/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofarmacia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Joel Arriola
 */
public class main {
    public static void main(String[] args)throws SQLException,ClassNotFoundException{
            String RutaOrigen = "C:\\Users\\Joel Arriola\\Documents\\NetBeansProjects\\ProyectoFarmacia\\src\\Reportes\\Cliente.jasper";

        String Destino = "C:\\Users\\Joel Arriola\\Documents\\NetBeansProjects\\ProyectoFarmacia\\src\\Reportes\\Cliente.pdf";

        Connection conexion = null;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmacia","root","joelarriola");
           
            if(conexion!=null){
                JOptionPane.showMessageDialog(null,"Conexion Exitosa");
               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERRO AL CONECTAR A LA BASE DE DATOS"+ e.toString());
        }
        
    

        try {
            //Compilar el archivo generado tipo jrxml
            JasperReport jasperReport = JasperCompileManager.compileReport(RutaOrigen);
                Class.forName("com.mysql.cj.jdbc.Driver");
            
            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport, null,conexion);
            
            JOptionPane.showMessageDialog(null, "Generamos informe");
       //Exportamos el formato qeu queremos 
            JasperExportManager.exportReportToPdf(jasperPrint);
        //Visualisar el archivo
            JasperViewer.viewReport(jasperPrint);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

        
   
    
      
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
    public void Metodo(){
        try{
        Conexion  conectar=new Conexion();
        Connection ConectarBD=conectar.getConection();
        
        JasperReport Reporte=null;
        String path="src\\Reportes\\ClientesDatos.jasper";
        
            Reporte= (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint =JasperFillManager.fillReport(path, null,ConectarBD);
            
            JasperViewer view=new JasperViewer(jprint,false);
            
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
