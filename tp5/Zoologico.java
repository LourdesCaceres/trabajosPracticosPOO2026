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
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
            for (Visitante unVisitante : this.getVisitantes()) {
                unVisitante.listarPorFecha(p_fecha, p_tipoVisitante);
            }
    }
    public void listarVisitantePorFecha(Calendar p_fecha){
        for(Visitante unVisitante : this.getVisitantes()){
            if(!unVisitante.getFechaVisita().equals(p_fecha)){
                System.out.print("\n...Error esta persona no visito el zoo en la fecha indicada");
            }
            unVisitante.mostrar();
        }
    }
    /**
     * Calcula la recaudación de las visitas dentro del rango de fechas, ambos extremos incluidos.
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){

        double total = 0.0;
        for (Visitante unVisitante : this.getVisitantes()){
            if (unVisitante.getFechaVisita().equals(p_fechaDesde) || unVisitante.getFechaVisita().equals(p_fechaHasta) 
                || (unVisitante.getFechaVisita().after(p_fechaDesde) && unVisitante.getFechaVisita().before(p_fechaHasta))){
                total += unVisitante.entrada();
            }
        }
        return total;
    }
    /**
     * @return conjunto, sin repeticiones, de todas las personas que visitaron el zoológico
     */
    public HashSet<Persona> listarPersonasQueVisitaronElZoo(){
        HashSet<Persona> personas = new HashSet<>();
        for (Visitante unVisitante : this.getVisitantes()){
            personas.addAll(unVisitante.listarPersonas());
        }
        return personas;
    }

}
