package Modelo;

/**
 * 

* 3. Crea un programa que guarde informacion sobre los trabajadores de ´
una empresa. De cada uno de ellos se quiere guardar el nombre, el
numero de la seguridad social y el tiempo que lleva en la empresa. ´
Cuando tengamos ya los datos de todos los empleados mostraremos
en pantalla el nombre del que mas tiempo lleva. 

 * @author 1gdaw09 MIGUEL OLMO HERNANDO
 */

public abstract class Persona {
    
    public String nombre;
    public String numSeguridadSocial;
    public String anosTrabajados;

    public Persona() {
    }

    public Persona(String nombreP, String numSeguridadSocialP, String anosTrabajadosP) {
        this.nombre = nombreP;
        this.numSeguridadSocial = numSeguridadSocialP;
        this.anosTrabajados = anosTrabajadosP;
    }
    



    
    
}

