/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class LoginInicio extends javax.swing.JFrame {

    int xMouse, yMouse;
    /**
     * Creates new form LoginInicio
     */
    Conexion Conecatar=new Conexion();
    
    ResultSet rs=null;
    PreparedStatement mostrar=null;
    public LoginInicio() {
        initComponents();
    }
public void Validacion(){
        try (Connection conecatrBD=Conecatar.getConection();){
            String Usuario=txtUsuario.getText();
            String contra=txtContra.getText();
            String Consulta="select NombreUsuario, ApellidoUsuario\n" +
"from Usuario where Usuario='"+Usuario+"' and Contraseña='"+contra+"'";
            mostrar=conecatrBD.prepareStatement(Consulta);
            rs=mostrar.executeQuery();
            if(rs.next()){
                setVisible(false);
                Programa acceder=new Programa();
                JOptionPane.showMessageDialog(null,"Bienvenido");
                acceder.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e.toString());
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

        panelPrincipal = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        tituloContraseña = new javax.swing.JLabel();
        tituloUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        botonInicio = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitj = new javax.swing.JLabel();
        Imagenfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        titulo1.setText("INICIAR SESIÓN");
        panelPrincipal.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        tituloContraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloContraseña.setText("CONTRASEÑA");
        panelPrincipal.add(tituloContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 110, 30));

        tituloUsuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        tituloUsuario.setText("USUARIO");
        panelPrincipal.add(tituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 30));

        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 310, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        panelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 310, 30));

        botonInicio.setBackground(new java.awt.Color(1, 128, 115));
        botonInicio.setText("INICIAR");
        botonInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonInicioMouseExited(evt);
            }
        });
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 180, 40));

        txtContra.setForeground(new java.awt.Color(204, 204, 204));
        txtContra.setText("*******");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        panelPrincipal.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                headerMouseReleased(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
        });

        exitj.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        exitj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitj.setText("X");
        exitj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitjMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitjMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitj, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 886, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipal.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        Imagenfondo.setForeground(new java.awt.Color(204, 204, 204));
        Imagenfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenLogin.png"))); // NOI18N
        Imagenfondo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelPrincipal.add(Imagenfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        // TODO add your handling code here:
        Validacion();
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseEntered
        // TODO add your handling code here:                                    
        botonInicio.setBackground(new Color(80, 196, 181));
    }//GEN-LAST:event_botonInicioMouseEntered

    private void botonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseExited
        // TODO add your handling code here:
        botonInicio.setBackground(new Color(1, 128, 115));
    }//GEN-LAST:event_botonInicioMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseReleased
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseReleased

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
       //exitBtn.setBackground(Color.red);
    }//GEN-LAST:event_exitBtnMouseEntered

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Ingrese su nombre de usuario")){
        txtUsuario.setText("");
        txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(txtContra.getPassword()).isEmpty()){
        txtContra.setText("*******");
        txtContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if (String.valueOf(txtContra.getPassword()).equals("*******")){
        txtContra.setText("");
        txtContra.setForeground(Color.black);
        }
        if (txtUsuario.getText().isEmpty()){
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void exitjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitjMouseExited
        exitBtn.setBackground(Color.white);
    }//GEN-LAST:event_exitjMouseExited

    private void exitjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitjMouseEntered
        exitBtn.setBackground(Color.red);
    }//GEN-LAST:event_exitjMouseEntered

    private void exitjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitjMouseClicked
      
        if(JOptionPane.showConfirmDialog(null,"DESEA SALIR DEL INICIO","SALIR",JOptionPane.YES_NO_CANCEL_OPTION)==0){
            dispose();
        }
    }//GEN-LAST:event_exitjMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagenfondo;
    private javax.swing.JButton botonInicio;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitj;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel tituloContraseña;
    private javax.swing.JLabel tituloUsuario;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
