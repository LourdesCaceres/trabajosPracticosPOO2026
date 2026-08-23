
/**
 * Clase ejecutable para instanciar y probar múltiples objetos Persona
 * recibiendo sus datos como constantes.
 * 
 * @author Lourdes Gabriela Caceres
 * @version 1.0 13/08/2026
 */
public class PersonaEjecutable{
    public static void main(String args []){
        
        Persona personaUno = new Persona(45900100, "Lourdes", "Caceres", 2004);
        Persona personaDos = new Persona(47200400, "Pedro", "Gomez", 2000);
     
        personaUno.mostrar();         
        System.out.print("\n**** Apellido y Nombre de: "+personaUno.apeYNom());
        
        personaDos.mostrar();
        System.out.print("\n**** Apellido y Nombre de: "+personaDos.apeYNom());
        
    }
}