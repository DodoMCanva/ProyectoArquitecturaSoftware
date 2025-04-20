package Servidor;

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
//                if (obj instanceof movimiento) {
//                    movimiento mov = (movimiento) obj;
//                    System.out.println("Jugador " + (jugador + 1) + " jugó: " + mov);
//
//                    // Verificamos si es su turno
//                    if (Servidor.jugadores.get(Servidor.jugadorActual) == this) {
//                        // Enviar la jugada a todos los jugadores
//                        for (Administrador player : Servidor.jugadores) {
//                            player.enviarMovimiento(mov);
//                        }
//                        Servidor.siguienteTurno();
//                    } else {
//                        enviarMensaje("No es tu turno. Espera.");
//                    }
//                }
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
