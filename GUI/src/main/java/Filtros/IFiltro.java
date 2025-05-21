package Filtros;

import Objetos.Linea;

/**
 *
 * @author User
 */
public interface IFiltro<a,b> {
    
    public b aplicar(a var);
    //public Boolean aplicar(Linea linea);
    public boolean esValido(a var)   ;

}
