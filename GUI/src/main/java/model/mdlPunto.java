package model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Equipo
 */
public class mdlPunto {

    private int x;
    private int y;

    public mdlPunto(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//    public void pintarCirculo(Graphics g) {
//        g.setColor(Color.BLACK);
//        g.fillOval(mdlPunto.x, mdlPunto.y, 15, 15);  // Dibuja el círculo
//    }

    @Override
    public String toString() {
        return "mdlPunto{" + "x=" + x + ", y=" + y + '}';
    }

}
