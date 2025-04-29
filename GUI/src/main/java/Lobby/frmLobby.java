package Lobby;

import Interfaz.Observador;
import Menu.frmMenu;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;

/**
 *
 * @author Equipo
 */
public class frmLobby extends javax.swing.JFrame implements Observador<ImdlLobby> {

    private ctrlLobby control;

    private Map<Integer, Color> coloresTableroPersonalizados = new HashMap<>();

    /**
     * Creates new form frmLobby
     */
    public frmLobby(ctrlLobby control) {
        initComponents();
        setSize(new java.awt.Dimension(900, 550));
        setPreferredSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
        this.control = control;

        inicializarCombosColor();
        configurarColorPrevisualizacion();

    }

    private void inicializarCombosColor() {
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja", "Rosa", "Morado", "Gris", "Negro"};

        comboColor1.setModel(new javax.swing.DefaultComboBoxModel<>(colores));
        comboColor2.setModel(new javax.swing.DefaultComboBoxModel<>(colores));
        comboColor3.setModel(new javax.swing.DefaultComboBoxModel<>(colores));
        comboColor4.setModel(new javax.swing.DefaultComboBoxModel<>(colores));
    }

    private void configurarColorPrevisualizacion() {
        lblColor1.setOpaque(true);
        lblColor2.setOpaque(true);
        lblColor3.setOpaque(true);
        lblColor4.setOpaque(true);

        comboColor1.addActionListener(e -> lblColor1.setBackground(obtenerColorPorNombre((String) comboColor1.getSelectedItem())));
        comboColor2.addActionListener(e -> lblColor2.setBackground(obtenerColorPorNombre((String) comboColor2.getSelectedItem())));
        comboColor3.addActionListener(e -> lblColor3.setBackground(obtenerColorPorNombre((String) comboColor3.getSelectedItem())));
        comboColor4.addActionListener(e -> lblColor4.setBackground(obtenerColorPorNombre((String) comboColor4.getSelectedItem())));
    }

    private void guardarColoresSeleccionados() {
        coloresTableroPersonalizados.put(1, obtenerColorPorNombre((String) comboColor1.getSelectedItem()));
        coloresTableroPersonalizados.put(2, obtenerColorPorNombre((String) comboColor2.getSelectedItem()));
        coloresTableroPersonalizados.put(3, obtenerColorPorNombre((String) comboColor3.getSelectedItem()));
        coloresTableroPersonalizados.put(4, obtenerColorPorNombre((String) comboColor4.getSelectedItem()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSolicitarInicio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblImagenUsuario = new javax.swing.JLabel();
        lblImagenUsuario1 = new javax.swing.JLabel();
        lblImagenUsuario2 = new javax.swing.JLabel();
        lblImagenUsuario3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboColor1 = new javax.swing.JComboBox<>();
        comboColor2 = new javax.swing.JComboBox<>();
        comboColor3 = new javax.swing.JComboBox<>();
        comboColor4 = new javax.swing.JComboBox<>();
        lblColor1 = new javax.swing.JLabel();
        lblColor2 = new javax.swing.JLabel();
        lblColor3 = new javax.swing.JLabel();
        lblColor4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        comboColor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        comboColor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboColor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        comboColor3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboColor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        comboColor4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboColor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        lblColor1.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(lblColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        lblColor2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblColor2.setDoubleBuffered(true);
        lblColor2.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(lblColor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        lblColor3.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(lblColor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        lblColor4.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(lblColor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel6.setText("Color jugador");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel7.setText("Color jugador");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel8.setText("Color jugador");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        jLabel9.setText("Color jugador");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

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

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSolicitarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarInicioActionPerformed
        guardarColoresSeleccionados();  
        control.abrirVentanaSiguiente();
    }//GEN-LAST:event_btnSolicitarInicioActionPerformed

    public JButton getBtnSolicitarInicio() {
        return btnSolicitarInicio;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSolicitarInicio;
    private javax.swing.JComboBox<String> comboColor1;
    private javax.swing.JComboBox<String> comboColor2;
    private javax.swing.JComboBox<String> comboColor3;
    private javax.swing.JComboBox<String> comboColor4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColor1;
    private javax.swing.JLabel lblColor2;
    private javax.swing.JLabel lblColor3;
    private javax.swing.JLabel lblColor4;
    private javax.swing.JLabel lblImagenUsuario;
    private javax.swing.JLabel lblImagenUsuario1;
    private javax.swing.JLabel lblImagenUsuario2;
    private javax.swing.JLabel lblImagenUsuario3;
    // End of variables declaration//GEN-END:variables

    private Color obtenerColorPorNombre(String nombre) {
        switch (nombre) {
            case "Rojo":
                return Color.RED;
            case "Verde":
                return Color.GREEN;
            case "Azul":
                return Color.BLUE;
            case "Amarillo":
                return Color.YELLOW;
            case "Naranja":
                return Color.ORANGE;
            case "Rosa":
                return Color.PINK;
            case "Morado":
                return new Color(128, 0, 128); // púrpura
            case "Gris":
                return Color.GRAY;
            case "Negro":
                return Color.BLACK;
            default:
                return Color.WHITE;
        }
    }

    @Override
    public void actualizar(ImdlLobby modelo) {
        switch (modelo.obtenerEstado()) {
            case "abrir":
                this.setVisible(true);
                break;
            case "Partida Lista":
                control.abrirVentanaSiguiente();
                this.dispose();
                break;
            default:
                System.out.println("n/a");
        }
    }
}
