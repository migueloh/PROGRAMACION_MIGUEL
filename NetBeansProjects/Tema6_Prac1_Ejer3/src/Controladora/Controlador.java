/*
3. Crea un programa que guarde informacion sobre los trabajadores de ´
una empresa. De cada uno de ellos se quiere guardar el nombre, el
numero de la seguridad social y el tiempo que lleva en la empresa. ´
Cuando tengamos ya los datos de todos los empleados mostraremos
en pantalla el nombre del que mas tiempo lleva.
 */
package Controladora;

import Modelo.*;
import Excepciones.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Controlador {

    /*
    Atributos de la clase Padre:
    
    public String nombre;
    public String numSeguridadSocial;
    public String anosTrabajados;
     */
    public static void main(String[] args) {

        // INICIO MAIN
        ArrayList<Trabajador> listaTrabajadores;

        Trabajador t;

        String buscarTrabajadorPorAnosTrabajados;

        try {

            listaTrabajadores = new ArrayList<>();
            t = new Trabajador();

            listaTrabajadores = insertarTrabajadores(t); // quitar t

        } catch (Exception E) {

            JOptionPane.showMessageDialog(null, "Error Inexperado" + E.getClass());
        }
    }

    public static ArrayList<Trabajador> insertarTrabajadores(Trabajador t) {  //quitar t

        //t = new Trabajador();
        
        t.setNombre(JOptionPane.showInputDialog("Introduce el Nombre del Trabajador"));
        t.setNumSeguridadSocial(JOptionPane.showInputDialog("Introduce el Numero de la Seguridad Social del Trabajador"));
        t.setAnosTrabajados(JOptionPane.showInputDialog("Introduce los Años que el Trabajador lleva en la Empresa"));

        //listaTrabajadores.add(t);
        //Trabajador t = new Trabajador (nombre, numSeguridadSocial, anosTrabajados);
        //listaTrabajadores.add(t);
        //return listaTrabajadores;
    }

}
