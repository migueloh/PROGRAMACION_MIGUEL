package practica1_ejer2_versionbuena;

import Vistas.*;
import ModeloBD.*;
import ModeloUML.*;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Controladora {

    private static AcontecimientoUML acontecimientoUML;
    private static vMenu vM;
    private static vAcontecimiento vA;
    private static LocalTime horaTimeInicio;
    private static LocalTime horaTimeFin;

    public static void main(String[] args) {
        // INICIO MAIN
        vA = new vAcontecimiento();
        abrirVentanaInicio(vM = new vMenu());

    }

    public static void abrirVentanaInicio(vMenu vMenu) {
        vM.setVisible(true);
    }

    public static void abrirVentanaCrearAcontecimientos() {
        vA.setVisible(true);
    }

    public static void cerrarVentanas() {
        System.exit(0);
    }

    public static void reabrirVentanaInicio() {
        abrirVentanaInicio(vM);
    }

    public static void registrarAcontecimientos(String nombre, String lugar, Date fechaAcontecimiento, String horaInicio, String horaFin, String aforo) throws Exception {        
        
        convertirHoras(horaInicio, horaFin);
        
        acontecimientoUML = new AcontecimientoUML(nombre, lugar, fechaAcontecimiento, horaTimeInicio, horaTimeFin, Integer.parseInt(aforo));
        
        
        
        AcontecimientoBD.guardarAcontecimiento(acontecimientoUML);
    }




    public static void convertirHoras(String horaInicio, String horFin) {
        horaTimeInicio = LocalTime.parse(horaInicio);
    }

  


    public Date validarFecha() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date fechaSistema = new Date();

        return fechaSistema;
    }


}
