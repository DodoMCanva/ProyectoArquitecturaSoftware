
package Objetos;

/**
 *
 * @author Equipo
 */
public class Tablero {
    private Linea[][] lineas;
    private Caja[][] cajas;

    public Tablero(Linea[][] lineas, Caja[][] cajas) {
        this.lineas = lineas;
        this.cajas = cajas;
    }

    public Linea[][] getLineas() {
        return lineas;
    }

    public void setLineas(Linea[][] lineas) {
        this.lineas = lineas;
    }

    public Caja[][] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[][] cajas) {
        this.cajas = cajas;
    }
    
    
}
