/*
Desarrolla un programa que acepte una sucesion de fechas y nos diga
si son correctas o no. El programa termina en el momento que nos
contesten que no se desea continuar.

Para controlar que una fecha es valida se controlara que el mes esta
entre 1 y 12. Los dıas no pasaran de 30 o 31 dependiendo del mes.

Tambien tendremos que controlar si febrero tiene 28 o 29 dıas en caso
de ser ano bisiesto.
 */
package pract2_ejer6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class Pract2_Ejer6 {

    public static void main(String[] args) {
        // INICIO MAIN

        int anio;
        int mes;
        int dia;
        int pregunta = 0;
        
        do {

            try {
                
                anio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año"));                 // año
                mes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes"));                 // mes [1,...,12]
                dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia"));                // día [1,...,31]

                if (anio < 1900) {
                    throw new IllegalArgumentException();
                } else {

                    Calendar calendar = Calendar.getInstance();
                    calendar.setLenient(false);
                    calendar.set(Calendar.YEAR, anio); // Comprueba el año
                    calendar.set(Calendar.MONTH, mes - 1); // del 0 al 11 por eso al mes introducido el resto 1
                    calendar.set(Calendar.DAY_OF_MONTH, dia); // no tengo problemas a la hora de saber si tiene que ser un mes con 28, 29, 30 o 31 dias porque compruebo primero el año.

                    Date date = calendar.getTime(); // cojo la fecha actual del equipo para compararla

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Aplico el patron de la fecha o establezco una mascara DIA/MES/AÑO - Pattern("dd/MM/yyyy")
                    sdf.format(date);

                    JOptionPane.showMessageDialog(null, "La fecha introducida " + dia + "/" + mes + "/" + anio + " es correcta");
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
            }
            catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "El año introducido es incorrecto."
                        + "\nPor lo tanto es imposible concretar una fecha logica.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ups!!!. Error inexperado.");
            }
            pregunta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
        } while (pregunta==0);
    }

}
