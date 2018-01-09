/*

DE PELICULA A ESTUDIO

DE 1 a N

Ejercicio uno:

Ano es un array de char de cuatro posiciones. ˜
La fecha de fundacion del estudio es de tipo java.util.Date. ´
En este primer ejercicio hay que mostrar el nombre del o de los estudios
en los que se ha producido la pel´ıcula mas larga y el nombre del ´
estudio que mas pel ´ ´ıculas ha producido.

 */
package pract2_tema6_ejer1;

import Modelo.*;

/**
 *
 * @author 1gdaw12 MIGUEL OLMO HERNANDO
 */
public class Controladora {

    
    public static void main(String[] args) {
        
        // INICIO MAIN
        
        //Estudio eST = new Estudio(nombre, ciudad, direccion, dirWeb, fechaFundacion, pais, listaTelefonos);
        //Pelicula pEL = new Pelicula(titulo, duracion, tipo, anio);
        
        Pelicula pEL1 = new Pelicula("Lobo", 90 , "accion", ("1988").toCharArray());
        Pelicula pEL2 = new Pelicula("Gato", 120 , "intriga", ("1989").toCharArray());
        
        
        Estudio eST = new Estudio("Fox", "Vitoria", "Paloma", "foxweb", fechaFundacion, pais, listaTelefonos);
        
    }
    
}
