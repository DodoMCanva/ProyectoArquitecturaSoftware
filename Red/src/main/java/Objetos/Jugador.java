package Objetos;

/**
 *
 * @author Equipo
 */
public class Jugador {
    private String nombre, avatar;

    public Jugador(String nombre, String avatar) {
        this.nombre = nombre;
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
}
