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
    private Observador vista;
    private ImdlCrearCuenta interfaz;
    private String estado = "";
    
    @Override
    public void abrirVentana(ctrlCrearCuenta control) {
        vista = new frmCrearCuenta(control);
        estado = "abrir";
        interfaz=this;
        notificar();
    }
    
    @Override
    public void crearJugador(String nombre, String avatar) {
        TuberiaJugador dominio = new TuberiaJugador();
        TuberiaRed red = new TuberiaRed();
        boolean r = dominio.procesar(nombre, avatar) && red.procesar(nombre);
        if (r) {
            estado = "cambiar";
            interfaz = this;
            notificar();
        }
    }
    
    @Override
    public String obtenerEstado() {
        return this.estado;
    }
    
    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }

    

    
}
