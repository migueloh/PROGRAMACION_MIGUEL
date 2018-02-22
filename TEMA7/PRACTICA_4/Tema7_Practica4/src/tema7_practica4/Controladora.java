package tema7_practica4;

//IMPORTS
import Vistas.*;
import Modelo.*;
import java.util.ArrayList;

/**
 * @author 1gdaw09 MIGUEL OLMO HERNANDO
 */
public class Controladora {

    //VARIABLES
    //PARA VENTANAS
    public static MenuInicio mI;
    public static InicioSesion iS;
    public static GestionPersonal gP;
    public static MostrarDatos mD;

    //PARA LAS DIFERENTES LISTAS
    public static int posicionLista;
    public static ArrayList<Trabajador> listaTrabajadores;
    public static ArrayList<Departamento> listaDepartamentos;
    public static ArrayList<Contrato> listaContratos;

    //INICIO MAIN
    public static void main(String[] args) {

        //INICIALIZAR CONFIGURACION PREVIA
        //INICIO LISTA TRABAJADORES
        listaTrabajadores = new ArrayList();

        //INICIALIZAR OBJETO PARA PODER ABRIR LA VENTANA DE INICIO DE SESION
        iS = new InicioSesion();

        //FUNCIONES PARA GENERAR USUARIO ADMINISTRADOR / DEPARTAMENTOS / CONTRATOS
        generarDepartamentos();
        generarContratos();
        generarUsuarioAdmin();

        //FUNCION QUE ME PERMITE ABRIR LA VENTANA DEL MENU DE INICIO
        abrirVentanaMenuInicio(mI = new MenuInicio());
    }

    //GESTION DE LAS VENTANAS
    //ABRIR VENTANA MENU INICIO
    public static void abrirVentanaMenuInicio(MenuInicio menuInicio) {
        mI.setVisible(true);
    }

    //ABRIR VENTANA INICIO DE SESION
    public static void abirVentanaInicioSesion() {
        iS.setVisible(true);
    }

    //ABRIR VENTANA GESTION DE PERSONAL
    public static void abrirVentanaGestionPersonal(String nombre) {
        gP = new GestionPersonal(nombre);
        gP.setVisible(true);

    }

    //ABRIR VENTANA DE MOSTRADO DE DATOS
    public static void abrirVentanaMostrarDatos(String lista) {
        mD = new MostrarDatos(lista);
        mD.setVisible(true);
    }

    //CERRAR VENTANAS
    public static void cerrarVentanas() {
        System.exit(0);
    }

    //REINICIALIZAR MENU
    public static void volverAlMenuInicio() {
        mI.setVisible(true);
    }

    //GESTION PREVIA DE LA APLICACION ACCESO ADMINISTRADOR / GENERAR DATOS
    //CREO UN USUARIO ADMINISTRADOR CLAVE / USUARIO = root / root
    public static void generarUsuarioAdmin() {
        Trabajador trabajadorAdmin = new Trabajador(new Login("root", "root"));
        listaTrabajadores.add(trabajadorAdmin);
    }

    //GENERAR DEPARTAMENTOS
    public static void generarDepartamentos() {

        //UN ARRAYLIST POR CADA DEPARTAMENTO
        ArrayList<Trabajador> ldTrabajador = new ArrayList();
        ArrayList<Trabajador> ldTrabajador2 = new ArrayList();

        //ARRAYLIST QUE INICIALIZO PARA GUARDAR LOS DEPARTAMENTOS
        listaDepartamentos = new ArrayList();

        //NOMBRES DE LOS DEPARTAMENTOS 
        Departamento dept1 = new Departamento("Gestion Personal", ldTrabajador);
        Departamento dept2 = new Departamento("Servicio Tecnico", ldTrabajador2);

        //GUARDO LOS DEPARTAMENTOS
        listaDepartamentos.add(dept1);
        listaDepartamentos.add(dept2);

    }

    //GENERAR CONTRATOS
    public static void generarContratos() {

        //UN ARRAYLIST POR CADA CONTRATO
        ArrayList<Trabajador> lcTrabajador = new ArrayList();
        ArrayList<Trabajador> lcTrabajador2 = new ArrayList();

        //ARRAYLIST QUE INICIALIZO PARA GUARDAR LOS CONTRATOS
        listaContratos = new ArrayList();

        //TIPOS DE LOS CONTRATOS
        Contrato contr1 = new Contrato("Fijo", lcTrabajador);
        Contrato contr2 = new Contrato("Discontinuo", lcTrabajador2);

        //GUARDO LOS CONTRATOS
        listaContratos.add(contr1);
        listaContratos.add(contr2);
    }

    //FUNCION QUE ME COMPRUEBA LOS DATOS INTRODUCIDOS EN LA VISTA COMO USUARIO / CLAVE
    public static int comprobarUsuario(String user, char[] password) {

        //VARIABLE PARA ALMACENAR LA CLAVE
        String constrasena = "";

        //EL CAMPO CLAVE ME RETORNA UN CHAR, ASI QUE LO RECORRO, ME QUEDO CON CADA POSICION LA CUAL CREA UNA PALABRA
        //ESTA PALABRA LA ALMENCENO EN LA VARIABLE SUPERIOR
        for (int x = 0; x < password.length; x++) {
            constrasena += password[x];
        }
        //TIPO DE ESTA, POR DEFECTO NO EXITE LA CLAVE INSERTADA
        int existe = 0;

        //CONDICION DE BUSQUEDA
        Boolean encontrado = true;

        //RECORRO EL ARRAYLIST DE LOS TRABAJADORES Y REALIZO LAS COMPROBACIONES USUARIO / CLAVE
        for (int i = 0; i < listaTrabajadores.size() && encontrado == true; i++) {
            if (user.equalsIgnoreCase(listaTrabajadores.get(i).getLogin().getUsuario())) {
                if (constrasena.equalsIgnoreCase(listaTrabajadores.get(i).getLogin().getContrasena())) {

                    //SI EXTITE LA CLAVE INSERTADA
                    existe = 1;

                    //CAMBIO EL VALOR A FALSE Y ROMPO LA CONDICION 
                    encontrado = false;
                }
            }
        }
        return existe;
    }

    //GESTION DE TRABAJADORES
    //DAR DE ALTA TRABAJADORES
    public static String insertarTrabajador(String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil, String tipoContrato, String departamento, String fecha, String numeroEmpleado) {

        //VARIABLE QUE ME PERMITIRA RETORNARLE A LA VISTA UN MENSAJE
        String insertOk = "El trabajador ha sido dado de alta.";

        //CREO E INICIALIZO EL OBJETO TRABAJADOR
        Trabajador t = new Trabajador(numeroEmpleado, dni, nss, nombre, apellidos, direccion, telefono, sexo, estadoCivil, fecha);

        //GENERAR CLAVE A PARTIR DEL NOMBRE Y DEL DNI PARA EL TRABAJADOR QUE SE DA DE ALTA
        Login l = new Login(nombre, dni);
        t.setLogin(l);

        try {
            //METO AL TRABAJADOR DADO DE ALTA EN UN DEPARTAMENTO
            for (int i = 0; i < listaDepartamentos.size(); i++) {
                if (departamento.equalsIgnoreCase(listaDepartamentos.get(i).getNombreDepartamento())) {
                    listaDepartamentos.get(i).getListaTrabajadoresDepartamento().add(t);
                }
            }

            //METO AL TRABAJADOR DADO DE ALTA CON SU TIPO DE CONTRATO
            for (int x = 0; x < listaContratos.size(); x++) {
                if (tipoContrato.equalsIgnoreCase(listaContratos.get(x).getTipoDeContrato())) {
                    listaContratos.get(x).getListaTrabajadoresContrato().add(t);
                }
            }
            //GUARDO EL TRABAJADOR
            listaTrabajadores.add(t);
            return insertOk;
        } catch (Exception e) {
            insertOk = "Error al dar de alta el Trabajador";
        }
        return insertOk;
    }

    //DAR DE BAJA TRABAJADORES
    public static void darDeBajaUsuario() {

        Boolean encontrado = true;
        //LOCALIZAR DEPARTAMENTO DONDE TRABAJA EL TRABAJADOR PARA ELIMINARLO
        for (int i = 0; i < listaDepartamentos.size() && encontrado == true; i++) {

            for (int z = 0; z < listaDepartamentos.get(i).getListaTrabajadoresDepartamento().size() && encontrado == true; z++) {
                //COMPROBACION MEDIANTE DNI
                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaDepartamentos.get(i).getListaTrabajadoresDepartamento().get(z).getDni())) {
                    //ELIMINO AL TRABAJADOR DE LA LISTA DE DEPARTAMENTOS
                    listaDepartamentos.get(i).getListaTrabajadoresDepartamento().remove(z);
                    encontrado = false;
                }
            }
        }

        //REINICIO LA CONDICION DE BUSQUEDA PARA ROMPER EL FOR
        encontrado = true;
        //LOCALIZAR CONTRATO DEL TRABAJADOR PARA ELIMINARLO
        for (int x = 0; x < listaContratos.size() && encontrado == true; x++) {

            for (int y = 0; y < listaContratos.get(x).getListaTrabajadoresContrato().size() && encontrado == true; y++) {
                //COMPROBACION MEDIANTE DNI
                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaContratos.get(x).getListaTrabajadoresContrato().get(y).getDni())) {
                    //ELIMINO AL TRABAJADOR DE LA LISTA DE CONTRATOS
                    listaContratos.get(x).getListaTrabajadoresContrato().remove(y);
                    encontrado = false;
                }
            }
        }
        //TRAS LAS ELIMINACIONES PREVIAS DE LOS DEPARTAMENTOS Y CONTRATOS, AHORA LO ELIMINO COMPLETAMENTE COMO TRABAJADOR
        listaTrabajadores.remove(posicionLista);
    }

    //MODIFICAR DATOS DEL TRABAJADOR
    public static String actualizarDatosTrabajador(String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil, String tipoContrato, String departamento, String fecha, String numeroEmpleado) {

        //LOCALIZAR DEPARTAMENTO DONDE TRABAJA EL TRABAJADOR PARA ELIMINARLO - PARTE 1
        Boolean encontrado = true;

        for (int i = 0; i < listaDepartamentos.size() && encontrado == true; i++) {

            for (int z = 0; z < listaDepartamentos.get(i).getListaTrabajadoresDepartamento().size() && encontrado == true; z++) {

                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaDepartamentos.get(i).getListaTrabajadoresDepartamento().get(z).getDni())) {
                    listaDepartamentos.get(i).getListaTrabajadoresDepartamento().remove(z);
                    encontrado = false;
                }
            }
        }

        //LOCALIZAR CONTRATO DEL TRABAJADOR PARA ELIMINARLO - PARTE A
        encontrado = true;

        for (int x = 0; x < listaContratos.size() && encontrado == true; x++) {

            for (int y = 0; y < listaContratos.get(x).getListaTrabajadoresContrato().size() && encontrado == true; y++) {

                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaContratos.get(x).getListaTrabajadoresContrato().get(y).getDni())) {
                    listaContratos.get(x).getListaTrabajadoresContrato().remove(y);
                    encontrado = false;
                }
            }
        }
        //MODIFICO LOS VALORES DEL TRABAJADOR POR LOS NUEVOS QUE DEJO CAMBIAR EN LA VISTA / NO DEJARE TODOS
        listaTrabajadores.get(posicionLista).setNss(nss);
        listaTrabajadores.get(posicionLista).setNombre(nombre);
        listaTrabajadores.get(posicionLista).setApellidos(apellidos);
        listaTrabajadores.get(posicionLista).setDireccion(direccion);
        listaTrabajadores.get(posicionLista).setTelefono(telefono);
        listaTrabajadores.get(posicionLista).setSexo(sexo);
        listaTrabajadores.get(posicionLista).setEstadoCivil(estadoCivil);

        //REALIZAR BUSQUEDA PARA ACTUALIZAR EL DEPARTAMENTO DEL TRABAJADOR - PARTE 2
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            if (departamento.equalsIgnoreCase(listaDepartamentos.get(i).getNombreDepartamento())) {
                listaDepartamentos.get(i).getListaTrabajadoresDepartamento().add(listaTrabajadores.get(posicionLista));
            }
        }

        //REALIZAR BUSQUEDA PARA ACTUALIZAR EL CONTRATO DEL TRABAJADOR - PARTE B
        for (int x = 0; x < listaContratos.size(); x++) {
            if (tipoContrato.equalsIgnoreCase(listaContratos.get(x).getTipoDeContrato())) {
                listaContratos.get(x).getListaTrabajadoresContrato().add(listaTrabajadores.get(posicionLista));
            }
        }

        //CONTINUO CON LA ACTUALIZACION DE LOS DATOS DEL TRABAJADOR
        listaTrabajadores.get(posicionLista).setFechaAlta(fecha);
        listaTrabajadores.get(posicionLista).setNumeroEmpleado(numeroEmpleado);

        //RETORNO UN MENSAJE A LA VISTA
        return "Datos del Trabajador actualizados correctamente.";
    }

    //REALIZAR BUSQUEDAS
    //BUSQUEDA DE TRABAJADOR POR DNI
    public static Integer buscarPorDni(String dni) {
        Boolean pararBusqueda = true;

        // LA POSICION LA INICIALIZO A -1 PARA QUE NO ME DE CONFLICO CON EL ARRAYLIST
        // LA INICIALIZO A 0 PARA QUE TAMPOCO ME COJA EL USUARIO ADMINISTRADOR GENERADO INICIALMENTE 
        posicionLista = -1;

        //FOR PARA RECORRER LA LISTA
        for (int x = 0; x < listaTrabajadores.size() && pararBusqueda == true; x++) {
            //COMPROBACION MEDIANTE DNI
            if (dni.equalsIgnoreCase(listaTrabajadores.get(x).getDni())) {
                //PARO LA BUSQUEDA SI EXISTE Y RECOJO ESA POSICION
                pararBusqueda = false;
                posicionLista = x;
            }
        }
        return posicionLista;
    }

    //FUNCIONES QUE MOSTRARAN INFORMACION
    //FUNCION QUE RETORNA EN LA VENTANA MOSTRAR DATOS TODOS LOS TRABAJADORES
    public static String mostrarListaTrabajadores() {
        //VARIABLE QUE ALMACENARA LOS TRABAJADORES
        String listaEmpleados = "Listado Completo de trabajadores:"
                + "\n-------------------------------------------------------";
        //RECORRO LA LISTA DE LOS TRABAJADORES, DEL OBJETO EXTRAIGO CADA DATO Y LO ALMACENO EN EL STRING SUPERIOR
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

    //FUNCION QUE SOLO ME MOSTRARA UN TRABAJADOR MEDIANTE LA BUSQUEDA POR DNI
    public static void mostrarTrabajador() {

        //VARIABLES QUE ME PERMITIRAN GUARDAR EL NOMBRE DE DEPARTAMENTO Y TIPO DE CONTRATO
        String tipoD = "";
        String tipoC = "";

        //VARIABLE QUE ME PERMITE PARAR LA BUSQUEDA SI LO ENCUENTRA
        Boolean encontrado = true;

        //RECORRO LISTA DE DEPARTAMENTOS
        for (int i = 0; i < listaDepartamentos.size() && encontrado == true; i++) {

            //RECORRO TAMBIEN LA LISTA DE TRABAJADORES POR DEPARTAMENTO
            for (int z = 0; z < listaDepartamentos.get(i).getListaTrabajadoresDepartamento().size() && encontrado == true; z++) {

                //COMPROBACION MEDIANTE EL DNI DE LA LISTA DE TRABAJADORES CON LA DE DEPARTAMENTO Y TRABAJADORES DEPARTAMENTO
                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaDepartamentos.get(i).getListaTrabajadoresDepartamento().get(z).getDni())) {
                    //ME QUEDO CON EL NOMBRE SI SE BUSCA Y ROMPO EL FOR
                    tipoD = listaDepartamentos.get(i).getNombreDepartamento();
                    encontrado = false;
                }
            }
        }
        //REINICIO LA VARIABLE A TRUE PARA USARLA DE NUEVO CON EL SIGUIENTE FOR
        encontrado = true;

        //RECORRO LA LISTA DE CONTRATOS
        for (int x = 0; x < listaContratos.size() && encontrado == true; x++) {

            //RECORRO LA LISTA DE CONTRATOS POR CONTRATO
            for (int y = 0; y < listaContratos.get(x).getListaTrabajadoresContrato().size() && encontrado == true; y++) {

                //COMPROBACION MEDIANTE EL DNI DE LA LISTA DE TRABAJADORES CON LA DE CONTRATOS Y TRABAJADORES CONTRATOS
                if (listaTrabajadores.get(posicionLista).getDni().equalsIgnoreCase(listaContratos.get(x).getListaTrabajadoresContrato().get(y).getDni())) {
                    //ME QUEDO CON TIPO SI SE BUSCA Y ROMPO EL FOR
                    tipoC = listaContratos.get(x).getTipoDeContrato();
                    encontrado = false;
                }
            }
        }
        //AHORA LE RETORNO A LA VISTA GESTION DE PERSONAL LOS DATOS PARA QUE SE MUESTREN EN LOS CAMPOS
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

    //BUSQUEDA MEDIANTE EL DEPARTAMENTO SELECCIONADO
    public static String buscarPorDepartamento(String tipoDepartamento) {
        String listadoPorDepart = "LISTADO POR DEPARTAMENTO"
                + "\n-------------------------------------------------------"
                + "\n";

        //FOR POSICION DEPARTAMENTO
        for (int x = 0; x < listaDepartamentos.size(); x++) {

            //FOR RECORRER LISTA TRABAJADORES POR DEPARTAMENTO
            for (int i = 0; i < listaDepartamentos.get(x).getListaTrabajadoresDepartamento().size(); i++) {

                if (tipoDepartamento.equalsIgnoreCase(listaDepartamentos.get(x).getNombreDepartamento())) {
                    listadoPorDepart += listaDepartamentos.get(x).getNombreDepartamento()
                            + "\n-------------------------------------------------------"
                            + "\n"
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

    //FUNCION PARA BUSCAR POR CONTRATO
    public static String buscarPorContrato(String tipoContrato) {
        String listadoPorContrat = "LISTADO POR CONTRATO"
                + "\n-------------------------------------------------------"
                + "\n";

        //FOR POSICION DEPARTAMENTO
        for (int x = 0; x < listaContratos.size(); x++) {

            //FOR RECORRER LISTA TRABAJADORES POR DEPARTAMENTO
            for (int i = 0; i < listaContratos.get(x).getListaTrabajadoresContrato().size(); i++) {

                if (tipoContrato.equalsIgnoreCase(listaContratos.get(x).getTipoDeContrato())) {
                    listadoPorContrat += listaContratos.get(x).getTipoDeContrato()
                            + "\n-------------------------------------------------------"
                            + "\n"
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
