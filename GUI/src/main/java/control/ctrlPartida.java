package control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.mdlPartida;
import view.frmPartida;

public class ctrlPartida  {

    //NO VA AQUI
    private frmPartida b = new frmPartida();
    
    private mdlPartida a;
    private int y = 0;
    private int x = 0;
    
    

    public void iniciar() {
        b.setVisible(true);
        a = new mdlPartida(b);
        a.agregarPuntos();
        a.refrescar();
        b.pnlDibujo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a.refrescar();
                x = e.getX();
                y = e.getY();
                System.out.println("Click en y: " + y + "  Click en x: " + x);
                if (a.verficarTurno()) {
                    a.verificarPunto(x, y);
                }
                
            }
        });
    }

}

