package control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.mdlPartida;
import view.frmPartida;

public class ctrlPartida implements ActionListener {

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
            JOptionPane panel = new JOptionPane("Cargando", JOptionPane.INFORMATION_MESSAGE);
            JDialog carg = panel.createDialog("Timbiriche");
            carg.setVisible(true);
            Thread.sleep(3000);
            carg.dispose();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
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
                if (click == 1) {
                    Graphics g = b.pnlDibujo.getGraphics();
                    g.drawLine(xaux, yaux, x, y);
                    System.out.println(click);
                    click = 0;
                } else {
                    System.out.println(click);
                    xaux = x;
                    yaux = y;
                    click++;
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Tu lógica aquí
    }
}
