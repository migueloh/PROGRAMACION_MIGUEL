package Modelo;

import java.util.ArrayList;

/**
 * @author 1gdaw09
 */

public class Departamento {
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String nombreDepartamento;
    
    //RELACIONES
    private ArrayList <Trabajador> listaTrabajadores;
    
    //CONTRUCTORES
    public Departamento() {
    }

    public Departamento(String nombreDepartamento, ArrayList<Trabajador> listaTrabajadores) {
        this.nombreDepartamento = nombreDepartamento;
        this.listaTrabajadores = listaTrabajadores;
    }
    
    //GETTERS & SETTERS
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }
    
    //METODOS PROPIOS DE LA CLAS
    public void mostrarListaTrabajadores () {
        String listaEmpleados = "Listado Completo de trabajadores";
        for (int x = 0; x < this.listaTrabajadores.size() ; x++) {
            listaEmpleados+="\n"+"Nombre: "+this.listaTrabajadores.get(x).nombre
                            +"\n"+"Apellido: "+this.listaTrabajadores.get(x).apellidos
                            +"\n"+"Dni: "+this.listaTrabajadores.get(x).dni
                            +"\n"+"Nss: "+this.listaTrabajadores.get(x).nss
                            +"\n"+"Sexo: "+this.listaTrabajadores.get(x).sexo
                            +"\n"+"Estado Civil: "+this.listaTrabajadores.get(x).estadoCivil
                            +"\n"+"Telefono: "+this.listaTrabajadores.get(x).telefono
                            +"\n"+"Direccion: "+this.listaTrabajadores.get(x).direccion
                            +"\n-------------------------------------------------------";  
        }
        
        System.out.println(listaEmpleados);
    }
    
  
}
