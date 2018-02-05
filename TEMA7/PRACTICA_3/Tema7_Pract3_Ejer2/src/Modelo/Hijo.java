package Modelo;

/**
 *
 * @author 1gdaw09
 */
public class Hijo {

    private String nombreHijo;
    private String diaNace;
    private String mesNace;
    private String anioNace;

    public Hijo() {
    }

    public Hijo(String nombreHijo, String diaNace, String mesNace, String anioNace) {
        this.nombreHijo = nombreHijo;
        this.diaNace = diaNace;
        this.mesNace = mesNace;
        this.anioNace = anioNace;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public String getDiaNace() {
        return diaNace;
    }

    public void setDiaNace(String diaNace) {
        this.diaNace = diaNace;
    }

    public String getMesNace() {
        return mesNace;
    }

    public void setMesNace(String mesNace) {
        this.mesNace = mesNace;
    }

    public String getAnioNace() {
        return anioNace;
    }

    public void setAnioNace(String anioNace) {
        this.anioNace = anioNace;
    }
    


}
