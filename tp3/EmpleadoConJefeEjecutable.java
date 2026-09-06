import java.util.Scanner;
import java.util.*;
/**
 * Clase ejecutable de la clase EmpleadoConJefe.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 06/09/2026
 */
public class EmpleadoConJefeEjecutable
{
    /**
     * Método Main().
     * Pide datos al usuario mediante scanner e instancia 2 objetos, uno para
     * el caso en que el empleado tiene jefe, y otro para cuando no lo tiene.
     * En el segundo se preguntará si desea ingresar la fecha completa de ingreso
     * o solo el año para probar los 3 constructores.
     */
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("***DATOS DEL EMPLEADO***");
        System.out.println("Ingrese el cuil del empleado.");
        long cuil1 = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Ingrese el nombre del empleado.");
        String nombre1 = teclado.nextLine();
        System.out.println("Ingrese el apellido del empleado.");
        String apellido1 = teclado.nextLine();
        System.out.println("Ingrese el importe del sueldo básico.");
        double sueldo1 = teclado.nextDouble();
        
        System.out.print('\u000C');
        System.out.println("\n***FECHA DE INGRESO***");
        System.out.println("Ingrese el año.");
        int anio1 = teclado.nextInt();
        System.out.println("Ingrese el número del mes.");
        int mes1 = teclado.nextInt();
        System.out.println("Ingrese el día.");
        int dia1 = teclado.nextInt();
        
        Calendar fecha1 = new GregorianCalendar(anio1, mes1 - 1, dia1);
        
        System.out.print('\u000C');
        System.out.println("***DATOS DEL JEFE***");
        System.out.println("Ingrese el cuil del jefe.");
        long cuilJefe = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Ingrese el nombre del jefe.");
        String nombreJefe = teclado.nextLine();
        System.out.println("Ingrese el apellido del jefe.");
        String apellidoJefe = teclado.nextLine();
        System.out.println("Ingrese el importe del sueldo básico.");
        double sueldoJefe = teclado.nextDouble();
        
        System.out.println("¿Desea ingresar la fecha completa de ingreso o solo el año?");
        System.out.println("1-Fecha");
        System.out.println("2-Año");
        
        int seleccion1 = teclado.nextInt();
        
        if(seleccion1 == 1){
            System.out.print('\u000C');
            System.out.println("\n***FECHA DE INGRESO***");
            System.out.println("Ingrese el año.");
            int anioJefe = teclado.nextInt();
            System.out.println("Ingrese el número del mes.");
            int mesJefe = teclado.nextInt();
            System.out.println("Ingrese el día.");
            int diaJefe = teclado.nextInt();
        
            Calendar fechaJefe = new GregorianCalendar(anioJefe, mesJefe - 1, diaJefe);
        
            EmpleadoConJefe jefe = new EmpleadoConJefe(cuilJefe, apellidoJefe, nombreJefe, sueldoJefe, fechaJefe);
            EmpleadoConJefe empleado1 = new EmpleadoConJefe(cuil1, apellido1, nombre1, sueldo1, fecha1, jefe);
        
            System.out.print('\u000C');
            empleado1.mostrarLinea();
            System.out.print("\n");
            empleado1.mostrarPantalla();
        }else if (seleccion1 == 2){
            System.out.println("Ingrese el año.");
            int anioJefe = teclado.nextInt();
            
            EmpleadoConJefe jefe = new EmpleadoConJefe(cuilJefe, apellidoJefe, nombreJefe, sueldoJefe, anioJefe);
            EmpleadoConJefe empleado1 = new EmpleadoConJefe(cuil1, apellido1, nombre1, sueldo1, fecha1, jefe);
        
            System.out.print('\u000C');
            empleado1.mostrarLinea();
            System.out.print("\n");
            empleado1.mostrarPantalla();
        }
        
        System.out.print("Presione enter para continuar.");
        teclado.nextLine();
        teclado.nextLine();
        System.out.print('\u000C');
        System.out.println("***DATOS DEL SEGUNDO EMPLEADO***");
        System.out.println("Ingrese el cuil del empleado.");
        long cuil2 = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Ingrese el nombre del empleado.");
        String nombre2 = teclado.nextLine();
        System.out.println("Ingrese el apellido del empleado.");
        String apellido2 = teclado.nextLine();
        System.out.println("Ingrese el importe del sueldo básico.");
        double sueldo2 = teclado.nextDouble();
        
        System.out.println("¿Desea ingresar la fecha completa de ingreso o solo el año?");
        System.out.println("1-Fecha");
        System.out.println("2-Año");
        
        int seleccion2 = teclado.nextInt();
        
        if(seleccion2 == 1){
            System.out.print('\u000C');
            System.out.println("\n***FECHA DE INGRESO***");
            System.out.println("Ingrese el año.");
            int anio2 = teclado.nextInt();
            System.out.println("Ingrese el número del mes.");
            int mes2 = teclado.nextInt();
            System.out.println("Ingrese el día.");
            int dia2 = teclado.nextInt();
        
            Calendar fecha2 = new GregorianCalendar(anio2, mes2 - 1, dia2);
        
            EmpleadoConJefe empleado2 = new EmpleadoConJefe(cuil2, apellido2, nombre2, sueldo2, fecha2);
        
            System.out.print('\u000C');
            empleado2.mostrarLinea();
            System.out.print("\n");
            empleado2.mostrarPantalla();
        }else if (seleccion2 == 2){
            System.out.println("Ingrese el año.");
            int anio2 = teclado.nextInt();
            
            EmpleadoConJefe empleado2 = new EmpleadoConJefe(cuil2, apellido2, nombre2, sueldo2, anio2);
            
            System.out.print('\u000C');
            empleado2.mostrarLinea();
            System.out.print("\n");
            empleado2.mostrarPantalla();
        }
    }
}