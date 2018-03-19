package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Excepciones.*;

/**
 *
 * @author MIGUEL
 */
public class GenericoBD {
  
     private static String nombreBD = "gabinete";
    private static String url = "jdbc:mysql://localhost:3307/" + nombreBD;
    private static String user = "root";
    private static String pass = "usbw";
    private static Connection con;
   

    // ESTABLECER CONEXION
    public static Connection abrirConexion() throws ClassNotFoundException, SQLException, Exception {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

            if (con == null) {
                throw new ProblemasConexion("mensaje");
            }
        } catch (ProblemasConexion | ClassNotFoundException | SQLException E) {
            return null;
        }
        return con;
    }

    //CERRAR CONEXION
    public static void cerrarConexion() throws SQLException, Exception {
        con.close();
    }
}
