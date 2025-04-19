package Cliente;
import iniciar.ctrlCrearCuenta;
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
public class Arranque {

    public static void main(String[] args) throws IOException {
        //Establecer conexion
        Socket socket = new Socket("localhost", 12221);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

        ctrlCrearCuenta control = new ctrlCrearCuenta();
        control.abrirVentana();

        //recibir(respuesta del servidor)
        new Thread(() -> {
            try {
                Object obj;
                while ((obj = in.readObject()) != null) {

//                    if (obj instanceof Jugada) {
//                        Jugada j = (Jugada) obj;
//                        System.out.println(">> " + j.getJugador() + " movió a [" + j.getFila() + "," + j.getColumna() + "]");
//                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }
}
