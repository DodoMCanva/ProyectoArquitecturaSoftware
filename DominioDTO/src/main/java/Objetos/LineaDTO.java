package Objetos;

import java.io.Serializable;

/**
 *
 * @author Equipo
 */
public class LineaDTO implements Serializable {

    private boolean estaDibujada;
    private Jugador jugador;

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

    
}
