package Controladora;

import Modelo.Persona;
import Vistas.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw07 Miguel Olmo Hernando
 *
 * INFO https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
 */
public class Controladora {

    //ATRIBUTOS
    private static ArrayList<Persona> listaPersonas;

    //VARIABLES PARA OBJETOS
    private static VentanaIntroDatos vID;
    private static VentanaMostrarResultados vR;

    public static void main(String[] args) {

        // INICIO MAIN
        
        //INICIO DEL PROGRAMA
        
        //INICIO EL ARRAY
        listaPersonas = new ArrayList<>();

        //CREAR OBJETO VENTANA PRINCIPAL                       
        abrirVentanaInicio(vID = new VentanaIntroDatos());

    }

    //ABRIR VENTANA INICIO
    public static void abrirVentanaInicio(VentanaIntroDatos vID) {
        vID.setVisible(true);
    }

    //DESTRUYE VENTANA INTRO DATOS Y MUESTRA VENTANA RESULTADOS
    public static void salirVentanaIntroDatosAbrirVentanaResultados() {

        destruirVentanaIntroDatos();

        abrirVentanaResultados();
    }

    //DESTRUIR LA VENTANA INTRO DATOS
    private static void destruirVentanaIntroDatos() {
        vID.setVisible(false);
    }

    //MOSTRAR VENTANA RESULTADOS
    public static void abrirVentanaResultados() {
        vR = new VentanaMostrarResultados();
        vR.setVisible(true);
    }

    //FUNCION PARA SALIR DE LAS VENTANAS
    public static void salirVentanas() {
        System.exit(0);
    }

    //FUNCION PARA GUARDAR PERSONAS
    public static void guardarPersona(String nombre, String apellido, String dni) {
        
        try {           
            listaPersonas.add(new Persona(nombre, apellido, dni));
        } catch (Exception e) {
            System.out.println("Error al crear Persona");
        }
    }

    //FUNCION PARA MOSTRAR LAS PERSONAS
    public static String mostrarLasPersonas() {
        
        String datos="";
        
        for(int x = 0; x < listaPersonas.size(); x++)
        {
            datos += listaPersonas.get(x).getNombre() + "  " + listaPersonas.get(x).getApellidos() + "  " + listaPersonas.get(x).getDNI()+ " \n" ;
        }
        
        return datos;
    }
}
