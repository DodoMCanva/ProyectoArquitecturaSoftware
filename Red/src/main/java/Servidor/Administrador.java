package Servidor;

import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Objetos.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo
 */
public class Administrador implements Runnable {

    //Objetos
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private int cliente;
    private Servidor servidor;
    private boolean aceptado;

    // Máximo 4 jugadores por partida
    private static final int MAX_JUGADORES = 4;
    //Esta en el mismo orden que la que entraron los jugadores
    private static int[] clientesPartida = new int[MAX_JUGADORES];
    private static int totalJugadores = 0;
    private static int votosInicio = 0;

    // Turnos
    private static int[] ordenTurnos = new int[MAX_JUGADORES];
    private static int turnoActual = 0;

    //Utilidades
    private static final Protocolo protocolo = Protocolo.getInstancia();
    convertirPartida convertidorPartida = new convertirPartida();
    convertirJugador convertidorJugador = new convertirJugador();

    public Administrador(Socket socket, int cliente, Servidor servidor) {
        this.socket = socket;
        this.cliente = cliente;
        this.servidor = servidor;

    }

    public void run() {
        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            out.flush();
            in = new ObjectInputStream(socket.getInputStream());
            Object obj;
            while ((obj = in.readObject()) != null) {

                //Crear Usuario
                if (obj instanceof String) {
                    if (!obj.equals("aceptado")) {
                        servidor.notificar(protocolo.nombreUnicoJugador((String) obj), cliente);

                    } else {

                    }
                }

                //Crear Partida
                if (obj instanceof PartidaDTO) {

                    boolean a = protocolo.crearPartida(convertidorPartida.convertir_DTO_a_Dominio((PartidaDTO) obj));
                    servidor.notificar(a, cliente);
                    synchronized (Administrador.class) {
                        if (a) {
                            if (totalJugadores < MAX_JUGADORES) {
                                clientesPartida[totalJugadores++] = cliente;
                                System.out.println("Jugador " + cliente + " unido. Total: " + totalJugadores);
                            }
                        }

                    }

                }

                //Unirse Partida 
                if (obj instanceof JugadorDTO) {
//                    servidor.notificarTodos("solicitud");
//                    if (aceptado) {
                        Jugador jugador = convertidorJugador.convertir_DTO_a_Dominio((JugadorDTO) obj);
                        Partida partida = protocolo.agregarJugador(jugador);
                        if (partida.partidaCompleta()) {
                            generarOrdenTurnos();
                        }
                        if (partida != null) {
                            PartidaDTO partidaDTO = convertidorPartida.convertir_Dominio_a_DTO(partida);
                            synchronized (Administrador.class) {
                                if (totalJugadores < MAX_JUGADORES) {
                                    clientesPartida[totalJugadores++] = cliente;
                                    System.out.println("Jugador " + cliente + " unido. Total: " + totalJugadores);
                                }
                            }
                            for (int i = 0; i < clientesPartida.length; i++) {
                                servidor.notificar(partidaDTO, clientesPartida[i]);
                            }

                        }
//                    }
                }

                // Voto para iniciar
                if (obj instanceof Boolean) {
                    String listo = protocolo.solicitarInicio();
                    servidor.notificarTodos(listo);
                    if (listo.equals("voto")) {
                        generarOrdenTurnos();
                    }

                }

                // Movimiento
                if (obj instanceof Movimiento) {
                    System.out.println("cliente que envio " + cliente);
                    System.out.println("numero de cliente en el turno actual "+ ordenTurnos[turnoActual] );
                    synchronized (Administrador.class) {
                        if (ordenTurnos[turnoActual] == cliente) {
                            if (protocolo.ejercerTurno((Movimiento) obj)) {
                                servidor.notificarTodos((Movimiento) obj);
                                System.out.println("Se aplico movimiento");
                                avanzarTurno();
                            }
                        } else {
                            System.out.println("No es el turno del cliente " + cliente);
                        }
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Jugador " + (cliente + 1) + " desconectado.");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administrador.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ObjectOutputStream getOut() {
        return out;
    }

    private void generarOrdenTurnos() {
        ordenTurnos = clientesPartida.clone();
        java.util.Random random = new java.util.Random();

        for (int i = ordenTurnos.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = ordenTurnos[i];
            ordenTurnos[i] = ordenTurnos[j];
            ordenTurnos[j] = temp;
        }

        turnoActual = 0;
    }

    private void avanzarTurno() {
        System.out.println("Total jugadores " + totalJugadores);
        System.out.println("Se cambio el turno");
        System.out.println("turno anterior " + turnoActual);
        turnoActual = (turnoActual + 1) % totalJugadores;
        System.out.println("turno actual " + turnoActual);
        //Aqui se mandaria el index
        int j = 0;
        for (int i = 0; i < clientesPartida.length; i++) {
            if (clientesPartida[i] == turnoActual) {
                j = i;
            }
        }
        servidor.notificarTodos(protocolo.obtenerJugador(j));
    }
}
