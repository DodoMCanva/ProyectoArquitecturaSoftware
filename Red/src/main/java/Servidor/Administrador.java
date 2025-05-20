package Servidor;

import Objetos.MovimientoDTO;
import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Objetos.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Administrador implements Runnable {

    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private int cliente;
    private Servidor servidor;

    private static final int MAX_JUGADORES = 4;
    private static int[] clientesPartida = new int[MAX_JUGADORES];
    private static int totalJugadores = 0;

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

                if (obj instanceof String) {
                    switch ((String) obj) {
                        case "abandono":
                            servidor.notificarTodos(protocolo.marcarAbandono(cliente));
                            break;
                        default:
                            servidor.notificar(protocolo.nombreUnicoJugador((String) obj), cliente);
                    }
                }

                if (obj instanceof PartidaDTO) {
                    boolean creada = protocolo.crearPartida(convertidorPartida.convertir_DTO_a_Dominio((PartidaDTO) obj));
                    servidor.notificar(creada, cliente);
                    if (creada && totalJugadores < MAX_JUGADORES) {
                        clientesPartida[totalJugadores++] = cliente;
                    }
                }

                if (obj instanceof JugadorDTO) {
                    Jugador jugador = convertidorJugador.convertir_DTO_a_Dominio((JugadorDTO) obj);
                    Partida partida = protocolo.agregarJugador(jugador);
                    if (partida != null) {
                        if (totalJugadores < MAX_JUGADORES) {
                            clientesPartida[totalJugadores++] = cliente;
                        }
                        PartidaDTO partidaDTO = convertidorPartida.convertir_Dominio_a_DTO(partida);
                        for (int i = 0; i < totalJugadores; i++) {
                            servidor.notificar(partidaDTO, clientesPartida[i]);
                        }
                        if (partida.partidaCompleta()) {
                            protocolo.generarOrdenTurnos(clientesPartida, totalJugadores);
                        }
                    }
                }

                if (obj instanceof Boolean) {
                    String estado = protocolo.solicitarInicio();
                    servidor.notificarTodos(estado);
                    if (estado.equals("voto")) {
                        protocolo.generarOrdenTurnos(clientesPartida, totalJugadores);
                        servidor.notificarTodos(protocolo.obtenerJugadorActual());
                    }
                }

                if (obj instanceof MovimientoDTO) {
                    MovimientoDTO mov = (MovimientoDTO) obj;
                    boolean resultado = protocolo.ejercerTurno(mov, cliente);
                    if (resultado) {
                        servidor.notificarTodos(mov);
                        servidor.notificarTodos(protocolo.obtenerJugadorActual());
                    } else {
                        System.out.println("Movimiento rechazado: no es el turno del cliente " + cliente);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Jugador " + (cliente + 1) + " desconectado.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ObjectOutputStream getOut() {
        return out;
    }
}
