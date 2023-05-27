/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Joel Arriola
 */
public class Programa extends javax.swing.JFrame {

    /**
     * Creates new form Programa
     */
    public Programa() {
        initComponents();
       // UsuarioBoton.putClientProperty( "FlatLaf.styleClass", "h1" );
         jLabel1.putClientProperty( "FlatLaf.styleClass", "h1" );
         
       //  this.setExtendedState(this.MAXIMIZED_BOTH);
       
    }
public void Usuario(){
    Usuario ConsultarDatos=new Usuario();
    ConsultarDatos.setSize(890,520);
    ConsultarDatos.setLocation(0,0);
    Mostrar.removeAll();
    Mostrar.add(ConsultarDatos,BorderLayout.CENTER);
    Mostrar.revalidate();
    Mostrar.repaint();
}
public void Productos(){
    Productos ConsultarDatos=new Productos();
    ConsultarDatos.setSize(890,529);
    ConsultarDatos.setLocation(0,0);
    Mostrar.removeAll();
    Mostrar.add(ConsultarDatos,BorderLayout.CENTER);
    Mostrar.revalidate();
    Mostrar.repaint();
}
public void Compras(){
    Compras compras=new Compras();
    compras.setSize(890,530);
    compras.setLocation(0,0);
    Mostrar.removeAll();
    Mostrar.add(compras,BorderLayout.CENTER);
    Mostrar.revalidate();
    Mostrar.repaint();
}

public void Ventas(){
    VentasPanel ventas=new VentasPanel();
    ventas.setSize(890,530);
    ventas.setLocation(0,0);
    Mostrar.removeAll();
    Mostrar.add(ventas,BorderLayout.CENTER);
    Mostrar.revalidate();
    Mostrar.repaint();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgrour = new javax.swing.JPanel();
        opciones = new javax.swing.JPanel();
        UsuarioBoton = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        ProductosBoton = new javax.swing.JButton();
        ComprasBoton = new javax.swing.JButton();
        VentasBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Mostrar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        backgrour.setBackground(new java.awt.Color(255, 255, 255));
        backgrour.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opciones.setBackground(new java.awt.Color(110, 207, 255));
        opciones.setPreferredSize(new java.awt.Dimension(290, 650));

        UsuarioBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsuarioBoton.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_add_12818.png"))); // NOI18N
        UsuarioBoton.setText("Usuario");
        UsuarioBoton.setContentAreaFilled(false);
        UsuarioBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsuarioBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsuarioBoton.setIconTextGap(15);
        UsuarioBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuarioBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuarioBotonMouseExited(evt);
            }
        });
        UsuarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioBotonActionPerformed(evt);
            }
        });

        Cerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(0, 0, 0));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salida.png"))); // NOI18N
        Cerrar.setText("CERRAR SESIÓN");
        Cerrar.setContentAreaFilled(false);
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cerrar.setIconTextGap(15);
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        ProductosBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProductosBoton.setForeground(new java.awt.Color(0, 0, 0));
        ProductosBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Producto.png"))); // NOI18N
        ProductosBoton.setText("PRODUCTOS");
        ProductosBoton.setContentAreaFilled(false);
        ProductosBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductosBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ProductosBoton.setIconTextGap(15);
        ProductosBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductosBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductosBotonMouseExited(evt);
            }
        });
        ProductosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosBotonActionPerformed(evt);
            }
        });

        ComprasBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComprasBoton.setForeground(new java.awt.Color(0, 0, 0));
        ComprasBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Compra1.png"))); // NOI18N
        ComprasBoton.setText("COMPRAS");
        ComprasBoton.setContentAreaFilled(false);
        ComprasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ComprasBoton.setIconTextGap(15);
        ComprasBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ComprasBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ComprasBotonMouseExited(evt);
            }
        });
        ComprasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprasBotonActionPerformed(evt);
            }
        });

        VentasBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VentasBoton.setForeground(new java.awt.Color(0, 0, 0));
        VentasBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Venta.png"))); // NOI18N
        VentasBoton.setText("VENTAS");
        VentasBoton.setContentAreaFilled(false);
        VentasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VentasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        VentasBoton.setIconTextGap(15);
        VentasBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VentasBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VentasBotonMouseExited(evt);
            }
        });
        VentasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasBotonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_Farmacia-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionesLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VentasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComprasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsuarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(opcionesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UsuarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProductosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(VentasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ComprasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backgrour.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 631));

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setPreferredSize(new java.awt.Dimension(850, 630));

        javax.swing.GroupLayout MostrarLayout = new javax.swing.GroupLayout(Mostrar);
        Mostrar.setLayout(MostrarLayout);
        MostrarLayout.setHorizontalGroup(
            MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        MostrarLayout.setVerticalGroup(
            MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        backgrour.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 91, 890, 540));

        jPanel1.setBackground(new java.awt.Color(110, 207, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FARMACIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 21, 146, 43));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 50, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarVentana.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, -1));

        backgrour.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 890, 92));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgrour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioBotonActionPerformed

        // TODO add your handling code here:
        Usuario();
    }//GEN-LAST:event_UsuarioBotonActionPerformed

    private void UsuarioBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioBotonMouseEntered
        // TODO add your handling code here:
        UsuarioBoton.setBackground(new Color(235, 176, 214));
    }//GEN-LAST:event_UsuarioBotonMouseEntered

    private void UsuarioBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioBotonMouseExited
        // TODO add your handling code here:
        UsuarioBoton.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_UsuarioBotonMouseExited

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarMouseExited

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        
        if(JOptionPane.showConfirmDialog(null,"ESTA SEGURO DE CERRAR SECCIÓN","SALIR" ,JOptionPane.YES_NO_CANCEL_OPTION)==0){
            LoginInicio login=new LoginInicio();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_CerrarActionPerformed

    private void ProductosBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosBotonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductosBotonMouseEntered

    private void ProductosBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosBotonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductosBotonMouseExited

    private void ProductosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosBotonActionPerformed
        // TODO add your handling code here:
        Productos();
    }//GEN-LAST:event_ProductosBotonActionPerformed

    private void ComprasBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasBotonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ComprasBotonMouseEntered

    private void ComprasBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasBotonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ComprasBotonMouseExited

    private void ComprasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprasBotonActionPerformed
        // TODO add your handling code here:
        Compras();
    }//GEN-LAST:event_ComprasBotonActionPerformed

    private void VentasBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasBotonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_VentasBotonMouseEntered

    private void VentasBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasBotonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_VentasBotonMouseExited

    private void VentasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasBotonActionPerformed
        Ventas();
    }//GEN-LAST:event_VentasBotonActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //Minimizar ventana
        this.setState(Clientes.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(JOptionPane.showConfirmDialog(null,"DESEA SALIR DE LA VENTANA CLIENTES","SALIR",JOptionPane.YES_NO_OPTION)==0){
            dispose();
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();
        FlatDraculaContrastIJTheme.setup();
        FlatMaterialLighterContrastIJTheme.setup();
        
        
      //.putClientProperty( "FlatLaf.styleClass", "h1" );
       UIManager.put( "Button.arc", 999 );
       UIManager.put( "Component.arc", 999 );
       UIManager.put( "ProgressBar.arc", 999 );
       UIManager.put( "TextComponent.arc", 999 );
       UIManager.put( "ScrollBar.showButtons", true );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton ComprasBoton;
    private javax.swing.JPanel Mostrar;
    private javax.swing.JButton ProductosBoton;
    private javax.swing.JButton UsuarioBoton;
    private javax.swing.JButton VentasBoton;
    private javax.swing.JPanel backgrour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel opciones;
    // End of variables declaration//GEN-END:variables
}
