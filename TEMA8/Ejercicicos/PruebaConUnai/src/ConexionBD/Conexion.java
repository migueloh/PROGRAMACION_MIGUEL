/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.*;

/**
 *
 * @author 1gdaw09
 */
public class Conexion {
    
    

// Abrir conexion con la bd ´
    Class.forName("com.mysql.jdbc.Driver");
    String login="root";
    String password= "root";
    String url = "jdbc:mysql://192.168.33.10:3306/acontecimientos";
    Connection con =
    DriverManager.getConnection (url ,login ,password);


20 // insert
21 Statement sentencia = con. createStatement ();
22 sentencia . executeUpdate ("insert into empleados
values (’13’,’Pepe ’)");
23 sentencia . executeUpdate ("insert into empleados
values (’14’,’Juan ’)");
24
25
26 // select
27 ResultSet resultado = sentencia . executeQuery ("select *
from empleados ");
28 String mensaje="";
29 while( resultado .next ())
30 {
31 mensaje += resultado . getString ("dni");
32 mensaje += resultado . getString ("nombre");
33 mensaje +="\n";
34 }
35 javax.swing. JOptionPane . showMessageDialog (null , mensaje);
36 con.close ();
37 }
38 catch( Exception e){
39 javax.swing. JOptionPane . showMessageDialog (null ," Problemas
"+e. getMessage ());
40
41 }

            
            
}
