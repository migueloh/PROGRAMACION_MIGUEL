package BD;

import UML.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteBD extends GenericoBD {

    private static Cliente clienteUML;

    private static PreparedStatement pS;
    private static String plantilla;
    private static Statement sT;
    private static ResultSet rS;

    public void insertarBD(Cliente c) throws SQLException, Exception {

        plantilla = "INSERT INTO clientes (dni, nombre, ape1, ape2, dir, tel) VALUES (?,?,?,?,?, ?)";

        pS = abrirConexion().prepareStatement(plantilla);
        pS.setString(1, c.getDni());
        pS.setString(2, c.getNombre());
        pS.setString(3, c.getApe1());
        pS.setString(4, c.getApe2());
        pS.setString(5, c.getDir());
        pS.setString(6, c.getTel());

        pS.executeUpdate();

        cerrarConexion();
    }

    public static void ejercutarBorrado(String dni) throws SQLException, Exception {
        plantilla = "DELETE FROM clientes WHERE dni = ?";

        pS = abrirConexion().prepareStatement(plantilla);

        pS.setString(1, dni);

        pS.executeUpdate();

        cerrarConexion();

    }

    public static void actualizarDireccion(Cliente c) throws SQLException, Exception {
        plantilla = "UPDATE abogados SET dir = ? WHERE dni = ?";

        pS = abrirConexion().prepareStatement(plantilla);
        pS.setString(1, c.getDir());

        pS.setString(2, c.getDni());

        pS.executeUpdate();

        cerrarConexion();
    }

    public static boolean solicitarInformacion(String dni) throws SQLException, Exception {
        
        boolean encontrado;
        
        plantilla = "SELECT * FROM clientes WHERE DNI = ?;";

        pS = abrirConexion().prepareStatement(dni);

        pS.setString(1, dni);

        rS = pS.executeQuery();

        if (!rS.next()) {
            return false;
        } else {
            clienteUML = new Cliente();
            
            clienteUML.setDni(rS.getString("dni"));
            clienteUML.setNombre(rS.getString("nombre"));
            clienteUML.setApe1(rS.getString("ape1"));
            clienteUML.setApe2(rS.getString("ape2"));
            clienteUML.setDir(rS.getString("dir"));
            clienteUML.setTel(rS.getString("tel"));
            
            encontrado = true;

        }
        rS.close();
        sT.close();
        cerrarConexion();
        
        return encontrado;
   
    }

}
