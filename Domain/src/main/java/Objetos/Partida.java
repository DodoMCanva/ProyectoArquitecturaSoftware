package Objetos;

/**
 *
 * @author Equipo
 */
public class Partida {

    private int numeroJugadores;
    private Tablero tablero;
    private Jugador[] jugadores;

    public Partida(int tamano, int numeroJugadores) {
        this.tablero = new Tablero(tamano);
        this.numeroJugadores = numeroJugadores;
        this.jugadores = new Jugador[this.numeroJugadores];
    }
    
    

    public Partida(Tablero tablero, int numeroJugadores) {
        this.tablero = tablero;
        this.numeroJugadores = numeroJugadores;
        this.jugadores = new Jugador[this.numeroJugadores];
    }

    public void agregarJugador(Jugador jugadorCliente) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = jugadorCliente;
                return;
            }
        }
    }

    public boolean partidaCompleta() {
        if (jugadores[jugadores.length] != null) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
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
    
    

}
