import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase ejecutable Empresa
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 28/09/2029
 */
public class Empresa {

    private ArrayList<Persona> personas;

    public Empresa(){
        this.personas = new ArrayList<>();
    }
    public static void agregarPersona(ArrayList<Persona> p_lista, Persona p_persona){
        p_lista.add(p_persona);
    }
    public static boolean quitarPersona(){
        return true;
    }


    /**
     * METODO EJECUTABLE
     */
    public static void main (String arg []){

        Scanner texto = new Scanner(System.in);

        personas.agregarPersona();
    }
}