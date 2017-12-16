/**
 *
 *
 * 3. Crea un programa que guarde informacion sobre los trabajadores de ´
 * una empresa. De cada uno de ellos se quiere guardar el nombre, el
 * numero de la seguridad social y el tiempo que lleva en la empresa. ´
 * Cuando tengamos ya los datos de todos los empleados mostraremos
 * en pantalla el nombre del que mas tiempo lleva.
 *
 *
 * @author 1gdaw09 MIGUEL OLMO HERNANDO
 */
package Modelo;

/**
 *
 * @author 1gdaw09 MIGUEL OLMO HERNANDO
 */
public class Trabajador extends Persona {

    private Integer anosTrabajados;

    public Trabajador() {
    }

    public Trabajador(Integer anosTrabajados) {
        this.anosTrabajados = anosTrabajados;
    }

    public Trabajador(Integer anosTrabajados, String nombre, String numSeguridadSocial) {
        super(nombre, numSeguridadSocial);
        this.anosTrabajados = anosTrabajados;
    }

    public Integer getAnosTrabajados() {
        return anosTrabajados;
    }

    public void setAnosTrabajados(Integer anosTrabajados) {
        this.anosTrabajados = anosTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(String numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    //FUNCIONES PROPIAS DE LA CLASE
    public String informacionTrabajador() {
        return "\nNombre : " + nombre
                + "\nAños en la Empresa: " + anosTrabajados
                + "\nNumero de la Seguridad Social: " + numSeguridadSocial;

    }

}
