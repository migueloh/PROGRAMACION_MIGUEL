package ModeloBD;

import Excepciones.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericoBD {

    private static String nombreBD = "acontecimientos";
    private static String url = "jdbc:mysql://localhost:3307/" + nombreBD;
    private static String user = "root";
    private static String pass = "usbw";
    private static Connection con;
    
    /*
    public static Connection abrirConexion()throws Exception{       
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/"+"bdPersonas";
            String usuario = "root";
            String password = "usbw";
            con = DriverManager.getConnection(url,usuario,password);
            return con;
    }
    */

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
