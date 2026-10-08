import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase ejecutable Empresa
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 28/09/2026
 */
public class Empresa {

    public static boolean agregarPersona(ArrayList<Persona> p_lista, Persona p_persona){
        return p_lista.add(p_persona);
    }
    public static boolean quitarPersona(ArrayList<Persona> p_lista, Persona p_persona){
        return p_lista.remove(p_persona);
    }
    public static boolean quitarPersona(ArrayList<Persona> p_lista, int p_dni){
        boolean quitada = false;
        int i = 0;
        while (i < p_lista.size() && !quitada){
            if (p_lista.get(i).getDNI() == p_dni){
                p_lista.remove(i);      // remove(int) quita por posición
                quitada = true;
            }
            i++;
        }
        return quitada;
    }
    public static void mostrarPersonas(ArrayList<Persona> p_lista){
        for(Persona p : p_lista){
            p.mostrar();
            System.out.print("\n=======================\n"); 
        }
    }
    public static Persona datosPersona(Scanner p_texto){
        
        System.out.print("----------------- DATOS PERSONALES: ");

        System.out.print("\nNombre/s: ");
        String nombre = p_texto.nextLine();
        
        System.out.print("Apellido: ");
        String apellido = p_texto.nextLine();
        
        System.out.print("DNI: ");
        int dni = p_texto.nextInt();
        p_texto.nextLine();
        
        System.out.print("Anio de nacimiento: ");
        int anioNac = p_texto.nextInt();
        p_texto.nextLine();

        System.out.print("\n... Es empleado? (1-si / 0-no): ");
        int respuesta = p_texto.nextInt();

        if(respuesta == 1){
            System.out.print("\nCUIL: ");
            long cuil = p_texto.nextLong();

            System.out.print("\nSueldo base: $");
            double sueldoBase = p_texto.nextDouble();
            p_texto.nextLine();

            System.out.print("Ingrese el año ingreso:");
            int anioIng = p_texto.nextInt();

            p_texto.nextLine();

            return new Empleado(dni, cuil, apellido, nombre, anioNac, sueldoBase, anioIng);
        }
        
        return new Persona(dni, nombre, apellido, anioNac);
    }
    /**
     * METODO EJECUTABLE
    */
   public static void main (String arg []){
       
       Scanner texto = new Scanner(System.in);
       
       ArrayList<Persona> personas = new ArrayList<>();
       
       int respuesta = -1;
       System.out.print("\n\n==================== Registro de nuevos empleados/personas ====================\n");

       do{
           agregarPersona(personas, datosPersona(texto));
           System.out.print("\n... Agregar otra persona? (1-si / 0-no): ");
           respuesta = texto.nextInt();
           texto.nextLine();

        }while(respuesta == 1);

        System.out.print("\n\n==================== REGISTROS ====================\n");
        mostrarPersonas(personas);

        System.out.print("\n...Ingrese el dni de la persona a quitar de la lista: ");
        int p_dni = texto.nextInt();
        texto.nextLine();
        quitarPersona(personas, p_dni);
        
        System.out.print("\n\n==================== REGISTROS ====================\n");
        mostrarPersonas(personas);

        texto.close();
    }
}