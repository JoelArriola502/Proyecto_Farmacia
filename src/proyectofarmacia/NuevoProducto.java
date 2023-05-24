/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class NuevoProducto extends javax.swing.JFrame {

   Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   PreparedStatement Insertar=null;
    ResultSet rs;
  PreparedStatement Actualizar;
  Statement st;
   
    public NuevoProducto() {
        initComponents();
        CargarDatosConbox(conMarca);
        CargarDatosLaboratorios(conLaboratorio);
      
       
    }
    public void VerDatosProductos(){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("idProductos");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Descripción");
    Modelo.addColumn("costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("NombreMarca");
    Modelo.addColumn("Laboratori");
   
    TablaProductos.setModel(Modelo);
    
    String Consulta="select p.idProductos,p.Nombre,p.Descripcion,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre as Laboratorio\n" +
"from Productos p, Marca m, Laboratorio l \n" +
"where p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio";
    String Datos[]=new String[8];
    
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
            
          
            
            Modelo.addRow(Datos);
            
            
        }
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error"+ e.toString());
    }
}
    public void InsertarNuevoProducto(){
        String Consulta="INSERT INTO Productos(Nombre,Descripcion,Costo,Precio,Existencia,idLaboratorio,idMarca)values(?,?,?,?,?,?,?)";
        int Laboratorio=1+conLaboratorio.getSelectedIndex();
        int Marca=1+conMarca.getSelectedIndex();
        
        try {
            Insertar=ConectarBD.prepareStatement(Consulta);
            Insertar.setString(1, txtNombre.getText());
            Insertar.setString(2, txtDescripcion.getText());
            Insertar.setString(3, txtCosto.getText());
            Insertar.setString(4, txtPrecio.getText());
            Insertar.setString(5, txtExistencia.getText());
            Insertar.setInt(6, Laboratorio);
             Insertar.setInt(7, Marca);
            Insertar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Agregados");
            Limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        }
        
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
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        conLaboratorio = new javax.swing.JComboBox<>();
        conMarca = new javax.swing.JComboBox<>();
        txtExistencia = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        NuevoProductoBo = new javax.swing.JButton();
        VerDatosBoton = new javax.swing.JButton();
        ActualizarBoton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(207, 155, 188));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setEnabled(false);
        Fondo.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 126, 43));
        Fondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 126, 43));
        Fondo.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 126, 43));

        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        Fondo.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 126, 43));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Costo");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 123, 43));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripcion");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 123, 43));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 123, 43));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 123, 43));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 123, 43));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Existencia");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 123, 43));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Marca");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 123, 43));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Laboratorio");
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 123, 43));

        Fondo.add(conLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 190, 30));

        Fondo.add(conMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 140, 30));
        Fondo.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 126, 43));
        Fondo.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 126, 43));

        jPanel1.setBackground(new java.awt.Color(207, 155, 188));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        NuevoProductoBo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        NuevoProductoBo.setText("NUEVO PRODUCTO");
        NuevoProductoBo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevoProductoBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProductoBoActionPerformed(evt);
            }
        });

        VerDatosBoton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        VerDatosBoton.setText(" Ver Productos");
        VerDatosBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerDatosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosBotonActionPerformed(evt);
            }
        });

        ActualizarBoton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        ActualizarBoton.setText("Actualizar Producto");
        ActualizarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(692, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NuevoProductoBo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerDatosBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NuevoProductoBo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ActualizarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(VerDatosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 878, 340));

        jPanel2.setBackground(new java.awt.Color(207, 155, 188));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

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
        jScrollPane1.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 880, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoProductoBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProductoBoActionPerformed
        // TODO add your handling code here:
        InsertarNuevoProducto();
      
    }//GEN-LAST:event_NuevoProductoBoActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoKeyTyped

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        
        ActualizarBoton.setEnabled(true);
        NuevoProductoBo.setEnabled(false);
        int fila=this.TablaProductos.getSelectedRow();
        this.txtID.setText(this.TablaProductos.getValueAt(fila, 0).toString());
        this.txtNombre.setText(this.TablaProductos.getValueAt(fila, 1).toString());
        this.txtDescripcion.setText(this.TablaProductos.getValueAt(fila, 2).toString());
        this.txtCosto.setText(this.TablaProductos.getValueAt(fila, 3).toString());
        this.txtPrecio.setText(this.TablaProductos.getValueAt(fila, 4).toString());
         this.txtExistencia.setText(this.TablaProductos.getValueAt(fila, 5).toString());
         this.conMarca.setSelectedItem(this.TablaProductos.getValueAt(fila, 6).toString());
         this.conLaboratorio.setSelectedItem(this.TablaProductos.getValueAt(fila, 7).toString());
          
    }//GEN-LAST:event_TablaProductosMouseClicked
public void ActualizarProducto(){
    
    int Marca=1+conMarca.getSelectedIndex();
    int Laboratori=1+conLaboratorio.getSelectedIndex();
    
    System.out.println("El id es "+Marca+"  labor"+Laboratori);
   
    try {
        Actualizar=ConectarBD.prepareStatement("update Productos set Nombre='"+txtNombre.getText()+"',Descripcion="
                + "'"+txtDescripcion.getText()+"',Costo='"+txtCosto.getText()+"',precio='"+txtPrecio.getText()+
                "',Existencia='"+txtExistencia.getText()+"',idLaboratorio='"+Laboratori+"',idMarca='"+Marca+"'"
                        + " where idProductos='"+txtID.getText()+"'");
    int Contador=Actualizar.executeUpdate();
    if(Contador>0){
        JOptionPane.showMessageDialog(null,"Datos Actualizados");
        VerDatosProductos();
        
    }else {
          JOptionPane.showMessageDialog(null,"No selecciono la fila");
    }
    
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"error"+e.toString());
    }
}

    private void VerDatosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosBotonActionPerformed
        VerDatosProductos();
    }//GEN-LAST:event_VerDatosBotonActionPerformed

    private void ActualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonActionPerformed
        ActualizarProducto();
    }//GEN-LAST:event_ActualizarBotonActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       NuevoProductoBo.setEnabled(true);
       ActualizarBoton.setEnabled(false);
       Limpiar();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if(JOptionPane.showConfirmDialog(null,"SEGURO QUE DESA SALIR","SALIENDO",JOptionPane.OK_CANCEL_OPTION)==0){
            dispose();

        }
        
    }//GEN-LAST:event_jLabel9MouseClicked
public void Limpiar(){
    txtID.setText("");
    txtNombre.setText("");
    txtDescripcion.setText("");
    txtCosto.setText("");
    txtPrecio.setText("");
    conLaboratorio.setSelectedItem("");
    conMarca.setSelectedItem("");
    txtExistencia.setText("");
    
}
public void CargarDatosConbox(JComboBox marcas){
    DefaultComboBoxModel Datos=new DefaultComboBoxModel();
    
    marcas.setModel(Datos);
    String consulta="select NombreMarca\n" +
"from Marca";
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(consulta);
        while(rs.next()){
          marcas.addItem(rs.getString("NombreMarca"));
            
        }
    } catch (Exception e) {
    }
   
    
    
}
public void CargarDatosLaboratorios(JComboBox Laboratorio){
    DefaultComboBoxModel Labor=new DefaultComboBoxModel();
    Laboratorio.setModel(Labor);
    String consulta="SELECT Nombre from Laboratorio";
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(consulta);
        while(rs.next()){
            Laboratorio.addItem(rs.getString("Nombre"));
        }
    } catch (Exception e) {
    }
    
}
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
                new NuevoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBoton;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton NuevoProductoBo;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton VerDatosBoton;
    private javax.swing.JComboBox<String> conLaboratorio;
    private javax.swing.JComboBox<String> conMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
