import java.util.Calendar;
import java.util.HashSet;
/**
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 18/10/2026
 */
public abstract class Visitante{
    //atributos de intancia
    private String nombre;
    private Calendar fechaVisita;

    /**
     * Constructor de la clase Visitante
     * 
     * @param 
     */
    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }
    
    //Mutadores (SETTERS)
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFechaVisita(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    //Observadores (GETTERS)
    public String getNombre(){
        return this.nombre;
    }
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }
    
    public abstract void mostrar();
    public abstract double entrada();
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    public abstract String tipoVisitante();
    public abstract HashSet<Persona> listarPersonas();

}