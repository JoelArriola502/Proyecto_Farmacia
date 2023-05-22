/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofarmacia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Nit");
    Modelo.addColumn("Telefono");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Cantidad");
    Modelo.addColumn("costoTotal");
    Modelo.addColumn("Fecha");
    Modelo.addColumn("Documento");
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
    
    String Consulta="select cd.idCompraDetalle,pr.Nombre,pr.Nit,pr.Telefono,cd.precio,cd.cantidad,cd.costoTotal,c.Fecha,c.Documento,p.idProductos,p.Nombre,p.Descripcion,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre,fp.TipoPago\n" +
"from CompraDetalle cd, Compras c, Productos p, Proveedor pr, Marca m, Laboratorio l,formaPago fp\n" +
"where cd.idCompras=c.idCompras and cd.idProductos=p.idProductos  and c.idProveedores=pr.idProveedores and p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio\n" +
"and fp.idFormaPago=pr.idFormaPago";
    
    String Datos[] = new String[18];
    
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
        jButton1 = new javax.swing.JButton();
        txtDocumento = new javax.swing.JTextField();
        txtidFactura = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtNit = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtCostoTotal = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCodigoProducto = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtLaboratorio = new javax.swing.JTextField();
        txtTipoPago = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComprasTB = new javax.swing.JTable();

        Fondo.setBackground(new java.awt.Color(149, 115, 153));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(149, 115, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("VER COMPRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        txtDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento"));
        jPanel2.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 140, 40));

        txtidFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("codigo Farctura"));
        jPanel2.add(txtidFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, 40));

        txtNombreProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Proveedor"));
        jPanel2.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 40));

        txtNit.setBorder(javax.swing.BorderFactory.createTitledBorder("Nit"));
        jPanel2.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, 40));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 140, 40));

        txtPrecioCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Compra"));
        jPanel2.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 40));

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 140, 40));

        txtCostoTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo Total"));
        jPanel2.add(txtCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 140, 40));

        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 140, 40));

        txtCodigoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("codigo Producto"));
        jPanel2.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 140, 40));

        txtMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca Producto"));
        jPanel2.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 140, 40));

        txtExistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Existencia"));
        jPanel2.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 140, 40));

        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo"));
        jPanel2.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 140, 40));

        txtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 140, 40));

        txtNombreProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Producto"));
        jPanel2.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 140, 40));

        txtLaboratorio.setBorder(javax.swing.BorderFactory.createTitledBorder("Laboratorio"));
        jPanel2.add(txtLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 140, 40));

        txtTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Pago"));
        jPanel2.add(txtTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 140, 40));

        txtPrecioVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio Venta"));
        jPanel2.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 140, 40));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VerDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComprasTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasTBMouseClicked
        // TODO add your handling code here:
        
        int fila=this.ComprasTB.getSelectedRow();
        this.txtidFactura.setText(this.ComprasTB.getValueAt(fila, 0).toString());
        this.txtNombreProveedor.setText(this.ComprasTB.getValueAt(fila, 1).toString());
        this.txtNit.setText(this.ComprasTB.getValueAt(fila, 2).toString());
        this.txtTelefono.setText(this.ComprasTB.getValueAt(fila, 3).toString());
        this.txtPrecioCompra.setText(this.ComprasTB.getValueAt(fila, 4).toString());
        this.txtCantidad.setText(this.ComprasTB.getValueAt(fila, 5).toString());
        this.txtCostoTotal.setText(this.ComprasTB.getValueAt(fila, 6).toString());
        this.txtFecha.setText(this.ComprasTB.getValueAt(fila, 7).toString());
        this.txtDocumento.setText(this.ComprasTB.getValueAt(fila, 8).toString());
        this.txtCodigoProducto.setText(this.ComprasTB.getValueAt(fila, 9).toString());
        this.txtNombreProducto.setText(this.ComprasTB.getValueAt(fila, 10).toString());
        this.txtDescripcion.setText(this.ComprasTB.getValueAt(fila, 11).toString());
        this.txtCosto.setText(this.ComprasTB.getValueAt(fila, 12).toString());
        this.txtPrecioVenta.setText(this.ComprasTB.getValueAt(fila, 13).toString());
        this.txtExistencia.setText(this.ComprasTB.getValueAt(fila, 14).toString());
         this.txtMarca.setText(this.ComprasTB.getValueAt(fila, 15).toString());
        this.txtLaboratorio.setText(this.ComprasTB.getValueAt(fila, 16).toString());
        this.txtTipoPago.setText(this.ComprasTB.getValueAt(fila, 17).toString());
    
        
    }//GEN-LAST:event_ComprasTBMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ComprasTB;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoPago;
    private javax.swing.JTextField txtidFactura;
    // End of variables declaration//GEN-END:variables
}
