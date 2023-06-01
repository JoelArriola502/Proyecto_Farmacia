/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofarmacia;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel Arriola
 */
public class main {
    public static void main(String[] args) {
        Conexion cone=new Conexion();
        
   
      
      String Dato=cone.CodigoVenta();
      int datos1=Integer.parseInt(Dato);
      int resul=1+datos1;
        System.out.println("Codigo Ventas "+resul);
      
    }
    
}
