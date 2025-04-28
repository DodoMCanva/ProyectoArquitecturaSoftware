package iniciar;

import Interfaz.Observador;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class frmCrearCuenta extends javax.swing.JFrame implements Observador<ImdlCrearCuenta> {

    private ctrlCrearCuenta control;

    public frmCrearCuenta(ctrlCrearCuenta control) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
        this.control = control;
    }

    private void cargarAvatares() {
        // Solo los nombres amigables
        cboxAvatar.addItem("Avatar 1");
        cboxAvatar.addItem("Avatar 2");
        cboxAvatar.addItem("Avatar 3");
        cboxAvatar.addItem("Avatar 4");
        cboxAvatar.addItem("Avatar 5");
        cboxAvatar.addItem("Avatar 6");
        cboxAvatar.addItem("Avatar 7");
        cboxAvatar.addItem("Avatar 8");
        cboxAvatar.addItem("Avatar 9");
        cboxAvatar.addItem("Avatar 10");
    }

    private String[] nombresArchivos = {
        "1.png", "2.png", "3.png", "4.png", "5.png",
        "6.png", "7.png", "8.png", "9.png", "10.png"
    };

   

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
        lblImagenAvatar = new javax.swing.JLabel();

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
        cboxAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAvatarActionPerformed(evt);
            }
        });
        jpCrearCuenta.add(cboxAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 230, 50));

        lbTituloAvatar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTituloAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloAvatar.setText("Avatar");
        jpCrearCuenta.add(lbTituloAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jpCrearCuenta.add(lblImagenAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

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
        String nombreUsuario = txtNombreUsuario.getText();
        int indiceSeleccionado = cboxAvatar.getSelectedIndex();

        if (indiceSeleccionado >= 0) {
            String nombreArchivo = nombresArchivos[indiceSeleccionado];
            control.crearJugador(nombreUsuario, nombreArchivo);
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un avatar");

}    }//GEN-LAST:event_btnCrearcuentaActionPerformed

    private void cboxAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAvatarActionPerformed
        control.cambiarAvatar();

    }//GEN-LAST:event_cboxAvatarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearcuenta;
    private javax.swing.JComboBox<String> cboxAvatar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpCrearCuenta;
    private javax.swing.JLabel lbTituloAvatar;
    private javax.swing.JLabel lbTituloNombreUsuario;
    private javax.swing.JLabel lblImagenAvatar;
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
            case "cambiar avatar":
                int indiceSeleccionado = cboxAvatar.getSelectedIndex();
                if (indiceSeleccionado >= 0) {
                    String rutaImagen = "/imagenes/" + nombresArchivos[indiceSeleccionado];
                    ImageIcon icono = new ImageIcon(getClass().getResource(rutaImagen));

                    // Opcional: escalar la imagen para que no se vea gigante
                    Image imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    lblImagenAvatar.setIcon(new ImageIcon(imagen));
                } else {
                    lblImagenAvatar.setIcon(null);
                }
            default:
                System.out.println("n/a");
        }
    }
}
