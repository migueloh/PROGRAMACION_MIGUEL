package ModeloBD;

import ModeloUML.AcontecimientoUML;

import java.sql.*;

public class AcontecimientoBD extends GenericoBD {

    private static PreparedStatement pS;
    private static String plantilla;
    private static Statement sT;
    private static ResultSet rS;

    public static void guardarAcontecimiento(AcontecimientoUML acon) throws SQLException, Exception {

        //nombre, lugar, fechaAcontecimiento, horaInicio, horaFin, aforo
        plantilla = "INSERT INTO Acontecimientos (nombre, lugar, fecha, hora_i, hora_f, aforo) VALUES (?,?,?,?,?,?)";

        pS = abrirConexion().prepareStatement(plantilla);
        pS.setString(1, acon.getNombre());
        pS.setString(2, acon.getLugar());
        pS.setDate(3, conversionDate(acon.getFechaAcontecimiento()));
        pS.setTime(4, conversionTime(acon.getHoraInicio()));
        pS.setTime(5, conversionTime(acon.getHoraFin()));
        pS.setInt(6, acon.getAforo());

        pS.executeUpdate();
        cerrarConexion();
    }

   
    // Conversion java.util.Time en java.sql.Time
    public static Time conversionTime(java.time.LocalTime hora) {
        return java.sql.Time.valueOf(hora);
    }

    // Conversion java.util.Date en java.sql.Date
    public static java.sql.Date conversionDate(java.util.Date fecha) {
        return new java.sql.Date(fecha.getTime());
    }

    public static void ejecutarBorrado(AcontecimientoUML acon) throws SQLException, Exception {
        plantilla = "DELETE FROM Acontecimientos where nombre = ?";
        pS = abrirConexion().prepareStatement(plantilla);
        pS.setString(1, acon.getNombre());

        pS.executeUpdate();
        cerrarConexion();
    }

    public static void ejecutarModificacion(AcontecimientoUML acon) throws Exception {

        plantilla = "UPDATE Acontecimientos SET lugar = ?, fecha = ?, hora_i = ?, hora_f = ?, aforo = ? where nombre = ?";
        pS = abrirConexion().prepareStatement(plantilla);

        pS.setString(1, acon.getNombre());
        pS.setString(2, acon.getLugar());
        
        // Conversion java.util.Date en java.sql.Date
        java.sql.Date sqlFechaAcon = new java.sql.Date(acon.getFechaAcontecimiento().getTime());
        pS.setDate(3, sqlFechaAcon);

        // Conversion LocalTime en java.sql.Time
        java.sql.Time sqlTimeHInicio = java.sql.Time.valueOf(acon.getHoraInicio());
        pS.setTime(4, sqlTimeHInicio);
        
        // Conversion LocalTime en java.sql.Time
        java.sql.Time sTimeHoraFin = java.sql.Time.valueOf(acon.getHoraFin());
        pS.setTime(5, sTimeHoraFin);

        pS.setInt(6, acon.getAforo());

        pS.executeUpdate();

        cerrarConexion();
    }

}
