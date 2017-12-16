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
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Controlador {

    /*
    Atributos que necesito recopilar:
    
    public String nombre;
    public String numSeguridadSocial;
    public String anosTrabajados;
     */
    public static void main(String[] args) {

        // INICIO MAIN
        ArrayList<Trabajador> listaContenedorDeTrabajadores;

        try {

            listaContenedorDeTrabajadores = insertarTrabajadores();

            //INICIALIZO EL OBJETO TRABAJADOR QUE CONTENDRA LOS DATOS DE LA PERSONA CON MAS AÑOS TRABAJADOS
            Trabajador t = localizarTrabajadorPorAnosTrabajados(listaContenedorDeTrabajadores);

            // LLAMO AL METODO DE LA CLASE TRABAJADOR QUE CREE PARA RETORNAR LOS DATOS DEL TRABAJADOR
            JOptionPane.showMessageDialog(null, "Trabajador con mas años en la Empresa:\n" + t.informacionTrabajador());

        } catch (HeadlessException E) {

            JOptionPane.showMessageDialog(null, "Error Inexperado" + E.getClass());
        }
    }

    public static ArrayList<Trabajador> insertarTrabajadores() {

        ArrayList<Trabajador> listaDatosTrabajadores = new ArrayList<>();

        do {

            Trabajador t = new Trabajador();

            t.setNombre(JOptionPane.showInputDialog("Introduce el Nombre del Trabajador"));
            t.setNumSeguridadSocial(JOptionPane.showInputDialog("Introduce el Numero de la Seguridad Social del Trabajador"));
            t.setAnosTrabajados(Integer.parseInt(JOptionPane.showInputDialog("Introduce los Años que el Trabajador lleva en la Empresa")));

            listaDatosTrabajadores.add(t);

        } while (JOptionPane.showConfirmDialog(null, "¿Quieres introducir otro Trabajador?") == 0);

        return listaDatosTrabajadores;

    }

    public static Trabajador localizarTrabajadorPorAnosTrabajados(ArrayList<Trabajador> listaContenedorDeTrabajadores) {

        // TOMO COMO TRABAJADOR CON MAS AÑOS TRABAJADOS EL PRIMERO DE LA LISTA DE TRABAJADORES
        Trabajador trabajadorConMasAnosTrabajados = listaContenedorDeTrabajadores.get(0);

        // CON EL FOR, EMPIEZO A COMPARAR LOS AÑOS TRABAJADOS DEL TRABAJADOR POR EL SIGUIENTE DE LA LISTA 
        for (int i = 1; i < listaContenedorDeTrabajadores.size(); i++) {

            if (trabajadorConMasAnosTrabajados.getAnosTrabajados() < listaContenedorDeTrabajadores.get(i).getAnosTrabajados()) {

                // DE LA COMPARACION ME QUEDO CON EL TRABAJADOR QUE MAS AÑOS TIENE EN LA EMPRESA
                trabajadorConMasAnosTrabajados = listaContenedorDeTrabajadores.get(i);
            }
        }

        // RETORNO EL TRABAJADOR CON MAS AÑOS TRABAJADOS
        return trabajadorConMasAnosTrabajados;
    }

}
