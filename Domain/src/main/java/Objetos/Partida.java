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
        for (Jugador jugador : jugadores) {
            if (jugador == null) {
                return false;
            }
        }
        return true;
    }

    public boolean jugarMovimiento(int x, int y, boolean esHorizontal, Jugador jugador) {
        if (esHorizontal) {
            return tablero.dibujarLineaHorizontal(x, y, jugador);
        } else {
            return tablero.dibujarLineaVertical(x, y, jugador);
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
