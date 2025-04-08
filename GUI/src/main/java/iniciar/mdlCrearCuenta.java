package iniciar;

import Interfaz.Observado;
import Interfaz.Observador;
import tuberias.TuberiaJugador;
import tuberias.TuberiaRed;

/**
 *
 * @author Equipo
 */
public class mdlCrearCuenta implements ImdlCrearCuenta, Observado {

    Observador vista;
    
    public void abrirVentana(ctrlCrearCuenta control) {
        vista = new frmCrearCuenta(control);
        notificar();
    }
    
    public boolean crearJugador(String nombre, String avatar) {
        TuberiaJugador dominio = new TuberiaJugador();
        TuberiaRed red = new TuberiaRed();
        notificar();
        return dominio.procesar(nombre, avatar) && red.procesar(nombre);
    }
    
    @Override
    public void notificar() {
        vista.actualizar(this);
    }
}
