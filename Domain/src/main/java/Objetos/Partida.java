package Objetos;


/**
 *
 * @author Equipo
 */
public class Partida {

    private int numeroJugadores;
    private Tablero tablero;
    private Jugador[] jugadores;

    public Partida(Tablero tablero, int numeroJugadores) {
        this.tablero = tablero;
        this.numeroJugadores = numeroJugadores;
        this.jugadores = new Jugador[this.numeroJugadores];
    }

    public Jugador[] agregarJugador(Jugador jugadorCliente) {
       return jugadores;
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
    
    
    

}
