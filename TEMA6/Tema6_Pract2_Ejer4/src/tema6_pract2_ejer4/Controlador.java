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
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 1gdaw10 MIGUEL OLMO HERNANDO
 */
public class Controlador {

    public static final String exprexionRegularParaNombre = "^[A-Z]{2,}([ ][A-Z]{2,}[ ][A-Z]{2,})*$";
    
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
                preValidarMedianteExpresionRegular(2, nombre, exprexionRegularParaNombre);

                String anio = JOptionPane.showInputDialog("Introduce el año en el que nacio");
                preValidarMedianteExpresionRegular(3, anio, "^[1-9]{4}$");

                //CONVERSION DE STRING A INT CON EL AÑO
                Integer anoCumpleComoInt = Integer.parseInt(anio);

                String mes = JOptionPane.showInputDialog("Introduce el mes en el que nacio");
                preValidarMedianteExpresionRegular(4, mes, "^[0-9]{1,2}$");
                
                if (Integer.parseInt(mes)>12 && Integer.parseInt(mes)>=0) {
                    throw new DatoNoValido(4);
                }

                //CONVERSION DE STRING A INT CON EL MES
                Integer mesCumpleComoInt = Integer.parseInt(mes);

                String dia = JOptionPane.showInputDialog("Introduce el dia en el que nacio");
                preValidarMedianteExpresionRegular(5, dia, "^[0-9]{1,2}$");

                //CONVERSION DE STRING A INT CON EL MES
                Integer diaCumpleComoInt = Integer.parseInt(dia);

                String direccion = JOptionPane.showInputDialog("Introduce la Direccion donde reside").toUpperCase();
                preValidarMedianteExpresionRegular(7, direccion, "^[A-Z]{30}$");

                String ciudad = JOptionPane.showInputDialog("Introduce la Ciudad donde vive").toUpperCase();
                preValidarMedianteExpresionRegular(8, ciudad, "^[A-Z]{15}$");

                String codigoPostal = JOptionPane.showInputDialog("Introduce el Codigo Postal");
                preValidarMedianteExpresionRegular(9, codigoPostal, "^[0-9]{4}$");
                
                // VALIDO LA FECHA - AÑO BISIESTO, ETC
                validarFecha(anoCumpleComoInt, mesCumpleComoInt, diaCumpleComoInt);
                
                /* CREO E INICIALIZO EL OBJETO PERSONA Y LE PASO LOS DATOS DE LA 
                PERSONA VALIDADOS PARA GUARDARLO EN UNA LISTA DE DATOS PERSONALES */            
                Persona objetoPersona = new Persona (nombre, diaCumpleComoInt, mesCumpleComoInt, anoCumpleComoInt, direccion, codigoPostal, ciudad);
                listaDatosPersonales.add(objetoPersona);

                /* NO TENER EN CUENTA - PRUEBAS INTERNAS
   
                     PARA SABER SI UN DATO PASADO COMO INT ESTA VACIO O NULO Optional.ofNullable(anio).orElse(0) != 0
                    
                    throw new DatoNoValido(1);
                 */
            }catch (DatoNoValido DNV) {

                JOptionPane.showMessageDialog(null, DNV.tipoExcepcion());
            } 
            catch (HeadlessException | NumberFormatException E) {

                JOptionPane.showMessageDialog(null, "Error inexperado" + E.getMessage());
            }

        } while (JOptionPane.showConfirmDialog(null, "¿Deseas introducir mas personas?") == 0);

        return listaDatosPersonales;
    }

    // PARA VALIDAR VARIAS EXPRESIONES REGULARES NO LE TENGO QUE PONER SOLO EL NOMBRE DE UNA VARIABLE
    public static void preValidarMedianteExpresionRegular(int i, String dato, String regex) {

        try {

            Pattern pat = Pattern.compile(regex);
            Matcher mat = pat.matcher(dato);

            if (!mat.matches()) {
                throw new DatoNoValido(i);
            }

        } catch (DatoNoValido DNV) {
            
            JOptionPane.showMessageDialog(null, DNV.tipoExcepcion());
            
        } catch (IllegalArgumentException E) {

            JOptionPane.showMessageDialog(null, "Error inexperado" + E.getMessage());
        }

    }

    public static void validarFecha(Integer anoCumpleComoInt, Integer mesCumpleComoInt, Integer diaCumpleComoInt) {

        Calendar objetoCalendar;

        try {

            if (anoCumpleComoInt < 1900) {
                throw new IllegalArgumentException();
            } else {

                // OBJETO calendar
                objetoCalendar = Calendar.getInstance();

                objetoCalendar.setLenient(false);
                objetoCalendar.set(Calendar.YEAR, anoCumpleComoInt); // COMPRUEBO EL AÑO
                objetoCalendar.set(Calendar.MONTH, mesCumpleComoInt - 1); // COMO EMPIEZO EL PRIMER MES CORRESPONDE AL 0 Y EL ULTIMO AL 11 LE RESTO -1
                objetoCalendar.set(Calendar.DAY_OF_MONTH, diaCumpleComoInt); // COMO COMPRUEBO EL AÑO PRIMERO Y LUEGO YA EL MES, AUTOMATICAMENTE SE SI UN MES TIENE 28, 29, 30 O 31 DIAS

                // COJO LA GECHA DEL SISTEMA PARA PODER LUEGO COMPARLA CON LA FECHA INTRODUCIDA
                Date fechaDelSistema = objetoCalendar.getTime();

                // VALIDO LA EECHA MEDIANTE EL PATRON ESTABLECIDO dd/MM/YYY DIA/MES/AÑO
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.format(fechaDelSistema);

                throw new DatoNoValido(6);

            }
        } catch (DatoNoValido DNV) {

            JOptionPane.showMessageDialog(null, DNV.tipoExcepcion());

        } catch (IllegalArgumentException E) {

            JOptionPane.showMessageDialog(null, "Error inexperado" + E.getMessage());
        }

    }

    public static void validarMayoriaEdad() {
        
        
        
    }

}
