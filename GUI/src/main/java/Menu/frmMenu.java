
package Menu;

import iniciar.frmCrearCuenta;

/**
 *
 * @author Equipo
 */
public class frmMenu extends javax.swing.JFrame {

    public frmMenu() {
        initComponents();
        setSize(new java.awt.Dimension(900, 550));
        setPreferredSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        cbxTamañoTablero = new javax.swing.JComboBox<>();
        lblTituloCrearPartida = new javax.swing.JLabel();
        btnVolverMenu = new javax.swing.JButton();
        lbtituloTamañoTab = new javax.swing.JLabel();
        SpNumeroJugadores = new javax.swing.JSpinner();
        lblTituloCodigoPartida = new javax.swing.JLabel();
        btnUnirsePartida = new javax.swing.JButton();
        lbTituloNumeroJugadores = new javax.swing.JLabel();
        lblLogoCrearPartida = new javax.swing.JLabel();
        lbtituloTamañoTab1 = new javax.swing.JLabel();
        txtCodigoPartida1 = new javax.swing.JTextField();
        btnCrearPartida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));

        jpMenu.setBackground(new java.awt.Color(0, 0, 0));
        jpMenu.setPreferredSize(new java.awt.Dimension(900, 500));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxTamañoTablero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "10x10", "20x20", "30x30" }));
        cbxTamañoTablero.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cbxTamañoTableroComponentAdded(evt);
            }
        });
        cbxTamañoTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTamañoTableroActionPerformed(evt);
            }
        });
        jpMenu.add(cbxTamañoTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 230, -1));

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
        jpMenu.add(SpNumeroJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 230, -1));

        lblTituloCodigoPartida.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTituloCodigoPartida.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCodigoPartida.setText("Codigo Partida");
        jpMenu.add(lblTituloCodigoPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, -1));

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
        jpMenu.add(txtCodigoPartida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 230, -1));

        btnCrearPartida.setBackground(new java.awt.Color(204, 255, 255));
        btnCrearPartida.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCrearPartida.setText("CREAR PARTIDA");
        btnCrearPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPartidaActionPerformed(evt);
            }
        });
        jpMenu.add(btnCrearPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 200, 50));

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

    private void cbxTamañoTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTamañoTableroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTamañoTableroActionPerformed

    private void cbxTamañoTableroComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cbxTamañoTableroComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTamañoTableroComponentAdded

    private void btnUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirsePartidaActionPerformed
        
    }//GEN-LAST:event_btnUnirsePartidaActionPerformed

    private void btnCrearPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPartidaActionPerformed
        

    }//GEN-LAST:event_btnCrearPartidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpNumeroJugadores;
    private javax.swing.JButton btnCrearPartida;
    private javax.swing.JButton btnUnirsePartida;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JComboBox<String> cbxTamañoTablero;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lbTituloNumeroJugadores;
    private javax.swing.JLabel lblLogoCrearPartida;
    private javax.swing.JLabel lblTituloCodigoPartida;
    private javax.swing.JLabel lblTituloCrearPartida;
    private javax.swing.JLabel lbtituloTamañoTab;
    private javax.swing.JLabel lbtituloTamañoTab1;
    private javax.swing.JTextField txtCodigoPartida1;
    // End of variables declaration//GEN-END:variables
}
