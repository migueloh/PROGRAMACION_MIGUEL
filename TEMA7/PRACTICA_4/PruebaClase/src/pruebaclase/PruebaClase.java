
package pruebaclase;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;


/**
 *
 * @author 1gdaw09
 */
public class PruebaClase {

    public static ArrayList listadoMultas;
    
    public static guardarDatos gD;
    
    public static void main(String[] args) {
        // INICIO MAIN
        
        abrirVentanaGuardarDatos(gD = new guardarDatos());
        
    }

    public static void abrirVentanaGuardarDatos(guardarDatos guardarDatos) {
        gD.setVisible(true);
    }
    
}
