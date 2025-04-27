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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void incrementarPuntos() {
        puntos++;
    }
}
