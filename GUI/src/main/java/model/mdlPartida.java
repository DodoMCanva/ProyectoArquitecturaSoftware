package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import view.frmPartida;

/**
 *
 * @author Fer
 */
public class mdlPartida implements iVista {

    private int tmn = 20;
    private int tmnTablero = 635;
    private int separador = 0;
    private int x = 20;
    private int y = 20;
    private mdlJugador[] jugadores = new mdlJugador[3];

    // Se agrega una referencia al frmPartida
    private frmPartida frm;

    // Constructor que recibe la referencia de frmPartida
    public mdlPartida(frmPartida frm) {
        this.frm = frm;  // Se guarda la referencia de frmPartida
        separador = tmnTablero / tmn;
    }

    @Override
    public void update() {

    }

    // Método para pintar el círculo
    public static void pintarCirculo(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 15, 15);  // Dibuja el círculo
    }

    // Método para agregar los puntos
    public void agregarPuntos() {
        separador = tmnTablero / tmn;
        int punto = 0;

        // Recorre las filas y columnas para dibujar los puntos
        for (int j = 0; j < tmn; j++) {
            for (int i = 0; i < tmn; i++) {
                // Dibuja el círculo en la posición (x, y)
                pintarCirculo(frm.pnlDibujo.getGraphics(), x, y);

                // Actualiza la coordenada x para el siguiente punto en la misma fila
                x = x + separador;
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                punto = punto + 1;
                System.out.println("P: " + punto);
            }
            // Resetea x y mueve hacia abajo para la siguiente fila
            x = 20;
            y = y + separador;
            System.out.println("");
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("P: " + punto);
        }

    }

    public static void pintarLinea(Graphics g, int x1, int y1, int x2, int y2) {
        int xAux = 0;
        int yAux = 0;
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        if (x1 <= x2) {
            xAux = ((x2 - x1) / 2) + x1;
        }
        if (x1 > x2) {
            xAux = ((x1 - x2) / 2) + x2;
        }
        if (y1 < y2) {
            yAux = ((y2 - y1) / 2) + y1;
        }
        if (y1 >= y2) {
            yAux = ((y1 - y2) / 2) + y2;
        }
    }
}
