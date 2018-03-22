package BD;

import UML.Abogado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbogadoBD extends GenericoBD {

    private static PreparedStatement pS;
    private static String plantilla;
    private static Statement sT;
    private static ResultSet rS;

    public void insertarBD(Abogado a) throws SQLException, Exception {

        plantilla = "INSERT INTO  abogados (dni, nombre, ape1, ape2, dir) VALUES (?,?,?,?,?)";

        pS = abrirConexion().prepareStatement(plantilla);
        pS.setString(1, a.getDni());
        pS.setString(2, a.getNombre());
        pS.setString(3, a.getApe1());
        pS.setString(4, a.getApe2());
        pS.setString(5, a.getDir());

        pS.executeUpdate();

        cerrarConexion();
    }

    public static void ejercutarBorrado(String dni) throws SQLException, Exception {
        plantilla = "DELETE FROM abogados WHERE dni = ?";

        pS = abrirConexion().prepareStatement(plantilla);

        pS.setString(1, dni);

        pS.executeUpdate();

        cerrarConexion();

    }

    public static void actualizarDireccion(Abogado ab) throws SQLException, Exception {
        plantilla = "UPDATE abogados SET dir = ? WHERE dni = ?";

        pS = abrirConexion().prepareStatement(plantilla);
        pS.setString(1, ab.getDir());

        pS.setString(2, ab.getDni());

        pS.executeUpdate();

        cerrarConexion();
    }

    public static void solicitarInformacion(String dni) throws SQLException, Exception {
        plantilla = "SELECT * FROM abogados WHERE DNI = ?;";
        
        pS = abrirConexion().prepareStatement(dni);
        
        pS.setString(1, dni);
        
        
        pS.executeQuery();
        
        
            if (!rs.next()) {
                 //ResultSet esta vacio
            } else {
                enco = 1;
                System.out.println(enco);
            }
}
        
        
        

    }

}
