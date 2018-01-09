/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author nieves
 */
public class Persona {
    private String nombre;
    private String dni;
    
    private ArrayList<Vehiculo> lista;

    public ArrayList<Vehiculo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Vehiculo> lista) {
        this.lista = lista;
    }
    public void setLista(Vehiculo v)
    {
        if (this.lista == null)
            this.lista = new ArrayList();
        this.lista.add(v);
    }
           

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.lista = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
