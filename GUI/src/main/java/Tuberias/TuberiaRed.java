package Tuberias;

import Filtros.FiltroCaracteres;
import Filtros.FiltroNombreUnico;
import Filtros.IFiltro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fdoga
 */
public class TuberiaRed {

    private List<IFiltro> filtros = new ArrayList<>();

    public TuberiaRed() {
        //filtros.add();
    }

    public String procesar(String nombre) {
        for (IFiltro filtro : filtros) {
            Object resultado = filtro.aplicar(nombre);
            if (resultado instanceof Boolean) {
                if (!(boolean) resultado) {
                    nombre = "";
                    return nombre;
                }
            } else if (resultado instanceof String) {
                nombre = (String) resultado;
            }
        }
        return nombre;
    }
}
