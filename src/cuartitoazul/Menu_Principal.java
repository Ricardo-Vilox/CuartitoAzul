package cuartitoazul;

import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.ImageIcon;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Gerardo Rubio and Ricardo Castillo
 */
public class Menu_Principal extends javax.swing.JFrame {

    private int x, y;

    public Menu_Principal() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); //centra frame en mi pantalla
        JPanelPersonal.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/cuartitoazul/imagenes/logochico.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panel1 = new org.edisoncor.gui.panel.Panel();
        JBCerrar = new javax.swing.JButton();
        JBMin = new javax.swing.JButton();
        JLTitulo = new javax.swing.JLabel();
        JLLogo = new javax.swing.JLabel();
        JBUsuarios = new javax.swing.JButton();
        JBPersonal = new javax.swing.JButton();
        JLVilox = new javax.swing.JLabel();
        JPanelPersonal = new org.edisoncor.gui.panel.Panel();
        JBCrearP = new javax.swing.JButton();
        JBEditarP = new javax.swing.JButton();
        JLPersonal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/fondogrande.png"))); // NOI18N
        panelImage1.setPreferredSize(new java.awt.Dimension(790, 360));
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
        panel1.add(JBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 30, -1));

        JBMin.setBackground(new java.awt.Color(153, 153, 153));
        JBMin.setForeground(new java.awt.Color(153, 153, 153));
        JBMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/minimizar.png"))); // NOI18N
        JBMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMinActionPerformed(evt);
            }
        });
        panel1.add(JBMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, -1));

        JLTitulo.setFont(new java.awt.Font("Blackadder ITC", 0, 36)); // NOI18N
        JLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        JLTitulo.setText("Menú Principal");
        panel1.add(JLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 210, 30));

        panelImage1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        JLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/logochico.png"))); // NOI18N
        panelImage1.add(JLLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 60));

        JBUsuarios.setText("Usuarios");
        JBUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuariosActionPerformed(evt);
            }
        });
        panelImage1.add(JBUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, 70));

        JBPersonal.setText("Personal");
        JBPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPersonalActionPerformed(evt);
            }
        });
        panelImage1.add(JBPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 80, 70));

        JLVilox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/vilox.png"))); // NOI18N
        panelImage1.add(JLVilox, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 50, 70));

        JPanelPersonal.setColorPrimario(new java.awt.Color(153, 153, 153));
        JPanelPersonal.setColorSecundario(new java.awt.Color(102, 102, 102));
        JPanelPersonal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBCrearP.setText("Crear");
        JPanelPersonal.add(JBCrearP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 80));

        JBEditarP.setText("Editar");
        JPanelPersonal.add(JBEditarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 80));

        JLPersonal.setFont(new java.awt.Font("Blackadder ITC", 0, 36)); // NOI18N
        JLPersonal.setForeground(new java.awt.Color(255, 255, 255));
        JLPersonal.setText("Personal");
        JPanelPersonal.add(JLPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 30));

        panelImage1.add(JPanelPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 230, 150));

        getContentPane().add(panelImage1, java.awt.BorderLayout.CENTER);

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

    private void JBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuariosActionPerformed
       Crear_Usuario a=new Crear_Usuario();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBUsuariosActionPerformed

    private void JBPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPersonalActionPerformed
        JPanelPersonal.setVisible(true);
    }//GEN-LAST:event_JBPersonalActionPerformed

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
    private javax.swing.JButton JBCerrar;
    private javax.swing.JButton JBCrearP;
    private javax.swing.JButton JBEditarP;
    private javax.swing.JButton JBMin;
    private javax.swing.JButton JBOficio;
    private javax.swing.JButton JBPersonal;
    private javax.swing.JButton JBUsuarios;
    private javax.swing.JLabel JLLogo;
    private javax.swing.JLabel JLPersonal;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JLabel JLVilox;
    private org.edisoncor.gui.panel.Panel JPanel2;
    private org.edisoncor.gui.panel.Panel JPanelPersonal;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
