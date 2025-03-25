
package Partida;
import Interfaz.Observado;
import Interfaz.Observador;

/**
 *
 * @author Equipo
 */
public class mdlPartida implements Observado, ImdlPartida {
    private Observador vista;
    private ImdlPartida interfaz = this; 
    
    public mdlPartida(frmPartida vistaPartida){
        vista = vistaPartida;
    }
    
    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }
    
    
}
