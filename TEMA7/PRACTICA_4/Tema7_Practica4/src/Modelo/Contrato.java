package Modelo;

/**
 * @author 1gdaw09
 */
public class Contrato {
    
    //ATRIBUTOS PROPIOS DE LA CLASE
    private String tipoDeContrato;
    private String fechaAlta;
    
    
    //CONTRUCTORES
    public Contrato() {
    }

    public Contrato(String tipoDeContrato, String fechaAlta) {
        this.tipoDeContrato = tipoDeContrato;
        this.fechaAlta = fechaAlta;
    }
    
    //GETTERS & SETTERS
    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    
    
   
    
    
    
    
}
