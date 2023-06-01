/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofarmacia;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Joel Arriola
 */
public class Conexion {
    ResultSet rs;
    PreparedStatement Actualizar;
     public Connection getConection(){
    {
     Connection Conectar=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmacia","root","joelarriola");
           
            if(Conectar!=null){
               // JOptionPane.showMessageDialog(null,"Conexion Exitosa");
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO AL CONECTAR A LA BASE DE DATOS"+ e.toString());
        }
        return Conectar;
    } 
     
 }
    public String CodigoVenta(){
       String id=null;
       
       try {
           String consulta="select MAX(idVentas)as Ventas from Ventas";
           Actualizar=getConection().prepareStatement(consulta);
           rs=Actualizar.executeQuery();
           if(rs.next()){
               String idCodigo=rs.getString("Ventas");
               id=(idCodigo);
               
            
           
           }
       } catch (Exception e) {
           System.out.println("Error "+e.toString());
       }
      return id;
      
   }
}