package Servidor;

import Objetos.Partida;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo
 */
public class Administrador implements Runnable {

    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    private List<String> nombres = new ArrayList<>();
    private int jugador;

    private Partida partida;

    public Administrador(Socket socket, int jugador) {
        this.socket = socket;
        this.jugador = jugador;
    }

    public void run() {

        try {
            out = new ObjectOutputStream(socket.getOutputStream());
            out.flush();
            in = new ObjectInputStream(socket.getInputStream());

            Object obj;
            while ((obj = in.readObject()) != null) {

                synchronized (Servidor.nombres) {
                    if (!Servidor.nombres.contains((String) obj)) {
                        Servidor.nombres.add((String) obj);
                        enviar(true);
                    } else {
                        enviar(false);
                    }
                }
                if (obj instanceof PartidaDTO) {

                    partida = (Partida)TuberiaDominio.aplicar(obj);
                    enviar(true);
                }
                if (obj instanceof Jugador) {
                    if (partida != null) {
                        //si esta llena
                        //partida.agregarjugador(jugador)
                        //enviartrue
                    }
                }
                if (obj instanceof movimiento) {
                    
                }
            }

        } catch (IOException e) {
            System.out.println("Jugador " + (jugador + 1) + " desconectado.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviar(Object obj) throws IOException {
        out.writeObject(obj);
        out.flush();
    }

}
