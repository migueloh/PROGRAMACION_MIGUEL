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

/**
 *
 * @author 1gdaw09
 */
public class Controladora {


    public static void main(String[] args) {

        // INICIO MAIN
        ArrayList<Alumno> listaAlumnos = null;

        try {

            Alumno a = null;

            listaAlumnos = new ArrayList();

            introducirAlumnos(a, listaAlumnos);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Desconocido");
        }

        mostrarLosAlumnos(listaAlumnos);

    }

    public static ArrayList<Alumno> introducirAlumnos(Alumno a, ArrayList<Alumno> listaAlumnos) {

        do {
            
            a = new Alumno();

            a.setCodA(JOptionPane.showInputDialog("Introduce el Codigo del Alumno"));
            a.setNombreA(JOptionPane.showInputDialog("Introduce el Nombre del Alumno"));
            a.setDomicilioA(JOptionPane.showInputDialog("Introduce el Domicilio del Alumno"));
            a.setTelefonoA(JOptionPane.showInputDialog("Introduce el Telefono del Alumno"));

            listaAlumnos.add(a);
            
        } while (JOptionPane.showConfirmDialog(null, "¿Deseas intorducir mas alumnos?") == 0);

        return listaAlumnos;
    }

    public static void mostrarLosAlumnos(ArrayList<Alumno> listaAlumnos) {
        
        for (Alumno listaAlumno : listaAlumnos) {
            

            JOptionPane.showMessageDialog(null, listaAlumno.datosAlumnoRetorno(codigo));
        }

    }

}
