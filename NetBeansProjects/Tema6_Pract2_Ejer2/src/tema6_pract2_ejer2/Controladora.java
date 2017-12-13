/*
Crea una agenda con los datos de los alumnos de clase. De cada
alumno guarda su codigo, nombre, domicilio y telefono. Una vez
introducido sus datos, se visualizaran los datos del alumno 
que corresponda con un codigo tecleado. 
 */
package tema6_pract2_ejer2;

import Modelo.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Excepciones.*;

/**
 *
 * @author 1gdaw09
 */
public class Controladora {

    public static void main(String[] args) {

        // INICIO MAIN
        ArrayList<Alumno> listaAlumnos;
        String buscarCodAlumno;

        try {

            Alumno a = null;

            listaAlumnos = new ArrayList();

            buscarCodAlumno = null;

            introducirAlumnos(a, listaAlumnos);

            buscarAlumnoPorCodigo(listaAlumnos, buscarCodAlumno);

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Error " + E.getMessage());
        }

    }

    public static ArrayList<Alumno> introducirAlumnos(Alumno a, ArrayList<Alumno> listaAlumnos) {

        do {

            a = new Alumno();

            a.setCodA(JOptionPane.showInputDialog("Introduce el Codigo del Alumno"));
            a.setNombreA(JOptionPane.showInputDialog("Introduce el Nombre del Alumno"));
            a.setDomicilioA(JOptionPane.showInputDialog("Introduce el Domicilio del Alumno"));
            a.setTelefonoA(JOptionPane.showInputDialog("Introduce el Telefono del Alumno"));

            listaAlumnos.add(a);

        } while (JOptionPane.showConfirmDialog(null, "¿Deseas introducir mas alumnos?") == 0);

        return listaAlumnos;
    }

    public static void buscarAlumnoPorCodigo(ArrayList<Alumno> listaAlumnos, String buscarCodAlumno) {
        try {

            buscarCodAlumno = JOptionPane.showInputDialog("Introduce el Codigo del Alumno que deseas buscar");

            if (buscarCodAlumno.isEmpty()) {

                throw new DatoNoValido();

            } else {

                for (Alumno listaAlumno : listaAlumnos) {

                    

                        if (buscarCodAlumno.equalsIgnoreCase(listaAlumno.getCodA())) {

                            JOptionPane.showMessageDialog(null, "El alumno SI existe y sus datos son los siguientes:");

                            mostrarInfoDelAlumno(listaAlumnos, buscarCodAlumno);

                        } else {

                            JOptionPane.showMessageDialog(null, "El alumno NO existe.");

                        } 
                }

            }

        } catch (DatoNoValido DNV) {
            JOptionPane.showMessageDialog(null, "No puedes buscar un Alumno si no introduces su Codigo.");
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Error " + E.getMessage());
        }

    }

    /*
    public static void mostrarElAlumno(ArrayList<Alumno> listaAlumnos, String buscarCodAlumno) {

        for (Alumno listaAlumno : listaAlumnos) {
            
            if (buscarCodAlumno.equals(listaAlumno.getCodA()))
            
                JOptionPane.showMessageDialog(null, listaAlumno.getInformacionAlumnoRetornar());
        }

    }
     */

    public static void mostrarInfoDelAlumno(ArrayList<Alumno> listaAlumnos, String buscarCodAlumno) {

        for (int x = 0; x < listaAlumnos.size(); x++) {
            
            buscarCodAlumno = "Codigo Alumno: " + listaAlumnos.get(x).getCodA() + "\n"
                    + "\nNombre: " + listaAlumnos.get(x).getNombreA()
                    + "\nDomicilio: " + listaAlumnos.get(x).getDomicilioA()
                    + "\nTeléfono: " + listaAlumnos.get(x).getTelefonoA();
        }
        JOptionPane.showMessageDialog(null, buscarCodAlumno);
    }

}
