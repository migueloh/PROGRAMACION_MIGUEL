
package UML;

import java.util.ArrayList;

/**
 *
 * @author MIGUEL
 */
public class Abogado {
    private String dni;
    private String nombre;
    private String ape1;
    private String ape2;
    private String dir;
    
    private ArrayList <Caso> listaCasos;

    public Abogado() {
    }

    public Abogado(ArrayList<Caso> listaCasos) {
        this.listaCasos = listaCasos;
    }

    public Abogado(String dni, String nombre, String ape1, String ape2, String dir) {
        this.dni = dni;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.dir = dir;
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public ArrayList<Caso> getListaCasos() {
        return listaCasos;
    }

    public void setListaCasos(ArrayList<Caso> listaCasos) {
        this.listaCasos = listaCasos;
    }
 
    
}
