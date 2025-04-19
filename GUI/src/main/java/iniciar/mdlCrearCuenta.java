package iniciar;

import Cliente.Cliente;
import Interfaz.Observado;
import Interfaz.Observador;
import Tuberias.TuberiaJugador;

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
        TuberiaJugador tuberia = new TuberiaJugador();
        Cliente red = new Cliente();
        String resultado = tuberia.procesar(nombre);
        if (!resultado.equals("")) {
            
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
