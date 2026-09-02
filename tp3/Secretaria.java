import java.util.Scanner;
/**
 * Clase ejecutable para instanciar objetos de la Clase Escuela y Docente y
 * probar los distintos métodos.
 * El ingreso de datos se da a travez de la clase Scanner
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 02/09/2026
 */
public class Secretaria {
    public static void main (String args []){

        Scanner texto = new Scanner(System.in);

        System.out.print("\n====================== Registrar ESCUELA en el Sistema ======================");
        System.out.print("\n- Nombre (completo) de la escuela: ");
        String nombreESC = texto.nextLine();
        System.out.print("\n- Direccion del Establecimiento: ");
        String direccion = texto.nextLine();
        System.out.print("\n- Nombre (completo) del director: ");
        String nombreDir = texto.nextLine();
        
        //nueva instancia Escuela
        Escuela escuela1 = new Escuela(nombreESC, direccion, nombreDir);
        
        System.out.print("\n====================== Registrar DOCENTE en el Sistema ======================");
        System.out.print("\n- Nombre (completo) del docente: ");
        String nombreDOC = texto.nextLine();
        System.out.print("\n- Ingrese el grado a cargo (ej. 4to grado): ");
        String grado = texto.nextLine();
        System.out.print("\n- Ingrese el monto del sueldo basico  $ ");
        double sueldoBas = texto.nextDouble();
        System.out.print("\n- Ingrese el monto del sueldo basico  $ ");
        double asigFam = texto.nextDouble();

        //nueva instancia Docente
        Docente docente1 = new Docente(nombreDOC, grado, sueldoBas, asigFam);

        escuela1.imprimirRecibo(docente1);

        texto.close();
    }    
}
