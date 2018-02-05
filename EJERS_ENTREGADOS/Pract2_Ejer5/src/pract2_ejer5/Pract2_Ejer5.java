/*
 *  Mostrar al usuario el siguiente menu:

1.- Sumar dos numeros.
2.- Restar dos numeros
3.-Visualizar la tabla de multiplicar de un numero.
4.- Visualizar el cociente y el resto de una division.
5.-Salir del programa.

Elige una opcion:

Cuando tengamos el resultado de la operacion elegida, lo visualiza-
mos en pantalla y volveremos a mostrar el menu hasta que seleccione
la opcion de salir.

 */
package pract2_ejer5;

import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class Pract2_Ejer5 {
    
    public static int resultado = 0;

    public static void main(String[] args) {
        // INICIO MAIN
        
        String opcionMenu = "";
        int numero1 = 0;
        int numero2 = 0;
        
        mostrarMenu(opcionMenu, numero1, numero2);
        
    }
    
    private static void mostrarMenu(String opcionMenu, int numero1, int numero2) {
        do {            
        opcionMenu = JOptionPane.showInputDialog(null, "Elige una de las opciones: "
                                        + "\n-------------------------------------"
                                        + "\n1.- Sumar dos numeros.\n" 
                                        + "\n2.- Restar dos numeros\n" 
                                        + "\n3.- Visualizar la tabla de multiplicar de un numero.\n" 
                                        + "\n4.- Visualizar el cociente y el resto de una division.\n" 
                                        + "\n5.- Salir del programa.");
        
        comprobarAccionMenu(opcionMenu, numero1, numero2);
        } while (true);
    }

    private static void comprobarAccionMenu(String opcionMenu, int numero1, int numero2) {
        try {  
            if (opcionMenu.equalsIgnoreCase("1")) {
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero:"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero:"));

                realiza_1A_Operacion(numero1, numero2);

            }   else {
                    if (opcionMenu.equalsIgnoreCase("2")){
                        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero:"));
                        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero:"));

                        realiza_2A_Operacion(numero1, numero2);

                    }   else{
                            if (opcionMenu.equalsIgnoreCase("3")) {
                                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la tabla a visualizar:"));

                                realiza_3A_Operacion(numero1);
                                
                            }   else{
                                    if (opcionMenu.equalsIgnoreCase("4")) {
                                        
                                        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero:"));
                                        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero:"));
                                            if (numero1==0 || numero2==0) {
                                                JOptionPane.showMessageDialog(null, "Operacion no valida.\nEl valor 0 no es permitido.");
                                            } else {
                                                realiza_4A_Operacion(numero1, numero2);
                                            }
                                        
                                        
                                }   else{
                                        if (opcionMenu.equalsIgnoreCase("5")) {
                                            int pregunta = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?");
                                                
                                                if (pregunta==0) {
                                                    JOptionPane.showMessageDialog(null, "Hasta luego.");
                                                    System.exit(0);

                                                }   else {
                                                        mostrarMenu(opcionMenu, numero1, numero2);
                                                }

                                        }   else{
                                            JOptionPane.showMessageDialog(null, "No se corresponde a ninguna funcion");
                                        }
                                    }
                            }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inexperado. ¡¡¡¡ Recuerde !!!!."
                                                 +"\nLa opcion 5 permite salir del programa.");
        }
        finally{
            JOptionPane.showMessageDialog(null, "El programa sigue en ejecucion.");
        }
    }

    private static void realiza_1A_Operacion(int numero1, int numero2) {
        resultado = numero1+numero2;
        JOptionPane.showMessageDialog(null, "La suma de los dos numeros es " + resultado);
    }

    private static void realiza_2A_Operacion(int numero1, int numero2) {
        resultado = numero1-numero2;
        JOptionPane.showMessageDialog(null, "La resta de los dos numeros es " + resultado);
    }

    private static void realiza_3A_Operacion(int numero1) {
        
        String mostrarTabla ="La tabla de multiplicar del " +numero1 + " es:\n";
        
        for (int i = 1; i <= 10; i++) {
            resultado = numero1*i;

            mostrarTabla += numero1 + "*" + i + "=" + resultado+"\n";
        }
        JOptionPane.showMessageDialog(null, mostrarTabla);
    
    }

    private static void realiza_4A_Operacion(int numero1, int numero2) {
        resultado = numero1/numero2;
        int resto = numero1%numero2;
        JOptionPane.showMessageDialog(null, "El cociente de la division es " + resultado 
                                        + "\nEl resto de la division es " + resto);
    }

    
    
}
