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
        setIconImage(new ImageIcon(getClass().getResource("/cuartitoazul/imagenes/logochico.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panel1 = new org.edisoncor.gui.panel.Panel();
        JBCerrar = new javax.swing.JButton();
        JBMin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLLogo = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Blackadder ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú Principal");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 210, 30));

        panelImage1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        JLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/logochico.png"))); // NOI18N
        panelImage1.add(JLLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 60));

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
    private javax.swing.JButton JBMin;
    private javax.swing.JLabel JLLogo;
    private javax.swing.JLabel jLabel1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
