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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel Arriola
 */
public class VentasPanel extends javax.swing.JPanel {
   Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   ResultSet rs;
   PreparedStatement insertar;
   PreparedStatement Actualizar;
   Statement st;
   

    public VentasPanel() {
        initComponents();
        CargarVentas(CodigoVentas);
        CargarCodigoProducto(CodigoProductosCon);
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
        CodigoProductosCon = new javax.swing.JComboBox<>();
        txtCostoTotal = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        CodigoVentas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        MenuVerDatos = new javax.swing.JComboBox<>();
        MenuAgregar = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentasTB = new javax.swing.JTable();

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

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

        txtCostoTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo "));

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        txtPrecioCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio "));
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

        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Detalle Ventas"));
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

        CodigoVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo Ventas"));
        CodigoVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodigoVentasMouseClicked(evt);
            }
        });
        CodigoVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoVentasActionPerformed(evt);
            }
        });

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("VER COMPRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        MenuVerDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Datos", "VER CLIENTES", "VER PRODUCTOS", "VER FECHA VENTAS", "VER DETALLE DE LAS VENTAS" }));
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

        MenuAgregar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DESEA AGREGAR", "AGREGAR CLIENTE", "AGREGAR FECHA VENTA", " ", " " }));
        MenuAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuAgregarMouseClicked(evt);
            }
        });
        MenuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CodigoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(CodigoProductosCon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(MenuVerDatos, 0, 1, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(MenuAgregar, 0, 1, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoProductosCon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MenuVerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 270));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        VentasTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(VentasTB);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 890, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
        InsertarVentaDetalle();
        Actualizar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void MenuVerDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuVerDatosMouseClicked

    }//GEN-LAST:event_MenuVerDatosMouseClicked

    private void MenuVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVerDatosActionPerformed
        if(MenuVerDatos.getSelectedItem().equals("VER PRODUCTOS")){
            MostrarDatosProductos();
           
        }if(MenuVerDatos.getSelectedItem().equals("VER CLIENTES")){
            VerDatosClientes();
           
        }if(MenuVerDatos.getSelectedItem().equals("VER FECHA VENTAS")){
           
        }if(MenuVerDatos.getSelectedItem().equals("VER DETALLE DE LAS VENTAS")){
            VerDatallesdeVentas();

        }
    }//GEN-LAST:event_MenuVerDatosActionPerformed

    private void CodigoVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoVentasActionPerformed

    private void MenuAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAgregarMouseClicked

    private void MenuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgregarActionPerformed
        if(MenuAgregar.getSelectedItem().equals("AGREGAR CLIENTE")){
            Clientes cliente=new Clientes();
            cliente.setVisible(true);
            
        }if(MenuAgregar.getSelectedItem().equals("AGREGAR FECHA VENTA")){
             Venta venta=new Venta();
            venta.setVisible(true);
        }
    }//GEN-LAST:event_MenuAgregarActionPerformed

    private void CodigoVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoVentasMouseClicked
        CargarVentas(CodigoVentas);
    }//GEN-LAST:event_CodigoVentasMouseClicked

    private void CodigoProductosConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoProductosConMouseClicked
        CargarCodigoProducto(CodigoProductosCon);
    }//GEN-LAST:event_CodigoProductosConMouseClicked
public void InsertarVentaDetalle(){
    String Consulta="INSERT INTO DetalleVenta(idProductos,idVentas,precio,cantidad,costoTotal)values(?,?,?,?,?)";
    String CodigoVen=(String) CodigoVentas.getSelectedItem();
    String CodigoProd=(String) CodigoProductosCon.getSelectedItem();
   
    
    try {
        insertar=ConectarBD.prepareStatement(Consulta);
        insertar.setString(1,CodigoProd);
        insertar.setString(2, CodigoVen);
        insertar.setString(3, txtPrecioCompra.getText());
        insertar.setString(4, txtCantidad.getText());
        insertar.setString(5, txtCostoTotal.getText());
        insertar.executeUpdate();
        JOptionPane.showMessageDialog(null,"Agregado correctamente" );
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Error"+e.toString() );
    }
    
}
public void Actualizar(){
    
   
    
    
    String CodigoP=(String) CodigoProductosCon.getSelectedItem();
    
    int CodigoProductos=Integer.parseInt(CodigoP);
    
    System.out.println("El id es "+CodigoProductos);
   
    try {
        Actualizar=ConectarBD.prepareStatement("update Productos set Existencia=Existencia-'"+txtCantidad.getText()+"' where idProductos='"+CodigoProductos+"'");
    int Contador=Actualizar.executeUpdate();
    if(Contador>0){
        JOptionPane.showMessageDialog(null,"Datos Actualizados");
      MostrarProductos();
        
    }else {
          JOptionPane.showMessageDialog(null,"No selecciono la fila");
    }
    
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"error"+e.toString());
    }
}
 public void MostrarProductos(){
        DefaultTableModel Modelo=new  DefaultTableModel();
        Modelo.addColumn("Codigo Producto");
        Modelo.addColumn("Nombre Producto");
        Modelo.addColumn("Descripcion");
        Modelo.addColumn("Costo");
        Modelo.addColumn("Precio");
        Modelo.addColumn("Existencia");
        Modelo.addColumn("Laboratorio");
        Modelo.addColumn("Marca");
        VentasTB.setModel(Modelo);
        String consulta=" select p.idProductos, p.Nombre,p.Descripcion,p.Costo,p.Precio,p.Existencia,l.Nombre,m.NombreMarca\n" +
"from Productos p, Marca m, Laboratorio l\n" +
"where p.idLaboratorio=l.idLaboratorio and p.idMarca=m.idMarca and p.idProductos='"+CodigoProductosCon.getSelectedItem()+"'";
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
 
 
 public void CargarVentas(JComboBox ventas){
     DefaultComboBoxModel ModeloVentas=new DefaultComboBoxModel();
     ventas.setModel(ModeloVentas);
     String Consulta="select idVentas from Ventas";
     try {
         st=ConectarBD.createStatement();
         rs=st.executeQuery(Consulta);
         while(rs.next()){
             ventas.addItem(rs.getString("idVentas"));
             
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
    
    // Metodos para ver los datos 
    public void VerDatosClientes(){
        DefaultTableModel Modelo=new DefaultTableModel();
        Modelo.addColumn("codigo Cliente");
        Modelo.addColumn("Nombre Cliente");
        Modelo.addColumn("Nit");
        Modelo.addColumn("Telefono");
        Modelo.addColumn("Tipo Pago");
        VentasTB.setModel(Modelo);
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
    public void MostrarDatosProductos(){
        DefaultTableModel Modelo=new  DefaultTableModel();
        Modelo.addColumn("Codigo Producto");
        Modelo.addColumn("Nombre Producto");
        Modelo.addColumn("Descripcion");
        Modelo.addColumn("Costo");
        Modelo.addColumn("Precio");
        Modelo.addColumn("Existencia");
        Modelo.addColumn("Laboratorio");
        Modelo.addColumn("Marca");
        VentasTB.setModel(Modelo);
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
    public void VerDatallesdeVentas(){
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
        Modelo.addColumn("Existencia");
        Modelo.addColumn("Marca");
        Modelo.addColumn("Laboratorio");
        Modelo.addColumn("Pago");
        VentasTB.setModel(Modelo);
        String Datos[]=new String[17];
        String Consulta="Select dv.idDetalleVenta, c.idClientes,c.Nombre,c.Nit,c.Telefono,v.idVentas,v.fecha,dv.precio,dv.cantidad,dv.costoTotal,p.idProductos,p.Nombre,p.Descripcion,p.Existencia,m.NombreMarca,l.Nombre,fp.TipoPago\n" +
"from DetalleVenta dv, Ventas v,Productos p, formaPago fp, Clientes c, Laboratorio l , Marca m\n" +
"where dv.idVentas=v.idVentas and dv.idProductos=p.idProductos and v.idClientes=c.idClientes and c.idFormaPago=fp.idFormaPago\n" +
"and p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio";
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
           
                Modelo.addRow(Datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.toString());
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CodigoProductosCon;
    private javax.swing.JComboBox<String> CodigoVentas;
    private javax.swing.JPanel Fondo;
    private javax.swing.JComboBox<String> MenuAgregar;
    private javax.swing.JComboBox<String> MenuVerDatos;
    private javax.swing.JTable VentasTB;
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
