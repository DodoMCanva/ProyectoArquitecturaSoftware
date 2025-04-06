package iniciar;

import Interfaz.Observado;
import Interfaz.Observador;

/**
 *
 * @author Equipo
 */
public class mdlCrearCuenta implements ImdlCrearCuenta, Observado {

    Observador vista = new frmCrearCuenta();
    Logica dominio = new Logica();

    //preguntar a dominio o la red
    
    public void abrirVentana() {
        if (vista instanceof frmCrearCuenta) {
            ((frmCrearCuenta) vista).setVisible(true);
        }
    }

    public boolean crearJugador() {
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
