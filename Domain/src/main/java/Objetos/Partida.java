package Objetos;


/**
 *
 * @author Equipo
 */
public class Partida {

    private Tablero tablero;
    private Jugador[] jugadores;
    private int turnoActual;

    public Partida(Tablero tablero, Jugador[] jugadores) {
        this.tablero = tablero;
        this.jugadores = jugadores;
        this.turnoActual = 0;
    }

    public Jugador getJugadorActual() {
        return jugadores[turnoActual];
    }

    public void siguienteTurno() {
        turnoActual = (turnoActual + 1) % jugadores.length;
    }

    
    
    
    
    

}
