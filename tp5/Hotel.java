import java.util.ArrayList;
/**
 * Write a description of class Hotel here.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0 - 18/10/2026
 */
public class Hotel extends Alojamiento
{
    // ATRIBUTOS
    private String tipoHabitacion;

    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String p_nombre, double p_precioBase, int p_diasAlquiler, 
                        ArrayList<Servicio> p_servicios, String p_tipoHabitacion){
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setTipoHabitacion(p_tipoHabitacion);
    }
    
    //SETTERS
    private void setTipoHabitacion(String p_tipoHabitacion){
        this.tipoHabitacion = p_tipoHabitacion;
    }
    
    //GETTERS
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }
    
    //MÉTODOS DE CLASE
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override 
    public double costo(){
        double agregado = 0.0;
        if(this.getTipoHabitacion().equals("Single")){
            agregado = this.getDiasAlquiler() * 20.0;
        }else if(this.getTipoHabitacion().equals("Doble")){
            agregado = this.getDiasAlquiler() * 35.0;
        }
        
        return super.costo() + agregado;
    }
    
    @Override
    public void liquidar(){
        double costoTotal = this.costo() + this.costoServicios();
        super.liquidar();
        System.out.println("Habitacion " + this.getTipoHabitacion());
        System.out.println("Total: ------> $" + costoTotal);
    }
    
    @Override
    public int contar(String p_alojamiento){
        if(p_alojamiento.equals("Hotel")){
            return 1;
        }else{
            return 0;
        }
    }
}