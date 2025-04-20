package Cliente;

import iniciar.ctrlCrearCuenta;
import java.io.IOException;

/**
 *
 * @author Equipo
 */
public class Arranque {

    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente("localhost", 12221);
        ctrlCrearCuenta control = new ctrlCrearCuenta(cliente);
        control.abrirVentana();
    }

}
