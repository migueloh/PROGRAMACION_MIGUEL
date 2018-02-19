package Modelo;

/**
 * @author 1gdaw09
 */
public class Trabajador extends Persona {

    //ATRIBUTOS PROPIOS DE LA CLASE TRABAJADOR
    private String numeroEmpleado;
    private String fechaAlta;

    //RELACIONES
    private Login login;

    //CONTRUCTORES
    public Trabajador() {
    }

    public Trabajador(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Trabajador(Login login) {
        this.login = login;
    }

    public Trabajador(String numeroEmpleado, String fechaAlta, Login login) {
        this.numeroEmpleado = numeroEmpleado;
        this.fechaAlta = fechaAlta;
        this.login = login;
    }

    public Trabajador(String numeroEmpleado, String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil, String fechaAlta) {
        super(dni, nss, nombre, apellidos, direccion, telefono, sexo, estadoCivil);
        this.numeroEmpleado = numeroEmpleado;
        this.fechaAlta = fechaAlta;
    }

    public Trabajador(Login login, String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil) {
        super(dni, nss, nombre, apellidos, direccion, telefono, sexo, estadoCivil);
        this.login = login;
    }

    //CONTRUCTOR INDEPENDIENTE PARA CREAR EL USUARIO ADMINISTRADOR
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
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
