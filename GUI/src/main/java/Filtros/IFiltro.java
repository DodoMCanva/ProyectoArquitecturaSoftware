package Filtros;

/**
 *
 * @author User
 */
public interface IFiltro<a,b> {
    
    public a aplicar(b var);
    
    public boolean esValido(a var)   ;

}
