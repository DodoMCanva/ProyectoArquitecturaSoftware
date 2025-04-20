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

    public static List<Administrador> jugadores = new ArrayList<>();
    public static List<String> nombres = new ArrayList<>();
    public static int jugadorActual = 0;
    public static boolean ejecutando;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12221)) {
            System.out.println("Servidor esperando jugadores...");
            int jugador = 0;
            ejecutando = true;
            while (ejecutando) {
                Socket socket = serverSocket.accept();
                Administrador admin = new Administrador(socket, jugador++);
                jugadores.add(admin);
                System.out.println("Se agrego jugador");
                new Thread(admin).start();
            }
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static synchronized void siguienteTurno() {
        jugadorActual = (jugadorActual + 1) % jugadores.size();
    }

}
