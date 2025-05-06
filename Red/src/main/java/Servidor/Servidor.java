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
    public static List<String> nombres = new ArrayList<>();
    public static int jugadorActual = 0;
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
                System.out.println("Se agregó un jugador");
                new Thread(admin).start();
            }
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
    
    public void notificar(Object mensaje, int jugador){
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
}
