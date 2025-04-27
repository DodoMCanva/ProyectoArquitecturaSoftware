package Objetos;

/**
 *
 * @author Equipo
 */
public class Linea {

    private boolean estaDibujada;
    private Jugador jugador;

    public Linea() {
        estaDibujada = false;
    }

    public boolean estaDibujada() {
        return estaDibujada;
    }

    public void dibujar(Jugador jugador) {
        if (!estaDibujada) {
            this.jugador = jugador;
            estaDibujada = true;
        }
    }

    public Jugador getJugador() {
        return jugador;
    }
}
