
/**
 * Clase que representa la informacion de una Escuela, y los docente que trabaja en ella
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 31/08/2026
 */
public class Escuela {

    public static final String LINEA = "............................................................................................................";

    // instance variables - replace the example below with your own
    private String nombre;
    private String domicilio;
    private String director;

    /**
     * Constructor de objetos de la clase Escuela
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }

    //Mutadores (SETTERS)
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setDirector(String p_director){
        this.director = p_director;
    }

    //Observadores (GETTERS)
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getDirector(){
        return this.director;
    }

    /**
     * Imprime por pantalla la imformacion relacionada con el cada objeto Docente, y el detallae del sueldo
     * 
     * @param  p_docente de tipo Docente
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.print("\nEscuela: "+this.getNombre()+"\tDomicilio: "+this.getDomicilio()+"\tDirector: "+this.getDirector());
        System.out.print("\n"+LINEA+"\n");
        System.out.println("- Docente: "+p_docente.getNombre());
        System.out.println("- Sueldo: ........................ $"+p_docente.calcularSueldo());
        System.out.println("- Sueldo Basico: ................. $"+p_docente.getSueldoBasico());
        System.out.println("- Asignacion Familiar: ........... $"+p_docente.getAsigFamiliar()+"\n");
    }
}