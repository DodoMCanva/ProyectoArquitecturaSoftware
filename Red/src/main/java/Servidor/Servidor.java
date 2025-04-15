package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class Servidor {

    private static List<Administrador> players = new ArrayList<>();
    private static int currentPlayerIndex = 0;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Esperando a 2 jugadores...");

        while (players.size() < 4) {
            Socket socket = serverSocket.accept();
            Administrador player = new Administrador(socket, players.size());
            players.add(player);
            new Thread(player).start();
        }

        //players.get(0).sendMessage("Ambos jugadores conectados. Eres el Jugador 1. ¡Tu turno!");
        //players.get(1).sendMessage("Ambos jugadores conectados. Eres el Jugador 2. Espera tu turno.");
    }

    static synchronized void nextTurn() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        //players.get(currentPlayerIndex).sendMessage("¡Es tu turno!");
    }

}
