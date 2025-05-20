package Partida;

import Objetos.Jugador;
import java.awt.Color;

/**
 *
 * @author Equipo
 */
public class linea {

    private punto punto_1;
    private punto punto_2;
    private Jugador jgdr;
    private Color color;

    public linea(punto punto_1, punto punto_2, Jugador jgdr, Color color) {
        this.punto_1 = punto_1;
        this.punto_2 = punto_2;
        this.jgdr = jgdr;
        this.color = color;
    }

    public punto getPunto_1() {
        return punto_1;
    }

    public void setPunto_1(punto punto_1) {
        this.punto_1 = punto_1;
    }

    public punto getPunto_2() {
        return punto_2;
    }

    public void setPunto_2(punto punto_2) {
        this.punto_2 = punto_2;
    }

    public Jugador getJgdr() {
        return jgdr;
    }

    public void setJgdr(Jugador jgdr) {
        this.jgdr = jgdr;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
