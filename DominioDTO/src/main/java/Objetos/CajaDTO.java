package Objetos;

import java.io.Serializable;

/**
 *
 * @author Equipo
 */
public class CajaDTO implements Serializable {

    private Jugador propietario;

    public CajaDTO(Jugador propietario) {
        this.propietario = propietario;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

}
