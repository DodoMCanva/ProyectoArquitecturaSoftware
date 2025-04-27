package Objetos;

/**
 *
 * @author Equipo
 */
public class Caja {

    private Jugador propietario;

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public boolean tienePropietario() {
        return propietario != null;
    }
}
