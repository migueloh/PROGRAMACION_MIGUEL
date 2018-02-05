package tema7_pract3_ejer2;

import Vistas.*;

/**
 *
 * @author 1gdaw09
 */

public class Controladora {

    private static ZOO z;
    
    public static void main(String[] args) {
        
        // INICIO MAIN
        
        abrirVentanaZOO( z = new ZOO());
        
        
    }

    public static void abrirVentanaZOO(ZOO zoo) {
        z.setVisible(true);
    }
    
}
