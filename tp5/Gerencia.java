import java.util.ArrayList;
/**
 * Write a description of class Gerencia here.
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
     * Constructor for objects of class Gerencia
     */
    public Gerencia(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlojamientos(new ArrayList<>());
    }
    
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientos().add(p_alojamiento);
    }
    
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientos().remove(p_alojamiento);
    }
    
    public int contarAlojamiento(String tipoAlojamiento){
        int cantidad = 0;
        
        for(Alojamiento unAlojamiento : this.getAlojamientos()){
            cantidad += unAlojamiento.contar(tipoAlojamiento);
        }
        
        return cantidad;
    }
    
    public void liquidar(){
        for(Alojamiento unAlojamiento : this.getAlojamientos()){
            unAlojamiento.liquidar();
            System.out.println("-------------------------");
        }
    }
    
    public void mostrarLiquidacion(){
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidacion------------------");
        this.liquidar();
        
        System.out.println("Alojamiento tipo Cabaña ---> " + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ----> " + this.contarAlojamiento("Hotel"));
    }
}