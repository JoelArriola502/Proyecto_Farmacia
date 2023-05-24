/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Venta extends javax.swing.JFrame {

   Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   ResultSet rs;
   PreparedStatement insertar;
   PreparedStatement Actualizar;
   Statement st;
   
    public Venta() {
        initComponents();
        CargarClientes(ClientesCon);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        FechaDate = new com.toedter.calendar.JDateChooser();
        ClientesCon = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegistrarBoton = new javax.swing.JButton();
        ActualizarBoton = new javax.swing.JButton();
        VerDatosBoton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentaTB = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(102, 255, 204));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaDate.setDateFormatString("yyy-MM-dd");
        jPanel2.add(FechaDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 157, 170, 40));

        jPanel2.add(ClientesCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 234, 170, 40));

        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 82, 170, 40));

        jLabel1.setText("Codigo venta");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 82, 100, 40));

        jLabel2.setText("Fecha");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 157, 100, 40));

        jLabel3.setText("Cliente");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 234, 100, 40));

        RegistrarBoton.setText("Registrar");
        RegistrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBotonActionPerformed(evt);
            }
        });
        jPanel2.add(RegistrarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 120, 50));

        ActualizarBoton.setText("Actualizar");
        ActualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonActionPerformed(evt);
            }
        });
        jPanel2.add(ActualizarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 120, 50));

        VerDatosBoton.setText("ver Fecha Compras");
        VerDatosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosBotonActionPerformed(evt);
            }
        });
        jPanel2.add(VerDatosBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 87, 140, 50));

        fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        VentaTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        VentaTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentaTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VentaTB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBotonActionPerformed
        InsertarVentas();
    }//GEN-LAST:event_RegistrarBotonActionPerformed

    private void VentaTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentaTBMouseClicked
        ActualizarBoton.setEnabled(true);
        RegistrarBoton.setEnabled(false);
        ClientesCon.setEnabled(false);
        int fila=this.VentaTB.getSelectedRow();
        this.txtID.setText(this.VentaTB.getValueAt(fila, 0).toString());
        this.FechaDate.setDateFormatString(this.VentaTB.getValueAt(fila, 1).toString());
        this.ClientesCon.setSelectedItem(this.VentaTB.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_VentaTBMouseClicked

    private void ActualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarBotonActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
   RegistrarBoton.setEnabled(true);
   ActualizarBoton.setEnabled(false);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void VerDatosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosBotonActionPerformed
      MostrarVentas();
    }//GEN-LAST:event_VerDatosBotonActionPerformed

    /**
     * @param args the command line arguments
     */
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
                new Venta().setVisible(true);
            }
        });
    }
    public void CargarClientes(JComboBox Clientes){
        DefaultComboBoxModel ModeloClientes=new DefaultComboBoxModel();
        Clientes.setModel(ModeloClientes);
        String consulta="select idClientes from Clientes";
        try {
            st=ConectarBD.createStatement();
            rs=st.executeQuery(consulta);
            while(rs.next()){
                Clientes.addItem(rs.getString("idClientes"));
            }
            
        } catch (Exception e) {
        }
        
    }
  public void InsertarVentas(){
   
     String sql="INSERT INTO Ventas(Fecha,idClientes)values(?,?)";
    String FechaA=((JTextField)FechaDate.getDateEditor().getUiComponent()).getText();
  
    String  CodigoCliente=(String) ClientesCon.getSelectedItem();
    int obtenerValor=Integer.parseInt(CodigoCliente);
    
        System.out.println("El codigo es"+obtenerValor);
    try {
        insertar=ConectarBD.prepareStatement(sql);
        insertar.setString(1, FechaA);
        insertar.setInt(2,obtenerValor);
        insertar.executeUpdate();
       
        
    JOptionPane.showMessageDialog(null,"Agregados Correcto" );
        Limpiar();
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"error"+e.toString() );
    }
}
  public void Limpiar(){
      txtID.setText("");
      FechaDate.setDateFormatString("");
      ClientesCon.setSelectedIndex(0);
      
  }
  public void MostrarVentas(){
      DefaultTableModel Modelo=new DefaultTableModel();
      Modelo.addColumn("Codigo Venta");
      Modelo.addColumn("Fecha venta");
      Modelo.addColumn("codigo Cliente");
    VentaTB.setModel(Modelo);
    String Consulta="select v.idVentas,v.fecha,c.Nombre\n" +
"from Ventas v, Clientes c\n" +
"where v.idClientes=c.idClientes";
    String Dato[]=new String[3];
    
      try {
          st=ConectarBD.createStatement();
          rs=st.executeQuery(Consulta);
          while(rs.next()){
              Dato[0]=rs.getString(1);
              Dato[1]=rs.getString(2);
              Dato[2]=rs.getString(3);
              Modelo.addRow(Dato);
          }
      } catch (Exception e) {
      }
      
           
  }
  public void ActualizarCliente(){
       String FechaA=((JTextField)FechaDate.getDateEditor().getUiComponent()).getText();
      try {
          Actualizar=ConectarBD.prepareStatement("update Ventas set fecha='"+FechaA+"' where idVentas='"+txtID.getText()+"'");
      int Contador=Actualizar.executeUpdate();
      if(Contador>0){
          MostrarVentas();
      }else {
          JOptionPane.showMessageDialog(null, "No selecciono fila");
      }
      } catch (Exception e) {
      }
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBoton;
    private javax.swing.JComboBox<String> ClientesCon;
    private com.toedter.calendar.JDateChooser FechaDate;
    private javax.swing.JButton RegistrarBoton;
    private javax.swing.JTable VentaTB;
    private javax.swing.JButton VerDatosBoton;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
