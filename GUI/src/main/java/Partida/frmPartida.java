package Partida;

import Interfaz.Observador;
import Objetos.Jugador;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

/**
 *
 * @author Equipo
 */
public class frmPartida extends javax.swing.JFrame implements Observador<ImdlPartida> {

    private ctrlPartida control;
    private ImageIcon icono;
    private Image imagen;

    public frmPartida(ctrlPartida control) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlJuego = new javax.swing.JPanel();
        lblJ1 = new javax.swing.JLabel();
        lblJ2 = new javax.swing.JLabel();
        lblJ3 = new javax.swing.JLabel();
        lblJ4 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblNombreJ2 = new javax.swing.JLabel();
        lblNombreJ3 = new javax.swing.JLabel();
        lblNombreJ4 = new javax.swing.JLabel();
        ls = new javax.swing.JLabel();
        lblScoreJ1 = new javax.swing.JLabel();
        ls1 = new javax.swing.JLabel();
        lblScoreJ2 = new javax.swing.JLabel();
        ls2 = new javax.swing.JLabel();
        lblScoreJ3 = new javax.swing.JLabel();
        ls3 = new javax.swing.JLabel();
        lblScoreJ4 = new javax.swing.JLabel();
        btnAbandonar = new javax.swing.JButton();
        pnlDibujo = new PanelDibujo();
        jLabel1 = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlJuego.setBackground(new java.awt.Color(255, 255, 255));

        lblJ1.setBackground(new java.awt.Color(255, 255, 255));
        lblJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblJ2.setBackground(new java.awt.Color(255, 255, 255));
        lblJ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblJ3.setBackground(new java.awt.Color(255, 255, 255));
        lblJ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblJ4.setBackground(new java.awt.Color(255, 255, 255));
        lblJ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreJ1.setText("Nombre");

        lblNombreJ2.setText("Nombre");

        lblNombreJ3.setText("Nombre");

        lblNombreJ4.setText("Nombre");

        ls.setText("Score:");

        lblScoreJ1.setText("100");

        ls1.setText("Score:");

        lblScoreJ2.setText("100");

        ls2.setText("Score:");

        lblScoreJ3.setText("100");

        ls3.setText("Score:");

        lblScoreJ4.setText("100");

        btnAbandonar.setBackground(new java.awt.Color(255, 51, 51));
        btnAbandonar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbandonar.setText("Abandonar");
        btnAbandonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbandonarActionPerformed(evt);
            }
        });

        pnlDibujo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlDibujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDibujoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlDibujoLayout = new javax.swing.GroupLayout(pnlDibujo);
        pnlDibujo.setLayout(pnlDibujoLayout);
        pnlDibujoLayout.setHorizontalGroup(
            pnlDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        pnlDibujoLayout.setVerticalGroup(
            pnlDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );

        jLabel1.setText("TURNO DEL JUGADOR...");

        lblTurno.setText("Jugador");

        javax.swing.GroupLayout pnlJuegoLayout = new javax.swing.GroupLayout(pnlJuego);
        pnlJuego.setLayout(pnlJuegoLayout);
        pnlJuegoLayout.setHorizontalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJuegoLayout.createSequentialGroup()
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNombreJ3)
                                .addComponent(lblJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlJuegoLayout.createSequentialGroup()
                                    .addComponent(ls2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblScoreJ3)))
                            .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlJuegoLayout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(lblNombreJ1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJuegoLayout.createSequentialGroup()
                                    .addComponent(ls)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblScoreJ1))))
                        .addGap(290, 290, 290)
                        .addComponent(btnAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJuegoLayout.createSequentialGroup()
                        .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlJuegoLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJuegoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)))
                        .addComponent(pnlDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombreJ4)
                        .addGroup(pnlJuegoLayout.createSequentialGroup()
                            .addComponent(ls3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblScoreJ4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNombreJ2)
                        .addComponent(lblJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlJuegoLayout.createSequentialGroup()
                            .addComponent(ls1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblScoreJ2))))
                .addContainerGap())
        );
        pnlJuegoLayout.setVerticalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJuegoLayout.createSequentialGroup()
                        .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlJuegoLayout.createSequentialGroup()
                                .addComponent(lblJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombreJ2)
                                .addGap(18, 18, 18)
                                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ls1)
                                    .addComponent(lblScoreJ2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlJuegoLayout.createSequentialGroup()
                                .addComponent(lblJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(lblNombreJ1)
                                .addGap(18, 18, 18)
                                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ls)
                                    .addComponent(lblScoreJ1))
                                .addGap(91, 91, 91)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblTurno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreJ3)
                            .addComponent(lblNombreJ4)))
                    .addComponent(pnlDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ls2)
                    .addComponent(lblScoreJ3)
                    .addComponent(ls3)
                    .addComponent(lblScoreJ4)
                    .addComponent(btnAbandonar))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDibujoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDibujoMouseReleased
        control.clickPanel(evt.getX(), evt.getY());

    }//GEN-LAST:event_pnlDibujoMouseReleased

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbandonarActionPerformed
        control.abandonar();
    }//GEN-LAST:event_btnAbandonarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbandonar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblJ1;
    private javax.swing.JLabel lblJ2;
    private javax.swing.JLabel lblJ3;
    private javax.swing.JLabel lblJ4;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblNombreJ3;
    private javax.swing.JLabel lblNombreJ4;
    private javax.swing.JLabel lblScoreJ1;
    private javax.swing.JLabel lblScoreJ2;
    private javax.swing.JLabel lblScoreJ3;
    private javax.swing.JLabel lblScoreJ4;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel ls;
    private javax.swing.JLabel ls1;
    private javax.swing.JLabel ls2;
    private javax.swing.JLabel ls3;
    public javax.swing.JPanel pnlDibujo;
    private javax.swing.JPanel pnlJuego;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(ImdlPartida modelo) {
        Graphics g = this.pnlDibujo.getGraphics();
        g.clearRect(0, 0, pnlDibujo.getWidth(), pnlDibujo.getHeight());

        switch (modelo.obtenerEstado()) {
            case "abrir":
                this.setVisible(true);
                for (punto punto : modelo.obtenerPuntos()) {
                    pintarCirculo(g, punto.getX(), punto.getY());
                }
                break;

            case "refrescar":
                for (punto punto : modelo.obtenerPuntos()) {
                    pintarCirculo(g, punto.getX(), punto.getY());
                }
                for (linea l : modelo.obtenerLineas()) {
                    punto p1 = l.getPunto_1();
                    punto p2 = l.getPunto_2();
                    pintarLinea(g, p1.getX(), p1.getY(), p2.getX(), p2.getY(), l.getColor());
                }
                lblTurno.setText(modelo.obtenerTurnoActual());
                cargarDatosJugadores(modelo);
                break;

            case "terminada":
                control.abrirVentanaSiguiente();
                this.dispose();
                break;

            default:
                throw new AssertionError("Estado desconocido: " + modelo.obtenerEstado());
        }
    }

    public static void pintarCirculo(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, 15, 15);
    }

    public static void pintarLinea(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
    }

    public void cargarDatosJugadores(ImdlPartida modelo) {
        Jugador[] jugadores = modelo.obtenerJugadores();

        lblNombreJ1.setText(jugadores[0].getNombre());
        lblScoreJ1.setText(Integer.toString(jugadores[0].getPuntos()));
        icono = new ImageIcon(getClass().getResource("/imagenes/" + jugadores[0].getAvatar()));
        imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lblJ1.setIcon(new ImageIcon(imagen));

        lblNombreJ2.setText(jugadores[1].getNombre());
        lblScoreJ2.setText(Integer.toString(jugadores[1].getPuntos()));
        icono = new ImageIcon(getClass().getResource("/imagenes/" + jugadores[1].getAvatar()));
        imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lblJ2.setIcon(new ImageIcon(imagen));

        if (jugadores[2] != null) {
            lblNombreJ3.setText(jugadores[2].getNombre());
            lblScoreJ3.setText(Integer.toString(jugadores[2].getPuntos()));
            icono = new ImageIcon(getClass().getResource("/imagenes/" + jugadores[2].getAvatar()));
            imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            lblJ3.setIcon(new ImageIcon(imagen));

        }

        if (jugadores[3] != null) {
            lblNombreJ4.setText(jugadores[3].getNombre());
            lblScoreJ4.setText(Integer.toString(jugadores[3].getPuntos()));
            icono = new ImageIcon(getClass().getResource("/imagenes/" + jugadores[3].getAvatar()));
            imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            lblJ4.setIcon(new ImageIcon(imagen));

        }

    }
}
