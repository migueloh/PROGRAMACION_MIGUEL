package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw09
 */
public class Dueno {
    
    private String dni;
    private String nombre;

   
    private ArrayList <Multa> listaCoches;

    public Dueno() {
    }

    public Dueno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Dueno(ArrayList<Multa> listaCoches) {
        this.listaCoches = listaCoches;
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

    public ArrayList<Multa> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(ArrayList<Multa> listaCoches) {
        this.listaCoches = listaCoches;
    }
 
    
    
    
}
