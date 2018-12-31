package cuartitoazul;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 *
 * @author Gerardo Rubio and Ricardo Castillo
 */
public class Login extends javax.swing.JFrame {

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
        JBMin = new javax.swing.JButton();
        JBCerrar = new javax.swing.JButton();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(340, 449));

        PanelContenedor.setPreferredSize(new java.awt.Dimension(340, 465));
        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        PanelContenedor.add(TXTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 200, 30));
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

        JBMin.setBackground(new java.awt.Color(153, 153, 153));
        JBMin.setForeground(new java.awt.Color(153, 153, 153));
        JBMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/minimizar.png"))); // NOI18N
        JBMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMinActionPerformed(evt);
            }
        });
        PanelContenedor.add(JBMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, -1));

        JBCerrar.setBackground(new java.awt.Color(153, 153, 153));
        JBCerrar.setForeground(new java.awt.Color(153, 153, 153));
        JBCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/cerrar.png"))); // NOI18N
        JBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrarActionPerformed(evt);
            }
        });
        PanelContenedor.add(JBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, -1));

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
        this.dispose();
        Menu_Principal menu = new Menu_Principal();
        menu.setVisible(true);
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

    private void JBMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMinActionPerformed
        // evento minimizar
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_JBMinActionPerformed

    private void JBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrarActionPerformed
        // evento cerrar
        System.exit(0);
    }//GEN-LAST:event_JBCerrarActionPerformed

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
    private javax.swing.JButton JBCerrar;
    private javax.swing.JButton JBMin;
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
