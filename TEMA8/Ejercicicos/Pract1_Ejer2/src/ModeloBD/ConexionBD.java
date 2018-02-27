package ModeloBD;

import Excepciones.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author MIGUEL
 */
public class ConexionBD {
    private String nombreBD = "acontecimientos";
    private String url = "jdbc:mysql://localhost:3307/" + nombreBD;
    private String user = "root";
    private String pass = "usbw";
    private Connection con;

    //INICIAR CONEXION
    public ConexionBD() throws SQLException, ClassNotFoundException, ProblemaConexion {
        Class.forName("com.mysql.jdbc.Driver");
        this.con = DriverManager.getConnection(url, user, pass);
        
        if (con==null) {
            throw new ProblemaConexion("Problemas con la conexion");      
        }
    }
    //ESTABLECER CONEXION
    public Connection getConnection(){
        return con;
    }
    
    //CERRAR CONEXION
    public void cerrarConexion() throws SQLException{
        con.close();
    }
}
