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
        UsuarioBoton2 = new javax.swing.JButton();
        Mostrar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgrour.setBackground(new java.awt.Color(255, 255, 255));

        opciones.setBackground(new java.awt.Color(216, 71, 245));
        opciones.setPreferredSize(new java.awt.Dimension(290, 650));

        UsuarioBoton.setText("Usuario");
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

        Cerrar.setText("CERRAR SESIÓN");
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

        ProductosBoton.setText("PRODUCTOS");
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

        UsuarioBoton2.setText("Usuario");
        UsuarioBoton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuarioBoton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuarioBoton2MouseExited(evt);
            }
        });
        UsuarioBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioBoton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesLayout = new javax.swing.GroupLayout(opciones);
        opciones.setLayout(opcionesLayout);
        opcionesLayout.setHorizontalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UsuarioBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProductosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        opcionesLayout.setVerticalGroup(
            opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(UsuarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProductosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(UsuarioBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setPreferredSize(new java.awt.Dimension(850, 630));

        javax.swing.GroupLayout MostrarLayout = new javax.swing.GroupLayout(Mostrar);
        Mostrar.setLayout(MostrarLayout);
        MostrarLayout.setHorizontalGroup(
            MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MostrarLayout.setVerticalGroup(
            MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(220, 94, 245));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FARMACIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(634, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgrourLayout = new javax.swing.GroupLayout(backgrour);
        backgrour.setLayout(backgrourLayout);
        backgrourLayout.setHorizontalGroup(
            backgrourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgrourLayout.createSequentialGroup()
                .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgrourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)))
        );
        backgrourLayout.setVerticalGroup(
            backgrourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opciones, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addGroup(backgrourLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void UsuarioBoton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioBoton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioBoton2MouseEntered

    private void UsuarioBoton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioBoton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioBoton2MouseExited

    private void UsuarioBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioBoton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioBoton2ActionPerformed

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
    private javax.swing.JPanel Mostrar;
    private javax.swing.JButton ProductosBoton;
    private javax.swing.JButton UsuarioBoton;
    private javax.swing.JButton UsuarioBoton2;
    private javax.swing.JPanel backgrour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel opciones;
    // End of variables declaration//GEN-END:variables
}
