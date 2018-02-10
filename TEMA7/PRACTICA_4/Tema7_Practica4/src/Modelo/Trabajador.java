package Modelo;

import java.util.ArrayList;

/**
 * @author 1gdaw09
 */
public class Trabajador extends Persona{
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String numeroEmpleado;
    
    // RELACIONES
    private Login login;
    
    private ArrayList <Contrato> listaContratos;
    
    private Departamento departamento;
    

    //CONTRUCTORES

    public Trabajador() {
    }

    public Trabajador(String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil) {
        super(dni, nss, nombre, apellidos, direccion, telefono, sexo, estadoCivil);
    }

    public Trabajador(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Trabajador(Login login) {
        this.login = login;
    }

    public Trabajador(ArrayList<Contrato> listaContratos) {
        this.listaContratos = listaContratos;
    }

    public Trabajador(Departamento departamento) {
        this.departamento = departamento;
    }

    public Trabajador(String numeroEmpleado, Login login, ArrayList<Contrato> listaContratos, Departamento departamento) {
        this.numeroEmpleado = numeroEmpleado;
        this.login = login;
        this.listaContratos = listaContratos;
        this.departamento = departamento;
    }

    public Trabajador(String numeroEmpleado, Login login, ArrayList<Contrato> listaContratos, Departamento departamento, String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil) {
        super(dni, nss, nombre, apellidos, direccion, telefono, sexo, estadoCivil);
        this.numeroEmpleado = numeroEmpleado;
        this.login = login;
        this.listaContratos = listaContratos;
        this.departamento = departamento;
    }
    
    //GETTERS & SETTERS

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public ArrayList<Contrato> getListaContratos() {
        return listaContratos;
    }

    public void setListaContratos(ArrayList<Contrato> listaContratos) {
        this.listaContratos = listaContratos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
   
    
    
}
