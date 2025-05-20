package Servidor;

import java.io.IOException;
import java.io.ObjectOutputStream;
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
    public static boolean ejecutando;

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        try (ServerSocket serverSocket = new ServerSocket(12221)) {
            System.out.println("Servidor esperando jugadores...");
            int jugador = 0;
            ejecutando = true;
            while (ejecutando) {
                Socket socket = serverSocket.accept();
                Administrador admin = new Administrador(socket, jugador++, servidor);
                jugadores.add(admin);
                System.out.println("Se agrego un jugador");
                new Thread(admin).start();
            }
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //No seria a todos sino a los que estan en partida
    public void notificarTodos(Object mensaje) {
        for (Administrador admin : jugadores) {
            try {
                ObjectOutputStream out = admin.getOut();
                out.writeObject(mensaje);
                out.flush();
            } catch (IOException e) {
                System.out.println("No se pudo notificar a un jugador.");
            }
        }
    }

    public void notificar(Object mensaje, int jugador) {
        try {
            ObjectOutputStream out = jugadores.get(jugador).getOut();
            out.writeObject(mensaje);
            out.flush();
        } catch (IOException e) {
            System.out.println("No se pudo notificar.");
        }
    }
}
