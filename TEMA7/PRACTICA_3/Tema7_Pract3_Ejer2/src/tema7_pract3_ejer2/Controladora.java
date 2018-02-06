package tema7_pract3_ejer2;

import Vistas.*;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Controladora {

    private static ZOO z;

    public static ArrayList<SocioConHijos> conHijos;
    private static ArrayList<Hijo> listaHijos;

    public static ArrayList<SocioSinHijos> sinHijos;

    public static void main(String[] args) {

        // INICIO MAIN
        listaHijos = new ArrayList();
        conHijos = new ArrayList();

        sinHijos = new ArrayList();

        abrirVentanaZOO(z = new ZOO());

    }

    public static void abrirVentanaZOO(ZOO zoo) {
        z.setVisible(true);
    }

    public static void crearHijos(String nombreHijo, String diaNace, String mesNace, String anioNace) {
        listaHijos.add(new Hijo(nombreHijo, diaNace, mesNace, anioNace));
    }

    public static void guardarDatos(char tipoSocios, String nombre, String apellidos, String telefono, String email) {
        try {

            if (tipoSocios == 'f') {

                SocioConHijos socios = new SocioConHijos(nombre, apellidos, telefono, email);
                ArrayList<Hijo> hijos = listaHijos;
                socios.setListaHijos(hijos);
                conHijos.add(socios);

            } else if (tipoSocios == 'i') {
                
                SocioSinHijos socios = new SocioSinHijos(nombre, apellidos, telefono, email);
                sinHijos.add(socios);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error desconocido");
        }
    }

    public static void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
