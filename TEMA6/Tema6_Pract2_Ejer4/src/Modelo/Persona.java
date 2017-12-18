package Modelo;

/**
 *
 * Define una clase Persona con los siguientes datos: nombre, dNacimiento (dıas
 * de nacimiento), mNacimiento (mes de nacimiento), aNacimiento (ano de
 * nacimiento), direccion, codigoPostal y ciudad.
 *
 * Crea varios objetos de tipo Persona y a traves de un programa muestra los
 * siguientes datos:
 *
 * Nombre de la persona de mayor edad.
 *
 * Nombre de las personas que viven en Elche.
 *
 * Numero de personas mayores de edad. * Hay que comprobar que todos los campos
 * contienen informacion y ´ que es logica. * En este ejercicio utilizaremos
 * alguna de las clases relacionadas con fechas en java.
 *
 *
 * @author 1gdaw10 MIGUEL OLMO HERNADNO
 */
public class Persona {

    private String nombre;
    private String diaNacimiento;
    private String mesNacimiento;
    private String anoNacimiento;
    private String direccion;
    private String codigoPostal;
    private String ciudad;

    public Persona() {
    }

    public Persona(String nombre, String diaNacimiento, String mesNacimiento, String anoNacimiento, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(String diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public String getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(String anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // FUNCIONES DE LA CLASE
    public String mostrarInformacionPersona() {

        return    "\n Nombre: " + nombre
                + "\n Dia Nacimiento" + diaNacimiento
                + "\n Mes Nacimiento" + mesNacimiento
                + "\n Año Nacimiento" + anoNacimiento
                + "\n Direccion" + direccion
                + "\n Codigo Postal " + codigoPostal
                + "\n Ciudad" + ciudad;

    }
}
