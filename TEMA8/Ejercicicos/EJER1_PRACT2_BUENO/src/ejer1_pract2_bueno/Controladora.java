package ejer1_pract2_bueno;

import Vistas.vAbogadoInsertar;
import BD.*;
import UML.Abogado;

/**
 *
 * @author MIGUEL
 */
public class Controladora {

    private static vAbogadoInsertar vA;
    private static AbogadoBD vABD;

    public static void main(String[] args) {

        
// INICIO MAIN
vABD = new AbogadoBD();
        abrirVentanaAbogado(vA = new vAbogadoInsertar());

    }

    public static void abrirVentanaAbogado(vAbogadoInsertar vAbogado) {
        vA.setVisible(true);
    }

    public static void generarAbogado(String dni, String nombre, String ape1, String ape2, String dir) throws Exception {
        Abogado a = new Abogado(dni, nombre, ape1, ape2, dir);
        
        vABD.insertarBD(a);
    }

}
