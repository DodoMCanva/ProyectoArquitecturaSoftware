package Objetos;

/**
 *
 * @author Equipo
 */
public class Jugador {

    private String nombre;
    private String avatar;
    private int puntos;

    public Jugador(String nombre, String avatar, int puntos) {
        this.nombre = nombre;
        this.avatar = avatar;
        this.puntos = puntos;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    
 
    public void incrementarPuntos() {
        puntos++;
    }
}
