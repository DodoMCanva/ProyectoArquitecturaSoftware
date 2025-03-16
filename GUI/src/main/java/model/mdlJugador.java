package model;

/**
 *
 * @author Equipo
 */
public class mdlJugador {
    String img;
    String nombre;
    boolean voto;
    boolean turno;
    int puntuacion;
    String color;

    public mdlJugador(String img, String nombre, boolean voto, boolean turno, int puntuacion, String color) {
        this.img = img;
        this.nombre = nombre;
        this.voto = voto;
        this.turno = turno;
        this.puntuacion = puntuacion;
        this.color = color;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
