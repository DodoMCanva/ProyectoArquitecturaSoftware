package Tuberias;

/**
 *
 * @author equipo
 */
import Filtros.IFiltro;
import Objetos.Linea;



public class TuberiaMovimientoRecibido {
        private IFiltro<String, Linea> verificarLinea;

    public TuberiaMovimientoRecibido(IFiltro<String, Linea> verificarLinea) {
        this.verificarLinea = verificarLinea;
    }

    public boolean procesar(Linea linea) {
        if (verificarLinea.aplicar(linea)) {
            return true;
        }
        return false;
    }

}
