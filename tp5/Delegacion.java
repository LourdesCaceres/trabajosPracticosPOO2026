import java.util.Calendar;
import java.util.HashSet;
/**
 * 
 * Delegacion
 *
 * @author Lourdes G. Caceres
 * @version 1.0 18/10/2026
 */
public class Delegacion extends Visitante{
    //nuevo atributo de instancia
    private HashSet<Individuo> integrantes;

    /**
     * Primer constructor de la clase Delegacion, recibe un individuo y lo agrega a la
     * coleccion
     * 
     * @param 
     */
    public Delegacion(String p_nombre, Calendar p_fecha, Individuo p_integrante){
        super(p_nombre, p_fecha);
        this.setIntegrantes(new HashSet<>());
        this.getIntegrantes().add(p_integrante);
    }
    /**
     * Segundo constructor de la clase Delegacion, recibe una colecciones de individuos
     * 
     * @param 
     */
    public Delegacion(String p_nombre, Calendar p_fecha, HashSet<Individuo> p_integrantes){
        super(p_nombre, p_fecha);
        this.setIntegrantes(p_integrantes);
    }    

    //ACCESORS
    private void setIntegrantes(HashSet<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    public HashSet<Individuo> getIntegrantes(){
        return this.integrantes;
    }

    /**
     * 
     * @return cadena de caracteres
     */
    @Override 
    public String tipoVisitante(){
        return "Delegacion";
    }
    /**
     * Inscribe un individuo en la delegación. No permite inscribir dos veces a la misma
     * persona (se compara por DNI).
     */
    public void inscribirIndividuo(Individuo p_individuo){
        for (Individuo unIntegrante : this.getIntegrantes()){
            if(unIntegrante.getPersona().getDNI() == p_individuo.getPersona().getDNI()){
                System.out.print("\n...Ya existe esta persona");
            }
        }
        this.getIntegrantes().add(p_individuo);
    }
    /**
     * Quita un integrante de la delegación.
     *
     * @return true si el individuo pertenecía a la delegación
     */
    public boolean quitarIntegrante(Individuo p_individuo){
        if(this.getIntegrantes().size() > 1){
            return this.getIntegrantes().remove(p_individuo);
        }
        return false;
    }
    /**
     * @return la cantidad de individuos que integran la delegación
     */
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    /**
     * Imprime el nombre de la delegación, los datos de cada integrante y su cantidad.
     */
    @Override 
    public void mostrar(){
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Delegación: " + this.getNombre());
        System.out.print("Integrantes: ");
        for(Individuo unIndividuo : this.getIntegrantes()){
            unIndividuo.mostrar();
        }
        System.out.println("\nCantidad de Integrantes: " + this.cantidadIntegrantes());
        System.out.println("-------------------------------------------------------------");
    }
    @Override 
    public double entrada(){
        double costoTotal = 0.0;
        for(Individuo unIntegrante : this.getIntegrantes()){
            costoTotal =+ unIntegrante.entrada();
        }
        return costoTotal - (costoTotal*0.1);
    }
    @Override 
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(!super.getFechaVisita().equals(p_fecha) && !this.tipoVisitante().equals(p_visitante)){
            System.out.print("\n...No coincide la busqueda");
        }
        this.mostrar();
    }
    /**
     * @return conjunto con las personas de todos los integrantes
     */
    @Override 
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet<>();
        for (Individuo unIndividuo : this.getIntegrantes()){
            personas.add(unIndividuo.getPersona());
        }
        return personas;
    }

}