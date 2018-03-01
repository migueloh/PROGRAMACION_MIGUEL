
package Modelo.BD;


import Modelo.UML.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AcontecimientoBD{
    
    /* Clase que contiene los métodos necesarios para trabajar
       con la tabla acontecimientos */
       
    private static Acontecimiento acontecimiento;
    
    private static PreparedStatement sentenciaPre;
    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
     
    public static void alta(Acontecimiento ac) throws Exception
    {
        /* Método que inserta una fila en la tabla de los acontecimientos
            a partir de un objeto de tipo acontecimiento.
        
            Este método también se suele llamar save.
        */
        
        // Abrir la conexión
            GenericoBD.abrirBD();
            
        // Preparar la sentencia que se quiere ejecutar
            plantilla = "INSERT INTO acontecimiento (nombre, lugar, fecha,hora_i, hora_f, aforo) VALUES (?,?,?,?,?,?)";
            sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
            sentenciaPre.setString(1,ac.getNombre());
            sentenciaPre.setString(2,ac.getLugar());
            sentenciaPre.setDate(3, conversionDate(ac.getFecha()));
            sentenciaPre.setTime(4, conversionTime(ac.getHoraI()));
            sentenciaPre.setTime(5, conversionTime(ac.getHoraF()));
            sentenciaPre.setInt(6,ac.getAforo());
            
            // Ejecutar sentencia
            int n = sentenciaPre.executeUpdate();
            System.out.println( n + "filas insertadas");
      
            // Cerrar la conexión
            GenericoBD.cerrarBD();
    }
    
    public static java.sql.Date conversionDate(java.util.Date fecha)
    {
        // Conversion java.util.Date en java.sql.Date
        return new java.sql.Date( fecha.getTime());
    }
    
    public static java.sql.Time conversionTime(java.time.LocalTime hora)
    {
         // Conversion java.time.LocalTime en java.sql.Time
        return java.sql.Time.valueOf(hora);
    }
    
    public static String listado() throws Exception{
        
        // Método que genera un String con los datos de todos los acontemientos
        GenericoBD.abrirBD();
            
        sentencia=GenericoBD.getCon().createStatement();
        resultado = sentencia.executeQuery("Select * from Acontecimiento");

        String mensaje="";
        while (resultado.next())
        {
            int id = resultado.getInt("id");
            crearObjeto();
                
            mensaje += id + " " + acontecimiento.toString()+"\n";
        }
        resultado.close();
        GenericoBD.cerrarBD();
        return mensaje;
    }
    
    public static void crearObjeto() throws Exception
    {
        acontecimiento = new Acontecimiento();
        acontecimiento.setNombre(resultado.getString("nombre"));
        acontecimiento.setLugar(resultado.getString("lugar"));
        acontecimiento.setFecha(new java.util.Date (resultado.getDate("fecha").getTime()));             
        acontecimiento.setHoraI(resultado.getTime("hora_i").toLocalTime());      
        acontecimiento.setHoraF(resultado.getTime("hora_f").toLocalTime());
        acontecimiento.setAforo(resultado.getInt("aforo"));
    }
    
}
