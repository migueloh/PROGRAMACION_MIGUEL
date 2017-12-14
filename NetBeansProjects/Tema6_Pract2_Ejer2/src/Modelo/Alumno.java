/*
Crea una agenda con los datos de los alumnos de clase. De cada
alumno guarda su codigo, nombre, domicilio y telefono. Una vez
introducido sus datos, se visualizaran los datos del alumno 
que corresponda con un codigo tecleado. 
 */
package Modelo;

/**
 *
 * @author 1gdaw09
 */
public class Alumno {

    private String codA;
    private String nombreA;
    private String domicilioA;
    private String telefonoA;
    
    private String informacionAlumnoRetornar;

    public Alumno() {
    }

    public Alumno(String codA, String nombreA, String domicilioA, String telefonoA) {
        this.codA = codA;
        this.nombreA = nombreA;
        this.domicilioA = domicilioA;
        this.telefonoA = telefonoA;
    }

    public String getCodA() {
        return codA;
    }

    public void setCodA(String codA) {
        this.codA = codA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getDomicilioA() {
        return domicilioA;
    }

    public void setDomicilioA(String domicilioA) {
        this.domicilioA = domicilioA;
    }

    public String getTelefonoA() {
        return telefonoA;
    }

    public void setTelefonoA(String telefonoA) {
        this.telefonoA = telefonoA;
    }

    public String getInformacionAlumnoRetornar() {
        informacionAlumnoRetornar = "\n" + codA + " - " + nombreA + " - " + domicilioA + " - " + telefonoA;
        return informacionAlumnoRetornar;
    }

 
}
