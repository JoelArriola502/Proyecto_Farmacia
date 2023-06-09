/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author Joel Arriola
 */
public class MostrarProductosVenta extends javax.swing.JFrame {

    Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   PreparedStatement Insertar=null;
   ResultSet rs;
   PreparedStatement Actualizar;
   Statement st;
    public MostrarProductosVenta() {
        initComponents();
        VerDatosProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscaPro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Agregarboton = new javax.swing.JButton();
        TodoRboton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscaPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaProKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 40, 250, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salida.png"))); // NOI18N
        jLabel2.setText("REGRESAR");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        Agregarboton.setForeground(new java.awt.Color(0, 0, 0));
        Agregarboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconG/Agregar.png"))); // NOI18N
        Agregarboton.setText("AGREGAR PRODUCTOS");
        Agregarboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarbotonActionPerformed(evt);
            }
        });

        TodoRboton.setForeground(new java.awt.Color(0, 0, 0));
        TodoRboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CargarDato.png"))); // NOI18N
        TodoRboton.setText("TODO LOS REGISTROS");
        TodoRboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TodoRboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodoRbotonActionPerformed(evt);
            }
        });

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TodoRboton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Agregarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TodoRboton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Agregarboton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProKeyReleased
        BuscarProductos(txtBuscaPro.getText());
    }//GEN-LAST:event_txtBuscaProKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void AgregarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarbotonActionPerformed
        NuevoProductos pro=new NuevoProductos();
        pro.setVisible(true);
    }//GEN-LAST:event_AgregarbotonActionPerformed

    private void TodoRbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodoRbotonActionPerformed
VerDatosProductos();
    }//GEN-LAST:event_TodoRbotonActionPerformed

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
      
      
        int fila=this.TablaProductos.getSelectedRow();
        Ventas.txtNombreProducto.setText(this.TablaProductos.getValueAt(fila,1 ).toString());
        Ventas.txtPrecioVenta.setText(this.TablaProductos.getValueAt(fila, 5).toString());
        Ventas.CodigoProductosCon.setText(this.TablaProductos.getValueAt(fila, 0).toString());
        Ventas.txtExistencia.setText(this.TablaProductos.getValueAt(fila, 6).toString());
        //Ventas.txtCostoTotal.setText(this.TablaProductos.getValueAt(fila,4 ).toString());
       dispose();
       
     
    }//GEN-LAST:event_TablaProductosMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public void Bloquear(){
        Agregarboton.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(MostrarProductosVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarProductosVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarProductosVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarProductosVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarProductosVenta().setVisible(true);
            }
        });
    }
 
public void BuscarProductos(String Buscar){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("idProductos");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Descripción");
    Modelo.addColumn("Fecha Caducidad");
    Modelo.addColumn("costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("NombreMarca");
    Modelo.addColumn("Laboratori");
   
    TablaProductos.setModel(Modelo);
    
    String Consulta="Select p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre \n" +
"from Productos p\n" +
"join Marca m on p.idMarca=m.idMarca\n" +
"join Laboratorio l on p.idLaboratorio=l.idLaboratorio\n" +
"where p.idProductos like '%"+Buscar+"%' or p.Nombre like'%"+Buscar+"%' or p.Descripcion like'%"+Buscar+"%' or p.Precio like'%"+Buscar+"%'";
    String Datos[]=new String[9];
    
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Datos[0]=rs.getString(1);
            Datos[1]=rs.getString(2);
            Datos[2]=rs.getString(3);
            Datos[3]=rs.getString(4);
            Datos[4]=rs.getString(5);
            Datos[5]=rs.getString(6);
            Datos[6]=rs.getString(7);
            Datos[7]=rs.getString(8);
            Datos[8]=rs.getString(9);
            
            
         
            
            Modelo.addRow(Datos);
          
        }
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error"+ e.toString());
    }
}


public void VerDatosProductos(){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("idProductos");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Descripción");
    Modelo.addColumn("Fecha Caducidad");
    Modelo.addColumn("costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("NombreMarca");
    Modelo.addColumn("Laboratori");
   
    TablaProductos.setModel(Modelo);
    
    String Consulta="select p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre as Laboratorio\n" +
"from Productos p, Marca m, Laboratorio l \n" +
"where p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio order by p.idProductos asc";
    String Datos[]=new String[9];
    
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Datos[0]=rs.getString(1);
            Datos[1]=rs.getString(2);
            Datos[2]=rs.getString(3);
            Datos[3]=rs.getString(4);
            Datos[4]=rs.getString(5);
            Datos[5]=rs.getString(6);
            Datos[6]=rs.getString(7);
            Datos[7]=rs.getString(8);
            Datos[8]=rs.getString(9);
            
            
         
            
            Modelo.addRow(Datos);
          
        }
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error"+ e.toString());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregarboton;
    private rojerusan.RSTableMetro TablaProductos;
    private javax.swing.JButton TodoRboton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscaPro;
    // End of variables declaration//GEN-END:variables
}
