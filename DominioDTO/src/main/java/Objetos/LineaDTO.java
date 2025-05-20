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

    public boolean isEstaDibujada() {
        return estaDibujada;
    }

    public void setEstaDibujada(boolean estaDibujada) {
        this.estaDibujada = estaDibujada;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    
    // Constructor desde objeto de dominio
    public LineaDTO(Objetos.Linea linea) {
        this.estaDibujada = linea.estaDibujada();
        this.nombreJugador = linea.getJugador().getNombre();
    }
    
}
