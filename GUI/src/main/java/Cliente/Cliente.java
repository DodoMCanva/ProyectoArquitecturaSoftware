package Cliente;

import Objetos.Movimiento;
import Convertidor.convertirJugador;
import Convertidor.convertirPartida;
import Objetos.*;
import Objetos.*;
import Tuberias.TuberiaConversorPartida;
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
 private TuberiaConversorPartida tuberiaConversorPartida;

    public Cliente() {
        this.tuberiaConversorPartida = new TuberiaConversorPartida();
    }

    //Variables de red
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    //Variables de logica de red
    private static boolean respuestaValida = false;
    private static boolean respuestaRecibida = false;

    //Variables unicas de cliente
    private Jugador JugadorCliente;
    private boolean administrador;
    private Partida PartidaCliente;
    private ArrayList<Color> preferencias;

    //variables logica cliente
    private boolean cambiograficoPartida = false;
    private boolean cambiograficoLobby = false;

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
                        convertirPartida convertidor = new convertirPartida();
                        PartidaCliente = (convertidor.convertir_DTO_a_Dominio((PartidaDTO) obj));
                    }

                    //Se unio alguien mas a la partida
                    if (obj instanceof JugadorDTO) {
                        convertirJugador convertidor = new convertirJugador();
                        PartidaCliente.agregarJugador(convertidor.convertir_DTO_a_Dominio((JugadorDTO) obj));
                        cambiograficoLobby = true;
//                        if (PartidaCliente.partidaCompleta()) {
//                            partidaLista();
//                        }
                    }

                    //Ejerciero Turno
                    if (obj instanceof Movimiento) {
                        //aqui se interpretaria
                    }

                    if (obj instanceof String) {
                        switch ((String) obj) {
                            case "partida lista":

                                break;
                            case "solicitud":
                                if (administrador) {
                                    int respuesta = JOptionPane.showConfirmDialog(null, "Un usuario quiere unirse");
                                    if (respuesta == JOptionPane.YES_OPTION) {
                                        enviarServidor(true);
                                    } else {
                                        enviarServidor(false);
                                    }
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }).start();

    }

    //Logica de red
    public boolean partidaLista() {
        //ajustar
        return true;
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
        respuestaRecibida=false;
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

    //getters y setters
    public boolean esAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
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

    public Partida recibirDatosPartida(PartidaDTO partidaDTO) {
        return tuberiaConversorPartida.procesar(partidaDTO);
    }

}
