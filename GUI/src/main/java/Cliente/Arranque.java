package Cliente;

import iniciar.ctrlCrearCuenta;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class Arranque {

    public static void main(String[] args) throws IOException {
        try {
            Cliente cliente = new Cliente("localhost", 12221);
            ctrlCrearCuenta control = new ctrlCrearCuenta(cliente);
            control.abrirVentana();
        } catch (Exception e) {
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "No se pudo establecer conexion");
            //e.printStackTrace(); 
        }

    }

}
