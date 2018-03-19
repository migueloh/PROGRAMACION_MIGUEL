
package UML;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MIGUEL
 */
public class Caso {
    private String num_exp;
    private Date fecha_i;
    private Date fecha_f;
    private String estado;
    
    private Cliente cliente;
    
    private ArrayList <Abogado> listaAbogodos;

    public Caso() {
    }

    public Caso(String num_exp, Date fecha_i, Date fecha_f, String estado) {
        this.num_exp = num_exp;
        this.fecha_i = fecha_i;
        this.fecha_f = fecha_f;
        this.estado = estado;
    }

    public Caso(Cliente cliente) {
        this.cliente = cliente;
    }

    public Caso(ArrayList<Abogado> listaAbogodos) {
        this.listaAbogodos = listaAbogodos;
    }

    public Caso(String num_exp, Date fecha_i, Date fecha_f, String estado, Cliente cliente, ArrayList<Abogado> listaAbogodos) {
        this.num_exp = num_exp;
        this.fecha_i = fecha_i;
        this.fecha_f = fecha_f;
        this.estado = estado;
        this.cliente = cliente;
        this.listaAbogodos = listaAbogodos;
    }

    public String getNum_exp() {
        return num_exp;
    }

    public void setNum_exp(String num_exp) {
        this.num_exp = num_exp;
    }

    public Date getFecha_i() {
        return fecha_i;
    }

    public void setFecha_i(Date fecha_i) {
        this.fecha_i = fecha_i;
    }

    public Date getFecha_f() {
        return fecha_f;
    }

    public void setFecha_f(Date fecha_f) {
        this.fecha_f = fecha_f;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Abogado> getListaAbogodos() {
        return listaAbogodos;
    }

    public void setListaAbogodos(ArrayList<Abogado> listaAbogodos) {
        this.listaAbogodos = listaAbogodos;
    }
    
    
    
}
