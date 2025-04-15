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
                Socket socket = new Socket("localhost", 12345); //BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                //BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                ) {
            System.out.println("Conectado al servidor. Esperando instrucciones...");

            // Hilo que escucha mensajes del servidor
//            new Thread(() -> {
//                String serverMessage;
//                try {
//                    while ((serverMessage = in.readLine()) != null) {
//                        System.out.println(">> " + serverMessage);
//                    }
//                } catch (IOException e) {
//                    System.out.println("Conexión cerrada.");
//                }
//            }).start();
//
//            // Enviar mensajes (jugadas)
//            String input;
//            while ((input = userInput.readLine()) != null) {
//                out.println(input);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
