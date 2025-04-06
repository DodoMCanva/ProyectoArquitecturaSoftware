
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import red.ServidorHilos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author delll
 */
public class red {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<ServidorHilos> listaServHilo = new ArrayList<>();
        try {
            ServerSocket servidor = null;
            servidor = new ServerSocket(1234);
            System.out.println("Abrinedo el servidor");
            Socket cliente = null;

            ServidorHilos hilo;
            while (true) {
                cliente = servidor.accept();
                hilo = new ServidorHilos(cliente);
                listaServHilo.add(hilo);
                for (ServidorHilos serv : listaServHilo) {
                    serv.setListaOutputs(listaServHilo);
                }
                hilo.start();
            }
        } catch (IOException ex) {
            System.err.println("Error en el servidor");
            System.exit(1);
        }

    }

    
}
