package Objetos;

import java.io.Serializable;

/**
 *
 * @author Equipo
 */
public class PartidaDTO implements Serializable {

    private Tablero tablero;
    private Jugador[] jugadores;
    private int turnoActual;

    public PartidaDTO(Tablero tablero, Jugador[] jugadores, int turnoActual) {
        this.tablero = tablero;
        this.jugadores = jugadores;
        this.turnoActual = turnoActual;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(int turnoActual) {
        this.turnoActual = turnoActual;
    }
}
