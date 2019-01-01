package cuartitoazul;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Gerardo Rubio and Ricardo Castillo.
 */
public class Login extends javax.swing.JFrame {

    private java.sql.Connection con;
    private java.sql.Statement stmt;
    private int x, y;

    /**
     * Creates new form Login
     */
    public Login() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); //centra frame en mi pantalla
        setIconImage(new ImageIcon(getClass().getResource("/cuartitoazul/imagenes/logochico.png")).getImage());
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

    public void acceder(String usuario, String pass) throws UnsupportedLookAndFeelException, SQLException {
        DBconnect();
        String cap = "";
        String sql = "SELECT * FROM usuarios WHERE usuario='" + usuario + "' && contra='" + pass + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("usuario");
            }
            if (cap.equals("")) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos.", "Error de inicio de sesion", JOptionPane.ERROR_MESSAGE);
            } else {
                Menu_Principal a = new Menu_Principal();
                a.setVisible(true);
                a.JLBienvenidoEdit.setText(TXTUsuario.getText());
                this.setVisible(false);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        con.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        TXTUsuario = new javax.swing.JTextField();
        TXTContra = new javax.swing.JPasswordField();
        btn_Cancelar = new javax.swing.JButton();
        btn_Ingresar = new javax.swing.JButton();
        lbl_IniciarSesion = new javax.swing.JLabel();
        JLLogo = new javax.swing.JLabel();
        JLUsuario = new javax.swing.JLabel();
        JLContra = new javax.swing.JLabel();
        JBMin = new javax.swing.JLabel();
        JBCerrar = new javax.swing.JLabel();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(340, 449));

        PanelContenedor.setPreferredSize(new java.awt.Dimension(340, 465));
        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        PanelContenedor.add(TXTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, 30));

        TXTContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTContraKeyPressed(evt);
            }
        });
        PanelContenedor.add(TXTContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, 30));

        btn_Cancelar.setBackground(new java.awt.Color(122, 34, 34));
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        PanelContenedor.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 150, 40));

        btn_Ingresar.setBackground(new java.awt.Color(60, 34, 6));
        btn_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        PanelContenedor.add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 150, 40));

        lbl_IniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/Login/iniciar_sesion.png"))); // NOI18N
        PanelContenedor.add(lbl_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 310, 100));

        JLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/Login/CuartitoAzulChico.png"))); // NOI18N
        PanelContenedor.add(JLLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 120, 80));

        JLUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        JLUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JLUsuario.setText("Usuario");
        PanelContenedor.add(JLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 20));

        JLContra.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        JLContra.setForeground(new java.awt.Color(255, 255, 255));
        JLContra.setText("Contraseña");
        PanelContenedor.add(JLContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 20));

        JBMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Minimizar.png"))); // NOI18N
        JBMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBMinMouseClicked(evt);
            }
        });
        PanelContenedor.add(JBMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 20, 20));

        JBCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Cerrar.png"))); // NOI18N
        JBCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBCerrarMouseClicked(evt);
            }
        });
        PanelContenedor.add(JBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 20, 20));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/Login/Fondo.jpg"))); // NOI18N
        lbl_Fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbl_FondoMouseDragged(evt);
            }
        });
        lbl_Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_FondoMousePressed(evt);
            }
        });
        PanelContenedor.add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 340, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        String usu = TXTUsuario.getText();
        String pass = new String(TXTContra.getPassword());
        try {
            acceder(usu, pass);
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void lbl_FondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FondoMousePressed
        x = evt.getX(); // este evento agarra las cordenadas de x y en las que estoy posicionado
        y = evt.getY();
    }//GEN-LAST:event_lbl_FondoMousePressed

    private void lbl_FondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FondoMouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y); //cuando tengo cordenasdas en x y ya las puedo mover donde quiera
    }//GEN-LAST:event_lbl_FondoMouseDragged

    private void JBMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMinMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_JBMinMouseClicked

    private void JBCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBCerrarMouseClicked

    private void TXTContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTContraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String usu = TXTUsuario.getText();
            String pass = new String(TXTContra.getPassword());
            try {
                acceder(usu, pass);
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println(ex);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_TXTContraKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JBCerrar;
    private javax.swing.JLabel JBMin;
    private javax.swing.JLabel JLContra;
    private javax.swing.JLabel JLLogo;
    private javax.swing.JLabel JLUsuario;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPasswordField TXTContra;
    private javax.swing.JTextField TXTUsuario;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_IniciarSesion;
    // End of variables declaration//GEN-END:variables
}
