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
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


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
          VerDatosClientes();
        AutoCompleteDecorator.decorate(TipoPago);
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
        RegistrarBoton = new javax.swing.JButton();
        ActualizarBoton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientesTB = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(153, 255, 204));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 207, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 15, 100, 40));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pago");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 239, 100, 40));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre Cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 73, 100, 40));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nit");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 121, 100, 40));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 179, 100, 40));

        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 121, 170, 40));

        txtCodigoCliente.setEditable(false);
        jPanel1.add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 15, 170, 40));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 65, 170, 40));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 167, 170, 40));

        TipoPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(TipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 239, 170, 40));

        RegistrarBoton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegistrarBoton.setForeground(new java.awt.Color(0, 0, 0));
        RegistrarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar_1.png"))); // NOI18N
        RegistrarBoton.setText("Registrar Cliente");
        RegistrarBoton.setContentAreaFilled(false);
        RegistrarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarBoton.setFocusable(false);
        RegistrarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RegistrarBoton.setIconTextGap(5);
        RegistrarBoton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        RegistrarBoton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RegistrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 192, 80));

        ActualizarBoton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ActualizarBoton.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        ActualizarBoton.setText("Actualizar Cliente");
        ActualizarBoton.setContentAreaFilled(false);
        ActualizarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ActualizarBoton.setIconTextGap(5);
        ActualizarBoton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ActualizarBoton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ActualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(ActualizarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 195, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarVentana.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, 40));

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 310));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente"));

        ClientesTB.setForeground(new java.awt.Color(0, 0, 0));
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
        
        if(txtNit.getText().trim().isEmpty()||txtNombre.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null,"LLENAR CAMPOS OBLIGATORIOS","ERROR",JOptionPane.WARNING_MESSAGE);
           
        } else{
             InsertarClientes();
        }
        
    }//GEN-LAST:event_RegistrarBotonActionPerformed

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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(JOptionPane.showConfirmDialog(null,"DESEA SALIR DE LA VENTANA CLIENTES","SALIR",JOptionPane.YES_NO_OPTION)==0){
            dispose();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //Minimizar ventana
        this.setState(Clientes.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
