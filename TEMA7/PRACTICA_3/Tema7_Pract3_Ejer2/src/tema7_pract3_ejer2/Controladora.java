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
    public static ArrayList<Hijo> listaHijos;

    public static ArrayList<SocioSinHijos> sinHijos;

    public static void main(String[] args) {

        // INICIO MAIN
        conHijos = new ArrayList<>();
        listaHijos = new ArrayList<>();

        sinHijos = new ArrayList<>();

        abrirVentanaZOO(z = new ZOO());

    }

    public static void abrirVentanaZOO(ZOO zoo) {
        z.setVisible(true);
    }

    public static void crearHijos(String nombreHijo, String diaNace, String mesNace, String anioNace) {
        listaHijos.add(new Hijo(nombreHijo, diaNace, mesNace, anioNace));
    }

    public static void guardarDatos(char socioFoI, String nombre, String apellidos, String telefono, String email) {
        try {
            
        
        if (socioFoI == 'f') {
            
            SocioConHijos socios = new SocioConHijos(nombre, apellidos, telefono, email);
            ArrayList <Hijo> hijos = listaHijos;
            socios.setListaHijos(hijos);
            conHijos.add(socios);
            
        } else if (socioFoI == 'i') {
            SocioSinHijos socios = new SocioSinHijos(nombre, apellidos, telefono, email);
            sinHijos.add(socios);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error desconocido");
        }
    }

    public static void mostrarDatos() {
        String datos ="LISTADO DE SOCIOS: "
                + "\n..........................................";
                
        for(int x = 0; x < conHijos.size(); x++){
            datos +="\n"
                  + "* Socios Familiares:"
                  + "\nNombre: " + conHijos.get(x).getNombre() + "\n Apellido: " + conHijos.get(x).getApellidos() + "\n Telefono: " + conHijos.get(x).getTelefono() + "\n Correo: " + conHijos.get(x).getEmail()
                  + "\n"
                  + "\n* Hijo(s): ";
            for(int y = 0 ; y < conHijos.get(x).getListaHijos().size() ; y++){
                datos += "\nNombre: " + conHijos.get(x).getListaHijos().get(y).getNombreHijo() + " Fecha: " + conHijos.get(x).getListaHijos().get(y).getDiaNace() + "/" + conHijos.get(x).getListaHijos().get(y).getMesNace() + "/" + conHijos.get(x).getListaHijos().get(y).getAnioNace()
                       + "\n-------------------";
            } 
        }
        for(int x = 0; x < sinHijos.size(); x++){
            datos +="\n"
                  + "\n* Socios Individuales:"
                                    + "\nNombre: " + sinHijos.get(x).getNombre() + "\n Apellido: " + sinHijos.get(x).getApellidos() + "\n Telefono: " + sinHijos.get(x).getTelefono() + "\n Correo: " + sinHijos.get(x).getEmail();
        }
        JOptionPane.showMessageDialog(null, datos);
    }

}
