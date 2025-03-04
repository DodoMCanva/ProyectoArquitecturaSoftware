package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import view.frmPartida;

/**
 *
 * @author Fer
 */
public class mdlPartida implements iVista {

    private int tmn = 10;
    private int tmnTablero = 635;
    private int separador = 0;
    private int x = 0;
    private int y = 0;
    private mdlJugador[] jugadores = new mdlJugador[3];

    @Override
    public void update() {
    
    }
    

    public static void pintarCirculo(Graphics g, int x, int y, String n) {
        ((Graphics2D) g).setColor(Color.blue);
        ((Graphics2D) g).setStroke(new BasicStroke(4));
        ((Graphics2D) g).fillOval(x, y, 15, 15);
        ((Graphics2D) g).setColor(Color.BLACK);
        ((Graphics2D) g).drawOval(x, y, 15, 15);

        ((Graphics2D) g).setColor(Color.BLACK);
        Font fuente = new Font("Monospaced", Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(n, x, y);

    }

    //vertices
    public void agregarPuntos() {
        frmPartida a = new frmPartida();

        separador = tmnTablero / tmn;

        for (int j = 0; j < tmn; j++) {
            for (int i = 0; i < tmn; i++) {
                pintarCirculo(a.pnlDibujo.getGraphics(), x, y, "matias");
                x = x + separador;
                System.out.println(x);
            }
            x=0;
            y=y+separador;
            System.out.println(y);
        }

    }

    //aristas
    public void colorearLinea() {

    }

    //ya se acabo la partida?
    //
}
