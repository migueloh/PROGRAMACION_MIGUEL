package pract1_ejer2;

<<<<<<< HEAD
import Vistas.vAcontecimiento;
import Vistas.vPrincipal;
=======
import vista.*;
import modelo.*;
import BD.*;
>>>>>>> master
import Excepciones.*;

/**
 *
 * @author MIGUEL
 */
public class Controladora {

    public static vPrincipal vP;
    public static vAcontecimiento vA;

    public static void main(String[] args) {
        // INICIO MAIN
        vA = new vAcontecimiento();

        abrirVentanaPrincipal(vP = new vPrincipal());
    }

    public static void abrirVentanaPrincipal(vPrincipal vPrincipal) {
        vP.setVisible(true);
    }

    public static void abrirVentanaAcontecimientos() {
        vA.setVisible(true);
    }

<<<<<<< HEAD
    public static void salirApp() {
        System.exit(0);    
    }

    public static void reabrirMenu() {
        vPrincipal vP = null;
        abrirVentanaPrincipal(vP);
    }

=======
>>>>>>> master
}
