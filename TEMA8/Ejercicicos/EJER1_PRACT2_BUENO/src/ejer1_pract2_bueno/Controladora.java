package ejer1_pract2_bueno;

import Vistas.vAbogadoInsertar;
import BD.*;
import UML.Abogado;
import Vistas.vPrincipal;

/**
 *
 * @author MIGUEL
 */
public class Controladora {

    private static vPrincipal vP;
    private static AbogadoBD vABD;

    public static void main(String[] args) {

// INICIO MAIN
        vABD = new AbogadoBD();

        abrirVentanaPrincipal(vP = new vPrincipal());

    }

    private static void abrirVentanaPrincipal(vPrincipal vPrincipal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void generarAbogado(String dni, String nombre, String ape1, String ape2, String dir) throws Exception {
        Abogado a = new Abogado(dni, nombre, ape1, ape2, dir);

        vABD.insertarBD(a);
    }

}
