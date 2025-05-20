package Cliente;

import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Objetos.*;
import Objetos.*;
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class Cliente {

    //Variables de red
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    //Variables de logica de red
    private static boolean respuestaValida = false;
    private static boolean respuestaRecibida = false;

    //Variables unicas de cliente
    private Jugador JugadorCliente;
    private Partida PartidaCliente;
    private int numeroCliente = -1;
    private int jugadoresenPartida=0;

    private String jugadorTurnoActual;

    private Movimiento ultimo;
    private Color[] preferencias = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};

    //variables logica cliente
    private boolean cambiograficoPartida = false;
    private boolean cambiograficoLobby = false;
    private boolean partidalista = false;
    private boolean partidaTerminada = false;

    public Cliente(String host, int puerto) throws IOException {
        socket = new Socket(host, puerto);
        out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        in = new ObjectInputStream(socket.getInputStream());

        new Thread(() -> {
            try {
                Object obj;
                while ((obj = getIn().readObject()) != null) {
                    //Valida
                    if (obj instanceof Boolean) {
                        respuestaValida = (Boolean) obj;
                        respuestaRecibida = true;
                    }
                    //Te uniste a la partida
                    if (obj instanceof PartidaDTO) {
                        convertirPartida convertidorP = new convertirPartida();
                        PartidaCliente = (convertidorP.convertir_DTO_a_Dominio((PartidaDTO) obj));
                        cambiograficoLobby = true;
                        //Corregir
                        partidalista = PartidaCliente.partidaCompleta();
                    }
                    if (obj instanceof JugadorDTO) {
                        convertirJugador convertidorJ = new convertirJugador();
                        jugadorTurnoActual = convertidorJ.convertir_DTO_a_Dominio((JugadorDTO) obj).getNombre();
                        System.out.println("Jugador actual" + jugadorTurnoActual);
                    }

                    //Ejerciero Turno
                    if (obj instanceof Movimiento) {
                        ultimo = (Movimiento) obj;
                        ejercerTurno(ultimo);
                        cambiograficoPartida = true;
                    }

                    if (obj instanceof String) {
                        switch ((String) obj) {
                            
                            case "voto":
                                partidalista = true;
                                break;
                            default:
                                System.out.println("N/A");
                        }
                    }
//                    if (obj instanceof JugadorDTO) {
//                        
//                    }
                    if (obj instanceof Integer) {
                        if (numeroCliente == -1) {
                            numeroCliente = (int) obj;
                        } else {

                        }
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }).start();

    }

    //Logica de red
    public boolean isPartidalista() {
        return partidalista;
    }

    public void setPartidalista(boolean partidalista) {
        this.partidalista = partidalista;
    }

    public boolean isPartidaTerminada() {
        return partidaTerminada;
    }

    public void setPartidaTerminada(boolean partidaTerminada) {
        this.partidaTerminada = partidaTerminada;
    }

    public boolean solicitudUnirse() {
        //ajustar
        return true;
    }

    public boolean cambioPartida() {
        return cambiograficoPartida;
    }

    public boolean cambioLobby() {
        return cambiograficoLobby;
    }

    public static boolean esRespuestaValida() {
        long timeout = System.currentTimeMillis() + 5000;
        while (!esRespuestaRecibida() && System.currentTimeMillis() < timeout) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        respuestaRecibida = false;
        return respuestaValida;
    }

    public static boolean esAceptado() {
        long timeout = System.currentTimeMillis() + 5000;
        while (!esRespuestaRecibida() && System.currentTimeMillis() < timeout) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return respuestaValida;
    }

    public static boolean esRespuestaRecibida() {
        return respuestaRecibida;
    }

    public void interpretar() {
    }

    public void setJugadorCliente(Jugador jugador) {
        this.JugadorCliente = jugador;
    }

    public Jugador getJugadorCliente() {
        return this.JugadorCliente;
    }

    public Partida getPartidaCliente() {
        return PartidaCliente;
    }

    public void setPartidaCliente(Partida PartidaCliente) {
        this.PartidaCliente = PartidaCliente;
    }

    //Metodos de red
    public boolean enviarServidor(Object objeto) {
        try {
            out.writeObject(objeto);
            out.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Object recibirServidor() {
        try {
            return in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void cerrar() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObjectInputStream getIn() {
        return in;
    }

    public ObjectOutputStream getOut() {
        return out;
    }

    public void setCambiograficoPartida(boolean cambiograficoPartida) {
        this.cambiograficoPartida = cambiograficoPartida;
    }

    public void setCambiograficoLobby(boolean cambiograficoLobby) {
        this.cambiograficoLobby = cambiograficoLobby;
    }

    public void ajustarPreferencias(Color J1, Color J2, Color J3, Color J4) {
        for (int i = 0; i < PartidaCliente.getJugadores().length; i++) {
            if (PartidaCliente.getJugadores()[i]!=null) {
                jugadoresenPartida++;
            }
        }
        preferencias[0] = J1;
        preferencias[1] = J2;
        preferencias[2] = J3;
        preferencias[3] = J4;
    }

    public Movimiento getUltimo() {
        return ultimo;
    }

    public String getJugadorTurnoActual() {
        return jugadorTurnoActual;
    }

    public void ejercerTurno(Movimiento mov) {
        convertirJugador convertir = new convertirJugador();
        Jugador jugadorMovimiento = convertir.convertir_DTO_a_Dominio(mov.getJugador());

        // Buscar el jugador real dentro de la partida
        Jugador jugadorReal = null;
        for (Jugador j : PartidaCliente.getJugadores()) {
            if (j != null && j.getNombre().equals(jugadorMovimiento.getNombre())) {
                jugadorReal = j;
                break;
            }
        }

        if (jugadorReal == null) {
            System.out.println("Jugador no encontrado en la partida");
            return;
        }

        boolean aplico;
        if (mov.isEsHorizontal()) {
            aplico = PartidaCliente.getTablero().dibujarLineaHorizontal(mov.getFila(), mov.getColumna(), jugadorReal);
        } else {
            aplico = PartidaCliente.getTablero().dibujarLineaVertical(mov.getFila(), mov.getColumna(), jugadorReal);
        }

        if (aplico) {
            System.out.println("Movimiento aplicado correctamente");
        } else {
            System.out.println("Movimiento inválido");
        }

        if (aplico) {
            System.out.println("Movimiento aplicado correctamente");
        } else {
            System.out.println("Movimiento inválido");
        }
    }

    public Color[] getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(Color[] preferencias) {
        this.preferencias = preferencias;
    }

    public static boolean isRespuestaValida() {
        return respuestaValida;
    }

    public static void setRespuestaValida(boolean respuestaValida) {
        Cliente.respuestaValida = respuestaValida;
    }

    public static boolean isRespuestaRecibida() {
        return respuestaRecibida;
    }

    public static void setRespuestaRecibida(boolean respuestaRecibida) {
        Cliente.respuestaRecibida = respuestaRecibida;
    }

    public int getJugadoresenPartida() {
        return jugadoresenPartida;
    }

    public void setJugadoresenPartida(int jugadoresenPartida) {
        this.jugadoresenPartida = jugadoresenPartida;
    }
    

}
