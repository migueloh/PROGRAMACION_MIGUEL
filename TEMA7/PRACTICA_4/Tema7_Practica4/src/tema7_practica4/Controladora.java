package tema7_practica4;

//IMPORTS
import Vistas.*;
import Modelo.*;
import java.util.ArrayList;

/**
 * @author 1gdaw09
 */
public class Controladora {

    //VARIABLES DEDICADAS A OBEJTOS
    //VENTANAS
    public static MenuInicio mI;
    public static InicioSesion iS;
    public static GestionPersonal gP;
    public static MostrarDatos mD;

    public static int posicionLista;

    public static ArrayList<Trabajador> listaTrabajadores;
    public static ArrayList<Departamento> listaDepartamentos;
    public static ArrayList<Contrato> listaContratos;

    public static void main(String[] args) {

        // INICIO MAIN
        //INICIALIZAR CONFIGURACION PREVIA
        listaTrabajadores = new ArrayList();

        generarDepartamentos();
        generarContratos();
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
            constrasena += password[x];
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

        Trabajador t = new Trabajador(numeroEmpleado, dni, nss, nombre, apellidos, direccion, telefono, sexo, estadoCivil, fecha);

        //GENERAR CLAVE AUTO PARA EL TRABAJADOR REGISTRADO
        Login l = new Login(nombre, dni);
        t.setLogin(l);

        for (int i = 0; i < listaDepartamentos.size(); i++) {
            if (departamento.equalsIgnoreCase(listaDepartamentos.get(i).getNombreDepartamento())) {
                listaDepartamentos.get(i).getListaTrabajadoresDepartamento().add(t);
            } 
        }
        
        for (int x = 0 ; x < listaContratos.size(); x++){
            if(tipoContrato.equalsIgnoreCase(listaContratos.get(x).getTipoDeContrato())){
                listaContratos.get(x).getListaTrabajadoresContrato().add(t);
            }
                
        }

        listaTrabajadores.add(t);

    }

    public static String mostrarListaTrabajadores() {
        String listaEmpleados = "Listado Completo de trabajadores";
        for (int x = 0; x < listaTrabajadores.size(); x++) {
            listaEmpleados += "\n" + "DNI: " + listaTrabajadores.get(x).getDni()
                    + "\n" + "NSS: " + listaTrabajadores.get(x).getNss()
                    + "\n" + "NOMBRE: " + listaTrabajadores.get(x).getNombre()
                    + "\n" + "APELLIDOS: " + listaTrabajadores.get(x).getApellidos()
                    + "\n" + "DIRECCION: " + listaTrabajadores.get(x).getDireccion()
                    + "\n" + "TELF: " + listaTrabajadores.get(x).getTelefono()
                    + "\n" + "SEXO: " + listaTrabajadores.get(x).getSexo()
                    + "\n" + "ESTADO CIVIL: " + listaTrabajadores.get(x).getEstadoCivil()
                    + "\n" + "FECHA ALTA: " + listaTrabajadores.get(x).getFechaAlta()
                    + "\n" + "Nº EMPLEADO: " + listaTrabajadores.get(x).getNumeroEmpleado()
                    + "\n-------------------------------------------------------";

        }

        return listaEmpleados;
    }

    public static void abrirVentanaMostrarDatos(String lista) {
        mD = new MostrarDatos(lista);
        mD.setVisible(true);
    }

    public static Integer buscarPorDni(String dni) {
        Boolean pararBusqueda = true;

        // La posicion la inicializo a -1 para que me de conflicto con el ArrayList y tampoco
        // la inicializo a 0 para que no me coja el usuario root 
        posicionLista = -1;
        for (int x = 0; x < listaTrabajadores.size() && pararBusqueda == true; x++) {

            if (dni.equalsIgnoreCase(listaTrabajadores.get(x).getDni())) {
                pararBusqueda = false;
                posicionLista = x;
            }

        }
        return posicionLista;
    }

    public static void mostrarTrabajador() {

        gP.rellenarCamposEncontrados(listaTrabajadores.get(posicionLista).getNss(),
                listaTrabajadores.get(posicionLista).getNombre());

    }

    public static String darDeBajaUsuario() {
        String mensaje;
        int cantidadUsuario = listaTrabajadores.size();

        listaTrabajadores.remove(posicionLista);

        if (cantidadUsuario > listaTrabajadores.size()) {
            mensaje = "No";
        } else {
            mensaje = "Eliminado con Exito";
        }

        return mensaje;
    }

    /*public static String buscarPorDepartamento(String tipoDepartamento) {
        String listadoPorDepart = "listadoPorDepart";

        for (int x = 0; x < listaTrabajadores.size(); x++) {

            if (tipoDepartamento.equalsIgnoreCase(listaDepartamentos.get(x).getNombreDepartamento())) {
                listadoPorDepart += "\n" + "DNI: " + listaTrabajadores.get(x).getDni()
                        + "\n" + "NSS: " + listaTrabajadores.get(x).getNss()
                        + "\n" + "NOMBRE: " + listaTrabajadores.get(x).getNombre()
                        + "\n" + "APELLIDOS: " + listaTrabajadores.get(x).getApellidos()
                        + "\n" + "DIRECCION: " + listaTrabajadores.get(x).getDireccion()
                        + "\n" + "TELF: " + listaTrabajadores.get(x).getTelefono()
                        + "\n" + "SEXO: " + listaTrabajadores.get(x).getSexo()
                        + "\n" + "ESTADO CIVIL: " + listaTrabajadores.get(x).getEstadoCivil()
                        + "\n" + "TIPO CONTRATO: " + listaTrabajadores.get(x).getTipoDeContrato()
                        + "\n" + "NOMBRE DEPART: " + listaTrabajadores.get(x).getNombreDepartamento()
                        + "\n" + "FECHA ALTA: " + listaTrabajadores.get(x).getFechaAlta()
                        + "\n" + "Nº EMPLEADO: " + listaTrabajadores.get(x).getNumeroEmpleado()
                        + "\n-------------------------------------------------------";
            }

        }
        return listadoPorDepart;
    }*/

    //GENERAR DEPARTAMENTOS
    public static void generarDepartamentos() {

        listaDepartamentos = new ArrayList();

        Departamento dept1 = new Departamento("Gestion Personal");
        Departamento dept2 = new Departamento("Servicio Tecnico");

        listaDepartamentos.add(dept1);
        listaDepartamentos.add(dept2);

    }

    //GENERAR CONTRATOS
    public static void generarContratos() {

        listaContratos = new ArrayList();

        Contrato contr1 = new Contrato("Fijo");
        Contrato contr2 = new Contrato("Discontinuo");

        listaContratos.add(contr1);
        listaContratos.add(contr2);

        /*
        listaContratos.get(0).getListaTrabajadoresContrato().add(new Trabajador("10"));
        
        System.out.println(listaContratos.get(0).getListaTrabajadoresContrato().get(0).getNumeroEmpleado());
         */
    }

}
