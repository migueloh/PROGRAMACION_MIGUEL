package t8p1e2;

import Modelo.UML.Acontecimiento;
import GUI.*;
import Modelo.BD.*;
import java.time.LocalTime;

import java.util.Date;


public class Controlador {
   
    private static Acontecimiento acontecimiento;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    
    // También se puede codificar en un controlador de la vista
    public static void main(String[] args) {       
        vp = new VentanaPrincipal();
        vp.setVisible(true);
    }
    
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         ve = new VentanaAcontecimientos();
         ve.setVisible(true);
    }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
    // Fin controlador vista
    
    public static void grabarAcontecimiento(String nombre, String lugar, Date fecha, String horaI, String horaF, int nro)throws Exception{
       
        acontecimiento = new Acontecimiento(nombre,lugar, fecha,LocalTime.parse(horaI),LocalTime.parse(horaF),nro);
        
        AcontecimientoBD.alta(acontecimiento);
    }
    
   public static void terminar(){
       System.exit(0);
   }
   
   public static String listado() throws Exception{
       return AcontecimientoBD.listado();
   }
}
