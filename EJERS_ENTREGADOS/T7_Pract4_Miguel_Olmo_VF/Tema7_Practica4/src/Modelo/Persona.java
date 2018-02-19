package Modelo;

/**
 * @author 1gdaw09
 */
public abstract class Persona {

    //ATRIBUTOS DEL PADRE
    protected String dni;
    protected String nss;
    protected String nombre;
    protected String apellidos;
    protected String direccion;
    protected String telefono;
    protected String sexo;
    protected String estadoCivil;

    //CONTRUCTORES
    public Persona() {
    }

    public Persona(String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

}
