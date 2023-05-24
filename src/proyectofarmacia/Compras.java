/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofarmacia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

public class Compras extends javax.swing.JPanel {

  Conexion conectar=new Conexion();
  Connection ConectarBD=conectar.getConection();
  ResultSet rs;
  PreparedStatement insertar;
  PreparedStatement Actualizar;
  Statement st;
  
    public Compras() {
        initComponents();
    }
public void VerDatos(){
    DefaultTableModel Modelo=new DefaultTableModel();
    
    Modelo.addColumn("idCompraDetalle");
    Modelo.addColumn("Codigo Proveedor");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Nit");
    Modelo.addColumn("Telefono");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Cantidad");
    Modelo.addColumn("costoTotal");
    Modelo.addColumn("Codigo Compra");
    Modelo.addColumn("Fecha");
    Modelo.addColumn("CodigoProducto");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Descripcion");
    Modelo.addColumn("Costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("Marca");
    Modelo.addColumn("Laboratorio");
    Modelo.addColumn("Pago");
    ComprasTB.setModel(Modelo);
    
    String Consulta="select cd.idCompraDetalle,pr.idProveedores,pr.Nombre,pr.Nit,pr.Telefono,cd.precio,cd.cantidad,cd.costoTotal,c.idCompras,c.Fecha,p.idProductos,p.Nombre,p.Descripcion,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre,fp.TipoPago \n" +
"from CompraDetalle cd, Compras c, Productos p, Proveedor pr, Marca m, Laboratorio l,formaPago fp\n" +
"where cd.idCompras=c.idCompras and cd.idProductos=p.idProductos  and c.idProveedores=pr.idProveedores and p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio\n" +
"and fp.idFormaPago=pr.idFormaPago";
    
    String Datos[] = new String[19];
    
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
        JOptionPane.showMessageDialog(null,"Erro "+ e.toString());
    }
    
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Menu = new javax.swing.JComboBox<>();
        MenuVerDatos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComprasTB = new javax.swing.JTable();

        Fondo.setBackground(new java.awt.Color(149, 115, 153));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(149, 115, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Que datos desa agregar", "Nuevo Producto", "Agrege Datos Del Proveedor", "Agregar Fecha Compras", "Realizar compra", "Nueva Marca De producto", " " }));
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel2.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 220, 60));

        MenuVerDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Datos", "Ver Proveedor", "Ver Productos", "Ver Compras", "Ver Detalles de la Compra" }));
        MenuVerDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuVerDatosMouseClicked(evt);
            }
        });
        MenuVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVerDatosActionPerformed(evt);
            }
        });
        jPanel2.add(MenuVerDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 60));

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 300));

        jPanel1.setBackground(new java.awt.Color(158, 156, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Compras", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        ComprasTB.setForeground(new java.awt.Color(38, 187, 187));
        ComprasTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ComprasTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprasTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ComprasTB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 299, 890, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComprasTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasTBMouseClicked
        // TODO add your handling code here:
        

    
        
    }//GEN-LAST:event_ComprasTBMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMouseClicked

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:

        if(Menu.getSelectedItem().equals("Nuevo Producto")){
            NuevoProducto Producto=new NuevoProducto();
            Producto.setVisible(true);

        }if(Menu.getSelectedItem().equals("Agrege Datos Del Proveedor")){
            Proveedor proveedor=new Proveedor();
            proveedor.setVisible(true);

        }if(Menu.getSelectedItem().equals("Agregar Fecha Compras")){
            Comprass compra=new Comprass();
            compra.setVisible(true);

        }if(Menu.getSelectedItem().equals("Realizar compra")){
            CompraProveedor compra=new CompraProveedor();
            compra.setVisible(true);

        }
    }//GEN-LAST:event_MenuActionPerformed

    private void MenuVerDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuVerDatosMouseClicked

    }//GEN-LAST:event_MenuVerDatosMouseClicked

    private void MenuVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVerDatosActionPerformed
        if(MenuVerDatos.getSelectedItem().equals("Ver Proveedor")){
            Proveedor();
        }if(MenuVerDatos.getSelectedItem().equals("Ver Productos")){
            MetodoMostrar();
        }if(MenuVerDatos.getSelectedItem().equals("Ver Compras")){
            Compra();
        }if(MenuVerDatos.getSelectedItem().equals("Ver Detalles de la Compra")){
            VerDatos();

        }
    }//GEN-LAST:event_MenuVerDatosActionPerformed
   public void MetodoMostrar(){
        DefaultTableModel Modelo=new  DefaultTableModel();
        Modelo.addColumn("Codigo Producto");
        Modelo.addColumn("Nombre Producto");
        Modelo.addColumn("Descripcion");
        Modelo.addColumn("Costo");
        Modelo.addColumn("Precio");
        Modelo.addColumn("Existencia");
        Modelo.addColumn("Laboratorio");
        Modelo.addColumn("Marca");
        ComprasTB.setModel(Modelo);
        String consulta=" select p.idProductos, p.Nombre,p.Descripcion,p.Costo,p.Precio,p.Existencia,l.Nombre,m.NombreMarca\n" +
"from Productos p, Marca m, Laboratorio l\n" +
"where p.idLaboratorio=l.idLaboratorio and p.idMarca=m.idMarca";
        String Datos[]=new String[8];
        
        try {
            st=ConectarBD.createStatement();
            rs=st.executeQuery(consulta);
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
        }
        
    }
    public void Proveedor(){
        DefaultTableModel Modelo=new DefaultTableModel();
        Modelo.addColumn("Codigo Proveedor");
        Modelo.addColumn("Nombre Proveedor");
        Modelo.addColumn("Nit ");
        Modelo.addColumn("Telefono");
        Modelo.addColumn("Forma de Pago");
        ComprasTB.setModel(Modelo);
        String Datos[]=new String[5];
        String Consulta="select p.idProveedores,p.Nombre,p.Nit,p.Telefono,fp.TipoPago\n" +
"from Proveedor p, formaPago fp\n" +
"where p.idFormaPago=fp.idFormaPago";
        
        try {
            st=ConectarBD.createStatement();
            rs=st.executeQuery(Consulta);
            while(rs.next()){
                Datos[0]=rs.getString(1);
                Datos[1]=rs.getString(2);
                Datos[2]=rs.getString(3);
                Datos[3]=rs.getString(4);
                Datos[4]=rs.getString(5);
                Modelo.addRow(Datos);
                
            }
        } catch (Exception e) {
        }
    }
    public void Compra(){
        DefaultTableModel Modelo=new DefaultTableModel();
        Modelo.addColumn("Numero de Compra");
        Modelo.addColumn("Fecha Compra");
        Modelo.addColumn("Codigo Proveedor");
        ComprasTB.setModel(Modelo);
        String Consulta="SELECT *FROM Compras";
        String Datos[]=new String[3];
        
        try {
             st=ConectarBD.createStatement();
            rs=st.executeQuery(Consulta);
            while(rs.next()){
                Datos[0]=rs.getString(1);
                Datos[1]=rs.getString(2);
                Datos[2]=rs.getString(3);
                Modelo.addRow(Datos);
            }
            
        } catch (Exception e) {
        }
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
public void CargarTipoPago(JComboBox Pago){
    DefaultComboBoxModel pag=new DefaultComboBoxModel();
    Pago.setModel(pag);
    String Consulta="select TipoPago from formaPago";
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Pago.addItem(rs.getString("TipoPago"));
            
        }
    } catch (Exception e) {
    }
    
}
public void CargarCodigoProducto(JComboBox Codigo){
    DefaultComboBoxModel CodigModel=new DefaultComboBoxModel();
    Codigo.setModel(CodigModel);
    String consulta="select idProductos from Productos";
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(consulta);
        while(rs.next()){
            Codigo.addItem(rs.getString("idProductos"));
        }
    } catch (Exception e) {
    }
    
}


public void CargarDatosCodgoProveedor(JComboBox CodigoProveedor){
        DefaultComboBoxModel Codigo=new DefaultComboBoxModel();
        CodigoProveedor.setModel(Codigo);
        String Consulta="select idProveedores from Proveedor";
        try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            CodigoProveedor.addItem(rs.getString("IdProveedores"));
            
        }
        } catch (Exception e) {
        }
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ComprasTB;
    private javax.swing.JPanel Fondo;
    private javax.swing.JComboBox<String> Menu;
    private javax.swing.JComboBox<String> MenuVerDatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
