package ModeloBD;

import ModeloUML.AcontecimientoUML;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalTime;

public class AcontecimientoBD extends GenericoBD {

    private static PreparedStatement pS;
    private static String plantilla;
    private static Statement sT;
    private static ResultSet rS;

    public static void guardarAcontecimiento(AcontecimientoUML acontecimientoUML) throws Exception {
        //nombre, lugar, fechaAcontecimiento, horaInicio, horaFin, aforo
        plantilla = "INSERT INTO acontecimientos (nombre, lugar, fechaAcontecimiento ,horaInicio, horaFin, aforo) VALUES (?,?,?,?,?,?)";

        pS = abrirConexion().prepareStatement(plantilla);
        pS.setString(1, acontecimientoUML.getNombre());
        pS.setString(2, acontecimientoUML.getLugar());
        
        pS.setDate(3, (Date) acontecimientoUML.getFechaAcontecimiento());
        
        pS.setTime(4, (LocalTime) acontecimientoUML.getHoraInicio());

        java.sql.Time sqlTimeHoraInicio = java.sql.Time.valueOf(acontecimientoUML.getHoraInicio());
        pS.setTime(4, sqlTimeHoraInicio);
        
        java.sql.Time sqlTimeHoraFin = java.sql.Time.valueOf(acontecimientoUML.getHoraFin());
        pS.setTime(5, sqlTimeHoraFin);
        
        pS.setString(6, acontecimientoUML.getAforo());
        
        pS.executeUpdate();

        cerrarConexion();
    }



}
