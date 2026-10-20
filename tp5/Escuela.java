import java.util.*;
import java.util.Scanner;
/**
 * La clase Escuela sirve de ejecutable para la relación de herencia
 * entre la superclase Persona y la subclase Alumno.
 * 
 * @author Chavez, Tobías Acdel. 
 * @version 1.0 - 02/10/2026
 */
public class Escuela
{
    /**
     * Se instancian 5 personas y 5 alumnos, guardandolos en dos arrays estáticos,
     * los datos para cada persona y alumnos son ingresados por teclado y almacenados en
     * los arrays a través de una estructura for. Una vez ingresados todos los datos, se 
     * compara el funcionamiento del método mostrar() para ambas clases.
     */
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        Persona[] personas = new Persona[5];
        Alumno[] alumnos = new Alumno[5];
        
        System.out.println("***REGISTRO DE PERSONAS***");
        for(i=0; i<5; i++){
            System.out.println("--PERSONA " + (i+1) + "--");
            System.out.println("Ingrese el DNI");
            int dniPer = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese el nombre");
            String nombrePer = teclado.nextLine();
            System.out.println("Ingrese el apellido");
            String apellidoPer = teclado.nextLine();
            
            System.out.println("Ingrese su año de nacimiento.");
            int anioNacimiento = teclado.nextInt();
            System.out.println("Ingrese el número de su mes de nacimiento.");
            int mesNacimiento = teclado.nextInt();
            System.out.println("Ingrese el número de su día de nacimiento.");
            int diaNacimiento = teclado.nextInt();
            
            Calendar fechaNacimientoPer = new GregorianCalendar(anioNacimiento, mesNacimiento - 1, diaNacimiento);
            personas[i] = new Persona(dniPer, nombrePer, apellidoPer, fechaNacimientoPer);
            
            System.out.println("Persona " + (i+1) + " ingresada correctamente. Presione ENTER para continuar.");
            teclado.nextLine();
            teclado.nextLine();
            System.out.print('\u000C');
        }
        
        System.out.println("***REGISTRO DE ALUMNOS***");
        for(i=0; i<5; i++){
            System.out.println("--ALUMNO " + (i+1) + "--");
            System.out.println("Ingrese el DNI");
            int dniAlum = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese el nombre");
            String nombreAlum = teclado.nextLine();
            System.out.println("Ingrese el apellido");
            String apellidoAlum = teclado.nextLine();
            System.out.println("Ingrese el número de libreta universitaria");
            int lu = teclado.nextInt();
            
            System.out.println("Ingrese su año de nacimiento.");
            int anioNacimiento2 = teclado.nextInt();
            System.out.println("Ingrese el número de su mes de nacimiento.");
            int mesNacimiento2 = teclado.nextInt();
            System.out.println("Ingrese el número de su día de nacimiento.");
            int diaNacimiento2 = teclado.nextInt();
            
            Calendar fechaNacimientoAlum = new GregorianCalendar(anioNacimiento2, mesNacimiento2 - 1, diaNacimiento2);
            alumnos[i] = new Alumno(lu, dniAlum, nombreAlum, apellidoAlum, fechaNacimientoAlum);
            
            System.out.println("Ingrese la primer nota del alumno.");
            alumnos[i].setNota1(teclado.nextDouble());
            System.out.println("Ingrese la segunda nota del alumno.");
            alumnos[i].setNota2(teclado.nextDouble());
            
            System.out.println("Alumno " + (i+1) + " ingresado correctamente. Presione ENTER para continuar.");
            teclado.nextLine();
            teclado.nextLine();
            System.out.print('\u000C');
        }
        
        System.out.println("***DIFERENCIA ENTRE LAS CLASES***");
        System.out.println("*MOSTRAR DE LA CLASE PERSONA*");
        for(i=0; i<5; i++){
            personas[i].mostrar();
        }
        
        System.out.println("\n*MOSTRAR DE LA CLASE ALUMNO*");
        for(i=0; i<5; i++){
            alumnos[i].mostrar();
        }
        teclado.close();
    }
}