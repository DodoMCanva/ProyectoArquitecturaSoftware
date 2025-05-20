package Objetos;

import java.io.Serializable;

/**
 *
 * @author Equipo
 */
public class TableroDTO implements Serializable {

    private int tamano;
    private LineaDTO[][] horizontales;
    private LineaDTO[][] verticales;
    private CajaDTO[][] cajas;
    private String[][] estructura;

    public String[][] getEstructura() { 
        return estructura; 
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public TableroDTO(int tamano) {
        this.tamano = tamano;
        horizontales = new LineaDTO[tamano][tamano - 1];
        verticales = new LineaDTO[tamano - 1][tamano];
        cajas = new CajaDTO[tamano - 1][tamano - 1];

        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - 1; j++) {
                cajas[i][j] = new CajaDTO();
            }
        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano - 1; j++) {
                horizontales[i][j] = new LineaDTO();
            }
        }

        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano; j++) {
                verticales[i][j] = new LineaDTO();
            }
        }
    }

    public LineaDTO[][] getHorizontales() {
        return horizontales;
    }

    public void setHorizontales(LineaDTO[][] horizontales) {
        this.horizontales = horizontales;
    }

    public LineaDTO[][] getVerticales() {
        return verticales;
    }

    public void setVerticales(LineaDTO[][] verticales) {
        this.verticales = verticales;
    }

    public CajaDTO[][] getCajas() {
        return cajas;
    }

    public void setCajas(CajaDTO[][] cajas) {
        this.cajas = cajas;
    }
    
    
}
