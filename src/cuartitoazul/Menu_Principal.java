package cuartitoazul;

import com.lowagie.text.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.ImageIcon;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Gerardo Rubio and Ricardo Castillo.
 */
public class Menu_Principal extends javax.swing.JFrame {

    private int x, y;

    public Menu_Principal() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); //centra frame en mi pantalla
        setIconImage(new ImageIcon(getClass().getResource("/cuartitoazul/imagenes/logochico.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_CerrarSesion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_AjustesMenu = new javax.swing.JButton();
        btn_Reportes1 = new javax.swing.JButton();
        btn_Reportes = new javax.swing.JButton();
        btn_Caja = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();
        btn_Usuarios = new javax.swing.JButton();
        btn_Personal = new javax.swing.JButton();
        JBCerrar = new javax.swing.JLabel();
        JBMin = new javax.swing.JLabel();
        JLVilox = new javax.swing.JLabel();
        JLTitulo = new javax.swing.JLabel();
        JLBievenido = new javax.swing.JLabel();
        JLBienvenidoEdit = new javax.swing.JLabel();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 438));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_CerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_CerrarSesion.setForeground(new java.awt.Color(44, 43, 6));
        lbl_CerrarSesion.setText("Cerrar Sesión");
        lbl_CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_CerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_CerrarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_CerrarSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_CerrarSesionMouseReleased(evt);
            }
        });
        jPanel1.add(lbl_CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 90, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 425, 140, 10));

        btn_AjustesMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Ajustes.png"))); // NOI18N
        btn_AjustesMenu.setText("Ajustes de Menu");
        btn_AjustesMenu.setFocusable(false);
        btn_AjustesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AjustesMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AjustesMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 210, 70));

        btn_Reportes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Corte.png"))); // NOI18N
        btn_Reportes1.setText("Corte de Caja\n");
        btn_Reportes1.setFocusable(false);
        btn_Reportes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Reportes1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Reportes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 140, 70));

        btn_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Reportes.png"))); // NOI18N
        btn_Reportes.setText("Reportes");
        btn_Reportes.setFocusable(false);
        btn_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 130, 70));

        btn_Caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Caja.png"))); // NOI18N
        btn_Caja.setText("Caja");
        btn_Caja.setFocusable(false);
        btn_Caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CajaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 130, 70));

        btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Menu.png"))); // NOI18N
        btn_Menu.setText("Menu");
        btn_Menu.setFocusable(false);
        btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 130, 70));

        btn_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Usuarios.png"))); // NOI18N
        btn_Usuarios.setText("Usuarios");
        btn_Usuarios.setFocusable(false);
        btn_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 140, 70));

        btn_Personal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Personal.png"))); // NOI18N
        btn_Personal.setText("Personal");
        btn_Personal.setFocusable(false);
        btn_Personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PersonalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 130, 70));

        JBCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Cerrar.png"))); // NOI18N
        JBCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(JBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 3, 20, 20));

        JBMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Minimizar.png"))); // NOI18N
        JBMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBMinMouseClicked(evt);
            }
        });
        jPanel1.add(JBMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 3, 20, 20));

        JLVilox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/vilox.png"))); // NOI18N
        jPanel1.add(JLVilox, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 50, 70));

        JLTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/MenuPrincipal.png"))); // NOI18N
        jPanel1.add(JLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 370, 100));

        JLBievenido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JLBievenido.setText("Bienvenido(a):");
        jPanel1.add(JLBievenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 406, -1, 30));

        JLBienvenidoEdit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(JLBienvenidoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 160, 20));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/fondo.jpg"))); // NOI18N
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
        jPanel1.add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuariosActionPerformed
        Crear_Usuario a = new Crear_Usuario();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_UsuariosActionPerformed

    private void btn_PersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PersonalActionPerformed

    }//GEN-LAST:event_btn_PersonalActionPerformed

    private void JBMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBMinMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_JBMinMouseClicked

    private void JBCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JBCerrarMouseClicked

    private void btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuActionPerformed
        Menu_Platillos a = new Menu_Platillos();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_MenuActionPerformed

    private void btn_CajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CajaActionPerformed

    private void btn_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReportesActionPerformed

    private void btn_Reportes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Reportes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Reportes1ActionPerformed

    private void lbl_CerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CerrarSesionMouseEntered
        // TODO add your handling code here:
        lbl_CerrarSesion.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
    }//GEN-LAST:event_lbl_CerrarSesionMouseEntered

    private void lbl_CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CerrarSesionMouseExited
        // TODO add your handling code here:
        lbl_CerrarSesion.setFont(new java.awt.Font("Segoe UI", Font.NORMAL, 12));
    }//GEN-LAST:event_lbl_CerrarSesionMouseExited

    private void lbl_CerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CerrarSesionMousePressed
        // TODO add your handling code here:
        lbl_CerrarSesion.setFont(new java.awt.Font("Segoe UI", Font.NORMAL, 12));
    }//GEN-LAST:event_lbl_CerrarSesionMousePressed

    private void lbl_CerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CerrarSesionMouseReleased
        // TODO add your handling code here:
        lbl_CerrarSesion.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
    }//GEN-LAST:event_lbl_CerrarSesionMouseReleased

    private void lbl_CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CerrarSesionMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_lbl_CerrarSesionMouseClicked

    private void lbl_FondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FondoMousePressed
        x = evt.getX(); // este evento agarra las cordenadas de x y en las que estoy posicionado
        y = evt.getY();
    }//GEN-LAST:event_lbl_FondoMousePressed

    private void lbl_FondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FondoMouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y); //cuando tengo cordenasdas en x y ya las puedo mover donde quiera
    }//GEN-LAST:event_lbl_FondoMouseDragged

    private void btn_AjustesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AjustesMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu_Ajustes ajustes = new Menu_Ajustes();
        ajustes.setVisible(true);
    }//GEN-LAST:event_btn_AjustesMenuActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //Esta tres lineas tiene una propiedad de un tema que da mejor estetica
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MagmaSkin");//le damos un tema al sistema
        SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceTerracottaTheme");
        SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark. SubstanceWoodWatermark");
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JBCerrar;
    private javax.swing.JLabel JBMin;
    public javax.swing.JLabel JLBienvenidoEdit;
    private javax.swing.JLabel JLBievenido;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JLabel JLVilox;
    private javax.swing.JButton btn_AjustesMenu;
    private javax.swing.JButton btn_Caja;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_Personal;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JButton btn_Reportes1;
    private javax.swing.JButton btn_Usuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_CerrarSesion;
    private javax.swing.JLabel lbl_Fondo;
    // End of variables declaration//GEN-END:variables
}
