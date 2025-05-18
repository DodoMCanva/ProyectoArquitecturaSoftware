
package Objetos;

import java.io.Serializable;

/**
 *
 * @author equipo
 */
public class Movimiento implements Serializable{
    private int x;
    private int y;
    private boolean esHorizontal;
    private Jugador jugador;
    
    public Movimiento(int x, int y, boolean esHorizontal, Jugador jugador) {
        this.x = x;
        this.y = y;
        this.esHorizontal = esHorizontal;
        this.jugador = jugador;
    }

    // Getters
    public int getX() { return x; }
    public int getY() { return y; }
    public Jugador getJugador() { return jugador; }
    public boolean esHorizontal() { return esHorizontal; }

    // Setters (si necesitas mutabilidad)
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setJugador(Jugador jugador) { this.jugador = jugador; }
    public void setEsHorizontal(boolean esHorizontal) { this.esHorizontal = esHorizontal; }
}
