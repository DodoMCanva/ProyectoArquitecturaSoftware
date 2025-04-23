package Objetos;

/**
 *
 * @author Equipo
 */
public class Partida {

    private Tablero tablero;
    private Jugador[] jugadores;
    
    //Crear Partida
    public Partida(Tablero tablero, int numero_jugadores) {
        this.tablero = tablero;
        this.jugadores = new Jugador[numero_jugadores];
    }

    //Logica
    public void agregarJugador(Jugador jugador) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = jugador;
                break;
            }
        }
    }

    //Getters y Setters
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
    
    

}
