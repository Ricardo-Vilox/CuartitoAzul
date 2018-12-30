package cuartitoazul;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo Rubio and Ricardo Castillo
 */
public final class Crear_Usuario extends javax.swing.JFrame implements ItemListener {

    private int x, y;
    private java.sql.Connection con;
    private java.sql.Statement stmt, stmtt;

    /**
     * Creates new form Crear_Usuario
     */
    public Crear_Usuario() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); //centra frame en mi pantalla
        setIconImage(new ImageIcon(getClass().getResource("/cuartitoazul/imagenes/logochico.png")).getImage());
        TXT1.setVisible(false);
        JCContra.setVisible(false);
        JPanelUsuario.setVisible(false);
        JPanelModificar.setVisible(false);
        noborrar();
    }

    private void DBconnect() {
        String url = "jdbc:mysql://localhost/cuartito_azul";
        String user = "root";
        String pass = "";
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            System.err.println("Ocurrio Excepcion" + ex);
        }
    }

    public void verborrar() throws SQLException {
        DBconnect();
        JBConfirmar2.setVisible(true);
        JLUsuario2.setVisible(true);
        JCUsuario1.setVisible(true);
        try {
            stmtt = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        ResultSet temp = null;
        try {
            temp = stmtt.executeQuery("SELECT * FROM usuarios");
            while (temp.next()) {
                JCUsuario1.addItem(temp.getString("nombre"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        JCUsuario1.addItemListener(this);
        con.close();
    }
    public void verborrar2() throws SQLException {

        JBConfirmar2.setVisible(true);
        JLUsuario2.setVisible(true);
        JCUsuario1.setVisible(true);

    }

    public void noborrar() {
        JBConfirmar2.setVisible(false);
        JLUsuario2.setVisible(false);
        JCUsuario1.setVisible(false);
    }

    public void CambiarContraVer() throws SQLException {
        DBconnect();
        JLUsuario1.setVisible(true);
        JCUsuario.setVisible(true);
        JLUsuario1.setVisible(true);
        TXTConAn.setVisible(true);
        JLContra1.setVisible(true);
        TXTContra1.setVisible(true);
        JLConfirmarPass1.setVisible(true);
        TXTConfirmarPass1.setVisible(true);
        JBConfirmar1.setVisible(true);
        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        ResultSet temp = null;
        try {
            temp = stmt.executeQuery("SELECT * FROM usuarios");
            while (temp.next()) {
                JCUsuario.addItem(temp.getString("nombre"));
                JCContra.addItem(temp.getString("contra"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        JCUsuario.addItemListener(this);
        con.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panel1 = new org.edisoncor.gui.panel.Panel();
        JBCerrar = new javax.swing.JButton();
        JBMin = new javax.swing.JButton();
        JLTitulo = new javax.swing.JLabel();
        JBAtras = new javax.swing.JButton();
        JCContra = new javax.swing.JComboBox<>();
        JBCrearUs = new javax.swing.JButton();
        JBBorrarUs = new javax.swing.JButton();
        JCUsuario1 = new javax.swing.JComboBox<>();
        JLUsuario2 = new com.icm.components.metro.LabelMetroICM();
        JBCambiarContra = new javax.swing.JButton();
        TXT1 = new javax.swing.JTextField();
        JBConfirmar2 = new javax.swing.JButton();
        JPanelUsuario = new org.edisoncor.gui.panel.Panel();
        JLUsuario3 = new javax.swing.JLabel();
        TXTUsuario = new org.edisoncor.gui.textField.TextFieldRectBackground();
        JLTipo = new javax.swing.JLabel();
        JBConfirmar = new javax.swing.JButton();
        TXTNombre = new org.edisoncor.gui.textField.TextFieldRectBackground();
        JLNombre = new javax.swing.JLabel();
        JLUsuario = new javax.swing.JLabel();
        JLContra2 = new javax.swing.JLabel();
        JLConfirmarPass = new javax.swing.JLabel();
        JCTipoU = new javax.swing.JComboBox<>();
        TXTConfirmarPass = new javax.swing.JPasswordField();
        TXTContra = new javax.swing.JPasswordField();
        JPanelModificar = new org.edisoncor.gui.panel.Panel();
        JLPersonal = new javax.swing.JLabel();
        JBConfirmar1 = new javax.swing.JButton();
        JLConfirmarPass1 = new com.icm.components.metro.LabelMetroICM();
        TXTConfirmarPass1 = new javax.swing.JPasswordField();
        JLContra1 = new com.icm.components.metro.LabelMetroICM();
        TXTContra1 = new javax.swing.JPasswordField();
        JLUsuario1 = new com.icm.components.metro.LabelMetroICM();
        TXTConAn = new javax.swing.JPasswordField();
        JCUsuario = new javax.swing.JComboBox<>();
        JLConAn = new com.icm.components.metro.LabelMetroICM();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/fondogrande.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setColorPrimario(new java.awt.Color(0, 102, 255));
        panel1.setColorSecundario(new java.awt.Color(153, 153, 153));
        panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel1MouseDragged(evt);
            }
        });
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel1MousePressed(evt);
            }
        });
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCerrar.setBackground(new java.awt.Color(153, 153, 153));
        JBCerrar.setForeground(new java.awt.Color(153, 153, 153));
        JBCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/cerrar.png"))); // NOI18N
        JBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrarActionPerformed(evt);
            }
        });
        panel1.add(JBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, -1));

        JBMin.setBackground(new java.awt.Color(153, 153, 153));
        JBMin.setForeground(new java.awt.Color(153, 153, 153));
        JBMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/minimizar.png"))); // NOI18N
        JBMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMinActionPerformed(evt);
            }
        });
        panel1.add(JBMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, -1));

        JLTitulo.setFont(new java.awt.Font("Blackadder ITC", 0, 36)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLTitulo.setText("Crear Usuario");
        panel1.add(JLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 210, 30));

        panelImage1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 70));

        JBAtras.setText("Atras");
        JBAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtrasActionPerformed(evt);
            }
        });
        panelImage1.add(JBAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        panelImage1.add(JCContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 100, 30));

        JBCrearUs.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        JBCrearUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/btn_user.png"))); // NOI18N
        JBCrearUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCrearUsActionPerformed(evt);
            }
        });
        panelImage1.add(JBCrearUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 100));

        JBBorrarUs.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        JBBorrarUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/btn_elim.png"))); // NOI18N
        JBBorrarUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBorrarUsActionPerformed(evt);
            }
        });
        panelImage1.add(JBBorrarUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 100));

        JCUsuario1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JCUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCUsuario1ActionPerformed(evt);
            }
        });
        panelImage1.add(JCUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 150, 40));

        JLUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        JLUsuario2.setText("BORRAR USUARIO:");
        JLUsuario2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panelImage1.add(JLUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 140, 40));

        JBCambiarContra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        JBCambiarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/btn_modi.png"))); // NOI18N
        JBCambiarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCambiarContraActionPerformed(evt);
            }
        });
        panelImage1.add(JBCambiarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 100));
        panelImage1.add(TXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 90, 30));

        JBConfirmar2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBConfirmar2.setText("CONFIRMAR");
        JBConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConfirmar2ActionPerformed(evt);
            }
        });
        panelImage1.add(JBConfirmar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 150, 40));

        JPanelUsuario.setColorPrimario(new java.awt.Color(153, 153, 153));
        JPanelUsuario.setColorSecundario(new java.awt.Color(102, 102, 102));
        JPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLUsuario3.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        JLUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        JLUsuario3.setText("Agregar");
        JPanelUsuario.add(JLUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 40));

        TXTUsuario.setDescripcion("Ej. Juan");
        JPanelUsuario.add(TXTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, 30));

        JLTipo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLTipo.setForeground(new java.awt.Color(255, 255, 255));
        JLTipo.setText("Tipo Usuario");
        JPanelUsuario.add(JLTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 20));

        JBConfirmar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBConfirmar.setText("CONFIRMAR");
        JBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConfirmarActionPerformed(evt);
            }
        });
        JPanelUsuario.add(JBConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        TXTNombre.setDescripcion("Ej. Juan Herrera");
        JPanelUsuario.add(TXTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 140, 30));

        JLNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLNombre.setForeground(new java.awt.Color(255, 255, 255));
        JLNombre.setText("Nombre");
        JPanelUsuario.add(JLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 20));

        JLUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JLUsuario.setText("Usuario");
        JPanelUsuario.add(JLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 20));

        JLContra2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLContra2.setForeground(new java.awt.Color(255, 255, 255));
        JLContra2.setText("Contraseña");
        JPanelUsuario.add(JLContra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 20));

        JLConfirmarPass.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLConfirmarPass.setForeground(new java.awt.Color(255, 255, 255));
        JLConfirmarPass.setText("Confirmar Contraseña");
        JPanelUsuario.add(JLConfirmarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 20));

        JCTipoU.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JCTipoU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecciona Opcion-", "Mesero", "Cocinero", "Encargado", "Gerente", "Dueño" }));
        JPanelUsuario.add(JCTipoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 160, -1));
        JPanelUsuario.add(TXTConfirmarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 30));
        JPanelUsuario.add(TXTContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 30));

        panelImage1.add(JPanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 230, 330));

        JPanelModificar.setColorPrimario(new java.awt.Color(153, 153, 153));
        JPanelModificar.setColorSecundario(new java.awt.Color(102, 102, 102));
        JPanelModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLPersonal.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        JLPersonal.setForeground(new java.awt.Color(255, 255, 255));
        JLPersonal.setText("Modificar");
        JPanelModificar.add(JLPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 30));

        JBConfirmar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JBConfirmar1.setText("CONFIRMAR");
        JBConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConfirmar1ActionPerformed(evt);
            }
        });
        JPanelModificar.add(JBConfirmar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        JLConfirmarPass1.setForeground(new java.awt.Color(255, 255, 255));
        JLConfirmarPass1.setText("Confirmar Contraseña");
        JPanelModificar.add(JLConfirmarPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 20));
        JPanelModificar.add(TXTConfirmarPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 140, 30));

        JLContra1.setForeground(new java.awt.Color(255, 255, 255));
        JLContra1.setText("Nueva Contraseña");
        JPanelModificar.add(JLContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 20));
        JPanelModificar.add(TXTContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 30));

        JLUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        JLUsuario1.setText("Usuario");
        JPanelModificar.add(JLUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 20));
        JPanelModificar.add(TXTConAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, -1));

        JCUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JPanelModificar.add(JCUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, 30));

        JLConAn.setForeground(new java.awt.Color(255, 255, 255));
        JLConAn.setText("Contraseña Antigua");
        JPanelModificar.add(JLConAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        panelImage1.add(JPanelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 230, 330));

        getContentPane().add(panelImage1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrarActionPerformed
        // evento cerrar
        System.exit(0);
    }//GEN-LAST:event_JBCerrarActionPerformed

    private void JBMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMinActionPerformed
        // evento minimizar
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_JBMinActionPerformed

    private void panel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y); //cuando tengo cordenasdas en x y ya las puedo mover donde quiera
    }//GEN-LAST:event_panel1MouseDragged

    private void panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MousePressed
        x = evt.getX(); // este evento agarra las cordenadas de x y en las que estoy posicionado
        y = evt.getY();
    }//GEN-LAST:event_panel1MousePressed

    private void JBAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtrasActionPerformed
        Menu_Principal a = new Menu_Principal();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBAtrasActionPerformed

    private void JBConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConfirmar1ActionPerformed
        DBconnect();
        String cadena1 = TXTConAn.getText();
        String cadena2 = (String) JCContra.getSelectedItem();

        String cadena3 = TXTContra1.getText();
        String cadena4 = TXTConfirmarPass1.getText();

        if (cadena1 == null ? cadena2 == null : cadena1.equals(cadena2)) {
            TXT1.setText("1");
        } else {
            JOptionPane.showMessageDialog(null, "Tus contraseñas antigua esta incorrecta");
        }
        if (cadena3 == null ? cadena4 == null : cadena3.equals(cadena4) && TXT1.getText().equals("1") && !TXTContra1.getText().isEmpty() && !TXTConfirmarPass1.getText().isEmpty()) {
            int editat = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres modificar la contraseña?");
            if (editat == JOptionPane.YES_OPTION) {
                try {
                    PreparedStatement pst = con.prepareStatement("update usuarios set contra= '" + TXTConfirmarPass1.getText() + "' WHERE nombre= '" + JCUsuario.getSelectedItem() + "'");
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Modificacion exitosa");
                    this.dispose();
                    Menu_Principal b = new Menu_Principal();
                    b.setVisible(true);
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tu contraseña nueva no coincide o esta vacia");
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Crear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBConfirmar1ActionPerformed

    private void JBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConfirmarActionPerformed
        DBconnect();
        String cadena1 = TXTContra.getText();
        String cadena2 = TXTConfirmarPass.getText();

        if (TXTNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Te falto llenar el nombre!", "error", JOptionPane.ERROR_MESSAGE);
            TXTNombre.setBackground(Color.red);
        } else if (TXTUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Te falto llenar el usuario!", "error", JOptionPane.ERROR_MESSAGE);
            TXTUsuario.setBackground(Color.red);
        } else if (TXTContra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Te falto llenar la contraseña!", "error", JOptionPane.ERROR_MESSAGE);
            TXTContra.setBackground(Color.red);
        } else if (cadena1 == null ? cadena2 == null : cadena1.equals(cadena2)) {
            if (JCTipoU.getSelectedItem() != "-Selecciona Opcion-") {
                try {
                    stmt = con.createStatement();// para evitar consultas a la BD
                    stmt.executeUpdate("insert into usuarios (nombre,usuario,contra,tipo_usuario) values ('" + TXTNombre.getText() + "','" + TXTUsuario.getText() + "','" + TXTContra.getText() + "','" + JCTipoU.getSelectedItem() + "')");
                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
                    this.dispose();
                    Crear_Usuario a = new Crear_Usuario();
                    a.setVisible(true);

                } catch (SQLException | HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error, contacte al encargado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Asignale un cargo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tus contraseñas no coinciden");
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Crear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBConfirmarActionPerformed

    private void JBCrearUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCrearUsActionPerformed
        noborrar();
        JPanelUsuario.setVisible(true);
        JPanelModificar.setVisible(false);
    }//GEN-LAST:event_JBCrearUsActionPerformed

    private void JBBorrarUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBorrarUsActionPerformed
        if (JCUsuario1.getSelectedItem() == null) {
            try {
                verborrar();
            } catch (SQLException ex) {
                Logger.getLogger(Crear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            JPanelUsuario.setVisible(false);
            JPanelModificar.setVisible(false);
        } else {
            try {
                verborrar2();
            } catch (SQLException ex) {
                Logger.getLogger(Crear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            JPanelUsuario.setVisible(false);
            JPanelModificar.setVisible(false);
        }

    }//GEN-LAST:event_JBBorrarUsActionPerformed

    private void JCUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCUsuario1ActionPerformed

    private void JBCambiarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCambiarContraActionPerformed
        if (JCUsuario.getSelectedItem() == null) {
            JPanelModificar.setVisible(true);
            JPanelUsuario.setVisible(false);
            noborrar();
            try {
                CambiarContraVer();
            } catch (SQLException ex) {
                Logger.getLogger(Crear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JPanelModificar.setVisible(true);
            JPanelUsuario.setVisible(false);
            noborrar();
        }

    }//GEN-LAST:event_JBCambiarContraActionPerformed

    private void JBConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConfirmar2ActionPerformed
        DBconnect();
        int editat = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar al usuario " + JCUsuario1.getSelectedItem() + "?");
        if (editat == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement pst = con.prepareStatement("DELETE FROM usuarios WHERE nombre='" + JCUsuario1.getSelectedItem() + "'");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
                this.dispose();
                Crear_Usuario b = new Crear_Usuario();
                b.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Crear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBConfirmar2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Crear_Usuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAtras;
    private javax.swing.JButton JBBorrarUs;
    private javax.swing.JButton JBCambiarContra;
    private javax.swing.JButton JBCerrar;
    private javax.swing.JButton JBConfirmar;
    private javax.swing.JButton JBConfirmar1;
    private javax.swing.JButton JBConfirmar2;
    private javax.swing.JButton JBCrearUs;
    private javax.swing.JButton JBMin;
    private javax.swing.JComboBox<String> JCContra;
    private javax.swing.JComboBox<String> JCTipoU;
    private javax.swing.JComboBox<String> JCUsuario;
    private javax.swing.JComboBox<String> JCUsuario1;
    private com.icm.components.metro.LabelMetroICM JLConAn;
    private javax.swing.JLabel JLConfirmarPass;
    private com.icm.components.metro.LabelMetroICM JLConfirmarPass1;
    private com.icm.components.metro.LabelMetroICM JLContra1;
    private javax.swing.JLabel JLContra2;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLPersonal;
    private javax.swing.JLabel JLTipo;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JLabel JLUsuario;
    private com.icm.components.metro.LabelMetroICM JLUsuario1;
    private com.icm.components.metro.LabelMetroICM JLUsuario2;
    private javax.swing.JLabel JLUsuario3;
    private org.edisoncor.gui.panel.Panel JPanelModificar;
    private org.edisoncor.gui.panel.Panel JPanelUsuario;
    private javax.swing.JTextField TXT1;
    private javax.swing.JPasswordField TXTConAn;
    private javax.swing.JPasswordField TXTConfirmarPass;
    private javax.swing.JPasswordField TXTConfirmarPass1;
    private javax.swing.JPasswordField TXTContra;
    private javax.swing.JPasswordField TXTContra1;
    private org.edisoncor.gui.textField.TextFieldRectBackground TXTNombre;
    private org.edisoncor.gui.textField.TextFieldRectBackground TXTUsuario;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void itemStateChanged(ItemEvent ie) {
        ResultSet temp = null;
        int g = JCUsuario.getSelectedIndex();
        JCContra.setSelectedIndex(g);
    }
}
