package Filtros;

/**
 *
 * @author User
 */
public class FiltroNombreUnico implements IFiltro<Boolean, String>{

    

    @Override
    public Boolean aplicar(String var) {
        return true;
    }
    
}
