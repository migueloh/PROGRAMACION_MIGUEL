/*
Desarrolla una  programa que  nos permita  jugar a
Muertos y heridos connumeros  de  tres  cifras.  

Generaremos  automaticamente  un numero e intentaremos adivinarlo 
teniendo como pista el numero de numeros que estan en la posicion 
adecuada (muertos) y el numero de numeros  que  estan  pero  no  
en  la  posicion  adecuada  (heridos). (charAt(posicion))
 */
package Pract2_Ejer8;

import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class Pract2_Ejer8 {

    public static void main(String[] args) {
        //INICIO MAIN

        int numero = generarNumero();

        System.out.println(numero);

        String mensaje = jugar(numero);
        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static int generarNumero() {

        int num = 0;
        boolean repetir = true;
        while (repetir) {

            num = (int) (Math.random() * 1000);

            repetir = comprobarNumero(num);
        }

        return num;
    }

    public static boolean comprobarNumero(int num) {

        if (num >= 100) {

            String cadena_num = String.valueOf(num);

            if (cadena_num.charAt(0) != cadena_num.charAt(1) && cadena_num.charAt(0) != cadena_num.charAt(2)) {

                if (cadena_num.charAt(1) != cadena_num.charAt(2)) {

                    return false;
                }

            }

        }

        return true;
    }

    public static String jugar(int n) {

        String mensaje = "";
        int intentos = 0;
        boolean repetir = true;
        String cadena_n = String.valueOf(n);

        while (repetir) {
            intentos++;
            String cifraUsuario;
            do {
                cifraUsuario = JOptionPane.showInputDialog("Introduce un numero de tres cifras.");
                repetir = comprobar(cifraUsuario);
                if (repetir == true) {

                    JOptionPane.showMessageDialog(null, "El campo numero es obligatorio.\nIntroduce un numero de tres cifras.");
                }
            } while (repetir);
            repetir = true;

            if (cadena_n.equalsIgnoreCase(cifraUsuario)) {

                mensaje = "¡ENHORABUENA! Has acertado el numero. Y solo has usado " + intentos + " intento/s";
                
                repetir = false;
                
                return mensaje;
                
            } else {
                
                boolean salir_for;
                
                for (int i = 0; i < cifraUsuario.length(); i++) {
                    
                    salir_for = true;
                    
                    for (int j = 0; j < cadena_n.length() && salir_for; j++) {

                        if (cifraUsuario.charAt(i) == cadena_n.charAt(i)) {

                            mensaje += cifraUsuario.charAt(i) + " ESTA MUERTO\n";
                            salir_for = false;
                            
                        } else {
                            
                            if (cifraUsuario.charAt(i) == cadena_n.charAt(j)) {
                                mensaje += cifraUsuario.charAt(i) + " ESTA HERIDO\n";

                            }
                        }
                    }

                }

            }

            if (mensaje.equalsIgnoreCase("")) {

                JOptionPane.showMessageDialog(null, "Lo siento no has acertado ningun numero, sigue jugando.");

            } else {

                JOptionPane.showMessageDialog(null, mensaje);
                mensaje = "";

            }

        }

        return mensaje;

    }

   
    public static boolean comprobar(String opcion) {

        if (opcion.isEmpty()) {

            return true;
        } else if (opcion.length() != 3) {

            return true;
        }
        return false;
    }

}
