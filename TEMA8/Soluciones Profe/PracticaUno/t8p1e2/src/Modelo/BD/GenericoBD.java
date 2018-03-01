package Modelo.BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class GenericoBD {
    /* Clase que contiene los método necesarios para trabajar
    con la base de datos */
    
    private static Connection con;
        
    public static void abrirBD() throws Exception
    { 
        // setCon también es un buen nombre para este método
        // En el constructor como en el ejercicio anterior
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/"+"acontecimientos";
            con = DriverManager.getConnection(url,"root","usbw");
    }
    
    public static void cerrarBD() throws Exception
    {    
        con.close();
    }

    public static Connection getCon() 
    {
        return con;
    }
}
