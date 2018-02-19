package Modelo;

import java.util.ArrayList;

/**
 * @author MIGUEL
 */
public class Departamento {

    //ATRIBUTOS PROPIOS DE LA CLASE DEPARTAMENTO
    private String nombreDepartamento;

    //RELACIONES
    private ArrayList<Trabajador> listaTrabajadoresDepartamento;

    //CONTRUCTORES
    public Departamento() {
    }

    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Departamento(ArrayList<Trabajador> listaTrabajadoresDepartamento) {
        this.listaTrabajadoresDepartamento = listaTrabajadoresDepartamento;
    }

    public Departamento(String nombreDepartamento, ArrayList<Trabajador> listaTrabajadoresDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.listaTrabajadoresDepartamento = listaTrabajadoresDepartamento;
    }

    //CONTRUCTOR INDEPENDIENTE PARA CREAR EL USUARIO ADMINISTRADOR
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public ArrayList<Trabajador> getListaTrabajadoresDepartamento() {
        return listaTrabajadoresDepartamento;
    }

    public void setListaTrabajadoresDepartamento(ArrayList<Trabajador> listaTrabajadoresDepartamento) {
        this.listaTrabajadoresDepartamento = listaTrabajadoresDepartamento;
    }

}
