import java.util.Calendar;
import java.util.HashSet;
/**
 * Clase Individuo: visitante que concurre al zoológico por sí mismo o como integrante
 * de una delegación. Colabora con la clase Persona, que aporta los datos personales.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 18/10/2026
 */
public class Individuo extends Visitante{
    //nuevos atributos de instancia
    private Persona persona;

    /**
     * Constructor de la clase Individuo
     */
    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona){
        super(p_nombre, p_fecha);
        this.setPersona(p_persona);
    }

    //ACCESOR
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    public Persona getPersona(){
        return this.persona;
    }

    /**
     * Implementacion del metodo abstracto tipoVisitante. Devuelve una cadena de caracteres
     * que indica el tipo de Visitante, en este caso "Individuo"
     */
    @Override 
    public String tipoVisitante(){
        return "Individuo";
    }
    /**
     * 
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(super.getFechaVisita().equals(p_fecha) && this.tipoVisitante().equals(p_visitante)){
            this.getPersona().mostrar();
        }
    }
    /**
     * Implementacion del metodo mostrar(). Imprime en pantalla
     */
    public void mostrar(){
        this.getPersona().mostrar();
    }
    /**
     * Implementacion del metodo entrada(). Retona el valor de la entrada correspodiente
     * a un individuo.
     * 
     * @return valor de la entrada (double).
     */
    public double entrada(){
        return 10.0F;
    }
    /**
     * Implementacion del método listarPersonas, devuelve una coleccion co
     * 
     * @return personas coleccion de un solo elemento (individuo)
     */
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet<>();
        personas.add(this.getPersona());
        return personas;
    }
}