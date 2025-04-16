package Cliente;

import iniciar.ctrlCrearCuenta;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Equipo
 */
public class Cliente {

    public static void main(String[] args) {
        ctrlCrearCuenta control = new ctrlCrearCuenta();
        control.abrirVentana();
        try (
            Socket socket = new Socket("localhost", 12221); //BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Conectado al servidor. Esperando instrucciones...");

            // Hilo que escucha mensajes del servidor, es el mero mero que hace el turno           
            new Thread(() -> {
                //Variable movimiento no string
                String serverMessage;
                while ((serverMessage = in.readLine()) != null) {
                    System.out.println(">> " + serverMessage);

                }
            }).start();

            // Enviar mensajes (jugadas)
            //aqui se deberia regresar la jugada para que se imprima el tablero
            String input;
            while ((input = userInput.readLine()) != null) {
                out.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
