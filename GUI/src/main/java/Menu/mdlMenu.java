package Menu;

import Interfaz.Observado;
import Interfaz.Observador;
import Objetos.*;

/**
 *
 * @author Equipo
 */
public class mdlMenu implements Observado, ImdlMenu {

    private Observador vista;
    private ImdlMenu interfaz;
    private String estado = "";
    
    private Partida partida;
    private Tablero tablero;

    public void abrirVentana(ctrlMenu control) {
        vista = new frmMenu(control);
        estado = "abrir";
        interfaz = this;
        notificar();
    }

    public void crearPartida(int tmn, int nj){
        //conectarse a la red y mandar la partida
    }
    
    public void unirsePartida(){
        
    }
    

    @Override
    public String obtenerEstado() {
        return estado;
    }

    @Override
    public void notificar() {
        vista.actualizar(interfaz);
    }

}
