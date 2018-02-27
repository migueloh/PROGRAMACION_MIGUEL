package practica1_ejer2_versionbuena;
import Vistas.*;


public class Controladora {

    private static vMenu vM;
    private static vAcontecimiento vA;
    
    public static void main(String[] args) {
        // INICIO MAIN
        vA = new vAcontecimiento();
        abrirVentanaInicio(vM = new vMenu());
        
    }
    
    public static void abrirVentanaInicio(vMenu vMenu) {
        vM.setVisible(true);
    }

    public static void abrirVentanaCrearAcontecimientos() {
        vA.setVisible(true);
    }
    
    public static void cerrarVentanas(){
        System.exit(0);
    }
    public static void reabrirVentanaInicio(){
        abrirVentanaInicio(vM);
    }

    
}
