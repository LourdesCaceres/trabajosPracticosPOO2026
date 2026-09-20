import java.util.Scanner;
import java.util.HashMap;
/**
 * Clase ejecutable para la clase Curso, busca probar todos los métodos de la clase
 * y además usar los dos constructores. Se instancian dos cursos y múltiples alumnos. 
 * 
 * @author Chavez, Tobías Acdel. 
 * @version 1.0 - 20/09/2026
 */
public class Carrera
{       
    /**
     * Al ejecutar el programa se pedirá el nombre para un nuevo curso, se instanciará
     * el objeto de clase Curso y luego se pedirá que se ingrese al menos un alumno para inscribirlo.
     * Mediante un do-while, el usuario ingresa cuántos alumnos desea y todos son inscriptos.
     * Se muestra la lista de alumnos indicando la cantidad de inscriptos. Se prueba dar de baja un alumno 
     * y se infroma que fue eliminado, luego se vuelve a mostrar la lista actualizada.
     * Se prueba la busqueda de alumno y se muestra los datos del alumno que se busca. Se muestra el promedio
     * de un alumno que el usuario desee.
     * Finalmente se instancia un nuevo curso para probar los métodos restantes, como la otra forma de
     * estaInscripto() y el segundo constructor de la clase.
     */
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       int seleccion = 0;
       
       System.out.println("***NUEVO CURSO***");
       System.out.println("Ingrese el nombre del nuevo curso");
       teclado.nextLine();
       String nomCurso = teclado.nextLine();
       
       Curso nuevoCurso = new Curso(nomCurso);
       
       System.out.println("/nCurso " + nomCurso + "creado!");
       System.out.println("***INGRESO DE ALUMNOS***");
       do{
           System.out.println("***NUEVO ALUMNO***");
           System.out.println("Ingrese la libreta universitaria del alumno.");
           int lu = teclado.nextInt();
           System.out.println("Ingrese el nombre del alumno.");
           teclado.nextLine();
           String nomAlumno = teclado.nextLine();
           System.out.println("Ingrese el apellido del alumno.");
           teclado.nextLine();
           String apeAlumno = teclado.nextLine();
           
           Alumno unAlumno = new Alumno(lu, nomAlumno, apeAlumno);
           
           System.out.println("-INGRESO DE NOTAS DEL ALUMNO-");
           System.out.println("Ingresa la primer nota del alumno.");
           double nota1 = teclado.nextDouble();
           unAlumno.setNota1(nota1);
           System.out.println("Ingresa la segunda nota del alumno.");
           double nota2 = teclado.nextDouble();
           unAlumno.setNota2(nota2);
           
           nuevoCurso.inscribirAlumno(unAlumno);
           
           System.out.println("Alumno " + unAlumno.nomYApe() + " inscripto al curso!");
           System.out.println("¿Desea ingresar otro alumno? 1-SI 2-NO");
           seleccion = teclado.nextInt();
           System.out.print('\u000C');
       }while(seleccion == 1);
       
       System.out.println("*****" + nuevoCurso.getNombre() + "*****");
       System.out.println("**Cantidad de alumnos inscriptos: " + nuevoCurso.cantidadDeAlumnos() + "**");
       nuevoCurso.mostrarInscriptos();
       
       System.out.print("/nPresione ENTER para continuar.");
       teclado.nextLine();
       System.out.print('\u000C');
       
       System.out.println("Ingrese la libreta del alumno que se dió de baja.");
       int luEliminado = teclado.nextInt();
       Alumno alumEliminado = nuevoCurso.quitarAlumno(luEliminado);
       System.out.println("¿Está " + alumEliminado.nomYApe() + "inscripto?");
       nuevoCurso.estaInscripto(alumEliminado);
       
       System.out.print("/nPresione ENTER para continuar.");
       teclado.nextLine();
       System.out.print('\u000C');
       
       System.out.println("*****" + nuevoCurso.getNombre() + "*****");
       System.out.println("**Cantidad de alumnos inscriptos: " + nuevoCurso.cantidadDeAlumnos() + "**");
       nuevoCurso.mostrarInscriptos();
       
       System.out.print("/nPresione ENTER para continuar.");
       teclado.nextLine();
       System.out.print('\u000C');
       
       System.out.println("***BUSQUEDA DE ALUMNO***");
       System.out.println("Ingrese la libreta del alumno que está buscando.");
       int luBuscado = teclado.nextInt();
       Alumno alumBuscado = nuevoCurso.buscarAlumno(luBuscado);
       alumBuscado.mostrar();
       
       System.out.print("/nPresione ENTER para continuar.");
       teclado.nextLine();
       System.out.print('\u000C');
       
       System.out.println("***PROMEDIO DE ALUMNO***");
       System.out.println("Ingrese la libreta del alumno que desea mostrar el promedio.");
       int luPromedio = teclado.nextInt();
       nuevoCurso.imprimirPromediosDelAlumno(luPromedio);
       
       System.out.print("/nPresione ENTER para continuar.");
       teclado.nextLine();
       System.out.print('\u000C');
       
       //EL resto del código es para probar el segundo constructor y métodos faltantes
       System.out.println("***NUEVO CURSO***");
       System.out.println("Ingrese el nombre del nuevo curso");
       teclado.nextLine();
       String nomCurso2 = teclado.nextLine();
       HashMap<Integer, Alumno> alumnos = new HashMap<>();
       
       Curso nuevoCurso2 = new Curso (nomCurso2, alumnos);
       
       Alumno alumX = new Alumno(12345, "Juan", "Perez");
       alumX.setNota1(6.0);
       alumX.setNota2(4.5);
       
       nuevoCurso2.inscribirAlumno(alumX);
       int luX = alumX.getLu();
       System.out.println("¿Está " + alumX.apeYNom() + " inscripto?");
       nuevoCurso2.estaInscripto(luX);
       
       System.out.println("***PROGRAMA FINALIZADO***");
       
    }
}