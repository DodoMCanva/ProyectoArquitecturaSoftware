
package iniciar;
import Interfaz.Observador;

/**
 *
 * @author Equipo
 */
public class frmCrearCuenta extends javax.swing.JFrame implements Observador<ImdlCrearCuenta>{
    private ctrlCrearCuenta control;
    
    public frmCrearCuenta(ctrlCrearCuenta control) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCrearCuenta = new javax.swing.JPanel();
        txtNombreUsuario = new javax.swing.JTextField();
        lbTituloNombreUsuario = new javax.swing.JLabel();
        btnCrearcuenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboxAvatar = new javax.swing.JComboBox<>();
        lbTituloAvatar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpCrearCuenta.setBackground(new java.awt.Color(0, 0, 0));
        jpCrearCuenta.setMinimumSize(new java.awt.Dimension(900, 500));
        jpCrearCuenta.setPreferredSize(new java.awt.Dimension(900, 500));
        jpCrearCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpCrearCuenta.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 230, -1));

        lbTituloNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTituloNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloNombreUsuario.setText("Nombre");
        jpCrearCuenta.add(lbTituloNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        btnCrearcuenta.setText("ENTRAR");
        btnCrearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearcuentaActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(btnCrearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 200, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logonuevo.jpg"))); // NOI18N
        jpCrearCuenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 270, 120));

        cboxAvatar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpCrearCuenta.add(cboxAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 230, 50));

        lbTituloAvatar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTituloAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloAvatar.setText("Avatar");
        jpCrearCuenta.add(lbTituloAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearcuentaActionPerformed
        control.crearJugador(txtNombreUsuario.getText(), "");
    }//GEN-LAST:event_btnCrearcuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearcuenta;
    private javax.swing.JComboBox<String> cboxAvatar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpCrearCuenta;
    private javax.swing.JLabel lbTituloAvatar;
    private javax.swing.JLabel lbTituloNombreUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables


    @Override
    public void actualizar(ImdlCrearCuenta modelo) {
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
