package Servidor;

import static Servidor.Servidor.nextTurn;
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

    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private int jugador;

    public Administrador(Socket socket, int jugador) {
        this.socket = socket;
        this.jugador = jugador;
    }

    public void run() {

        try {
            in = new ObjectInputStream(socket.getInputStream());
            out = new ObjectOutputStream(socket.getOutputStream());

            Object obj;
            while ((obj = in.readObject()) != null) {

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

    //mov en vez de Object
    public void enviarMovimiento(Object mov) throws IOException {
        out.writeObject(mov);
        out.flush();
    }

    public void enviarMensaje(String mensaje) throws IOException {
        out.writeObject(mensaje); 
        out.flush();
    }
}
