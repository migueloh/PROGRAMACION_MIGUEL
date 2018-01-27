/*
 Desarrolla un proyecto que te permita guardar los datos de todas las
personas (nombre, apellidos y dni) que estudian en Egibide Arriaga.
Si la persona es nueva, nos tienen que indicar su nombre, apellidos,
dni y curso en el que se matricula. Vamos a suponer que hay 16 cursos
(4  primeros,  4  segundos,  4  terceros  y  cuatro  cuartos,  A,  B,  C  y  D
respectivamente).

Si  la  persona  no  es  nueva  (ya  tenemos  una  persona  con  ese  dni),
vamos a suponer que hay que matricularla en otro curso o borrrarla.

En estos dos ultimos casos, mostraremos sus datos en la ventana y
luego preguntaremos al usuario que operacion quiere realizar a traves
de un cuadro de dialogo
 */
package tema7_pract1_ejer2;

import Modelo.*;
import Vistas.VentanaDatos;
import java.util.ArrayList;

/**
 *
 * @author MIGUEL
 * INFO
 * http://puntocomnoesunlenguaje.blogspot.com.es/2012/10/arrays-unidimensionales-en-java.html
 */
public class Controladora {

    private static VentanaDatos vD;
    private static Curso[] listaCurso;
    private static ArrayList<Persona> listaPersonas;

    private static Curso cur;
    private static Persona per;

    public static void main(String[] args) {

        // INICIO MAIN
        crearCursos();
        listaPersonas = new ArrayList();
        abrirVentanaPrincipal(vD = new VentanaDatos());

    }

    public static void abrirVentanaPrincipal(VentanaDatos ventanaDatos) {
        ventanaDatos.setVisible(true);
    }

    public static void salirVentanas() {
        System.exit(0);
    }

    public static void crearCursos() {
        listaCurso = new Curso[16];
        cur = new Curso("1A");
        listaCurso[0] = cur;
        cur = new Curso("1B");
        listaCurso[1] = cur;
        cur = new Curso("1C");
        listaCurso[2] = cur;
        cur = new Curso("1D");
        listaCurso[3] = cur;
        cur = new Curso("2A");
        listaCurso[4] = cur;
        cur = new Curso("2B");
        listaCurso[5] = cur;
        cur = new Curso("2C");
        listaCurso[6] = cur;
        cur = new Curso("2D");
        listaCurso[7] = cur;
        cur = new Curso("3A");
        listaCurso[8] = cur;
        cur = new Curso("3B");
        listaCurso[9] = cur;
        cur = new Curso("3C");
        listaCurso[10] = cur;
        cur = new Curso("3D");
        listaCurso[11] = cur;
        cur = new Curso("4A");
        listaCurso[12] = cur;
        cur = new Curso("4B");
        listaCurso[13] = cur;
        cur = new Curso("4C");
        listaCurso[14] = cur;
        cur = new Curso("4D");
        listaCurso[15] = cur;
    }
    
    public static Curso recogerValorCurso(String curso) {
        for (int i = 0; i < listaCurso.length ; i++) {
   
            if (listaCurso[i].getCurso().equalsIgnoreCase(curso)){
                return listaCurso[i];
            }
        }
        return null;
    }
    
    // Para retornar los datos de la persona
    public static Persona getPersona(){
        return per;
    }
    
    // Para retornar el curso
    public static Curso getCurso(){
        return cur;
    }
    

    public static void altaPersona(String dni, String nombre, String apellido, String curso) {
        cur =recogerValorCurso(curso);
 
        listaPersonas.add(new Persona (dni, nombre, apellido, cur));
            
    }

    public static void editarPersona() {
        per.getCurso().editarCursoPersona(per);
        per.setCurso(cur);
        
    }

    public static void borrarPersona() {
        //per.getCurso().borrarPersona(per);
        listaPersonas.remove(per);

    }

    public static Persona buscarDNI(String dni) {
        int posicion=0;
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getDni().equalsIgnoreCase(dni)) {
                    posicion=i;
                
                }
        }
        
        per=listaPersonas.get(posicion);
        return per;
    }
    
    public static Persona recogerValorDNI(String dni) {
        for (int i = 0; i < listaPersonas.size() ; i++) {
   
            if (listaPersonas.get(i).getDni().equalsIgnoreCase(dni)){
                return listaPersonas.get(i);
            }
        }
        return null;
    }

  



}
