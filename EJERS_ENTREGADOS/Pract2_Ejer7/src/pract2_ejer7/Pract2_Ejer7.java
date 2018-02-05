/*
Desarrolla una programa en el que el usuario nos proporcione el
nombre de los alumnos de un curso y sus notas en seis asignaturas
distintas. 

El programa terminara cuando como nombre nos tecleen la
palabra FIN.


Nuestro programa debe visualizar el nombre de cada uno de los alumnos
y su nota media.

 */
package pract2_ejer7;

import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class Pract2_Ejer7 {

    public static void main(String[] args) {
        // INICIO MAIN

        pedirNombreNotas();

    }

    public static void pedirNombreNotas() {

        int numeroNota;
        double sumaNota;
        double notaMedia;

        String nombresNotas = "";
        boolean resp;
        double nota;

        do {
            try {

                String nombre = JOptionPane.showInputDialog("Introduce tu nombre");

                numeroNota = 1;
                sumaNota = 0;
                do {

                    nota = Double.parseDouble(JOptionPane.showInputDialog(nombre + " introduce tu " + numeroNota++ + "\u00aa nota de la asignatura: "));

                    sumaNota = sumaNota + nota;

                } while (numeroNota <= 6);

                notaMedia = sumaNota / (numeroNota - 1);

                nombresNotas += nombre + " tu nota media es de " + Math.round(notaMedia) + "\n";

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡¡¡ UPS !!!. Error desconocido");
            }

            resp = continuar_O_FinalizarPrograma(nombresNotas);

        } while (resp);

    }

    private static boolean continuar_O_FinalizarPrograma(String nombresNotas) {

        String respuesta = JOptionPane.showInputDialog("¿Deseas continuar?"
                + "\nSI para continuar / FIN para terminar");
        if (respuesta.equalsIgnoreCase("FIN")) {
            JOptionPane.showMessageDialog(null, nombresNotas + "\n");
            JOptionPane.showMessageDialog(null, "Hasta luego.");

            return false;

        }

        return true;

    }
}
