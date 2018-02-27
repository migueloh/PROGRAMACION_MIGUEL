package ModeloBD;

import ModeloUML.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author MIGUEL
 */
public class AcontecimientoBD extends ConexionBD {

    private static Acontecimiento acontecimientos;

    private static PreparedStatement sentenciaCon;

    private static String plantilla;
    private static Statement sentencia;
    private static ResultSet resultado;
/*
    ConexionBD.abrirConexion();
    
    plantilla  = "INSERT INTO acon... (nombre, lugar, fecha, hora_i, hora_f, aforo) VALUES (?,?,?,?,?,?)";
    sentenciaCon  = GenericoBD.getCon().prepareStatement(plantilla);

    sentenciaCon.setString (

    1,ac.getNombre());
    sentenciaCon.setString (

    2,ac.getLugar());
    */
            
            /*
            // Conversion java.util.Date en java.sql.Date
            java.sql.Date sqlDate =  new java.sql.Date( ac.getFecha().getTime());
            sentenciaCon.setDate(3, sqlDate);
            
            // Conversion LocalTime en java.sql.Time
            java.sql.Time sqlTimeHInicio= java.sql.Time.valueOf(ac.getHoraInicio());
            sentenciaCon.setTime(4, sqlTimeHInicio);
            
            // Conversion java.util.Calendar en java.sql.Time
            java.sql.Time sqlTimeHFin= new java.sql.Time(ac.getHoraFinalizacion().getTimeInMillis());
            sentenciaCon.setTime(5, sqlTimeHFin);
            */
            
    //INSERT INTO `acontecimientos`( `) VALUES ([?,?,?,?,?,?)
    ps.setStrig (

1, nombre);
}
