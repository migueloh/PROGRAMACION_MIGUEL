/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclases;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author nieves
 */
public class EjemploClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Pepe","1");
         Persona p1 = new Persona("Jose","2");
        
        Vehiculo v1 = new Vehiculo();
         v1.setColor("rojo");
         v1.setMatricula("1111aaa");
         v1.setP(p);
         
         Vehiculo v2 = new Vehiculo();
         v2.setColor("blanco");
         v2.setMatricula("2222bbb");
         v2.setP(p);
         
          Vehiculo v3 = new Vehiculo();
         v3.setColor("azul");
         v3.setMatricula("6666bbb");
         v3.setP(p1);
         javax.swing.JOptionPane.showMessageDialog(null,v3.getP().getNombre());
         ArrayList<Vehiculo> l = new ArrayList();
         l.add(v1);
         l.add(v2);
         p.setLista(l);
         
         p1.setLista(v3);
          javax.swing.JOptionPane.showMessageDialog(null,p.getLista().get(0).getMatricula());
         
    }
    
}
