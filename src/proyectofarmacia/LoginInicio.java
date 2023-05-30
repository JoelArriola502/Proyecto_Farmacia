/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.sql.Statement;


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
    Connection ConectarBD=Conecatar.getConection();
    ResultSet rs=null;
    PreparedStatement mostrar=null;
    public LoginInicio() {
        initComponents();
    }
public void Validacion(){
        try (Connection conecatrBD=Conecatar.getConection();){
            String Usuario=txtUsuario.getText();
            String contra=txtContra.getText();
            String Consulta="select u.idUsuario,u.NombreUsuario,u.ApellidoUsuario,u.Usuario,u.Contraseña, tu.NombreTipoUsuario As Cargo ,es.NombreEstado as Estado, cu.NombreAcceso as NivelAcceso\n" +
"from Usuario u, TipoUsuario tu, EstadoUsuario es, AccesoUsuario cu\n" +
"where u.idAccesoUsuario=cu.idAccesoUsuario and u.idEstadoUsuario=es.idEstadoUsuario and u.idTipoUsuario=tu.idTipoUsuario and  u.Usuario='"+Usuario+"' and u.Contraseña='"+contra+"'";
            mostrar=conecatrBD.prepareStatement(Consulta);
            rs=mostrar.executeQuery();
            if(rs.next()){
                setVisible(false);
                Programa acceder=new Programa();
                JOptionPane.showMessageDialog(null,"Bienvenido "+Usuario);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarVentana.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 752, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelPrincipal.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 50));

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
public void ValidacionBloqueo(){
        try (Connection conecatrBD=Conecatar.getConection();){
            String Usuario=txtUsuario.getText();
            String contra=txtContra.getText();
            int Admin=1;
            String Consulta="select u.idUsuario,u.NombreUsuario,u.ApellidoUsuario,u.Usuario,u.Contraseña, tu.NombreTipoUsuario As Cargo ,es.NombreEstado as Estado, cu.NombreAcceso as NivelAcceso\n" +
"from Usuario u, TipoUsuario tu, EstadoUsuario es, AccesoUsuario cu\n" +
"where u.idAccesoUsuario=cu.idAccesoUsuario and u.idEstadoUsuario=es.idEstadoUsuario and u.idTipoUsuario=tu.idTipoUsuario and  u.Usuario='"+Usuario+"' and u.Contraseña='"+contra+"' ";
            mostrar=conecatrBD.prepareStatement(Consulta);
            rs=mostrar.executeQuery();
            if(rs.next()){
                setVisible(false);
                Programa acceder=new Programa();
                JOptionPane.showMessageDialog(null,"Bienvenido "+Usuario);
                acceder.setVisible(true);
                
               acceder.Cajero();
                
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e.toString());
        }
        
    }
   
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
      
        
        String admin= ValidadUsuarioAdministrador(txtUsuario.getText(), txtContra.getText());
        String Cajero=ValidadUsuarioCajero(txtUsuario.getText(), txtContra.getText());
        if(txtUsuario.getText().trim().isEmpty()||txtContra.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "LLENE LOS CAMPOS");
       }else {
   
       if(admin.equals("USUARIO VALIDADO")){
            Programa acceder=new Programa();
                String DatosUsuario=BuscarNombreUsuario(txtUsuario.getText());
                
                JOptionPane.showMessageDialog(null,"Bienvenido "+DatosUsuario);
                acceder.setVisible(true);
                dispose();
       } else if(Cajero.equals("USUARIO VALIDADO")){
            Programa acceder=new Programa();
                String DatosUsuario=BuscarNombreUsuario(txtUsuario.getText());
                JOptionPane.showMessageDialog(null,"Bienvenido "+DatosUsuario);
               acceder.Cajero();
                acceder.setVisible(true);
              dispose();
       }else{
           JOptionPane.showMessageDialog(null, "CONTRASEÑA O USUARIO INCORRECTO");
       }
       }
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseEntered
        // TODO add your handling code here:                                    
        botonInicio.setBackground(new Color(80, 196, 181));
    }//GEN-LAST:event_botonInicioMouseEntered

    private void botonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseExited
        // TODO add your handling code here:
        botonInicio.setBackground(new Color(1, 128, 115));
    }//GEN-LAST:event_botonInicioMouseExited

    
    
    //Metodo Validacion Usuario
    public String ValidadUsuarioAdministrador(String Usuario, String Contra){
        Connection ConectarBD=Conecatar.getConection();
        String Validar=null;
       String admin="Administrador";
        String Consulta="select u.idUsuario,u.NombreUsuario,u.ApellidoUsuario,u.Usuario,u.Contraseña, tu.NombreTipoUsuario As Cargo ,es.NombreEstado as Estado, cu.NombreAcceso as NivelAcceso\n" +
"from Usuario u, TipoUsuario tu, EstadoUsuario es, AccesoUsuario cu\n" +
"where u.idAccesoUsuario=cu.idAccesoUsuario and u.idEstadoUsuario=es.idEstadoUsuario and u.idTipoUsuario=tu.idTipoUsuario and  u.Usuario='"+Usuario+"' and u.Contraseña='"+Contra+"' and tu.NombreTipoUsuario='"+admin+"'";
        
        try {
            mostrar=ConectarBD.prepareStatement(Consulta);
            rs=mostrar.executeQuery();
            if(rs.next()){
               
         Validar="USUARIO VALIDADO";
            } else{
                Validar="USUARIO NO VALIDADO";
            }
        } catch (Exception e) {
        }
       
       return Validar;
    }
     public String ValidadUsuarioCajero(String Usuario, String Contra){
         String Valida=null;
        Connection ConectarBD=Conecatar.getConection();
       String admin="Cajero";
        String Consulta="select u.idUsuario,u.NombreUsuario,u.ApellidoUsuario,u.Usuario,u.Contraseña, tu.NombreTipoUsuario As Cargo ,es.NombreEstado as Estado, cu.NombreAcceso as NivelAcceso\n" +
"from Usuario u, TipoUsuario tu, EstadoUsuario es, AccesoUsuario cu\n" +
"where u.idAccesoUsuario=cu.idAccesoUsuario and u.idEstadoUsuario=es.idEstadoUsuario and u.idTipoUsuario=tu.idTipoUsuario and  u.Usuario='"+Usuario+"' and u.Contraseña='"+Contra+"' and tu.NombreTipoUsuario='"+admin+"'";
        
        try {
            mostrar=ConectarBD.prepareStatement(Consulta);
            rs=mostrar.executeQuery();
            if(rs.next()){
               
           Valida="USUARIO VALIDADO";
            } else{
               Valida="USUARIO NO VALIDADO";
            }
        } catch (Exception e) {
        }
       
       return Valida; 
    }
    public String BuscarNombreUsuario(String Usuario){
        String MostrarDatos=null;
        String Consulta="Select NombreUsuario, ApellidoUsuario from Usuario where Usuario='"+Usuario+"'";
        
            try {
                mostrar=ConectarBD.prepareStatement(Consulta);
                rs=mostrar.executeQuery();
                if(rs.next()){
                    String Nombre=rs.getString("NombreUsuario");
                    String Apellido=rs.getString("ApellidoUsuario");
                    
                    MostrarDatos=" "+(Nombre)+" "+(Apellido)+"";
                }
                
            } catch (Exception e) {
            }
            
            return MostrarDatos;
    }
    
    
    
    
    
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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(JOptionPane.showConfirmDialog(null,"DESEA SALIR DE LA VENTANA CLIENTES","SALIR",JOptionPane.YES_NO_OPTION)==0){
            dispose();
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //Minimizar ventana
        this.setState(Clientes.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        
        
       FlatLightLaf.setup();
        UIManager.put( "Button.arc", 999 );
       UIManager.put( "Component.arc", 999 );
       UIManager.put( "ProgressBar.arc", 999 );
       UIManager.put( "TextComponent.arc", 999 );
       UIManager.put( "ScrollBar.showButtons", true );
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
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
