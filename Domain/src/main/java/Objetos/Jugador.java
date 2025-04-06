
package Objetos;

/**
 *
 * @author Equipo
 */
public class Jugador {
    private String avatar;
    private String nombre;
    private int puntos;

    public Jugador(String avatar, String nombre, int puntos) {
        this.avatar = avatar;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
