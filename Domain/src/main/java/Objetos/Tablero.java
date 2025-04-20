package Objetos;

/**
 *
 * @author Equipo
 */
public class Tablero {

    private Linea[][] horizontales;
    private Linea[][] verticales;
    private Caja[][] cajas;

    public Tablero(int tmn) {
        horizontales = new Linea[tmn][(tmn - 1)];
        verticales = new Linea[(tmn - 1)][tmn];
    }

    public void crearCajas(){
        
    }

}
