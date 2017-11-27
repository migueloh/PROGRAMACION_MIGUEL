/*
Tenemos una matriz bidimensional de boolean donde cada posicion
indica si el punto (x, y) es blanco (true) o negro(false).

Ejemplo:

0000000000
0011111100
0001111100
0000111100
0000011100
0000000000

Escribe metodos para localizar los bordes superior, inferior, izquierdo y derecho.

El borde superior es el valor maximo de y donde algun punto es TRUE.

El borde inferior es el valor mınimo de y donde algun punto es TRUE. 

El borde izquierdo es el valor mınimo de x donde algun punto es TRUE.

El borde derecho es el valor maximo de x donde algun punto es TRUE.
 */
package tema5_pract2_ejer3;

import java.util.Arrays;

/**
 * @author 1gdaw07 MIGUEL OLMO
 */
public class Tema5_Pract2_Ejer3 {

    public static void main(String[] args) {
        // INICIO MAIN

        boolean xBlanco = true;
        boolean yNegro = false;

        boolean[][] aBidi = new boolean[6][10];

        boolean[][] aBidi2 = {{false, false, false, false, false, false, false, false, false, false}, {false, false, 1, 1, 1, 1, 1, 1, false, false}, {false, false, false, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 1, 1, 1, 0, 0}, {false, false, false, false, false, false, false, false, false, false}};

        
 
        for(int i = 1; i < aBidi2.length; i++) {
            
        Arrays.binarySearch(aBidi2, i);
        
            for (int x = 0; x < aBidi2.length; x++) {
                
                Arrays.binarySearch(aBidi2, x);
            } 
            
        }

        
        
    }

}
