package tema6_pract2_ejer3;

import javax.swing.JOptionPane;
import Modelo.*;
import java.util.ArrayList;


/**
 *
 * @author 1gdaw07
 */
public class Tema6_Pract2_Ejer3 {

    private static ArrayList<Persona> listaPersonas;
    private static ArrayList<Cliente> listaClientes;
    
    public static void main(String[] args) {
        // INICIO MAIN
            
        try {
            
            meterPersonas();
            meterClientes();
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Inexperado");
        }
        
    }

    private static void meterPersonas() {
        //Persona(String nombre, String edad
        
        ArrayList<String> nombrePersonas = new ArrayList<>();
        nombrePersonas.add("Miguel");
        nombrePersonas.add("Jose");
        nombrePersonas.add("David");
        
        
        
        listaPersonas = new ArrayList<>();
        
                
    }

    private static void meterClientes() {
        
        ArrayList<String>listaClientes =new ArrayList<>();
        
        
    }
    
}
