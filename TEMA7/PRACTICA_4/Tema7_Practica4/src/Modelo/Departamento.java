package Modelo;

import java.util.ArrayList;

/**
 * @author 1gdaw09
 */

public class Departamento {
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String nombreDepartamento;
    
    //RELACIONES
    private ArrayList <Trabajador> listaTrabajadoresDepartamentos;
    
    //CONTRUCTORES
    public Departamento() {
    }

    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Departamento(ArrayList<Trabajador> listaTrabajadoresDepartamentos) {
        this.listaTrabajadoresDepartamentos = listaTrabajadoresDepartamentos;
    }

    public Departamento(String nombreDepartamento, ArrayList<Trabajador> listaTrabajadoresDepartamentos) {
        this.nombreDepartamento = nombreDepartamento;
        this.listaTrabajadoresDepartamentos = listaTrabajadoresDepartamentos;
    }
    
    //GETTERS & SETTERS
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public ArrayList<Trabajador> getListaTrabajadoresDepartamentos() {
        return listaTrabajadoresDepartamentos;
    }

    public void setListaTrabajadoresDepartamentos(ArrayList<Trabajador> listaTrabajadoresDepartamentos) {
        this.listaTrabajadoresDepartamentos = listaTrabajadoresDepartamentos;
    }
    
    
}
