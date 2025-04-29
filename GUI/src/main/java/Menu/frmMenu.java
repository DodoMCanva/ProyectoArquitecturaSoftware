package Menu;

import Interfaz.Observador;

/**
 *
 * @author Equipo
 */
public class frmMenu extends javax.swing.JFrame implements Observador<ImdlMenu> {

    private ctrlMenu control;

    public frmMenu(ctrlMenu control) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jpMenu = new javax.swing.JPanel();
        cboxTmn = new javax.swing.JComboBox<>();
        lblTituloCrearPartida = new javax.swing.JLabel();
        btnVolverMenu = new javax.swing.JButton();
        lbtituloTamañoTab = new javax.swing.JLabel();
        btnUnirsePartida = new javax.swing.JButton();
        lbTituloNumeroJugadores = new javax.swing.JLabel();
        lblLogoCrearPartida = new javax.swing.JLabel();
        lbtituloTamañoTab1 = new javax.swing.JLabel();
        btnCrearPartida = new javax.swing.JButton();
        rbtn4 = new javax.swing.JRadioButton();
        rbtn2 = new javax.swing.JRadioButton();
        rbtn3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));

        jpMenu.setBackground(new java.awt.Color(0, 0, 0));
        jpMenu.setPreferredSize(new java.awt.Dimension(900, 500));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxTmn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10x10", "20x20", "30x30" }));
        cboxTmn.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cboxTmnComponentAdded(evt);
            }
        });
        cboxTmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTmnActionPerformed(evt);
            }
        });
        jpMenu.add(cboxTmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 230, -1));

        lblTituloCrearPartida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloCrearPartida.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCrearPartida.setText("Partida");
        jpMenu.add(lblTituloCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnVolverMenu.setText("Volver");
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });
        jpMenu.add(btnVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        lbtituloTamañoTab.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbtituloTamañoTab.setForeground(new java.awt.Color(255, 255, 255));
        lbtituloTamañoTab.setText("Unirse a partida existente");
        jpMenu.add(lbtituloTamañoTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        btnUnirsePartida.setBackground(new java.awt.Color(204, 255, 255));
        btnUnirsePartida.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnUnirsePartida.setText("UNIRSE A PARTIDA");
        btnUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirsePartidaActionPerformed(evt);
            }
        });
        jpMenu.add(btnUnirsePartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, 50));

        lbTituloNumeroJugadores.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbTituloNumeroJugadores.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloNumeroJugadores.setText("Numero Jugadores");
        jpMenu.add(lbTituloNumeroJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        lblLogoCrearPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoJuegoTim.png"))); // NOI18N
        jpMenu.add(lblLogoCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        lbtituloTamañoTab1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbtituloTamañoTab1.setForeground(new java.awt.Color(255, 255, 255));
        lbtituloTamañoTab1.setText("Tamaño del tablero");
        jpMenu.add(lbtituloTamañoTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        btnCrearPartida.setBackground(new java.awt.Color(204, 255, 255));
        btnCrearPartida.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCrearPartida.setText("CREAR PARTIDA");
        btnCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartidaActionPerformed(evt);
            }
        });
        jpMenu.add(btnCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 200, 50));

        rbtn4.setBackground(new java.awt.Color(0, 0, 0));
        btnGroup.add(rbtn4);
        rbtn4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtn4.setForeground(new java.awt.Color(255, 255, 255));
        rbtn4.setText("4");
        jpMenu.add(rbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        rbtn2.setBackground(new java.awt.Color(0, 0, 0));
        btnGroup.add(rbtn2);
        rbtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtn2.setForeground(new java.awt.Color(255, 255, 255));
        rbtn2.setText("2");
        jpMenu.add(rbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));

        rbtn3.setBackground(new java.awt.Color(0, 0, 0));
        btnGroup.add(rbtn3);
        rbtn3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtn3.setForeground(new java.awt.Color(255, 255, 255));
        rbtn3.setText("3");
        rbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn3ActionPerformed(evt);
            }
        });
        jpMenu.add(rbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed


    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void cboxTmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTmnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTmnActionPerformed

    private void cboxTmnComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cboxTmnComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTmnComponentAdded

    private void btnUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirsePartidaActionPerformed

        control.unirsePartida();
    }//GEN-LAST:event_btnUnirsePartidaActionPerformed

    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
        int tmn = 10;
        int nj = 2;
        switch (cboxTmn.getSelectedIndex()) {
            case 0:
                tmn = 10;
                break;
            case 1:
                tmn = 20;
                break;
            case 2:
                tmn = 30;
                break;
            default:
                System.out.println("ERROR");
        }
        if (rbtn2.isSelected()) {
            nj = 2;
        }
        if (rbtn3.isSelected()) {
            nj = 3;
        }
        if (rbtn4.isSelected()) {
            nj = 4;
        }
        control.crearPartida(tmn, nj);
    }//GEN-LAST:event_btnCrearPartidaActionPerformed

    private void rbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnUnirsePartida;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JComboBox<String> cboxTmn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lbTituloNumeroJugadores;
    private javax.swing.JLabel lblLogoCrearPartida;
    private javax.swing.JLabel lblTituloCrearPartida;
    private javax.swing.JLabel lbtituloTamañoTab;
    private javax.swing.JLabel lbtituloTamañoTab1;
    private javax.swing.JRadioButton rbtn2;
    private javax.swing.JRadioButton rbtn3;
    private javax.swing.JRadioButton rbtn4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(ImdlMenu modelo) {
        switch (modelo.obtenerEstado()) {
            case "abrir":
                this.setVisible(true);
                break;
            case "cambiar":
                control.abrirVentanaSiguiente();
                this.dispose();
                break;
            default:
                System.out.println("n/a");
        }
    }
}
