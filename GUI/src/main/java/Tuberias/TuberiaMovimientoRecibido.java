package Tuberias;

/**
 *
 * @author equipo
 */
import Filtros.IFiltro;
import Objetos.Linea;



public class TuberiaMovimientoRecibido {
private IFiltro<Linea, Boolean> verificarLinea;

    public TuberiaMovimientoRecibido(IFiltro<Linea, Boolean> verificarLinea) {
        this.verificarLinea = verificarLinea;
    }

    public boolean procesar(Linea linea) {
        return verificarLinea.aplicar(linea);
    }


}
