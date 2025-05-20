package Partida;

import Objetos.Jugador;
import java.util.List;

/**
 *
 * @author Equipo
 */
public interface ImdlPartida {

    public String obtenerEstado();
    
    public Jugador[] obtenerJugadores();
    
    public List<punto> obtenerPuntos();
    
    public linea obtenerLinea();
    
    public String obtenerTurnoActual();
    
    public List<linea> obtenerLineas();
    
}
