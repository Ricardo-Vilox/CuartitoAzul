/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuartitoazul;

import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author pc 007
 */
public class Menu_Ajustes extends javax.swing.JFrame {

    DefaultTableModel ModeloTablaMenu;
    Connection con = null;
    Statement st;

    int id_categorias = 0;

    public Menu_Ajustes() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); //centra frame en mi pantalla
        setIconImage(new ImageIcon(getClass().getResource("/cuartitoazul/imagenes/logochico.png")).getImage());
        MostrarDatos();
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

    public void Limpiar_Campos() {
        txt_Platillo.setText("");
        txt_Precio.setText("");
        cmb_Categorias.setSelectedIndex(0);
    }

    public void MostrarDatos() {
        //-------Cambiar el formato de la cabecera----------
        JTableHeader th = Tabla_Menu.getTableHeader();
        Font fuente = new Font("Segoue UI", Font.BOLD, 11);
        th.setFont(fuente);

        String[] cabecera = new String[3];

        ModeloTablaMenu = new DefaultTableModel();
        ModeloTablaMenu.addColumn("PLATILLO");
        ModeloTablaMenu.addColumn("PRECIO");
        ModeloTablaMenu.addColumn("CATEGORIA");
        Tabla_Menu.setModel(ModeloTablaMenu);

        Tabla_Menu.getColumnModel().getColumn(0).setPreferredWidth(250);//Platillo
        Tabla_Menu.getColumnModel().getColumn(1).setPreferredWidth(70);//Precio
        Tabla_Menu.getColumnModel().getColumn(2).setPreferredWidth(150);//Categoria

        DBconnect();

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT platillos.descripcion, platillos.precio, categorias.categoria "
                    + "FROM platillos "
                    + "INNER JOIN categorias ON platillos.id_categoria = categorias.id_categoria "
                    + "ORDER BY platillos.id_platillo DESC");

            while (rs.next()) {
                cabecera[0] = rs.getString(1);
                cabecera[1] = rs.getString(2);
                cabecera[2] = rs.getString(3);
                ModeloTablaMenu.addRow(cabecera);
            }
            Tabla_Menu.setModel(ModeloTablaMenu);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar Informacion!");
        }

        MostrarCategorias();

    }

    public void EncontrarIdCategorias() {
        try {
            DBconnect();
            // Apartado para encontrar ID del ComboBox
            Statement sr = con.createStatement();
            ResultSet r = sr.executeQuery("SELECT id_categoria FROM categorias WHERE categoria = '"
                    + cmb_Categorias.getSelectedItem() + "'");

            while (r.next()) {
                id_categorias = Integer.parseInt(r.getString(1));
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error al conectar con Categorias", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarCategorias() {
        try {
            DBconnect();
            ResultSet rs = st.executeQuery("SELECT categoria FROM categorias");

            while (rs.next()) {
                cmb_Categorias.addItem(rs.getString(1));
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "Error al conectar con Categorias", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Contenedor = new javax.swing.JPanel();
        lbl_Cerrar = new javax.swing.JLabel();
        lbl_Minimizar = new javax.swing.JLabel();
        lbl_Precio1 = new javax.swing.JLabel();
        lbl_Precio = new javax.swing.JLabel();
        lbl_Platillo = new javax.swing.JLabel();
        lbl_Titulo = new javax.swing.JLabel();
        btn_Eliminar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        txt_Precio = new javax.swing.JTextField();
        txt_Platillo = new javax.swing.JTextField();
        cmb_Categorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Menu = new javax.swing.JTable();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 425));

        Panel_Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Cerrar.png"))); // NOI18N
        lbl_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_CerrarMouseClicked(evt);
            }
        });
        Panel_Contenedor.add(lbl_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 3, 20, 20));

        lbl_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/MenuPrincipal/Minimizar.png"))); // NOI18N
        lbl_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_MinimizarMouseClicked(evt);
            }
        });
        Panel_Contenedor.add(lbl_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 3, 20, 20));

        lbl_Precio1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_Precio1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Precio1.setText("Categoria:");
        Panel_Contenedor.add(lbl_Precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        lbl_Precio.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_Precio.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Precio.setText("Precio: ");
        Panel_Contenedor.add(lbl_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        lbl_Platillo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbl_Platillo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Platillo.setText("Platillo:");
        Panel_Contenedor.add(lbl_Platillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        lbl_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/Menu_Ajustes/Titulo.png"))); // NOI18N
        Panel_Contenedor.add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 70));

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/Menu_Ajustes/Eliminar.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 110, 40));

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/Menu_Ajustes/Modificar.png"))); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 120, 40));

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/Menu_Ajustes/Agregar.png"))); // NOI18N
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        Panel_Contenedor.add(btn_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 110, 40));
        Panel_Contenedor.add(txt_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 30));
        Panel_Contenedor.add(txt_Platillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 480, 30));

        Panel_Contenedor.add(cmb_Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 230, 30));

        Tabla_Menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Menu);

        Panel_Contenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 530, 180));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuartitoazul/imagenes/Menu_Ajustes/fondo.png"))); // NOI18N
        Panel_Contenedor.add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_MinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lbl_MinimizarMouseClicked

    private void lbl_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_CerrarMouseClicked

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        // TODO add your handling code here:
        DBconnect();
        try {
            PreparedStatement sm = con.prepareStatement("INSERT INTO platillos"
                    + "(descripcion,precio,id_categoria) "
                    + "VALUES(?,?,?);");

            sm.setString(1, txt_Platillo.getText());//Ingresar la variable convertida a la Base de Datos
            sm.setString(2, txt_Precio.getText());

            EncontrarIdCategorias();
            sm.setInt(3, id_categorias);

            sm.executeUpdate();
            MostrarDatos();
            Limpiar_Campos();

            sm.close();

            JOptionPane.showMessageDialog(null, "Platillo Agregado!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar registro!: \n" + ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        // TODO add your handling code here:

        String platillo = Tabla_Menu.getValueAt(Tabla_Menu.getSelectedRow(), 0).toString();
        int ax = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el Platillo?");

        if (ax == JOptionPane.YES_OPTION) {
            try {
                PreparedStatement sl = null;
                sl = con.prepareStatement("DELETE FROM platillos WHERE descripcion = '" + platillo + "'");
                sl.executeUpdate();

                sl.close();
                MostrarDatos();
                Limpiar_Campos();

                JOptionPane.showMessageDialog(null, "Platillo Eliminado!");
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar Platillo" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        // TODO add your handling code here:
        int a = Tabla_Menu.getSelectedRow();
        String platillo = Tabla_Menu.getModel().getValueAt(a, 0).toString();
        
        EncontrarIdCategorias();
  
        try {
            PreparedStatement sa = null;
            String sql = "UPDATE platillos SET descripcion = '" + txt_Platillo.getText() + "', "
                    + "precio = " + txt_Precio.getText() + ", "
                    + "id_categoria = " + id_categorias
                    + " WHERE descripcion = '" + platillo + "'";//Query
            sa = con.prepareStatement(sql);
            sa.executeUpdate();
            MostrarDatos();
            Limpiar_Campos();
            
            sa.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar registro!: "
                    + "\n" + ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Ajustes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Ajustes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Contenedor;
    private javax.swing.JTable Tabla_Menu;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JComboBox<String> cmb_Categorias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Cerrar;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Minimizar;
    private javax.swing.JLabel lbl_Platillo;
    private javax.swing.JLabel lbl_Precio;
    private javax.swing.JLabel lbl_Precio1;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JTextField txt_Platillo;
    private javax.swing.JTextField txt_Precio;
    // End of variables declaration//GEN-END:variables
}
