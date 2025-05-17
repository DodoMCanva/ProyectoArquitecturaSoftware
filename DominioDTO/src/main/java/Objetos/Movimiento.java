
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

    public Movimiento(Linea linea) {
    }

public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean esHorizontal() {
        return esHorizontal;
    }

    public Jugador getJugador() {
        return jugador;
    }

    // Método para validar si el movimiento es válido dentro del tablero
    public boolean esValido(Tablero tablero) {
        if (esHorizontal) {
            return x >= 0 && x < tablero.getTamano() && y >= 0 && y < tablero.getTamano() - 1;
        } else {
            return x >= 0 && x < tablero.getTamano() - 1 && y >= 0 && y < tablero.getTamano();
        }
    }

    // Método para aplicar el movimiento al tablero si es válido
    public boolean aplicarMovimiento(Tablero tablero) {
        if (esValido(tablero)) {
            if (esHorizontal) {
                return tablero.dibujarLineaHorizontal(x, y, jugador);
            } else {
                return tablero.dibujarLineaVertical(x, y, jugador);
            }
        }
        return false;
    }

}
