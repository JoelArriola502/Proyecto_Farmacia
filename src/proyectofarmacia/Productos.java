/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofarmacia;

import java.awt.Image;
import java.awt.image.ImageProducer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Joel Arriola
 */
public class Productos extends javax.swing.JPanel {

   Conexion conectar=new Conexion();
   Connection ConectarBd=conectar.getConection();    
     ResultSet rs;
    PreparedStatement Insertar=null;
    PreparedStatement Actualizar=null;
    PreparedStatement Eliminar=null;
    Statement st;
    @Override
    public Image createImage(ImageProducer producer) {
        return super.createImage(producer); //To change body of generated methods, choose Tools | Templates.
    }

    public Productos() {
        initComponents();
        

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
        MenuVencer = new javax.swing.JComboBox<>();
        FechaDate = new com.toedter.calendar.JDateChooser();
        MenuVentas = new javax.swing.JComboBox<>();
        MenuVencer1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductosTable = new javax.swing.JTable();

        Fondo.setBackground(new java.awt.Color(207, 155, 188));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 207, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuVencer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONSULTAR PRODUCTOS A VENCER", "POR MES", "POR AÑO", "POR FECHA", " " }));
        MenuVencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVencerActionPerformed(evt);
            }
        });
        jPanel1.add(MenuVencer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 50));

        FechaDate.setDateFormatString("yyy-MM-dd");
        jPanel1.add(FechaDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 50));

        MenuVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONSULTAS DE  VENTAS", "VER VENTAS DEL MES", "VER VENTAS DEL AÑO ", "VER VENTAS POR FECHA", " " }));
        MenuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVentasActionPerformed(evt);
            }
        });
        jPanel1.add(MenuVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, 50));

        MenuVencer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONSULTAR DE COMPRAS", "POR MES", "POR AÑO", "POR FECHA", " " }));
        MenuVencer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVencer1ActionPerformed(evt);
            }
        });
        jPanel1.add(MenuVencer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 50));

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        ProductosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ProductosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductosTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 890, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProductosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosTableMouseClicked
     
     
    }//GEN-LAST:event_ProductosTableMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void MenuVencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVencerActionPerformed
        if(MenuVencer.getSelectedItem().equals("POR MES")){
            ProductosVencerMes();
        } if(MenuVencer.getSelectedItem().equals("POR AÑO")){
            ProductosVenceranio();
        }if(MenuVencer.getSelectedItem().equals("POR FECHA")){
            ProductosVencerFecha();
        }
    }//GEN-LAST:event_MenuVencerActionPerformed

    private void MenuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVentasActionPerformed
        if(MenuVentas.getSelectedItem().equals("VER VENTAS DEL MES")){
            VerDatallesdeVentasMes();
        }
    }//GEN-LAST:event_MenuVentasActionPerformed

    private void MenuVencer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVencer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuVencer1ActionPerformed

/*
public void ActualizarTipoLaboratorio(){
  
    
    try {
        Actualizar=ConectarBd.prepareStatement("update TipoLaboratorio set Nombre='' where idTipoLaboratorio='"+txtID.getText()+"'");
        int Contador=Actualizar.executeUpdate();
        if(Contador>0){
        JOptionPane.showMessageDialog(null,"Datos Actualizados");
        Mostrar();
        
    }else {
          JOptionPane.showMessageDialog(null,"No selecciono la fila");
    }
    
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"error"+e.toString());
    }
}
*/

public void CargarDatosConbox(JComboBox marcas){
    DefaultComboBoxModel Datos=new DefaultComboBoxModel();
    
    marcas.setModel(Datos);
    String consulta="select NombreMarca\n" +
"from Marca";
    try {
        st=ConectarBd.createStatement();
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
        st=ConectarBd.createStatement();
        rs=st.executeQuery(consulta);
        while(rs.next()){
            Laboratorio.addItem(rs.getString("Nombre"));
        }
    } catch (Exception e) {
    }
    
}
// todo metodos de mostrar productos a vencer 
public void ProductosVencerMes(){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("codigo Producto");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Decripcion");
    Modelo.addColumn("Fecha Caducidad");
    Modelo.addColumn("Costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("Nombre Marca");
    Modelo.addColumn("Laboratorio");
    
    
    ProductosTable.setModel(Modelo);
    String FechaA=((JTextField)FechaDate.getDateEditor().getUiComponent()).getText();
    String Consulta="select p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre as Laboratorio\n" +
"from Productos p, Marca m, Laboratorio l \n" +
"where p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio and MONTH(p.FechaCaducidad)='"+FechaA+"'";
    
    String Dato[]=new String[9];
    try {
        st=ConectarBd.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Dato[0]=rs.getString(1);
            Dato[1]=rs.getString(2);
            Dato[2]=rs.getString(3);
            Dato[3]=rs.getString(4);
            Dato[4]=rs.getString(5);
            Dato[5]=rs.getString(6);
            Dato[6]=rs.getString(7);
            Dato[7]=rs.getString(8);
            Dato[8]=rs.getString(9);
            Modelo.addRow(Dato);
            
        }
    } catch (Exception e) {
    }
}

public void ProductosVenceranio(){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("codigo Producto");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Decripcion");
    Modelo.addColumn("Fecha Caducidad");
    Modelo.addColumn("Costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("Nombre Marca");
    Modelo.addColumn("Laboratorio");
    
    
    ProductosTable.setModel(Modelo);
    String FechaA=((JTextField)FechaDate.getDateEditor().getUiComponent()).getText();
    String Consulta="select p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre as Laboratorio\n" +
"from Productos p, Marca m, Laboratorio l \n" +
"where p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio and year(p.FechaCaducidad)='"+FechaA+"'";
    
    String Dato[]=new String[9];
    try {
        st=ConectarBd.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Dato[0]=rs.getString(1);
            Dato[1]=rs.getString(2);
            Dato[2]=rs.getString(3);
            Dato[3]=rs.getString(4);
            Dato[4]=rs.getString(5);
            Dato[5]=rs.getString(6);
            Dato[6]=rs.getString(7);
            Dato[7]=rs.getString(8);
            Dato[8]=rs.getString(9);
            Modelo.addRow(Dato);
            
        }
    } catch (Exception e) {
    }
}

public void ProductosVencerFecha(){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("codigo Producto");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Decripcion");
    Modelo.addColumn("Fecha Caducidad");
    Modelo.addColumn("Costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("Nombre Marca");
    Modelo.addColumn("Laboratorio");
    
    
    ProductosTable.setModel(Modelo);
    String FechaA=((JTextField)FechaDate.getDateEditor().getUiComponent()).getText();
    String Consulta="select p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre as Laboratorio\n" +
"from Productos p, Marca m, Laboratorio l \n" +
"where p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio and p.FechaCaducidad='"+FechaA+"'";
    
    String Dato[]=new String[9];
    try {
        st=ConectarBd.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Dato[0]=rs.getString(1);
            Dato[1]=rs.getString(2);
            Dato[2]=rs.getString(3);
            Dato[3]=rs.getString(4);
            Dato[4]=rs.getString(5);
            Dato[5]=rs.getString(6);
            Dato[6]=rs.getString(7);
            Dato[7]=rs.getString(8);
            Dato[8]=rs.getString(9);
            Modelo.addRow(Dato);
            
        }
    } catch (Exception e) {
    }
}

    public void VerDatallesdeVentasMes(){
        String FechaA=((JTextField)FechaDate.getDateEditor().getUiComponent()).getText();
        DefaultTableModel Modelo=new DefaultTableModel();
        Modelo.addColumn("Codigo VentaDetalle");
        Modelo.addColumn("CD Cliente");
        Modelo.addColumn("Nombre");
        Modelo.addColumn("Nit");
        Modelo.addColumn("Telefono");
        Modelo.addColumn("Codigo Ventas");
        Modelo.addColumn("Fecha");
        Modelo.addColumn("Precio ");
        Modelo.addColumn("Cantidad");
        Modelo.addColumn("Costo");
        Modelo.addColumn("Codigo Producto");
        Modelo.addColumn("Nombre");
        Modelo.addColumn("Descripcion");
        Modelo.addColumn("Fecha Caducidad");
        Modelo.addColumn("Existencia");
        Modelo.addColumn("Marca");
        Modelo.addColumn("Laboratorio");
        Modelo.addColumn("Pago");
        Modelo.addColumn("Total ");
        ProductosTable.setModel(Modelo);
        String Datos[]=new String[19];
        String Consulta="Select dv.idDetalleVenta, c.idClientes,c.Nombre,c.Nit,c.Telefono,v.idVentas,v.fecha,dv.precio,dv.cantidad,dv.costoTotal,\n" +
"p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Existencia,m.NombreMarca,l.Nombre,fp.TipoPago,sum(dv.cantidad*dv.precio)as Total\n" +
"from DetalleVenta dv, Ventas v,Productos p, formaPago fp, Clientes c, Laboratorio l , Marca m\n" +
"where dv.idVentas=v.idVentas and dv.idProductos=p.idProductos and v.idClientes=c.idClientes and c.idFormaPago=fp.idFormaPago\n" +
"and p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio  and year(v.fecha)='"+FechaA+"'\n" +
"group by  dv.idDetalleVenta, c.idClientes,c.Nombre,c.Nit,c.Telefono,v.idVentas,v.fecha,dv.precio,dv.cantidad,dv.costoTotal,\n" +
"p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Existencia,m.NombreMarca,l.Nombre,fp.TipoPago";
        try {
            st=ConectarBd.createStatement();
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
            Datos[9]=rs.getString(10);
            Datos[10]=rs.getString(11);
            Datos[11]=rs.getString(12);
            Datos[12]=rs.getString(13);
            Datos[13]=rs.getString(14);
            Datos[14]=rs.getString(15);
            Datos[15]=rs.getString(16);
            Datos[16]=rs.getString(17);
            Datos[17]=rs.getString(18);
            Datos[18]=rs.getString(19);
           
                Modelo.addRow(Datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.toString());
        }
        
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaDate;
    private javax.swing.JPanel Fondo;
    private javax.swing.JComboBox<String> MenuVencer;
    private javax.swing.JComboBox<String> MenuVencer1;
    private javax.swing.JComboBox<String> MenuVentas;
    private javax.swing.JTable ProductosTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
