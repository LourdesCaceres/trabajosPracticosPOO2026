
/**
 * Write a description of class PersonaEjecutable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonaEjecutable{
    public static void main(String args []){
        
        //nueva intancia del tipo persona
        Persona personaUno = new Persona(45900100, "Lourdes", "Caceres", 2004);
        Persona personaDos = new Persona(47200400, "Pedro", "Gomez", 2000);
        //mensaje
        personaUno.mostrar(); 
        
        System.out.print("\n**** Apellido y Nombre de x: "+personaDos.apeYNom());
        
        
    }
}