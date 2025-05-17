package Objetos;

import java.io.Serializable;

/**
 *
 * @author Equipo
 */
public class LineaDTO implements Serializable {

    private boolean estaDibujada;
    private String nombreJugador;

    public LineaDTO() {
    }

    
    // Constructor desde objeto de dominio
    public LineaDTO(Objetos.Linea linea) {
        this.estaDibujada = linea.estaDibujada();
        this.nombreJugador = linea.getJugador().getNombre();
    }
    
}
