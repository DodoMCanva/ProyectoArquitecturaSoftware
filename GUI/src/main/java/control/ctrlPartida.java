package control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.mdlPartida;
import view.frmPartida;

public class ctrlPartida  {

    private frmPartida b = new frmPartida();
    private mdlPartida a;
    private int yaux = 0;
    private int xaux = 0;
    private int y = 0;
    private int x = 0;
    private int click = 0;

    public void iniciar() {
        b.setVisible(true);

        try {
            System.out.println("Cargando...");
            Thread.sleep(3000);  
            System.out.println("Fin");
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }

        a = new mdlPartida(b);
        a.agregarPuntos();

        b.pnlDibujo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                System.out.println("Click en y: " + y + "  Click en x: " + x);
                System.out.println(click);

                a.verificarPunto(x, y);
            }
        });
    }

}

