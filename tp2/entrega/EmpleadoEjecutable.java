
/**
 * Clase ejecutable para instanciar y probar múltiples objetos Empleado
 * recibiendo sus datos por teclado desde la interfaz del sistema. 
 * 
 * @author Lourdes Gabriela Caceres 
 * @version 1.0 24/08/2026
 */
import java.util.Scanner;
public class EmpleadoEjecutable{
    public static void main(String args []){
    
        Scanner texto = new Scanner(System.in);
        
        System.out.println("Ingrese los datos del empleado:");
        System.out.print("Nombre: ");
        String nombre = texto.nextLine();
        System.out.print("\nApellido: ");
        String apellido = texto.nextLine();
        System.out.print("\nCUIL: ");
        long cuil = texto.nextLong();
        System.out.print("\nSueldo base: $");
        double sueldoBase = texto.nextDouble();
        System.out.print("\nAño de ingreso: ");
        int anioIng = texto.nextInt();
        
        // Instanciación del objeto Empleado
        Empleado empleado1 = new Empleado(cuil, apellido, nombre, sueldoBase, anioIng);
        
        empleado1.mostrar();
    }
}