/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4e2;
import javax.swing.JOptionPane;

public class Tema4E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int correcto=0;
        
        String[] meses = new String [12];
        int c = 0;
       meses [0]="enero";
       meses [1]="febrero";
       meses [2]="marzo";
       meses [3]="abril";
       meses [4]="mayo";
       meses [5]="junio";
       meses [6]="julio";
       meses [7]="agosto";
       meses [8]="septiembre";
       meses [9]="octubre";
       meses [10]="noviembre";
       meses [11]="diciembre";
       
      String mes;
      try
      {
           mes=JOptionPane.showInputDialog("Introduce el mes (Con letras)"); 
           for (c=0;c<meses.length;c++)
       {
           if (mes.equalsIgnoreCase(meses[c]))
           {
              correcto++;
           }}
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, "ERROR");
      }
     
      
           if (correcto==1)
                {
                   JOptionPane.showMessageDialog(null, "El mes introducido es correcto");
                } 
           else 
           {
               JOptionPane.showMessageDialog(null, "El mes introducido NO es correcto");
           
            }
       
       
    
    }
    
}
