/*
Define una clase Persona con los siguientes datos: 
nombre, dNacimiento (dıas de nacimiento), mNacimiento (mes de nacimiento),
aNacimiento (ano de nacimiento), direccion, codigoPostal y ciudad.

Crea varios objetos de tipo Persona y a traves de un programa muestra
los siguientes datos:

Nombre de la persona de mayor edad.

Nombre de las personas que viven en Elche.

Numero de personas mayores de edad. 

Hay que comprobar que todos los campos contienen informacion y ´
que es logica. 

En este ejercicio utilizaremos alguna de las clases relacionadas con
fechas en java.

 */
package tema6_pract2_ejer4;

import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Excepciones.*;

/**
 *
 * @author 1gdaw10 MIGUEL OLMO HERNANDO
 */
public class Controlador {

    public static void main(String[] args) {

        ArrayList<Persona> listaDePersonas;

        // INICIO MAIN
        try {

            listaDePersonas = insertarPersonas();

        } catch (Exception e) {

        }

    }

    public static ArrayList<Persona> insertarPersonas() {

        ArrayList<Persona> listaDatosPersonales = new ArrayList<>();

        do {

            try {

                String nombre = JOptionPane.showInputDialog("Introduce el nombre de la Persona");
                String diaNacimiento = JOptionPane.showInputDialog("Introduce el Dia de Nacimiento de la Persona");
                String mesNacimiento = JOptionPane.showInputDialog("Introduce el Mes de Nacimiento de la Persona");
                String anoNacimiento = JOptionPane.showInputDialog("Introduce el Año de Nacimiento de la Persona");
                String direccion = JOptionPane.showInputDialog("Introduce la Direccion donde reside la Persona");
                String ciudad = JOptionPane.showInputDialog("Introduce la Ciudad donde vive la Persona");
                String codigoPostal = JOptionPane.showInputDialog("Introduce el Codigo Postal de la Ciudad");

                if (nombre.isEmpty() || diaNacimiento.isEmpty() || mesNacimiento.isEmpty() || anoNacimiento.isEmpty() || direccion.isEmpty() || ciudad.isEmpty() || codigoPostal.isEmpty()) {

                    throw new DatoNoValido();
                    
                } else {
                    
                    validarDatosPersonales(nombre, diaNacimiento, mesNacimiento, anoNacimiento, direccion, ciudad, codigoPostal);
                }

            } 
            catch (DatoNoValido DNV) {
                
                JOptionPane.showMessageDialog(null, DNV.getMensajeConLaExcepcion());
                
            }
            catch (Exception e) {
            } 

        } while (JOptionPane.showConfirmDialog(null, "¿Deseas introducir mas personas?") == 0);

        return listaDatosPersonales;
    }

    public static void validarDatosPersonales(String nombre, String diaNacimiento, String mesNacimiento, String anoNacimiento, String direccion, String ciudad, String codigoPostal) {

    }

}
