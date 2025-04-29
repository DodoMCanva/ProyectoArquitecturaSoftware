package Tuberias;

import Filtros.FiltroCaracteres;
import Filtros.IFiltro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class TuberiaJugador {
    
    private List<IFiltro> filtros = new ArrayList<>();
    
    public TuberiaJugador(){
        filtros.add(new FiltroCaracteres());
    }
    
    public String procesar(String nombre){
        for (IFiltro filtro : filtros) {
            Object resultado = filtro.aplicar(nombre);
            if (resultado instanceof Boolean) {
                if (!(boolean)resultado) {
                    nombre = "";
                    return nombre;
                }
            }else if ( resultado instanceof String){
                nombre = (String)resultado;
            }
        }
        return nombre;
    }
}
