package Controladora;

import Vistas.*;

/**
 *
 * @author 1gdaw07 Miguel Olmo Hernando
 */
public class Controladora {

    public static void main(String[] args) {

        // INICIO MAIN
        //https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
        abrirVentanas();

    }

    public static void abrirVentanas() {
        
        VentanaIntroDatos vID;
        vID = new VentanaIntroDatos();
        vID.setVisible(true);
    }

}
