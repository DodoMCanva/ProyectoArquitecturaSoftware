package Objetos;

import java.io.Serializable;

/**
 *
 * @author equipo
 */
public class Movimiento implements Serializable {

    private int fila;
    private int columna;
    private boolean esHorizontal;
    private JugadorDTO jugador;

    public Movimiento(int fila, int columna, boolean esHorizontal, JugadorDTO jugador) {
        this.fila = fila;
        this.columna = columna;
        this.esHorizontal = esHorizontal;
        this.jugador = jugador;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public boolean isEsHorizontal() {
        return esHorizontal;
    }

    public void setEsHorizontal(boolean esHorizontal) {
        this.esHorizontal = esHorizontal;
    }

    public JugadorDTO getJugador() {
        return jugador;
    }

    public void setJugador(JugadorDTO jugador) {
        this.jugador = jugador;
    }

}
