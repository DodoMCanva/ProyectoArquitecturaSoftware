
package view;

/**
 *
 * @author Equipo
 */
public class frmPartida extends javax.swing.JFrame {

    /**
     * Creates new form frmPartida
     */
    public frmPartida() {
        initComponents();
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
        btnTerminar = new javax.swing.JButton();
        pnlDibujo = new javax.swing.JPanel();

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

        btnTerminar.setBackground(new java.awt.Color(255, 51, 51));
        btnTerminar.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminar.setText("Terminar Partida");

        pnlDibujo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout pnlJuegoLayout = new javax.swing.GroupLayout(pnlJuego);
        pnlJuego.setLayout(pnlJuegoLayout);
        pnlJuegoLayout.setHorizontalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJuegoLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(pnlDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlJuegoLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(btnTerminar))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
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
    private javax.swing.JLabel ls;
    private javax.swing.JLabel ls1;
    private javax.swing.JLabel ls2;
    private javax.swing.JLabel ls3;
    public javax.swing.JPanel pnlDibujo;
    private javax.swing.JPanel pnlJuego;
    // End of variables declaration//GEN-END:variables
}
