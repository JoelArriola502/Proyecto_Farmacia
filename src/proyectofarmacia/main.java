/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofarmacia;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel Arriola
 */
public class main {
    public static void main(String[] args) {
        Conexion cone=new Conexion();
        
   
      fecha();
      
      String dato=FechaActual();
      int mes=Integer.parseInt(dato);
      int messiguiente=1+mes;
        System.out.println("Fecha es "+messiguiente);
      
    }
    
    public static void fecha(){
        Calendar calendario =new GregorianCalendar(2015, Calendar.DECEMBER,25);
        int mes=calendario.get(Calendar.MONTH);
        int fecha=1+mes;
        
        System.out.println("Dato fecha"+fecha);
        
    }
    public static String FechaActual(){
        Date fecha=new Date();
        
        SimpleDateFormat fechaa=new SimpleDateFormat("M");
        
        return fechaa.format(fecha);
        
    }
}
