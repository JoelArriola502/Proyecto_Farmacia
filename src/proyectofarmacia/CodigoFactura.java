/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofarmacia;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel Arriola
 */
public class CodigoFactura extends javax.swing.JPanel implements Printable{

     Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   PreparedStatement Insertar=null;
    ResultSet rs;
  PreparedStatement Actualizar;
  Statement st;
    public CodigoFactura() {
        initComponents();
       pasar();
         VerTotalPagr();
        DatosFactura();
      txtNombre.setText(ClienteDato(txtID.getText()));
      txtNit.setText(ClienteDatoNit(txtID.getText()));
    }
public String ClienteDato(String ID){
    String Cliente=null;
    String Consulta="select c.Nombre from Clientes c, Ventas v\n" +
"where v.idClientes=c.idClientes and v.idVentas='"+ID+"'";
    try {
        PreparedStatement Cargar=ConectarBD.prepareStatement(Consulta);
        ResultSet rs=Cargar.executeQuery();
        if(rs.next()){
            String Nombre=rs.getString("c.Nombre");
            Cliente=(Nombre);
        }
    } catch (Exception e) {
    }
    return  Cliente;
}
public String ClienteDatoNit(String ID){
    String Cliente=null;
    String Consulta="select c.Nit from Clientes c, Ventas v\n" +
"where v.idClientes=c.idClientes and v.idVentas='"+ID+"'";
    try {
        PreparedStatement Cargar=ConectarBD.prepareStatement(Consulta);
        ResultSet rs=Cargar.executeQuery();
        if(rs.next()){
            String Nombre=rs.getString("c.Nit");
            Cliente=(Nombre);
        }
    } catch (Exception e) {
    }
    return  Cliente;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaFactura = new rojerusan.RSTableMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        CodigoVentas = new rojerusan.RSTableMetro();

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(rSTableMetro1);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Número Factura");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, 120, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Factura");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 6, 149, 37));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 496, 10));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        Fondo.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 22, 120, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txtNit.setBackground(new java.awt.Color(255, 255, 255));
        txtNit.setForeground(new java.awt.Color(0, 0, 0));
        txtNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitActionPerformed(evt);
            }
        });
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 100, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 30));

        jLabel5.setText("4° Calle, 3° ave. Comunidad Agraria ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 35));

        jLabel6.setText("Multicultural San Vicente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 147, 35));

        jLabel4.setText("Retalhuleu, Champerico.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 147, 35));

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 290, 200));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Farmacia-removebg-preview.png"))); // NOI18N
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 60));

        TablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaFactura);

        Fondo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 550, 140));

        CodigoVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(CodigoVentas);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 480, 190, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
       VerTotalPagr();
        DatosFactura();
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed
public void DatosFactura(){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("Codigo Producto");
    Modelo.addColumn("Nombre Producto");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Cantidad");
    Modelo.addColumn("Total ");
    TablaFactura.setModel(Modelo);
    String Consulta="select p.idProductos,p.Nombre,dv.precio,dv.cantidad, sum(dv.precio*dv.cantidad)as Total\n" +
"from DetalleVenta dv, Ventas v,Productos p, formaPago fp, Clientes c, Laboratorio l , Marca m\n" +
"where dv.idVentas=v.idVentas and dv.idProductos=p.idProductos and v.idClientes=c.idClientes and c.idFormaPago=fp.idFormaPago\n" +
"and p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio and v.idVentas='"+txtID.getText()+"'\n" +
"group by p.idProductos,p.Nombre,dv.precio,dv.cantidad ";
    String Dato[]=new String[5];
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
        JOptionPane.showMessageDialog(null,"Error"+ e.toString());
    }
}
public void VerTotalPagr(){
    DefaultTableModel Modelo=new DefaultTableModel();
    
    Modelo.addColumn("Total Pagado");
    CodigoVentas.setModel(Modelo);
    String Consulta="select sum(precio*cantidad)as TotalAPagar from DetalleVenta\n" +
"where idVentas='"+txtID.getText()+"'";
    String Dato[]=new String[1];
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Dato[0]=rs.getString(1);
            Modelo.addRow(Dato);
        }
    } catch (Exception e) {
       
    }
    
}  
public void pasar(){
    Ventas venta=new Ventas();
    venta.idVenta();
    String Venta=venta.idVenta();
    txtID.setText(Venta);
}
public void Mostrar(){
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro CodigoVentas;
    private javax.swing.JPanel Fondo;
    private rojerusan.RSTableMetro TablaFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private rojerusan.RSTableMetro rSTableMetro1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex==0){
          Graphics2D graphics2D=(Graphics2D) graphics;
          graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
          printAll(graphics2D);
          return  PAGE_EXISTS;
          
      }else {
          return NO_SUCH_PAGE;
      }
    }
}
