package ModeloBD;

import Excepciones.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GenericoBD {

    private String nombreBD = "acontecimientos";
    private String url = "jdbc:mysql://localhost:3307/" + nombreBD;
    private String user = "root";
    private String pass = "usbw";
    private Connection con;

    // ESTABLECER CONEXION
    public GenericoBD() throws ClassNotFoundException, SQLException {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection(url, user, pass);

            if (con == null) {
                throw new ProblemasConexion("mensaje");
            }
        } catch (Exception E) {
        }
    }

    // ABRIR CONEXION CONEXION
    public Connection getConnection() {
        return con;
    }

    //CERRAR CONEXION
    public void cerrarConexion() throws SQLException {
        con.close();
    }

}
