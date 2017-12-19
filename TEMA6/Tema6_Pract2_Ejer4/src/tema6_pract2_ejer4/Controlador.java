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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            
            JOptionPane.showMessageDialog(null, "Error Inexperado" + e.getMessage());
        }

    }

    public static ArrayList<Persona> insertarPersonas() {

        ArrayList<Persona> listaDatosPersonales = new ArrayList<>();

        do {

            try {

                String nombre = JOptionPane.showInputDialog("Introduce el nombre de la Persona").toUpperCase();
                preValidarMedianteExpresionRegular(2, nombre, "^[A-Z]{2,}([ ][A-Z]{2,})([ ][A-Z]{2,})*$");

                String anio = JOptionPane.showInputDialog("Introduce el año en el que nacio");
                preValidarMedianteExpresionRegular(3, anio, "^[1-9]{4}*$");
                //CONVERSION DE STRING A INT CON EL AÑO
                int anoCumpleComoInt = Integer.parseInt(anio);
                
                String mes = JOptionPane.showInputDialog("Introduce el mes en el que nacio");
                preValidarMedianteExpresionRegular(4, mes, "^[09]{2}*$");
                //CONVERSION DE STRING A INT CON EL MES
                int mesCumpleComoInt = Integer.parseInt(mes);

                String dia = JOptionPane.showInputDialog("Introduce el dia en el que nacio");
                preValidarMedianteExpresionRegular(5, dia, "^[0-9]{1*$");
                //CONVERSION DE STRING A INT CON EL MES
                int diaCumpleComoInt = Integer.parseInt(dia);

                String direccion = JOptionPane.showInputDialog("Introduce la Direccion donde reside").toUpperCase();
                preValidarMedianteExpresionRegular(7, direccion, "^*$");

                String ciudad = JOptionPane.showInputDialog("Introduce la Ciudad donde vive").toUpperCase();
                preValidarMedianteExpresionRegular(8, ciudad, "^*$");

                String codigoPostal = JOptionPane.showInputDialog("Introduce el Codigo Postal");
                preValidarMedianteExpresionRegular(9, codigoPostal, "^[0-9]{4}*$");

                //SIMPLEMENTE QUIERO VALIDAR QUE NINGUNO DE LOS DATOS QUE SE PIDEN SE QUEDAN EN BLANCO 
                if (nombre.isEmpty() || anio.isEmpty() || mes.isEmpty() || dia.isEmpty() || direccion.isEmpty() || ciudad.isEmpty() || codigoPostal.isEmpty()) {

                    // PARA SABER SI UN DATO PASADO COMO INT ESTA VACIO O NULO Optional.ofNullable(anio).orElse(0) != 0
                    
                    throw new DatoNoValido(1);

                } else {

                    validarFecha(anoCumpleComoInt, mesCumpleComoInt, diaCumpleComoInt);
                }

            } catch (DatoNoValido DNV) {

                JOptionPane.showMessageDialog(null, DNV.tipoExcepcion());

            } catch (Exception e) {
            }

        } while (JOptionPane.showConfirmDialog(null, "¿Deseas introducir mas personas?") == 0);

        return listaDatosPersonales;
    }

    public static void preValidarMedianteExpresionRegular(int i, String dato, String regex) throws DatoNoValido {
        
        // DUDA AQUI
        /*
        public static void preValidarMedianteExpresionRegular(int i, String nombre, String aZ2_AZ2_AZ2$)
        Pattern pat = Pattern.compile(nombre, i);
        Matcher mat = pat.matcher(nombre);*/
        
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(regex);
        
        if (!mat.matches())
            throw new DatoNoValido(2);

    }

    public static void validarFecha(int anoCumpleComoInt, int mesCumpleComoInt, int diaCumpleComoInt) throws DatoNoValido {

        try {

            if (anoCumpleComoInt < 1900) {
                throw new IllegalArgumentException();
            } else {

                Calendar calendar = Calendar.getInstance();
                calendar.setLenient(false);
                calendar.set(Calendar.YEAR, anoCumpleComoInt); // Comprueba el aÃ±o
                calendar.set(Calendar.MONTH, mesCumpleComoInt - 1); // del 0 al 11 por eso al mes introducido el resto 1
                calendar.set(Calendar.DAY_OF_MONTH, diaCumpleComoInt); // no tengo problemas a la hora de saber si tiene que ser un mes con 28, 29, 30 o 31 dias porque compruebo primero el aÃ±o.

                Date date = calendar.getTime(); // cojo la fecha actual del equipo para compararla

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Aplico el patron de la fecha o establezco una mascara DIA/MES/AÃ‘O - Pattern("dd/MM/yyyy")
                sdf.format(date);
                
                throw new DatoNoValido(6);

            }
        }catch (DatoNoValido DNV) {
            
            JOptionPane.showMessageDialog(null, DNV.tipoExcepcion());
            
        } 
        catch (Exception e) {
        }
    }

}
