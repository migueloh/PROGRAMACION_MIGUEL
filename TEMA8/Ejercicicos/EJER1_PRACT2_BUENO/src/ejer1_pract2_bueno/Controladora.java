package ejer1_pract2_bueno;

import BD.*;
import UML.Abogado;
import Vistas.vPrincipal;

/**
 *
 * @author MIGUEL
 */
public class Controladora {
    
    private static Abogado ab;

    private static vPrincipal vP;
    private static AbogadoBD vABD;

    public static void main(String[] args) {

// INICIO MAIN
        vABD = new AbogadoBD();

        abrirVentanaPrincipal(vP = new vPrincipal());

    }

    private static void abrirVentanaPrincipal(vPrincipal vPrincipal) {
        vP.setVisible(true);
    }

    public static void generarAbogado(String dni, String nombre, String ape1, String ape2, String dir) throws Exception {
        ab = new Abogado(dni, nombre, ape1, ape2, dir);

        vABD.insertarBD(ab);
    }

    public static void borrarAbogado(String dni) throws Exception {
        AbogadoBD.ejercutarBorrado(dni);
    }

    public static void editarAbogado(String dni, String nombre, String ape1, String ape2, String dir) throws Exception {
        
        //solo se podra cambiar la direccion
        ab = new Abogado(dni, nombre, ape1, ape2, dir);
        
        AbogadoBD.actualizarDireccion(ab);
    
    }

    public static void buscarAbogado(String dni) {
        
        ab.setDni(dni);
        
        AbogadoBD.solicitarInformacion(dni);
        
    }
    

}
