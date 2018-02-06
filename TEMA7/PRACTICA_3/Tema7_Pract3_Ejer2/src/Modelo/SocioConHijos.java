package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw09
 */
public class SocioConHijos extends Socio{

    private ArrayList<Hijo> listaHijos;

    public SocioConHijos() {
    }

    public SocioConHijos(ArrayList<Hijo> listaHijos) {
        this.listaHijos = listaHijos;
    }

    public SocioConHijos(ArrayList<Hijo> listaHijos, String nombre, String apellidos, String telefono, String email) {
        super(nombre, apellidos, telefono, email);
        this.listaHijos = listaHijos;
    }

    public SocioConHijos(String nombre, String apellidos, String telefono, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Hijo> getListaHijos() {
        return listaHijos;
    }

    public void setListaHijos(ArrayList<Hijo> listaHijos) {
        this.listaHijos = listaHijos;
}
    


}
