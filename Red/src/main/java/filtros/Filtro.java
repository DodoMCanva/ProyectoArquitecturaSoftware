package filtros;

/**
 *
 * @author Equipo
 */
public interface Filtro<r, p> {

    public r aplicar(p parametro);
}
