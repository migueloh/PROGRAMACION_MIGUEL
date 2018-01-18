package Modelo;

import Modelo.*;
import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Cliente> listaEstudios;
    private ArrayList<Empleado> listaEmpleados;
    
    private String nombre;

    public Empresa() {
    }

    public Empresa(ArrayList<Cliente> listaEstudios, ArrayList<Empleado> listaEmpleados, String nombre) {
        this.listaEstudios = listaEstudios;
        this.listaEmpleados = listaEmpleados;
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(ArrayList<Cliente> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
