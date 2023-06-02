/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author Joel Arriola
 */
public class DatosClientes extends javax.swing.JFrame {

   Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   ResultSet rs;
   Statement st;
   PreparedStatement insertar;
   PreparedStatement Actualizar;
    public DatosClientes() {
        initComponents();
        VerDatosClientes();
        
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClientesTB = new rojerusan.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        Agregarboton = new javax.swing.JButton();
        Agregarboton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTROS DE CLIENTES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        ClientesTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ClientesTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesTBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ClientesTB);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 650, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
        });
        jPanel3.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 350, 70));

        Agregarboton.setForeground(new java.awt.Color(0, 0, 0));
        Agregarboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CargarDato.png"))); // NOI18N
        Agregarboton.setText("TODO LOS REGISTROS");
        Agregarboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarbotonActionPerformed(evt);
            }
        });
        jPanel1.add(Agregarboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 200, 60));

        Agregarboton1.setForeground(new java.awt.Color(0, 0, 0));
        Agregarboton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconG/Agregar.png"))); // NOI18N
        Agregarboton1.setText("AGREGAR CLIENTE");
        Agregarboton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregarboton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregarboton1ActionPerformed(evt);
            }
        });
        jPanel1.add(Agregarboton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 200, 60));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        BuscarCliente(txtCliente.getText());
    }//GEN-LAST:event_txtClienteKeyReleased

    private void AgregarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarbotonActionPerformed
        VerDatosClientes();
    }//GEN-LAST:event_AgregarbotonActionPerformed

    private void Agregarboton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregarboton1ActionPerformed
       Clientes cliente=new Clientes();
        cliente.setVisible(true);
    }//GEN-LAST:event_Agregarboton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ClientesTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesTBMouseClicked
       int fila=this.ClientesTB.getSelectedRow();
       Ventas.txtNombreCliente.setText(this.ClientesTB.getValueAt(fila, 1).toString());
       Ventas.txtCodigoCliente.setText(this.ClientesTB.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_ClientesTBMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosClientes().setVisible(true);
            }
        });
    }
 public void VerDatosClientes(){
        DefaultTableModel Modelo=new DefaultTableModel();
        
        Modelo.addColumn("CodigoClientes");
        Modelo.addColumn("Nombre Clientes");
        Modelo.addColumn("Nit Clientes");
        Modelo.addColumn("Telefono");
        Modelo.addColumn("Pago");
        ClientesTB.setModel(Modelo);
        
        String Dato[]=new String[5];
        String Consulta="select c.idClientes, c.Nombre,c.Nit,c.Telefono,fp.TipoPago\n" +
"from Clientes c, formaPago fp\n" +
"where c.idFormaPago=fp.idFormaPago";
        
        try {
            st=ConectarBD.createStatement();
            rs=st.executeQuery(Consulta);
            while(rs.next()){
                Dato[0]=rs.getString(1);
                Dato[1]=rs.getString(2);
                Dato[2]=rs.getString(3);
                Dato[3]=rs.getString(4);
                Dato[4]=rs.getString(5);
                Modelo.addRow(Dato);
            }
        } catch (Exception e) {
        }
        
        
    }
  public void BuscarCliente(String Buscar){
        DefaultTableModel Modelo=new DefaultTableModel();
        
        Modelo.addColumn("CodigoClientes");
        Modelo.addColumn("Nombre Clientes");
        Modelo.addColumn("Nit Clientes");
        Modelo.addColumn("Telefono");
        Modelo.addColumn("Pago");
        ClientesTB.setModel(Modelo);
        
        String Dato[]=new String[5];
        String Consulta="select c.idClientes, c.Nombre,c.Nit,c.Telefono,fp.TipoPago\n" +
"from Clientes c join  formaPago fp on \n" +
"c.idFormaPago=fp.idFormaPago and c.idClientes like'%"+Buscar+"%' or c.Nombre like'%"+Buscar+"%'or c.Nit like'%"+Buscar+"%'";
        
        try {
            st=ConectarBD.createStatement();
            rs=st.executeQuery(Consulta);
            while(rs.next()){
                Dato[0]=rs.getString(1);
                Dato[1]=rs.getString(2);
                Dato[2]=rs.getString(3);
                Dato[3]=rs.getString(4);
                Dato[4]=rs.getString(5);
                Modelo.addRow(Dato);
            }
        } catch (Exception e) {
        }
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregarboton;
    private javax.swing.JButton Agregarboton1;
    private rojerusan.RSTableMetro ClientesTB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
}
