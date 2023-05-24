/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Clientes extends javax.swing.JFrame {

   Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   ResultSet rs;
   Statement st;
   PreparedStatement insertar;
   PreparedStatement Actualizar;
   
    public Clientes() {
        initComponents();
        CargarDatosPago(TipoPago);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        TipoPago = new javax.swing.JComboBox<>();
        VerClientesBoton = new javax.swing.JButton();
        RegistrarBoton = new javax.swing.JButton();
        ActualizarBoton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientesTB = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(153, 255, 204));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("Codigo Cliente");

        jLabel2.setText("Pago");

        jLabel3.setText("Nombre Cliente");

        jLabel4.setText("Nit");

        jLabel5.setText("Telefono");

        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });

        txtCodigoCliente.setEditable(false);

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        VerClientesBoton.setText("Ver Cliente");
        VerClientesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerClientesBotonActionPerformed(evt);
            }
        });

        RegistrarBoton.setText("Registrar Cliente");
        RegistrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBotonActionPerformed(evt);
            }
        });

        ActualizarBoton.setText("Actualizar Cliente");
        ActualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtNit, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActualizarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VerClientesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(498, Short.MAX_VALUE)
                    .addComponent(RegistrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(162, 162, 162)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VerClientesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(185, Short.MAX_VALUE)
                    .addComponent(RegistrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(89, 89, 89)))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 310));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente"));

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
        jScrollPane1.setViewportView(ClientesTB);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 830, 280));

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

    private void RegistrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBotonActionPerformed
        InsertarClientes();
    }//GEN-LAST:event_RegistrarBotonActionPerformed

    private void VerClientesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerClientesBotonActionPerformed
      VerDatosClientes();
    }//GEN-LAST:event_VerClientesBotonActionPerformed

    private void ClientesTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesTBMouseClicked
       
        ActualizarBoton.setEnabled(true);
        RegistrarBoton.setEnabled(false);
        int fila=this.ClientesTB.getSelectedRow();
        this.txtCodigoCliente.setText(this.ClientesTB.getValueAt(fila, 0).toString());
        this.txtNombre.setText(this.ClientesTB.getValueAt(fila, 1).toString());
        this.txtNit.setText(this.ClientesTB.getValueAt(fila, 2).toString());
        this.txtTelefono.setText(this.ClientesTB.getValueAt(fila, 3).toString());
        this.TipoPago.setSelectedItem(this.ClientesTB.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_ClientesTBMouseClicked

    private void ActualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonActionPerformed
        ActualizarCliente();
    }//GEN-LAST:event_ActualizarBotonActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
      RegistrarBoton.setEnabled(true);
      ActualizarBoton.setEnabled(false);
      Limpiar();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped
        char validar=evt.getKeyChar();
        if(validar<'0'||validar>'9')evt.consume();
        
    }//GEN-LAST:event_txtNitKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
       char validar=evt.getKeyChar();
       if(validar<'0'||validar>'9')evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

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
                new Clientes().setVisible(true);
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
    public void CargarDatosPago(JComboBox Pago){
        DefaultComboBoxModel ModeloPago=new DefaultComboBoxModel();
        Pago.setModel(ModeloPago);
        
        String consulta="Select TipoPago from formaPago";
        try {
            st=ConectarBD.createStatement();
            rs=st.executeQuery(consulta);
            while(rs.next()){
                Pago.addItem(rs.getString("TipoPago"));
            }
        } catch (Exception e) {
        }
        
    }
    public void InsertarClientes(){
        String Consulta="insert into Clientes(Nombre,Nit,Telefono,idFormaPago)values(?,?,?,?)";
        int idPago=1+TipoPago.getSelectedIndex();
        try {
            insertar=ConectarBD.prepareStatement(Consulta);
            insertar.setString(1,txtNombre.getText());
            insertar.setString(2, txtNit.getText());
            insertar.setString(3, txtTelefono.getText());
            insertar.setInt(4, idPago);
            insertar.executeUpdate();
            VerDatosClientes();
            JOptionPane.showMessageDialog(null,"Agregados Correctamente" );
            Limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error"+e.toString());
        }
    }
public void ActualizarCliente(){
    int Pago=1+TipoPago.getSelectedIndex();
    try {
        Actualizar=ConectarBD.prepareStatement("update Clientes set Nombre='"+txtNombre.getText()+"',Nit='"+txtNit.getText()+"',Telefono='"+txtTelefono.getText()+"',idFormaPago='"+Pago+"' where idClientes='"+txtCodigoCliente.getText()+"'");
    int Contador=Actualizar.executeUpdate();
    if(Contador>0){
        VerDatosClientes();
    }else {
        JOptionPane.showMessageDialog(null,"Seleccione fila" );
    }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"error"+e.toString() );
    }
    
}
public void Limpiar(){
    txtCodigoCliente.setText("");
    txtNombre.setText("");
    txtNit.setText("");
    txtTelefono.setText("");
    TipoPago.setSelectedIndex(0);
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBoton;
    private javax.swing.JTable ClientesTB;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton RegistrarBoton;
    private javax.swing.JComboBox<String> TipoPago;
    private javax.swing.JButton VerClientesBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
