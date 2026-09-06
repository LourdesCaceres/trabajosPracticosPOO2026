import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Clase ejecutable Empresa para instanciar objetos de la clase Empleado,
 * y probar sus metodos, como por ejemplo emisión de permisos de salida por aniversario.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 03/09/2026
 */
public class Empresa {
    public static void main(String args []){

        Scanner texto = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();
        Empleado empleado1;
        
        System.out.print("\n\n==================== EMPRESA - Informacion del Empleado ====================");
        System.out.print("\nNombre: ");
        String nombre = texto.nextLine();
        System.out.print("\nApellido: ");
        String apellido = texto.nextLine();
        System.out.print("\nCUIL: ");
        long cuil = texto.nextLong();
        System.out.print("\nSueldo base: $");
        double sueldoBase = texto.nextDouble();
        
        // Menú de selección de constructor
        System.out.println("\n--- Elegir el ingreso de fecha de ingreso - Seleccione una opción (1 o 2): ");
        System.out.println("1. Ingresar solo el año de ingreso");
        System.out.println("2. Ingresar fecha completa [Día, Mes, Año]");
        int opcion = texto.nextInt();
        
        if (opcion == 1) {
            System.out.print("Año de ingreso: ");
            int anioIng = texto.nextInt();
            
            // Instanciación mediante Constructor 1 (Protocolo original con int)
            empleado1 = new Empleado(cuil, apellido, nombre, sueldoBase, anioIng);
        } else {
            System.out.print("Ingrese el día de ingreso (1-31): ");
            int dia = texto.nextInt();
            System.out.print("Ingrese el mes de ingreso (1-12): ");
            int mes = texto.nextInt();
            System.out.print("Ingrese el año de ingreso (AAAA): ");
            int anio = texto.nextInt();

            // Construcción del objeto Calendar con ajuste de base cero (mes - 1)
            Calendar fechaIng = new GregorianCalendar(anio, mes - 1, dia);
            
            // Instanciación mediante Constructor 2 (Con objeto Calendar)
            empleado1 = new Empleado(cuil, apellido, nombre, sueldoBase, fechaIng);
        }
                
        empleado1.mostrar();
        
        System.out.print("\n\n==================== EMPRESA - Permiso de salida ====================");
        
        // Si se utilizó el Constructor 1, se solicitan el día y mes para completar la fecha
        if (opcion == 1) {
            System.out.print("\n[AVISO] Para consultar el permiso de salida se requiere la fecha completa.");
            System.out.print("\nIngrese el día de ingreso (1-31): ");
            int dia = texto.nextInt();
            System.out.print("\nIngrese el mes de ingreso (1-12): ");
            int mes = texto.nextInt();

            // Se re-instancia el objeto utilizando el Constructor 2 con la fecha precisa
            Calendar fechaCompleta = new GregorianCalendar(empleado1.getAnioIngreso(), mes - 1, dia);
            empleado1 = new Empleado(cuil, apellido, nombre, sueldoBase, fechaCompleta);
        }
        
        //Si ya se encuentra registrada la fecha completa
        if (empleado1.esAniversario()) {
            System.out.print("\n\t - PERMISO DE SALIDA OTORGADO");
            System.out.println("Empleado: " + empleado1.apeYNom());
            System.out.println("Motivo: Cumple aniversario de ingreso en la fecha.");
            System.out.println("Beneficio: Autorizado a retirarse 1 hora más temprano.");
        } else {
            System.out.print("\n\nPara el empleado: "+empleado1.apeYNom()+
                            "\nHoy no corresponde el beneficio de retiro anticipado por aniversario.");
        }
        
        texto.close();
    }
}