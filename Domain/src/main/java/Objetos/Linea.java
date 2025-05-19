package Objetos;

/**
 *
 * @author Equipo
 */
public class Linea {

    private boolean estaDibujada;
    private Jugador jugador;
    private int x1, y1, x2, y2;
    private boolean esHorizontal;

    public Linea() {
        estaDibujada = false;
    }
public Linea(int x1, int y1, int x2, int y2, boolean esHorizontal) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.esHorizontal = esHorizontal;
        this.estaDibujada = false;
        this.jugador = null;
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
