package Objetos;

import java.io.Serializable;

/**
 *
 * @author Equipo
 */
public class TableroDTO implements Serializable {

    private Linea[][] horizontales;
    private Linea[][] verticales;
    private Caja[][] cajas;

    public TableroDTO(Linea[][] horizontales, Linea[][] verticales, Caja[][] cajas) {
        this.horizontales = horizontales;
        this.verticales = verticales;
        this.cajas = cajas;
    }

    public Linea[][] getHorizontales() {
        return horizontales;
    }

    public void setHorizontales(Linea[][] horizontales) {
        this.horizontales = horizontales;
    }

    public Linea[][] getVerticales() {
        return verticales;
    }

    public void setVerticales(Linea[][] verticales) {
        this.verticales = verticales;
    }

    public Caja[][] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[][] cajas) {
        this.cajas = cajas;
    }
}
