package Objetos;

import java.io.Serializable;

/**
 *
 * @author Equipo
 */
public class PartidaDTO implements Serializable {

    private int numeroJugadores;
    private TableroDTO tablero;
    private JugadorDTO[] jugadores;

    public PartidaDTO(TableroDTO tablero, int numeroJugadores) {
        this.tablero = tablero;
        this.numeroJugadores = numeroJugadores;
        this.jugadores = new JugadorDTO[this.numeroJugadores];
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public TableroDTO getTablero() {
        return tablero;
    }


    
    
}
