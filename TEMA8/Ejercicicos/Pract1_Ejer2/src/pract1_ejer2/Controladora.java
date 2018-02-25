package pract1_ejer2;

import vista.*;
import modelo.*;
import BD.*;
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

}
