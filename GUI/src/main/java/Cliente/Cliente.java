package Cliente;

import Objetos.*;
import Objetos.*;
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Equipo
 */
public class Cliente {

    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    private static boolean respuestaValida = false;
    private static boolean respuestaRecibida = false;

    private Jugador JugadorCliente;
    private Partida PartidaCliente;

    private Color preferencias;

    public Cliente(String host, int puerto) throws IOException {
        socket = new Socket(host, puerto);
        out = new ObjectOutputStream(socket.getOutputStream());
        out.flush();
        in = new ObjectInputStream(socket.getInputStream());

        new Thread(() -> {
            try {
                Object obj;
                while ((obj = getIn().readObject()) != null) {
                    if (obj instanceof Boolean) {
                        respuestaValida = (Boolean) obj;
                        respuestaRecibida = true;
                    }
                    if (obj instanceof PartidaDTO) {
                        PartidaCliente = (Partida) obj;
                        respuestaValida = (Boolean) obj;
                        respuestaRecibida = true;
                    }
                    if (obj instanceof JugadorDTO) {
                        PartidaCliente.agregarJugador(JugadorCliente);
                        int registros;
                        for (int i = 0; i < 10; i++) {

                        }

                    }
                    if (obj instanceof String) {
                        if ((String) obj == "voto") {
                            //partidaLista
                        }
                    }

                    // es string? y ya se lleno?
                    // notificar al mdl Lobby
                    //
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }).start();

    }

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

    //
    public boolean partidaLista() {
        return true;
    }

    public boolean solicitudUnirse() {
        return true;
    }

    public boolean cambioPartida() {
        return true;
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
        return respuestaValida;
    }

    public static boolean esRespuestaRecibida() {
        return respuestaRecibida;
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

    public void interpretar() {
    }

}
