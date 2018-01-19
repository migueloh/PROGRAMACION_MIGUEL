package Modelo;

public class Pasajero {

    //ATRIBUTOS PROPIOS DE LA CLASE
    private String DNI;
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    
    // RELACIONES
    private Asiento asiento;
    private Vuelo vuelo;

    //CONSTRUCTORES
    public Pasajero() {
    }

    public Pasajero(String DNI, String nombre, String apellido, String sexo, int edad, Asiento asiento, Vuelo vuelo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.asiento = asiento;
        this.vuelo = vuelo;
    }
    
    // GETTERS AND SETTERS
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    

    
    //METODOS PROPIOS DE LA CLASE

    public void aregarNuevo() {

    }

    public void modificar() {

    }

    public void asignarVuelo() {

    }

    public Pasajero buscar() {
        return null;
    }

}
