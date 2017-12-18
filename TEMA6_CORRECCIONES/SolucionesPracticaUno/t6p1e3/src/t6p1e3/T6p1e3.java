
package t6p1e3;

import Excepciones.*;
import Modelo.Trabajador;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p1e3 {

    private static ArrayList<Trabajador> trabajadores;
    
    public static void main(String[] args) {
        try
        {
            obtenerDatos();
            buscarMaximo();
        }
        catch(Exception e)
        {
            System.out.println("Problemas");
        }
    }
    
    
    public static void buscarMaximo()throws Exception{
         int maximo = -1;
         Trabajador maximoT=null;
         for(Trabajador t:trabajadores)
         {
             if(t.getAntiguedad() > maximo)
             {   
                 maximoT = t;
                 maximo = t.getAntiguedad();
             }
         }
         JOptionPane.showMessageDialog(null,"El trabajador que más tiempo lleva en la empresa se llama: " + maximoT.getNombre());
    }
    
    public static void obtenerDatos(){
        trabajadores = new ArrayList();
        do
        {
            try
            {
                String nombre = JOptionPane.showInputDialog("Teclea el nombre del trabajador");
                validar(1,nombre,"^[A-Z][a-z]{2,}([ ][A-Z][a-z]{1,})*$");
                String nss = JOptionPane.showInputDialog("Teclea el número de la seguridad social");
                //  28 12345678 40 
                validar(2,nss,"^[0-9]{2}[ ][0-9]{8}[ ][0-9]{2}$");
                /*
                   Con la expresión regular sólo hemos validado el formato.
                   Falta comprobar más cosas
                   http://www.grupoalquerque.es/ferias/2012/archivos/digitos/codigo_seguridad_social.pdf*/
                validarNSS(nss);
                String antiguedad = JOptionPane.showInputDialog("Teclea la antiguedad");
                validar(3,antiguedad,"^[0-9]{1,2}$");
            
                Trabajador t = new Trabajador(nombre,nss,Integer.parseInt(antiguedad));
                trabajadores.add(t);
            }
            catch(DatoNoValido e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
            catch(Exception e)
            {
                System.out.println("Problemas");
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Hay más trabajadores?")==0);
    }
    
    public static void validar(int n,String dato,String regex)throws Exception{
        Pattern patron = Pattern.compile(regex);
        Matcher m = patron.matcher(dato);
        if (!m.matches())
            throw new DatoNoValido(n);
                    
    }
    public static void validarNSS(String nss) throws Exception
    {
        //  28 12345678 40 
        String parteUno=nss.substring(0, 2);
        String parteDos=nss.substring(3, 11);
        String parteTres=nss.substring(12, 14);
        
        String[] arrayProvincias ={"01","02","03","04","33","05","06","07","08",
            "09","10","11","39","12","13","14","15","16","17","18","19","20","21",
            "22","23","24","25","27","28","29","30","31","32","34","35","36","26",
            "37","38","40","41","42","43","44","45","46","47","48","49","50","53","66"};
        
        boolean encontrado = false;
        for(int x = 0; x < arrayProvincias.length && encontrado == false; x++)
            if(arrayProvincias[x].compareTo(parteUno)== 0)
                encontrado = true;
        if (encontrado == false)
            throw new DatoNoValido(2);
        
        String digitosControl;
        long dividendo = Long.parseLong(parteUno + parteDos);
        Long resto = dividendo % 97;
        if (resto < 10)
            digitosControl = "0" + resto;
        else
            digitosControl = resto.toString();
        
        System.out.println(digitosControl + " "+ resto);
        if (digitosControl.compareTo(parteTres)!= 0)
            throw new DatoNoValido(2);
           
    }
}
