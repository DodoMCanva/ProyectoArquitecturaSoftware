package filtros;

import Objetos.Partida;

/**
 *
 * @author Equipo
 */
public class FiltroLimite implements Filtro {

    public boolean aplicar(Partida partida) {
        if (partida.getJugadores() != null) {
            if (partida.getJugadores().length < 4) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
