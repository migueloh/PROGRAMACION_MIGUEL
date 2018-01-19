package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String DNI;
    
    private ArrayList <Persona> grupoPersonas;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String DNI, ArrayList<Persona> grupoPersonas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.grupoPersonas = grupoPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Persona> getGrupoPersonas() {
        return grupoPersonas;
    }

    public void setGrupoPersonas(ArrayList<Persona> grupoPersonas) {
        this.grupoPersonas = grupoPersonas;
    }
    
    
}
