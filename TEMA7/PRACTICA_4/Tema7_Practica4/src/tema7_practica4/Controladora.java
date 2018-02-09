package tema7_practica4;

//IMPORTS
import Vistas.*;

/**
 * @author 1gdaw09
 */

public class Controladora {


    //VARIABLES DEDICADAS A OBEJTOS
    
    //VENTANAS
    public static MenuInicio mI;
    public static InicioSesion iS;
    public static GestionPersonal gP;
    
    public static void main(String[] args) {
        
        // INICIO MAIN
        
        iS = new InicioSesion();
        gP = new GestionPersonal();
        abrirVentanaMenuInicio(mI = new MenuInicio());

    }
    
    public static void abrirVentanaMenuInicio(MenuInicio menuInicio) {
        mI.setVisible(true);
    }
    
    public static void abirVentanaInicioSesion () {
        iS.setVisible(true);
    }
    
    public static void abrirVentanaGestionPersonal() {
        gP.setVisible(true);
    }
    
    public static void cerrarVentanas() {
        System.exit(0);
    }
    
}
