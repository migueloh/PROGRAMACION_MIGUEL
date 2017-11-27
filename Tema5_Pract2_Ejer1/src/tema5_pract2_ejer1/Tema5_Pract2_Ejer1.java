/*
1.  Dado un array de numeros enteros, localiza series de numeros consecutivos 
en las que cada numero es igual o mayor que el anterior.

Devuelve otro array con las posiciones donde empiezan esas series.

Ejemplo:

A = 0, 4, 7, 3, 5, -1, 10, 10, 20

Hay tres series ascendentes
0 4 7
3 5
-1 10 10 20

de forma que devuelve el array de inicios
0, 3, 5

 */
package tema5_pract2_ejer1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07 MIGUEL OLMO
 */
public class Tema5_Pract2_Ejer1 {

    public static void main(String[] args) {
        // INICIO MAIN

        // Prueba 1º
        int[] arrayNumeros = {0, 4, 7, 3, 5, -1, 10, 10, 20};
        int[] arrayPosiciones = new int[arrayNumeros.length];

        //Para retrasar y poner a 0 los valores del array de posiciones
        Arrays.fill(arrayPosiciones, -1);

        int contPosiciones = 0;

        for (int i = 0; i < arrayNumeros.length - 1; i++) {

            if (i + 1 == arrayNumeros.length - 1) {
                if (arrayNumeros[i + 1] > arrayNumeros[i]) {
                    contPosiciones++;
                    if (contPosiciones > 0) {
                        arrayPosiciones[i] = ((i + 1) - contPosiciones);
                    }
                }
            }

            if (arrayNumeros[i + 1] >= arrayNumeros[i]) {
                contPosiciones++;
            } else {
                if (contPosiciones > 0) {
                    arrayPosiciones[i] = (i - contPosiciones);
                }
                contPosiciones = 0;
            }
        }

        for (int x = 0; x < arrayPosiciones.length; x++) {
            if (arrayPosiciones[x] != -1) {
                JOptionPane.showMessageDialog(null, "El array de las posiciones es: " + arrayPosiciones[x]);
            }
        }

    }

}
