package Excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10 MIGUEL OLMO HERNANDO
 */
public class DatoNoValido extends Exception {

    private int numeroExcepcion;
    private String mensajeConLaExcepcion;

    public int getNumeroExcepcion() {
        return numeroExcepcion;
    }

    public void setNumeroExcepcion(int numeroExcepcion) {
        this.numeroExcepcion = numeroExcepcion;
    }

    public String getMensajeConLaExcepcion() {
        return mensajeConLaExcepcion;
    }

    public void setMensajeConLaExcepcion(String mensajeConLaExcepcion) {
        this.mensajeConLaExcepcion = mensajeConLaExcepcion;
    }

    // FUNCIONES DE LA CLASE
    public String SwitchMensajesErrores() {

        switch (numeroExcepcion) {
            case 1:
                mensajeConLaExcepcion = "Todos los campos son Obglque se requieren son obligatorios."
                                        + "\n.";
                break;
            case 2:
                mensajeConLaExcepcion = "";
                break;
            case 3:
                mensajeConLaExcepcion = "";
                break;
            case 4:
                mensajeConLaExcepcion = "";
                break;
            case 5:
                mensajeConLaExcepcion = "";
                break;
            case 6:
                mensajeConLaExcepcion = "";
                break;

            default:
                mensajeConLaExcepcion = "";
                break;         
        }
        return mensajeConLaExcepcion;
    }


}
