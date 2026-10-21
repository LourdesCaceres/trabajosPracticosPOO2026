import java.util.ArrayList;
/**
 * Clase que sirve como general para el manejo de las clases Alojamiento,
 * Cabania, Hotel y Servicio. Representa una gerencia de alojamientos en alquiler.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 18/10/2026
 */
public class Gerencia
{
    // ATRIBUTOS
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Gerencia: para la cardinalidad ninguno.
     * 
     * @param p_nombre: String - nombre de la gerencia.
     */
    public Gerencia(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlojamientos(new ArrayList<>());
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE Gerencia: para la cardinalidad muchos.
     * 
     * @param p_nombre: String - nombre de la gerencia.
     * @param p_alojamientos: ArrayList<Alojamiento> - colección de alojamientos.
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos){
        this.setNombre(p_nombre);
        this.setAlojamientos(p_alojamientos);
    }

    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlojamientos(ArrayList<Alojamiento> p_alojamientos){
        this.alojamientosAlquilados = p_alojamientos;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Alojamiento> getAlojamientos(){
        return this.alojamientosAlquilados;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Método propio de las colecciones tipo ArrayList, agrega un
     * objeto a la colección.
     * 
     * @param p_alojamiento: Alojamiento - alojamiento a agregar.
     * @return true/false según si pudo ser agregado.
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientos().add(p_alojamiento);
    }
    
    /**
     * Método propio de las colecciones tipo ArrayList, agrega un
     * objeto a la colección.
     * 
     * @param p_alojamiento: Alojamiento - alojamiento a quitar.
     * @return true/false según si pudo ser eliminado.
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientos().remove(p_alojamiento);
    }
    
    /**
     * Se busca contar la cantidad total de un tipo de alojamiento, Cabaña u Hotel,
     * que es pasado por parámetro como una cadena. Utiliza un objeto colaborador
     * de clase Alojamiento para acceder a sus métodos internos y que cuente de a uno,
     * se recorre la colección utilizando este método con cada elemento y guardando
     * en un contador.
     * 
     * @param p_tipoAlojamiento: String - cadena que indica el tipo de alojamiento a contar.
     * @return número de cabañas u hoteles.
     */
    public int contarAlojamiento(String p_tipoAlojamiento){
        int cantidad = 0;
        
        for(Alojamiento unAlojamiento : this.getAlojamientos()){
            cantidad += unAlojamiento.contar(p_tipoAlojamiento);
        }
        
        return cantidad;
    }
    
    /**
     * Liquidación final de toda la gerencia. Recorre todos los alojamientos y los liquida en una sola lista.
     */
    public void liquidar(){
        for(Alojamiento unAlojamiento : this.getAlojamientos()){
            unAlojamiento.liquidar();
            System.out.println("-------------------------");
        }
    }
    
    /**
     * Muestra la liquidación completa con los datos de la gerencia, las liquidaciones particulares
     * de cada alojamiento y al final un dato con la cantidad de cabañas y de hoteles.
     */
    public void mostrarLiquidacion(){
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidacion------------------");
        this.liquidar();
        
        System.out.println("Alojamiento tipo Cabaña ---> " + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ----> " + this.contarAlojamiento("Hotel"));
    }
}