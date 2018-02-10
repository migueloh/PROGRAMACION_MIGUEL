package tema7_practica4;

//IMPORTS
import Vistas.*;
import Modelo.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.ButtonModel;

/**
 * @author 1gdaw09
 */
public class Controladora {

    //VARIABLES DEDICADAS A OBEJTOS
    //VENTANAS
    public static MenuInicio mI;
    public static InicioSesion iS;
    public static GestionPersonal gP;

    public static ArrayList<Trabajador> listaTrabajadores;

    public static void main(String[] args) {

        // INICIO MAIN
        listaTrabajadores = new ArrayList();
        generarUsuarioAdmin();

        iS = new InicioSesion();
        
        abrirVentanaMenuInicio(mI = new MenuInicio());

    }

    //GESTION DE VENTANAS
    public static void abrirVentanaMenuInicio(MenuInicio menuInicio) {
        mI.setVisible(true);
    }

    public static void abirVentanaInicioSesion() {
        iS.setVisible(true);
    }

    public static void abrirVentanaGestionPersonal(String nombre) {
        gP = new GestionPersonal(nombre);
        gP.setVisible(true);
        
    }

    public static void cerrarVentanas() {
        System.exit(0);
    }

    public static void volverAlMenuInicio() {
        mI.setVisible(true);
    }

    public static void generarUsuarioAdmin() {
        Trabajador trabajadorAdmin = new Trabajador(new Login("root", "root"));
        listaTrabajadores.add(trabajadorAdmin);
    }

    public static int comprobarUsuario(String user, char[] password) {
        
        String constrasena = "";
        for (int x = 0; x < password.length; x++) {
            constrasena+=password[x];
        }

        int existe = 0;//no exite
        Boolean encontrado = true;
        for (int i = 0; i < listaTrabajadores.size() && encontrado == true; i++) {
            if (user.equalsIgnoreCase(listaTrabajadores.get(i).getLogin().getUsuario())) {
                if (constrasena.equalsIgnoreCase(listaTrabajadores.get(i).getLogin().getContrasena())) {
                        existe = 1; //si existe
                        encontrado = false;
                    }
            } 
        }
        return existe;
    }

    public static void insertarTrabajador(String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil, String tipoContrato, String departamento, String fecha, String numeroEmpleado) {
    
        Trabajador t = new Trabajador(dni, nss, nombre, apellidos, direccion, telefono, sexo, estadoCivil);
        
        t.setNumeroEmpleado(numeroEmpleado);
        
        Contrato c = new Contrato(tipoContrato, fecha);
        ArrayList <Contrato> listaContratos=new ArrayList();
        listaContratos.add(c);
        t.setListaContratos(listaContratos);
        
        Departamento d = new Departamento();
        d.setNombreDepartamento(departamento);
        t.setDepartamento(d);
        
        Login l = new Login (nombre,dni);
        t.setLogin(l);
        
        listaTrabajadores.add(t);
        
    }

    

}
