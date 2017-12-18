package t6p1e4;

import Modelo.Persona;
import Excepciones.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T6p1e4 {

    public static void main(String[] args) {
        
            // Creación de tres objetos de tipo persona
            Persona[] arrayPersonas = new Persona[3];

            for(int x = 0; x < 3; x++)
            {
                    arrayPersonas[x] = crearObjeto();
            }

            buscarMayorEdad(arrayPersonas);
            buscarCiudad(arrayPersonas);
            buscarMayoresEdad(arrayPersonas);
            // Un único buscar
        
    }
    
    public static Persona crearObjeto(){
            String nombre = solicitarNombre();
            
            Date fechaNacimiento = solicitarFechaNacimiento();
           
            String direccion = solicitarDireccion();
           
            String codigoPostal = solicitarCodigoPostal();
            
            String ciudad = solicitarCiudad();
            
            Persona objetoPersona = new Persona(nombre,dNacimiento,mNacimiento,aNacimiento,direccion,codigoPostal,ciudad);
            
            return objetoPersona;
    }
    
    public static String solicitarNombre(){
        boolean error = true;
        String nombre="";
        do
        {
            try
            {
                nombre=javax.swing.JOptionPane.showInputDialog("Teclea el nombre de la persona: ");
                if (nombre.isEmpty())
                    throw new CampoObligatorio();
                // Expresión regular
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El nombre es un campo obligatorio");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el nombre \n" + e.getClass());
                error = true;
            }
        }
        while (error == true);
        return nombre;
    }
    
    public static Date solicitarFechaNacimiento(){
            int dNacimiento;
            int mNacimiento;
            int aNacimiento;
            
            Date fechaNacimiento=null;
            
            
            boolean error = false;
            do
            {
                do
                {
                    dNacimiento = solicitarDia();
                    mNacimiento = solicitarMes();
                    // Validar el dia en función del mes
                    error = validarDiaMes(dNacimiento, mNacimiento);
                }
                while (error == true);

                aNacimiento = solicitarAño();
                // Validar el día de un año bisiesto
                error = validarDiaAño(dNacimiento,mNacimiento,aNacimiento);
            }
            while (error == true);
            
            // Cuando los datos son correctos, creo la fecha
            try
            {
                String fecha = aNacimiento + "-" + mNacimiento + "-" + dNacimiento;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                fechaNacimiento = sdf.parse(fecha);
                System.out.println(fechaNacimiento);
            }
            catch(Exception e)
            {
                System.out.println(e.getClass());
            }
            return fechaNacimiento;
    }
    
    public static int solicitarDia(){
        boolean error = true;
        int dia=0;
        do
        {
            try
            {
                String d=javax.swing.JOptionPane.showInputDialog("Teclea día de nacimiento: ");
                if (d.isEmpty())
                    throw new CampoObligatorio();
                dia = Integer.parseInt(d);
                if (dia < 0 || dia > 31)
                    throw new DiaNoValido();
                // No puedo validar más porque no tengo el mes
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El día de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El día de nacimiento es un campo numérico");
                error = true;
            }
            catch(DiaNoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El día de nacimiento tecleado no es válido");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el dia de nacimiento \n" + e.getClass());
                error = true;
            }
        }
        while (error == true);
        return dia;
    }
    
    public static int solicitarMes(){
        boolean error = true;
        int mes=0;
        do
        {
            try
            {
                String m=javax.swing.JOptionPane.showInputDialog("Teclea el mes de nacimiento: ");
                if (m.isEmpty())
                    throw new CampoObligatorio();
                mes = Integer.parseInt(m);
                if (mes < 0 || mes > 12)
                    throw new MesNoValido();
                
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El mes de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El mes de nacimiento es un campo numérico");
                error = true;
            }
            catch(MesNoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El mes de nacimiento tecleado no es válido");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el mes \n" + e.getClass());
                error = true;
            }
        }
        while (error == true);
        return mes;
    }
    
    public static boolean validarDiaMes(int dia, int mes){
        int[] diasMeses = {31,29,31,30,31,30,31,31,30,31,30,31};
        //pongo 29 sin saber si el año es bisiesto o no
        try
        {
            if (dia > diasMeses[mes-1])
                throw new DiaNoValido();
            return false;
        }
        catch(DiaNoValido e){
            javax.swing.JOptionPane.showMessageDialog(null, " El dia tecleado no existe en el mes indicado");
            return true;
        }
        catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el dia del mes \n" + e.getClass());
                return true;
            }
    }
    
    public static int solicitarAño(){
        boolean error = true;
        int año=0;
        do
        {
            try
            {
                String a=javax.swing.JOptionPane.showInputDialog("Teclea el año de nacimiento: ");
                if (a.isEmpty())
                    throw new CampoObligatorio();
                año = Integer.parseInt(a);
                // Calendar es un clase que contiene información sobre la fecha del sistema
                Calendar c = Calendar.getInstance();
                if (año < 1900 || año > c.get(Calendar.YEAR))
                    throw new AñoNoValido();
                
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El año de nacimiento es un campo obligatorio");
                error = true;
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "El año de nacimiento es un campo numérico");
                error = true;
            }
            catch(AñoNoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El año de nacimiento tecleado no es válido");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el año \n" + e.getClass());
                error = true;
            }
        }
        while (error == true);
        return año;
    }
    
    public static boolean validarDiaAño(int dia, int mes,int año){
        try
        {
            if (mes == 2 && dia == 29)
            {
                /*if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
                    ("El año es bisiesto");
                 else
                    ("El año no es bisiesto");*/
                java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
                if (calendar.isLeapYear(año)== false)
                    // El año no es bisiesto
                    throw new DiaNoValido();
            }
            return false;
        }
        catch(DiaNoValido e){
            javax.swing.JOptionPane.showMessageDialog(null, " El dia tecleado no existe en el año indicado");
            return true;
        }
        catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el dia del año \n" + e.getClass());
                return true;
        }
    }
    
    public static String solicitarDireccion(){
        boolean error = true;
        String direccion="";
        do
        {
            try
            {
                direccion=javax.swing.JOptionPane.showInputDialog("Teclea la direccion de la persona: ");
                if (direccion.isEmpty())
                    throw new CampoObligatorio();
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El direccion es un campo obligatorio");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con la dirección \n" + e.getClass());
                error = true;
            }
        }
        while (error == true);
        return direccion;
    }
    
    public static String solicitarCodigoPostal(){
        boolean error = true;
        String codigo="";
        do
        {
            try
            {
                codigo=javax.swing.JOptionPane.showInputDialog("Teclea el código postal: ");
                if (codigo.isEmpty())
                    throw new CampoObligatorio();
                
                Pattern patron = Pattern.compile("^[0-9]{5}");
                Matcher m = patron.matcher(codigo);
                if (!m.matches())
                     throw new CodigoNoValido();
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El código es un campo obligatorio");
                error = true;
            }
            catch(CodigoNoValido e){
                javax.swing.JOptionPane.showMessageDialog(null, "El código no es correcto ya que tiene que estar formado por cinco numeros");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con el código \n" + e.getClass());
                error = true;
            }
        }
        while (error == true);
        return codigo;
    }
    
    public static String solicitarCiudad(){
        boolean error = true;
        String ciudad="";
        do
        {
            try
            {
                ciudad=javax.swing.JOptionPane.showInputDialog("Teclea la ciudad: ");
                if (ciudad.isEmpty())
                    throw new CampoObligatorio();
                error = false;
            }
            catch(CampoObligatorio e){
                javax.swing.JOptionPane.showMessageDialog(null, "El ciudad es un campo obligatorio");
                error = true;
            }
            catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null, "Problemas con la ciudad \n" + e.getClass());
                error = true;
            }
        }
        while (error == true);
        return ciudad;
    }
    
    public static void buscarMayorEdad(Persona[] arrayPersonas){
        int mayorEdad = 0;
        int posicionPersonaMayorEdad = 0;
        for(int x = 0; x < arrayPersonas.length; x++)
        {
            int edad = arrayPersonas[x].calcularEdad();
            if ( edad > mayorEdad)
            {
                posicionPersonaMayorEdad = x;
                mayorEdad = edad;
            }
        }
        
        javax.swing.JOptionPane.showMessageDialog(null, "La persona de mayor edad es: " + arrayPersonas[posicionPersonaMayorEdad].getNombre() + " y tiene "+ mayorEdad + " años");
    }
    
    public static void buscarCiudad(Persona[] arrayPersonas){
        String nombres="";
        
        for(int x = 0; x < arrayPersonas.length; x++)
        {
            if (arrayPersonas[x].getCiudad().compareToIgnoreCase("Elche") == 0)
            {
                nombres += arrayPersonas[x].getNombre() + " ";
            }
        }
        
        if (nombres.compareTo("")== 0)
            javax.swing.JOptionPane.showMessageDialog(null, "No hay personas de Elche");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "En Elche viven: "+nombres);
    }
    
    public static void buscarMayoresEdad(Persona[] arrayPersonas)
    {
        String nombres="";
        final int MAYORIAEDAD = 18;
        for(int x = 0; x < arrayPersonas.length; x++)
        {
            if (arrayPersonas[x].calcularEdad() >= MAYORIAEDAD)
            {
                nombres += arrayPersonas[x].getNombre() + " ";
            }
        }
        
        if (nombres.compareTo("")== 0)
            javax.swing.JOptionPane.showMessageDialog(null, "No hay personas mayores de edad");
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Las personas mayores de edad son " + nombres);
    }
    
}
