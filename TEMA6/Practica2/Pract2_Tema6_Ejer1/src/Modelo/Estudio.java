
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1gdaw12 MIGUEL
 */
public class Estudio {
    
    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    private Date fechaFundacion;
    private String pais;
    
    private ArrayList<String> listaTelefonos;

    public Estudio() {
    }

    public Estudio(String nombre, String ciudad, String direccion, String dirWeb, Date fechaFundacion, String pais, ArrayList<String> listaTelefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.listaTelefonos = listaTelefonos;
    }
    
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<String> getListaTelefonos() {
        return listaTelefonos;
    }

    public void setListaTelefonos(ArrayList<String> listaTelefonos) {
        this.listaTelefonos = listaTelefonos;
    }
    
    
    
}
