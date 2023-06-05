/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofarmacia;

import java.awt.Frame;
import java.sql.*;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class ClientesInforme {
    Conexion cone=new Conexion();
    
    
    public static void ImprimirInforme(){
        
String Ruta="Exception in thread \"AWT-EventQueue-0\" java.lang.NoClassDefFoundError: net/sf/jasperreports/compilers/GroovyEvaluator";
Connection conectar=null;

        try {
            conectar=Conexion.getConection();
            HashMap parametro=new HashMap();
            parametro.put("CodigoCliente", Ventas.txtCodigoCliente.getText());
            JasperPrint jp=JasperFillManager.fillReport(Ruta, parametro,conectar);
            JasperViewer view=new JasperViewer(jp,false);
            view.setTitle("CLIENTE");
            view.setExtendedState(Frame.MAXIMIZED_BOTH);
            view.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
