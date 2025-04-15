package Servidor;

import static Servidor.Servidor.nextTurn;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Equipo
 */
public class Administrador implements Runnable {

    private Socket socket;
    //private BufferedReader in;
    //private PrintWriter out;
    private int playerId;

    public Administrador(Socket socket, int playerId) {
        this.socket = socket;
        this.playerId = playerId;
    }

    public void run() {
        /*
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            String input;
            while ((input = in.readLine()) != null) {
                System.out.println("Jugador " + (playerId + 1) + ": " + input);

                if (players.get(currentPlayerIndex) == this) {
                    // Es su turno, procesamos el movimiento
                    for (ClientHandler player : players) {
                        player.sendMessage("Jugador " + (playerId + 1) + ": " + input);
                    }
                    nextTurn();
                } else {
                    sendMessage("No es tu turno. Espera.");
                }
            }

        } catch (IOException e) {
            System.out.println("Jugador " + (playerId + 1) + " desconectado.");
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }*/
    }
}
