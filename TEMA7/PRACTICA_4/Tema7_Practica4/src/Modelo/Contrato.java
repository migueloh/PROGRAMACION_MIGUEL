package Modelo;

import java.util.ArrayList;

/**
 * @author MIGUEL
 */
public class Contrato {

    //ATRIBUTOS PROPIOS DE LA CLASE CONTRATO
    private String tipoDeContrato;

    //RELACIONES
    private ArrayList<Trabajador> listaTrabajadoresContrato;

    //CONTRUCTORES
    public Contrato() {
    }

    public Contrato(ArrayList<Trabajador> listaTrabajadoresContrato) {
        this.listaTrabajadoresContrato = listaTrabajadoresContrato;
    }

    public Contrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public Contrato(String tipoDeContrato, ArrayList<Trabajador> listaTrabajadoresContrato) {
        this.tipoDeContrato = tipoDeContrato;
        this.listaTrabajadoresContrato = listaTrabajadoresContrato;
    }

    //CONTRUCTOR INDEPENDIENTE PARA CREAR EL USUARIO ADMINISTRADOR
    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public ArrayList<Trabajador> getListaTrabajadoresContrato() {
        return listaTrabajadoresContrato;
    }

    public void setListaTrabajadoresContrato(ArrayList<Trabajador> listaTrabajadoresContrato) {
        this.listaTrabajadoresContrato = listaTrabajadoresContrato;
    }

}
