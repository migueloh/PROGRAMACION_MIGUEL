package practica1_ejer2_versionbuena;

import Vistas.*;
import ModeloBD.*;
import ModeloUML.*;
import Excepciones.*;
import java.util.Date;
import java.time.LocalTime;
import java.util.Calendar;

public class Controladora {

    private static AcontecimientoUML acontecimientoUML;
    private static vMenu vM;
    private static vAcontecimiento vA;

    //Variables en las que guardo las conversiones de la fecha y hora
    private static LocalTime horaTimeInicio;
    private static LocalTime horaTimeFin;
    private static Date fechaAcon;

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
        validarFecha(fechaAcontecimiento);

        acontecimientoUML = new AcontecimientoUML(nombre, lugar, fechaAcon, horaTimeInicio, horaTimeFin, Integer.parseInt(aforo));

        AcontecimientoBD.guardarAcontecimiento(acontecimientoUML);

    }

    public static void convertirHoras(String horaInicio, String horaFin) {
        horaTimeInicio = LocalTime.parse(horaInicio);
        horaTimeFin = LocalTime.parse(horaFin);
    }

    public static void validarFecha(Date fechaAcontecimiento) throws Exception {

        Date fechaActual = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaActual);

        if (fechaAcontecimiento.before(fechaActual)) {
            throw new ProblemasFecha("La fecha ha de ser mayor que la actual");
        } else{
            fechaAcon = fechaAcontecimiento;
        }
    }

    public static void pedirBorrarAcontecimiento(String nombreAcon) throws Exception {
        AcontecimientoBD.ejecutarBorrado(acontecimientoUML);
    }

    public static void pedirActualizarAcontecimiento(Date fechaAcontecimiento, String horaInicio, String horaFin) throws Exception {
        horaTimeInicio = LocalTime.parse(horaInicio);
        horaTimeFin = LocalTime.parse(horaFin);

        acontecimientoUML.setFechaAcontecimiento(fechaAcontecimiento);
        acontecimientoUML.setHoraInicio(horaTimeInicio);
        acontecimientoUML.setHoraFin(horaTimeFin);

        AcontecimientoBD.ejecutarModificacion(acontecimientoUML);

    }

    public static void abrirVentanaPersona() {

    }

}
