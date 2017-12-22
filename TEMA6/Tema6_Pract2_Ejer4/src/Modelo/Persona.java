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

    private String nombrePersona;
    private Integer diaNacimientoPersona;
    private Integer mesNacimientoPersona;
    private Integer anoNacimientoPersona;
    private String direccionPersona;
    private String codigoPostalPersona;
    private String ciudadPersona;

    public Persona() {
    }

    public Persona(String nombrePersona, Integer diaNacimientoPersona, Integer mesNacimientoPersona, Integer anoNacimientoPersona, String direccionPersona, String codigoPostalPersona, String ciudadPersona) {
        this.nombrePersona = nombrePersona;
        this.diaNacimientoPersona = diaNacimientoPersona;
        this.mesNacimientoPersona = mesNacimientoPersona;
        this.anoNacimientoPersona = anoNacimientoPersona;
        this.direccionPersona = direccionPersona;
        this.codigoPostalPersona = codigoPostalPersona;
        this.ciudadPersona = ciudadPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public Integer getDiaNacimientoPersona() {
        return diaNacimientoPersona;
    }

    public void setDiaNacimientoPersona(Integer diaNacimientoPersona) {
        this.diaNacimientoPersona = diaNacimientoPersona;
    }

    public Integer getMesNacimientoPersona() {
        return mesNacimientoPersona;
    }

    public void setMesNacimientoPersona(Integer mesNacimientoPersona) {
        this.mesNacimientoPersona = mesNacimientoPersona;
    }

    public Integer getAnoNacimientoPersona() {
        return anoNacimientoPersona;
    }

    public void setAnoNacimientoPersona(Integer anoNacimientoPersona) {
        this.anoNacimientoPersona = anoNacimientoPersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public String getCodigoPostalPersona() {
        return codigoPostalPersona;
    }

    public void setCodigoPostalPersona(String codigoPostalPersona) {
        this.codigoPostalPersona = codigoPostalPersona;
    }

    public String getCiudadPersona() {
        return ciudadPersona;
    }

    public void setCiudadPersona(String ciudadPersona) {
        this.ciudadPersona = ciudadPersona;
    }
    
    // FUNCIONES DE LA CLASE
    public String mostrarInformacionPersona() {

        return "\nNombre: " + nombrePersona
              +"\nDia Nacimiento" + diaNacimientoPersona
              +"\nMes Nacimiento" + mesNacimientoPersona
              +"\nAño Nacimiento" + anoNacimientoPersona
              +"\nDireccion" + direccionPersona
              +"\nCodigo Postal " + codigoPostalPersona
              +"\nCiudad" + ciudadPersona;

    }
}
