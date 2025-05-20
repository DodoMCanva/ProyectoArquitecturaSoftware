package Puntaje;

import Interfaz.Observador;
import Menu.frmMenu;
import Objetos.Jugador;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Equipo
 */
public class frmPuntaje extends javax.swing.JFrame implements Observador<ImdlPuntaje> {

    private ctrlPuntaje control;
    private ImageIcon icono;
    private Image imagen;

    /**
     * Creates new form frmScores
     */
    public frmPuntaje(ctrlPuntaje control) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNombre1ero = new javax.swing.JLabel();
        lblImagen1ero = new javax.swing.JLabel();
        lblImagen2do = new javax.swing.JLabel();
        lblNombre2do = new javax.swing.JLabel();
        lblImagen3ero = new javax.swing.JLabel();
        lblNombre3ero = new javax.swing.JLabel();
        lblImagen4to = new javax.swing.JLabel();
        lblNombre4to = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblpuntos4to = new javax.swing.JLabel();
        lblpuntos1ero = new javax.swing.JLabel();
        lblpuntos2do = new javax.swing.JLabel();
        lblpuntos3ero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setBackground(new java.awt.Color(51, 153, 255));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Ir al MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 427, 123, 52));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/The_Score_Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        lblNombre1ero.setText("---");
        jPanel1.add(lblNombre1ero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, -1));

        lblImagen1ero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblImagen1ero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 100));

        lblImagen2do.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblImagen2do, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 100, 100));

        lblNombre2do.setText("---");
        jPanel1.add(lblNombre2do, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 90, -1));

        lblImagen3ero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblImagen3ero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 100, 100));

        lblNombre3ero.setText("---");
        jPanel1.add(lblNombre3ero, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 90, -1));

        lblImagen4to.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblImagen4to, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 100, 100));

        lblNombre4to.setText("---");
        jPanel1.add(lblNombre4to, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 90, -1));

        jLabel2.setText("PRIMER LUGAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel3.setText("SEGUNDO LUGAR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel4.setText("CUARTO LUGAR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, -1, -1));

        jLabel5.setText("TERCER LUGAR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        lblpuntos4to.setText("0");
        jPanel1.add(lblpuntos4to, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 20, -1));

        lblpuntos1ero.setText("0");
        jPanel1.add(lblpuntos1ero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 20, -1));

        lblpuntos2do.setText("0");
        jPanel1.add(lblpuntos2do, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 20, -1));

        lblpuntos3ero.setText("0");
        jPanel1.add(lblpuntos3ero, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 20, -1));

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

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagen1ero;
    private javax.swing.JLabel lblImagen2do;
    private javax.swing.JLabel lblImagen3ero;
    private javax.swing.JLabel lblImagen4to;
    private javax.swing.JLabel lblNombre1ero;
    private javax.swing.JLabel lblNombre2do;
    private javax.swing.JLabel lblNombre3ero;
    private javax.swing.JLabel lblNombre4to;
    private javax.swing.JLabel lblpuntos1ero;
    private javax.swing.JLabel lblpuntos2do;
    private javax.swing.JLabel lblpuntos3ero;
    private javax.swing.JLabel lblpuntos4to;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar(ImdlPuntaje modelo) {
        switch (modelo.obtenerEstado()) {
            case "abrir":
                this.setVisible(true);
                cargarDatosJugadores(modelo);
                break;
            case "cambio":
                control.abrirVentanaSiguiente();
                this.dispose();
                break;
            default:
                System.out.println("n/a");
        }
    }
    
    public void cargarDatosJugadores(ImdlPuntaje modelo){
        Jugador[] jugadores = modelo.obtenerJugadores();

        lblNombre1ero.setText(jugadores[0].getNombre());
        lblpuntos1ero.setText(Integer.toString(jugadores[0].getPuntos()));
        icono = new ImageIcon(getClass().getResource("/imagenes/" + jugadores[0].getAvatar()));
        imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lblImagen1ero.setIcon(new ImageIcon(imagen));
        

        lblNombre2do.setText(jugadores[1].getNombre());
        lblpuntos2do.setText(Integer.toString(jugadores[1].getPuntos()));
        icono = new ImageIcon(getClass().getResource("/imagenes/" + jugadores[1].getAvatar()));
        imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        lblImagen2do.setIcon(new ImageIcon(imagen));
        

        if (jugadores[2] != null) {
            lblNombre3ero.setText(jugadores[2].getNombre());
            lblpuntos3ero.setText(Integer.toString(jugadores[2].getPuntos()));
            icono = new ImageIcon(getClass().getResource("/imagenes/" + jugadores[2].getAvatar()));
            imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            lblpuntos3ero.setIcon(new ImageIcon(imagen));
            
        }

        if (jugadores[3] != null) {
            lblNombre4to.setText(jugadores[3].getNombre());
            lblNombre4to.setText(Integer.toString(jugadores[3].getPuntos()));
            icono = new ImageIcon(getClass().getResource("/imagenes/" + jugadores[3].getAvatar()));
            imagen = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            lblNombre4to.setIcon(new ImageIcon(imagen));
            
        }

    
    }

}
