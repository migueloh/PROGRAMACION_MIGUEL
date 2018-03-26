package BD;

import UML.Abogado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbogadoBD extends GenericoBD {

    private static Abogado abogadoUML;

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

    public static boolean solicitarInformacion(String dni) throws SQLException, Exception {
        
        boolean encontrado;
        
        plantilla = "SELECT * FROM abogados WHERE DNI = ?;";

        pS = abrirConexion().prepareStatement(plantilla);

        pS.setString(1, dni);

        rS = pS.executeQuery();

        if (!rS.next()) {
            return false;
        } else {
            
            abogadoUML = new Abogado();
            
            abogadoUML.setDni(rS.getString("dni"));
            abogadoUML.setNombre(rS.getString("nombre"));
            abogadoUML.setApe1(rS.getString("ape1"));
            abogadoUML.setApe2(rS.getString("ape2"));
            abogadoUML.setDir(rS.getString("dir"));
            
            encontrado = true;

        }
        rS.close();
        //sT.close();
        cerrarConexion();
        
        return encontrado;
   
    }
    
        public static Abogado solicitarDatosInformaticos(String dni) throws SQLException, Exception {
        
        
        plantilla = "SELECT * FROM abogados WHERE DNI = ?;";

        pS = abrirConexion().prepareStatement(plantilla);

        pS.setString(1, dni);

        rS = pS.executeQuery();

        if (!rS.next()) {
            return null;
        } else {
            
            abogadoUML = new Abogado();
            
            abogadoUML.setDni(rS.getString("dni"));
            abogadoUML.setNombre(rS.getString("nombre"));
            abogadoUML.setApe1(rS.getString("ape1"));
            abogadoUML.setApe2(rS.getString("ape2"));
            abogadoUML.setDir(rS.getString("dir"));
            
        }
        rS.close();
        //sT.close();
        cerrarConexion();
        
        return abogadoUML;
   
    }

}
