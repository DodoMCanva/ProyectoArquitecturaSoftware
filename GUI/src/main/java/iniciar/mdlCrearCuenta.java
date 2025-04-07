package iniciar;

import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.Jugador;

/**
 *
 * @author Equipo
 */
public class mdlCrearCuenta implements ImdlCrearCuenta, Observado {

    Observador vista = new frmCrearCuenta(new ctrlCrearCuenta());
    Jugador Jugador;

    //preguntar a dominio o la red
    
    public void abrirVentana() {
        if (vista instanceof frmCrearCuenta) {
            ((frmCrearCuenta) vista).setVisible(true);
        }
    }

    public boolean crearCuenta() {
        if (dominio.crearJugador()) {
            if (vista instanceof frmCrearCuenta) {
                ((frmCrearCuenta) vista).setVisible(true);
            }
            return true;
        }
        return false;
    }

    @Override
    public void notificar() {
        vista.actualizar(this);
    }
}
