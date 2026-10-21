import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
/**
 * 
 * Zoologico
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 18/10/2026
 */
public class Zoologico {
    //atributos de instancia
    private String nombre;
    private HashSet<Visitante> visitantes;
 
    /**
     * Constructor de la clase Zoologico, sin visitantes registrados.
     */
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new HashSet<>());
    }
    /**
     * Segundo constructor de la clase Zoologico, recibe una coleecion de visitantes
     * @param p_nombre
     * @param p_visitantes
     */
    public Zoologico(String p_nombre, HashSet<Visitante> p_Visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_Visitantes);
    }

    //Mutadores (SETTERS)
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setVisitantes(HashSet<Visitante> p_visitantes){
        if(p_visitantes != null){
            this.visitantes = p_visitantes;
        }
    }
    //Observadores (GETTERS)
    public String getNombre(){
        return this.nombre;
    }
    public HashSet<Visitante> getVisitantes(){
        return this.visitantes;
    }

    public void nuevoVisitante(Visitante p_Visitante){
        this.getVisitantes().add(p_Visitante);
    }
    public boolean quitarVisitante(Vistante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    

}
