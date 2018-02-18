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

    public static String insertarTrabajador(String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil, String tipoContrato, String departamento, String fecha, String numeroEmpleado) {

        String insertOk = "El trabajador ha sido dado de alta.";

        Trabajador t = new Trabajador(numeroEmpleado, dni, nss, nombre, apellidos, direccion, telefono, sexo, estadoCivil, fecha);

        //GENERAR CLAVE AUTO PARA EL TRABAJADOR REGISTRADO
        Login l = new Login(nombre, dni);
        t.setLogin(l);

        try {

            for (int i = 0; i < listaDepartamentos.size(); i++) {
                if (departamento.equalsIgnoreCase(listaDepartamentos.get(i).getNombreDepartamento())) {
                    listaDepartamentos.get(i).getListaTrabajadoresDepartamento().add(t);
                }
            }

            for (int x = 0; x < listaContratos.size(); x++) {
                if (tipoContrato.equalsIgnoreCase(listaContratos.get(x).getTipoDeContrato())) {
                    listaContratos.get(x).getListaTrabajadoresContrato().add(t);
                }
            }
            listaTrabajadores.add(t);
            return insertOk;
        } catch (Exception e) {
            insertOk = "Error al dar de alta el Trabajador";
        }
        return insertOk;

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

        String tipoD = "";
        String tipoC = "";
        Boolean encontrado = true;

        for (int i = 0; i < listaDepartamentos.size() && encontrado == true; i++) {

            for (int z = 0; z < listaDepartamentos.get(i).getListaTrabajadoresDepartamento().size() && encontrado == true; z++) {

                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaDepartamentos.get(i).getListaTrabajadoresDepartamento().get(z).getDni())) {
                    tipoD = listaDepartamentos.get(i).getNombreDepartamento();
                    encontrado = false;
                }

            }

        }

        encontrado = true;

        for (int x = 0; x < listaContratos.size() && encontrado == true; x++) {

            for (int y = 0; y < listaContratos.get(x).getListaTrabajadoresContrato().size() && encontrado == true; y++) {

                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaContratos.get(x).getListaTrabajadoresContrato().get(y).getDni())) {
                    tipoC = listaContratos.get(x).getTipoDeContrato();
                    encontrado = false;
                }

            }
        }

        gP.rellenarCamposEncontrados(
                listaTrabajadores.get(posicionLista).getNss(),
                listaTrabajadores.get(posicionLista).getNombre(),
                listaTrabajadores.get(posicionLista).getApellidos(),
                listaTrabajadores.get(posicionLista).getDireccion(),
                listaTrabajadores.get(posicionLista).getTelefono(),
                listaTrabajadores.get(posicionLista).getSexo(),
                listaTrabajadores.get(posicionLista).getEstadoCivil(),
                tipoC,
                tipoD,
                listaTrabajadores.get(posicionLista).getFechaAlta(),
                listaTrabajadores.get(posicionLista).getNumeroEmpleado()
        );

    }

    public static void darDeBajaUsuario() {

        //LOCALIZAR DEPARTAMENTO DONDE TRABAJA EL TRABAJADOR PARA ELIMINARLO
        Boolean encontrado = true;

        for (int i = 0; i < listaDepartamentos.size() && encontrado == true; i++) {

            for (int z = 0; z < listaDepartamentos.get(i).getListaTrabajadoresDepartamento().size() && encontrado == true; z++) {

                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaDepartamentos.get(i).getListaTrabajadoresDepartamento().get(z).getDni())) {
                    listaDepartamentos.get(i).getListaTrabajadoresDepartamento().remove(z);
                    encontrado = false;
                }

            }

        }

        //LOCALIZAR CONTRATO DEL TRABAJADOR PARA ELIMINARLO
        encontrado = true;

        for (int x = 0; x < listaContratos.size() && encontrado == true; x++) {

            for (int y = 0; y < listaContratos.get(x).getListaTrabajadoresContrato().size() && encontrado == true; y++) {

                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaContratos.get(x).getListaTrabajadoresContrato().get(y).getDni())) {
                    listaContratos.get(x).getListaTrabajadoresContrato().remove(y);
                    encontrado = false;
                }

            }
        }

        listaTrabajadores.remove(posicionLista);

    }

    public static String buscarPorDepartamento(String tipoDepartamento) {
        String listadoPorDepart = "LISTADO POR DEPARTAMENTO"
                + "\n_______________________";

        //FOR POSICION DEPARTAMENTO
        for (int x = 0; x < listaDepartamentos.size(); x++) {

            //FOR RECORRER LISTA TRABAJADORES POR DEPARTAMENTO
            for (int i = 0; i < listaDepartamentos.get(x).getListaTrabajadoresDepartamento().size(); i++) {

                if (tipoDepartamento.equalsIgnoreCase(listaDepartamentos.get(x).getNombreDepartamento())) {
                    listadoPorDepart += listaDepartamentos.get(x).getNombreDepartamento()
                            + "\n-------------------------------------------------------"
                            + "\n" + "DNI: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getDni()
                            + "\n" + "NSS: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getNss()
                            + "\n" + "NOMBRE: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getNombre()
                            + "\n" + "APELLIDOS: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getApellidos()
                            + "\n" + "DIRECCION: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getDireccion()
                            + "\n" + "TELF: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getTelefono()
                            + "\n" + "SEXO: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getSexo()
                            + "\n" + "ESTADO CIVIL: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getEstadoCivil()
                            + "\n" + "FECHA ALTA: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getFechaAlta()
                            + "\n" + "Nº EMPLEADO: " + listaDepartamentos.get(x).getListaTrabajadoresDepartamento().get(i).getNumeroEmpleado()
                            + "\n-------------------------------------------------------";
                }

            }

        }
        return listadoPorDepart;
    }

    //GENERAR DEPARTAMENTOS
    public static void generarDepartamentos() {

        ArrayList<Trabajador> ldTrabajador = new ArrayList();
        ArrayList<Trabajador> ldTrabajador2 = new ArrayList();

        listaDepartamentos = new ArrayList();

        Departamento dept1 = new Departamento("Gestion Personal", ldTrabajador);
        Departamento dept2 = new Departamento("Servicio Tecnico", ldTrabajador2);

        listaDepartamentos.add(dept1);
        listaDepartamentos.add(dept2);

    }

    //GENERAR CONTRATOS
    public static void generarContratos() {

        ArrayList<Trabajador> lcTrabajador = new ArrayList();
        ArrayList<Trabajador> lcTrabajador2 = new ArrayList();

        listaContratos = new ArrayList();

        Contrato contr1 = new Contrato("Fijo", lcTrabajador);
        Contrato contr2 = new Contrato("Discontinuo", lcTrabajador2);

        listaContratos.add(contr1);
        listaContratos.add(contr2);

    }

    public static String actualizarDatosTrabajador(String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil, String tipoContrato, String departamento, String fecha, String numeroEmpleado) {

        //LOCALIZAR DEPARTAMENTO DONDE TRABAJA EL TRABAJADOR PARA ELIMINARLO
        Boolean encontrado = true;

        for (int i = 0; i < listaDepartamentos.size() && encontrado == true; i++) {

            for (int z = 0; z < listaDepartamentos.get(i).getListaTrabajadoresDepartamento().size() && encontrado == true; z++) {

                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaDepartamentos.get(i).getListaTrabajadoresDepartamento().get(z).getDni())) {
                    listaDepartamentos.get(i).getListaTrabajadoresDepartamento().remove(z);
                    encontrado = false;
                }

            }

        }

        //LOCALIZAR CONTRATO DEL TRABAJADOR PARA ELIMINARLO
        encontrado = true;

        for (int x = 0; x < listaContratos.size() && encontrado == true; x++) {

            for (int y = 0; y < listaContratos.get(x).getListaTrabajadoresContrato().size() && encontrado == true; y++) {

                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaContratos.get(x).getListaTrabajadoresContrato().get(y).getDni())) {
                    listaContratos.get(x).getListaTrabajadoresContrato().remove(y);
                    encontrado = false;
                }

            }
        }

        listaTrabajadores.get(posicionLista).setNss(nss);
        listaTrabajadores.get(posicionLista).setNombre(nombre);
        listaTrabajadores.get(posicionLista).setApellidos(apellidos);
        listaTrabajadores.get(posicionLista).setDireccion(direccion);
        listaTrabajadores.get(posicionLista).setTelefono(telefono);
        listaTrabajadores.get(posicionLista).setSexo(sexo);
        listaTrabajadores.get(posicionLista).setEstadoCivil(estadoCivil);

        //REALIZAR BUSQUEDA PARA ACTUALIZAR EL DEPARTAMENTO DEL TRABAJADOR
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            if (departamento.equalsIgnoreCase(listaDepartamentos.get(i).getNombreDepartamento())) {
                listaDepartamentos.get(i).getListaTrabajadoresDepartamento().add(listaTrabajadores.get(posicionLista));
            }
        }

        //REALIZAR BUSQUEDA PARA ACTUALIZAR EL CONTRATO DEL TRABAJADOR
        for (int x = 0; x < listaContratos.size(); x++) {
            if (tipoContrato.equalsIgnoreCase(listaContratos.get(x).getTipoDeContrato())) {
                listaContratos.get(x).getListaTrabajadoresContrato().add(listaTrabajadores.get(posicionLista));
            }
        }

        listaTrabajadores.get(posicionLista).setFechaAlta(fecha);
        listaTrabajadores.get(posicionLista).setNumeroEmpleado(numeroEmpleado);

        return "Datos del Trabajador actualizados correctamente";
    }

    public static String buscarPorContrato(String tipoContrato) {
        String listadoPorContrat = "LISTADO POR CONTRATO"
                + "\n_______________________";

        //FOR POSICION DEPARTAMENTO
        for (int x = 0; x < listaContratos.size(); x++) {

            //FOR RECORRER LISTA TRABAJADORES POR DEPARTAMENTO
            for (int i = 0; i < listaContratos.get(x).getListaTrabajadoresContrato().size(); i++) {

                if (tipoContrato.equalsIgnoreCase(listaContratos.get(x).getTipoDeContrato())) {
                    listadoPorContrat += listaContratos.get(x).getTipoDeContrato()
                            + "\n-------------------------------------------------------"
                            + "\n" + "DNI: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getDni()
                            + "\n" + "NSS: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getNss()
                            + "\n" + "NOMBRE: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getNombre()
                            + "\n" + "APELLIDOS: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getApellidos()
                            + "\n" + "DIRECCION: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getDireccion()
                            + "\n" + "TELF: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getTelefono()
                            + "\n" + "SEXO: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getSexo()
                            + "\n" + "ESTADO CIVIL: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getEstadoCivil()
                            + "\n" + "FECHA ALTA: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getFechaAlta()
                            + "\n" + "Nº EMPLEADO: " + listaContratos.get(x).getListaTrabajadoresContrato().get(i).getNumeroEmpleado()
                            + "\n-------------------------------------------------------";
                }
            }
        }
        return listadoPorContrat;
    }
}
