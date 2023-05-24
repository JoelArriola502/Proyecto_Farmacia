/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class Comprass extends javax.swing.JFrame {

    Conexion conectar=new Conexion();
    Connection conectarBD=conectar.getConection();
    ResultSet rs;
    PreparedStatement Insertar;
    PreparedStatement Actualiza;
    Statement st;
    public Comprass() {
        initComponents();
        CargarDatosCodgoProveedor(CodigoProveedor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        DateFecha = new com.toedter.calendar.JDateChooser();
        CodigoProveedor = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        VerDatosBoton = new javax.swing.JButton();
        ActualizarBoton = new javax.swing.JButton();
        NuevaCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCompras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(0, 204, 204));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        DateFecha.setDateFormatString("yyy-MM-dd");
        DateFecha.setName("yyy-MM-dd"); // NOI18N
        DateFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DateFechaMouseClicked(evt);
            }
        });

        txtID.setEditable(false);
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });

        VerDatosBoton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        VerDatosBoton.setText(" Ver Compras");
        VerDatosBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerDatosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosBotonActionPerformed(evt);
            }
        });

        ActualizarBoton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        ActualizarBoton.setText("Actualizar Compra");
        ActualizarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonActionPerformed(evt);
            }
        });

        NuevaCompra.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        NuevaCompra.setText("Nueva Compra");
        NuevaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaCompraActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha");

        jLabel2.setText("Codigo Proveedor");

        jLabel3.setText("CodigoCompra");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("x");
        jLabel4.setAutoscrolls(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerDatosBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(ActualizarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VerDatosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(CodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 350));

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCompras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 790, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaComprasMouseClicked
        ActualizarBoton.setEnabled(true);
        CodigoProveedor.setEnabled(false);
        NuevaCompra.setEnabled(false);
        int fila=this.TablaCompras.getSelectedRow();
        this.txtID.setText(this.TablaCompras.getValueAt(fila, 0).toString());
        this.DateFecha.setDateFormatString(this.TablaCompras.getValueAt(fila, 1).toString());
        this.CodigoProveedor.setSelectedItem(this.TablaCompras.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_TablaComprasMouseClicked

    private void VerDatosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosBotonActionPerformed
        VerCompras();
    }//GEN-LAST:event_VerDatosBotonActionPerformed

    private void ActualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonActionPerformed
       
    }//GEN-LAST:event_ActualizarBotonActionPerformed

    private void NuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaCompraActionPerformed
        InsertarCompra();
       

    }//GEN-LAST:event_NuevaCompraActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        NuevaCompra.setEnabled(true);
        CodigoProveedor.setEnabled(true);
        ActualizarBoton.setEnabled(false);
        
        
                
                
                
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
         CodigoProveedor.setEnabled(true);
    }//GEN-LAST:event_txtIDMouseClicked

    private void DateFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateFechaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DateFechaMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null,"SEGURO QUE DESA SALIR","SALIENDO",JOptionPane.OK_CANCEL_OPTION)==0){
            dispose();

        }
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    
    public void CargarDatosCodgoProveedor(JComboBox CodigoProveedor){
        DefaultComboBoxModel Codigo=new DefaultComboBoxModel();
        CodigoProveedor.setModel(Codigo);
        String Consulta="select idProveedores from Proveedor";
        try {
        st=conectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            CodigoProveedor.addItem(rs.getString("IdProveedores"));
            
        }
        } catch (Exception e) {
        }
        
        
        
        
    }
    
    public void VerCompras(){
        DefaultTableModel Modelo=new DefaultTableModel();
        Modelo.addColumn("idCompras");
        Modelo.addColumn("Fecha");
        Modelo.addColumn("Codigo Proveedor");
        TablaCompras.setModel(Modelo);
        
        String consulta="Select *from Compras";
        String Dato[]=new String[3];
        try {
            st=conectarBD.createStatement();
            rs=st.executeQuery(consulta);
            while(rs.next()){
                Dato[0]=rs.getString(1);
                Dato[1]=rs.getString(2);
                Dato[2]=rs.getString(3);
                Modelo.addRow(Dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.toString());
        }
    }
    public void limpiar(){
        txtID.setText("");
        DateFecha.setDateFormatString("");
        CodigoProveedor.setSelectedItem(0);
    }
    public void InsertarCompra(){
    /*
  
    DateFormat dateFormat = new SimpleDateFormat("yyyy/dd/MM HH"); 
     Date fecha = new Date();
     String FechaActual=dateFormat.format(fecha);
    */
     String sql="INSERT INTO Compras(Fecha,idProveedores)values(?,?)";
    String FechaA=((JTextField)DateFecha.getDateEditor().getUiComponent()).getText();
    String Datos=(String) CodigoProveedor.getSelectedItem();
    int Codigo=Integer.parseInt(Datos);
    
        System.out.println("El codigo es"+Codigo);
    try {
        Insertar=conectarBD.prepareStatement(sql);
        Insertar.setString(1, FechaA);
        Insertar.setInt(2,Codigo);
        Insertar.executeUpdate();
        
        
    JOptionPane.showMessageDialog(null,"Agregados Correcto" );
        limpiar();
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"error"+e.toString() );
    }
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();
   
       UIManager.put( "Button.arc", 999 );
       UIManager.put( "Component.arc", 999 );
       UIManager.put( "ProgressBar.arc", 999 );
       UIManager.put( "TextComponent.arc", 999 );
       UIManager.put( "ScrollBar.showButtons", true );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBoton;
    private javax.swing.JComboBox<String> CodigoProveedor;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton NuevaCompra;
    private javax.swing.JTable TablaCompras;
    private javax.swing.JButton VerDatosBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
