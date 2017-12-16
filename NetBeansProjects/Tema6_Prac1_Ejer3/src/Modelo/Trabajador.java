/**
 * 

* 3. Crea un programa que guarde informacion sobre los trabajadores de ´
una empresa. De cada uno de ellos se quiere guardar el nombre, el
numero de la seguridad social y el tiempo que lleva en la empresa. ´
Cuando tengamos ya los datos de todos los empleados mostraremos
en pantalla el nombre del que mas tiempo lleva. 

 * @author 1gdaw09 MIGUEL OLMO HERNANDO
 */
package Modelo;

/**
 *
 * @author 1gdaw09 MIGUEL OLMO HERNANDO
 */

public class Trabajador extends Persona {

    public Trabajador() {
    }

    public Trabajador(String nombreT, String numSeguridadSocialT, String anosTrabajadosT) {
        super(nombreT, numSeguridadSocialT, anosTrabajadosT);
    }

    public String getNombreT() {
        return nombre;
    }

    public void setNombre(String nombreT) {
        this.nombre = nombreT;
    }

    public String getNumSeguridadSocialT() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(String numSeguridadSocialT) {
        this.numSeguridadSocial = numSeguridadSocialT;
    }

    public String getAnosTrabajadosT() {
        return anosTrabajados;
    }

    public void setAnosTrabajados(String anosTrabajadosT) {
        this.anosTrabajados = anosTrabajadosT;
    }

    public String informacionTrabajador() {
        return "Nombre del Trabajador: " + nombre 
             + "Años en la Empresa: " + anosTrabajados;

    }
}
