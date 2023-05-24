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
        CargarCodigoCompras(CodigoCompras);
        CargarCodigoProducto(CodigoProductosCon);
    }
    public void InsertarCompraDEtalle(){
        String insertarDatos="insert into CompraDetalle(idCompras,idProductos,precio,cantidad,costoTotal)values(?,?,?,?,?)";
        float CostoTotal1=Float.valueOf(txtPrecioCompra.getText());
        float Costototal2=Float.valueOf(txtCantidad.getText());
        float Resul=CostoTotal1*Costototal2;
       
       
        
        String Produ=(String) CodigoProductosCon.getSelectedItem();
        String Comp=(String) CodigoCompras.getSelectedItem();
        int CodigoProducto=Integer.parseInt(Produ);
        int CodigoCompra=Integer.parseInt(Comp);
        
        try {
            insertar=ConectarBD.prepareStatement(insertarDatos);
            insertar.setInt(1, CodigoCompra);
            insertar.setInt(2, CodigoProducto);
            insertar.setString(3, txtPrecioCompra.getText());
            insertar.setString(4, txtCantidad.getText());
            insertar.setFloat(5, Resul);
            insertar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Agregados Correctamente");
            System.out.println("Compras "+CodigoCompra);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Eroror"+e.toString());
        }
    
    }
public void Actualizar(){
    
   
    
    
    String CodigoP=(String) CodigoProductosCon.getSelectedItem();
    
    int CodigoProductos=Integer.parseInt(CodigoP);
    
    System.out.println("El id es "+CodigoProductos);
   
    try {
        Actualizar=ConectarBD.prepareStatement("update Productos set Existencia=Existencia+'"+txtCantidad.getText()+"' where idProductos='"+CodigoProductos+"'");
    int Contador=Actualizar.executeUpdate();
    if(Contador>0){
        JOptionPane.showMessageDialog(null,"Datos Actualizados");
        MetodoMostrar();
        
    }else {
          JOptionPane.showMessageDialog(null,"No selecciono la fila");
    }
    
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"error"+e.toString());
    }
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
        CodigoProductosCon = new javax.swing.JComboBox<>();
        txtCostoTotal = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        CodigoCompras = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        jPanel2.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 220, 40));

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
        jPanel2.add(MenuVerDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        CodigoProductosCon.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo Producto"));
        CodigoProductosCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodigoProductosConMouseClicked(evt);
            }
        });
        CodigoProductosCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoProductosConActionPerformed(evt);
            }
        });
        jPanel2.add(CodigoProductosCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 140, 40));

        txtCostoTotal.setEditable(false);
        txtCostoTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo Total"));
        jPanel2.add(txtCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 40));

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 40));

        txtPrecioCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Compra"));
        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });
        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 40));

        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Detalle Compra"));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 40));

        CodigoCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo Compra"));
        CodigoCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodigoComprasMouseClicked(evt);
            }
        });
        jPanel2.add(CodigoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 140, 40));

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 140, 40));

        jButton3.setText("VER COMPRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 140, 40));

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

    private void CodigoProductosConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoProductosConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoProductosConActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char valida=evt.getKeyChar();
        if(valida<'0'||valida>'9')evt.consume();
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraActionPerformed

    private void txtPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyTyped
        // TODO add your handling code here:
        char valida=evt.getKeyChar();
        if(valida<'0'||valida>'9')evt.consume();
    }//GEN-LAST:event_txtPrecioCompraKeyTyped

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //InsertarProveedor();
        //InsertarCompra();
        //InsertarNuevoProducto();

        InsertarCompraDEtalle();
        Actualizar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        VerDatos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CodigoProductosConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoProductosConMouseClicked
        CargarCodigoProducto(CodigoProductosCon);
    }//GEN-LAST:event_CodigoProductosConMouseClicked

    private void CodigoComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoComprasMouseClicked
        CargarCodigoCompras(CodigoCompras);
    }//GEN-LAST:event_CodigoComprasMouseClicked
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
public void CargarCodigoCompras(JComboBox CodigoCompras){
    DefaultComboBoxModel CodigoCompraModelo=new DefaultComboBoxModel();
       CodigoCompras.setModel(CodigoCompraModelo);
       String Consulta="select idCompras from Compras";
       try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            this.CodigoCompras.addItem(rs.getString("idCompras"));
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
    private javax.swing.JComboBox<String> CodigoCompras;
    private javax.swing.JComboBox<String> CodigoProductosCon;
    private javax.swing.JTable ComprasTB;
    private javax.swing.JPanel Fondo;
    private javax.swing.JComboBox<String> Menu;
    private javax.swing.JComboBox<String> MenuVerDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPrecioCompra;
    // End of variables declaration//GEN-END:variables
}
