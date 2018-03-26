package ejer1_pract2_bueno;

import BD.*;
import UML.*;
import Vistas.vPrincipal;

/**
 *
 * @author MIGUEL
 */
public class Controladora {

    private static Abogado ab;
    private static Cliente cl;

    private static vPrincipal vP;
    private static AbogadoBD vABD;
    
    private static ClienteBD vCBD;

    public static void main(String[] args) {

// INICIO MAIN
        vABD = new AbogadoBD();
        vCBD = new ClienteBD();

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

    public static Boolean buscarDniAbogado(String dni) throws Exception {

        Boolean encontrado;
        encontrado = AbogadoBD.solicitarInformacion(dni);
        if (encontrado) {
            encontrado = true;
        }
        return encontrado;
    }

    public static Abogado recuperarInformacionAbogado(String dni) throws Exception {
        
        ab = AbogadoBD.solicitarDatosInformaticos(dni);
        return ab;
    }

    //////cliente
    public static void generarCliente(String dni, String nombre, String ape1, String ape2, String dir, String tel) throws Exception {
        cl = new Cliente(dni, nombre, ape1, ape2, dir, tel);
        vCBD.insertarBD(cl);
    }

    public static void borrarCliente(String dni) throws Exception {
        ClienteBD.ejercutarBorrado(dni);
    }

    public static void editarCliente(String dni, String nombre, String ape1, String ape2, String dir, String tel) throws Exception {

        //solo se podra cambiar rl telefono
        cl = new Cliente(dni, nombre, ape1, ape2, dir, tel);
        ClienteBD.actualizarDireccion(cl);
    }

    public static boolean buscarDniCliente(String dni) throws Exception {
        return ClienteBD.solicitarInformacion(dni);
    }

}
