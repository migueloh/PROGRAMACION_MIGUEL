/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4e1;
import javax.swing.JOptionPane;
/**
 *
 * @author 1GDAW09
 */
public class Tema4E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double min=9999;
        double max=0; 
        
         double[] listanumeros = new double[10];
         int c=0;
       try{  
        for (c=0;c<10;c++){
                  listanumeros[c]=Double.parseDouble(JOptionPane.showInputDialog("Introduceme un numero"));   
             }
       }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"el dato introducido no es correcto");
                }
       for (c=0;c<10;c++){
        if (listanumeros[c] < min){
                   min=listanumeros[c];  
                 }
                 if (listanumeros[c] >max){
                   max=listanumeros[c];  
                 }
       }
                
             JOptionPane.showMessageDialog(null,"El numero minimo es "+min+" el numero maximo es "+max);
  
        }

       
       
    }
    

