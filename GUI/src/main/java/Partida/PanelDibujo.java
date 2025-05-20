/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partida;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class PanelDibujo extends JPanel {

    private final List<punto> puntos = new ArrayList<>();
    private final List<linea> lineas = new ArrayList<>();

    public void agregarPunto(punto p) {
        puntos.add(p);
        repaint();
    }

    public void agregarLinea(linea l) {
        lineas.add(l);
        repaint();
    }

    public void reiniciar() {
        puntos.clear();
        lineas.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Pintar puntos
        for (punto p : puntos) {
            g.setColor(Color.BLACK);
            g.fillOval(p.getX(), p.getY(), 15, 15);
        }

        // Pintar líneas
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(2));

        for (linea l : lineas) {
            punto p1 = l.getPunto_1();
            punto p2 = l.getPunto_2();
            g2d.setColor(Color.BLACK); // o puedes usar l.getJgdr().getColor() si tienes colores por jugador
            g2d.drawLine(p1.getX() + 10, p1.getY() + 10, p2.getX() + 10, p2.getY() + 10);
        }
    }
}
