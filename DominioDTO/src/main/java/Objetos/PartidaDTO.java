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
    private JugadorDTO creador;
    

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

    public JugadorDTO[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(JugadorDTO[] jugadores) {
        this.jugadores = jugadores;
    }

    public JugadorDTO getCreador() {
        return creador;
    }

    public void setCreador(JugadorDTO creador) {
        this.creador = creador;
    }


    
    
}
