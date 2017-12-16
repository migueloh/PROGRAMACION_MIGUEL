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
package tema5_pract2_ejer2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw07 MIGUEL OLMO
 */
public class Tema5_Pract2_Ejer2 {

    public static void main(String[] args) {
        // INICIO MAIN

        ArrayList<Integer> arrayListNumeros = new ArrayList();
        
        arrayListNumeros.add(0);
        arrayListNumeros.add(4);
        arrayListNumeros.add(7);
        arrayListNumeros.add(3);
        arrayListNumeros.add(5);
        arrayListNumeros.add(-1);
        arrayListNumeros.add(10);
        arrayListNumeros.add(10);
        arrayListNumeros.add(20);

        ArrayList<Integer> arrayPosiciones = new ArrayList();

        for (int i = 1; i < arrayListNumeros.size() -1; i++) {

            if (i == 1) {
                
                if (arrayListNumeros.get(i - 1) <= arrayListNumeros.get(i) ) {
                       
                        
                    arrayPosiciones.add(0);
                }
            }

            if (arrayListNumeros.get(i) < arrayListNumeros.get(i -1) && arrayListNumeros.get(i) < arrayListNumeros.get(i +1)) {
                arrayPosiciones.add(i);
            }
        }

        for (int x = 0; x < arrayPosiciones.size(); x++) {
            
            JOptionPane.showMessageDialog(null, "El array de inicios es " + arrayPosiciones.get(x));
            

        }

    }

}
