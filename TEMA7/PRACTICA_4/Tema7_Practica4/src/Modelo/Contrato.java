package Modelo;

import java.util.ArrayList;

/**
 * @author 1gdaw09
 */
public class Contrato {
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String tipoDeContrato;
    
    //RELACIONES
    private ArrayList <Trabajador> listaTrabajadoresContratos;
    
    //CONTRUCTORES
    public Contrato() {
    }

    public Contrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public Contrato(ArrayList<Trabajador> listaTrabajadoresContratos) {
        this.listaTrabajadoresContratos = listaTrabajadoresContratos;
    }

    public Contrato(String tipoDeContrato, ArrayList<Trabajador> listaTrabajadoresContratos) {
        this.tipoDeContrato = tipoDeContrato;
        this.listaTrabajadoresContratos = listaTrabajadoresContratos;
    }
    
    //GETTERS & SETTERS
    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public ArrayList<Trabajador> getListaTrabajadoresContratos() {
        return listaTrabajadoresContratos;
    }

    public void setListaTrabajadoresContratos(ArrayList<Trabajador> listaTrabajadoresContratos) {
        this.listaTrabajadoresContratos = listaTrabajadoresContratos;
    }
    
    
    
    
}
