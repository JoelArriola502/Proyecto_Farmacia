/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofarmacia;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel Arriola
 */
public class CompraProductos extends javax.swing.JPanel {

     Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   ResultSet rs;
   PreparedStatement insertar;
   PreparedStatement Actualizar;
   Statement st;
   DefaultTableModel Modelo=new DefaultTableModel();
    public CompraProductos() {
        initComponents();
       
        Modelo.addColumn("CodigoCompra");
        Modelo.addColumn("CodigoProducto");
        Modelo.addColumn("Precio");
        Modelo.addColumn("Cantidad");
        Modelo.addColumn("CostoTotal");
        
        this.ComprasTB.setModel(Modelo);
        txtFecha.setDisabledTextColor(Color.BLUE);
        txtFecha.setText(Fecha());//pasamos la fecha al txtFecha
        txtFecha.setEnabled(false);//para que no se edite la fecha
        Bloquear();
        CargarNumeroCompra();
    }
public void CargarNumeroCompra(){
    String CodigoFactura=idCompras(); //cargamos el id de venta 
        int factura=Integer.parseInt(CodigoFactura);//comvertimos el id tipo int
        int resul=1+factura;// le sumamos 1
        String mostraCodigoFa=Integer.toString(resul);
        txtNumeroCompra.setDisabledTextColor(Color.BLUE);
        txtNumeroCompra.setText(mostraCodigoFa);// pasamos el id
        txtNumeroCompra.setEnabled(false);// para que no se pueda editar
}
public void Bloquear(){
    CargarPeroducto.setEnabled(false);
    ProveedorCargar.setEnabled(false);
    
}
public void Desbloquear(){
    CargarPeroducto.setEnabled(true);
    ProveedorCargar.setEnabled(true);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtCodigoProveedor = new javax.swing.JTextField();
        ProveedorCargar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtNombreProducto = new javax.swing.JTextField();
        CodigoProductosCon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        CargarPeroducto = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCostoTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtNumeroCompra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TotalTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ComprasTB = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(110, 207, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(110, 207, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Proveedor");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo Proveedor");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 108, 30));
        jPanel4.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 30, 210, 30));

        txtCodigoProveedor.setEditable(false);
        txtCodigoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProveedorActionPerformed(evt);
            }
        });
        jPanel4.add(txtCodigoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 110, 30));

        ProveedorCargar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProveedorCargar.setForeground(new java.awt.Color(0, 0, 0));
        ProveedorCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargar.png"))); // NOI18N
        ProveedorCargar.setText("CARGAR DATOS PROVEEDOR");
        ProveedorCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProveedorCargar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ProveedorCargar.setIconTextGap(15);
        ProveedorCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorCargarActionPerformed(evt);
            }
        });
        jPanel4.add(ProveedorCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 250, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 130));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        jPanel5.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 210, 30));

        CodigoProductosCon.setEditable(false);
        CodigoProductosCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodigoProductosConKeyTyped(evt);
            }
        });
        jPanel5.add(CodigoProductosCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Producto");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Codigo Producto");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 108, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 30));

        txtPrecioCompra.setEditable(false);
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
        jPanel5.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Existencia");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 70, 30));

        txtExistencia.setEditable(false);
        jPanel5.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 70, 30));

        CargarPeroducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CargarPeroducto.setForeground(new java.awt.Color(0, 0, 0));
        CargarPeroducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cargar.png"))); // NOI18N
        CargarPeroducto.setText("CARGAR DATOS PRODUCTO");
        CargarPeroducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarPeroducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CargarPeroducto.setIconTextGap(15);
        CargarPeroducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarPeroductoActionPerformed(evt);
            }
        });
        jPanel5.add(CargarPeroducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 250, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 530, 180));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cantidad");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Costo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 530, 90));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA COMPRA");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, 48));

        txtFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel7.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 80, 180, 53));

        txtNumeroCompra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel7.add(txtNumeroCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, 53));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NUMERO  COMPRA");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 170, 190, 48));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 300, 320));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(15);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, 60));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setIconTextGap(15);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 180, 60));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        jButton3.setText("ELIMINAR");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setIconTextGap(15);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 180, 60));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 620, 90));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IMPRIMIR.png"))); // NOI18N
        jButton4.setText("IMPRIMIR");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setIconTextGap(15);

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nueva.png"))); // NOI18N
        jButton5.setText("NUEVA COMPRA");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(15);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar_1.png"))); // NOI18N
        jButton6.setText("REALIZAR COMPRA");
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.setIconTextGap(15);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 280, 320));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(0, 0, 0));

        TotalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TotalTable);

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
        jScrollPane3.setViewportView(ComprasTB);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(997, 997, 997)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProveedorActionPerformed

    private void ProveedorCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorCargarActionPerformed
        RegistroProveedores pro=new RegistroProveedores();
        pro.setVisible(true);
    }//GEN-LAST:event_ProveedorCargarActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void CodigoProductosConKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoProductosConKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_CodigoProductosConKeyTyped

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraActionPerformed

    private void txtPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyTyped
        char v=evt.getKeyChar();
        if((v<'0'||v>'9')&&(v<'.'||v>'.'))evt.consume();
    }//GEN-LAST:event_txtPrecioCompraKeyTyped

    private void CargarPeroductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarPeroductoActionPerformed
        //ProductosNew pro=new ProductosNew();
        MostrarProductosCompra pro=new MostrarProductosCompra();
        pro.setVisible(true);
    }//GEN-LAST:event_CargarPeroductoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(txtCantidad.getText().trim().isEmpty()||txtExistencia.getText().trim().isEmpty()||txtPrecioCompra.getText().trim().isEmpty()||CodigoProductosCon.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "POR FAVOR LLENE LOS CAMPOS");

        }else {
            int CantidadV=Integer.parseInt(txtCantidad.getText());
            int existenciap=Integer.parseInt(txtExistencia.getText());
            if(CantidadV>0){
                  llamar();
                
            } else {
                JOptionPane.showMessageDialog(null, "La Cantidad No puede ser 0");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        InsertarCompra();
        RealizarCompra();
        ActualizarExistencia();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     eliminar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       EliminarAgregados();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       EliminarAgregados();
       CargarNumeroCompra();
       Desbloquear();
       Limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void llamar(){
    String idVenta=idCompras();
    int codiV=Integer.parseInt(idVenta);
    int resul=1+codiV;
    String idVentaC=Integer.toString(resul);
    String cargar[]= new String[5];
  
    float precio=Float.parseFloat(txtPrecioCompra.getText());
    int Cantidad=Integer.parseInt(txtCantidad.getText());
    float costo=precio*Cantidad;
    String CostoTotal=Float.toString(costo);
    
    cargar[0]=txtNumeroCompra.getText();
    cargar[1]=CodigoProductosCon.getText();
    cargar[2]=txtPrecioCompra.getText();
    cargar[3]=txtCantidad.getText();
    cargar[4]=CostoTotal;
    Modelo.addRow(cargar);
    
    
    
    
    
}
    
    public String Fecha(){
    Date fecha=new Date();
    SimpleDateFormat fechaActual=new SimpleDateFormat("yyy-MM-dd");
    return fechaActual.format(fecha);
    
}
public String idCompras(){
    String Consulta="select max(idCompras)as CodigoCompras from Compras";
    String id=null;
    try {
         PreparedStatement Mostra=ConectarBD.prepareStatement(Consulta);
         rs=Mostra.executeQuery();
         if(rs.next()){
             String idCompra=rs.getString("CodigoCompras");
             id=(idCompra);
         }
    } catch (Exception e) {
    }
    return id;
    
}
public void RealizarCompra(){
      try {
          for(int i=0;i<ComprasTB.getRowCount();i++){
              insertar=ConectarBD.prepareStatement("insert into CompraDetalle(idCompras,idProductos,precio,cantidad,costoTotal)values(?,?,?,?,?)");
              insertar.setString(1, ComprasTB.getValueAt(i, 0).toString());
              insertar.setString(2, ComprasTB.getValueAt(i, 1).toString());
              insertar.setString(3, ComprasTB.getValueAt(i, 2).toString());
              insertar.setString(4, ComprasTB.getValueAt(i, 3).toString());
              insertar.setString(5, ComprasTB.getValueAt(i, 4).toString());
              insertar.executeUpdate();
              
          }
          JOptionPane.showMessageDialog(null, "COMPRA REALIZADA CON EXITO");
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error"+e.toString());
      }
  }
  public void ActualizarExistencia(){
   int Cantidad=Integer.parseInt(txtCantidad.getText().toString());
   int Existencia=Integer.parseInt(txtExistencia.getText());
    try {
         for(int i=0;i<ComprasTB.getRowCount();i++){
              Actualizar=ConectarBD.prepareStatement("update Productos set Existencia=Existencia+'"+ComprasTB.getValueAt(i, 3)+"' where idProductos='"+ComprasTB.getValueAt(i, 1)+"'");
              
              Actualizar.executeUpdate();    
         }
        
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"error"+e.toString());
    }
   
}
   public void InsertarCompra(){
   
     String sql="INSERT INTO Compras(Fecha,idProveedores)values(?,?)";
     
    try {
        insertar=ConectarBD.prepareStatement(sql);
        insertar.setString(1, txtFecha.getText());
        insertar.setString(2,txtCodigoProveedor.getText());
        insertar.executeUpdate();
       
        
    JOptionPane.showMessageDialog(null,"Agregados Correcto ventas" );
       
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"error"+e.toString() );
    }
}
   public static String validadif(){
       String Compra="Compra";
       return Compra;
       
   }
   public void eliminar(){
    int fila=ComprasTB.getSelectedRow();
    if(fila>=0){
        Modelo.removeRow(fila);
        
    }else {
        JOptionPane.showMessageDialog(null, "Seleccione la fila");
    }
}
   public void EliminarAgregados(){
    int fila=ComprasTB.getRowCount();
    for(int i=fila-1; i>=0; i--){
        Modelo.removeRow(i);
    }
}
   public void Limpiar(){
       txtCantidad.setText("");
       txtCodigoProveedor.setText("");
       CodigoProductosCon.setText("");
       txtCostoTotal.setText("");
       txtExistencia.setText("");
       txtNombreProducto.setText("");
       txtNombreProveedor.setText("");
       txtPrecioCompra.setText("");
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarPeroducto;
    public static javax.swing.JTextField CodigoProductosCon;
    private rojerusan.RSTableMetro ComprasTB;
    private javax.swing.JButton ProveedorCargar;
    private javax.swing.JTable TotalTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtCodigoProveedor;
    public static javax.swing.JTextField txtCostoTotal;
    public static javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtNombreProducto;
    public static javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNumeroCompra;
    public static javax.swing.JTextField txtPrecioCompra;
    // End of variables declaration//GEN-END:variables
}
