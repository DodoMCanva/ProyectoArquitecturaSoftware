
package Lobby;

import Menu.frmMenu;
import javax.swing.JButton;

/**
 *
 * @author Equipo
 */
public class frmLobby extends javax.swing.JFrame {

    /**
     * Creates new form frmLobby
     */
    public frmLobby() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSolicitarInicio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblImagenUsuario = new javax.swing.JLabel();
        lblImagenUsuario1 = new javax.swing.JLabel();
        lblImagenUsuario2 = new javax.swing.JLabel();
        lblImagenUsuario3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JUGADORES EN LOBBY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        btnSolicitarInicio.setBackground(new java.awt.Color(255, 51, 51));
        btnSolicitarInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSolicitarInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitarInicio.setText("SOLICITAR INICIO DE JUEGO");
        btnSolicitarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 220, 50));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jButton3.setText("Color del tablero");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        jButton4.setText("Color del tablero");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jButton5.setText("Color del tablero");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        jButton6.setText("Color del tablero");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        lblImagenUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(lblImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 130, 120));

        lblImagenUsuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(lblImagenUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 130, 120));

        lblImagenUsuario2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(lblImagenUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 130, 120));

        lblImagenUsuario3.setBackground(new java.awt.Color(255, 255, 255));
        lblImagenUsuario3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(lblImagenUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 130, 120));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmMenu menu = new frmMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSolicitarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarInicioActionPerformed
        
    }//GEN-LAST:event_btnSolicitarInicioActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        frmColoresTablas col = new frmColoresTablas();
        col.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frmColoresTablas col1 = new frmColoresTablas();
        col1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        frmColoresTablas col = new frmColoresTablas();
        col.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frmColoresTablas col = new frmColoresTablas();
        col.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public JButton getBtnSolicitarInicio() {
        return btnSolicitarInicio;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }



  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSolicitarInicio;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagenUsuario;
    private javax.swing.JLabel lblImagenUsuario1;
    private javax.swing.JLabel lblImagenUsuario2;
    private javax.swing.JLabel lblImagenUsuario3;
    // End of variables declaration//GEN-END:variables
}
