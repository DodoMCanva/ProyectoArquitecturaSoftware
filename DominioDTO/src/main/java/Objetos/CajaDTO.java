package Objetos;

import java.io.Serializable;

/**
 *
 * @author Equipo
 */
public class CajaDTO implements Serializable {
    private Jugador propietario;

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    
    
}
