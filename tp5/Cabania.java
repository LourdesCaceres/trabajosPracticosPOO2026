import java.util.ArrayList;
/**
 * Write a description of class Cabania here.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 18/10/2026
 */
public class Cabania extends Alojamiento
{
    // ATRIBUTOS
    private int nroHabitaciones;

    /**
     * Constructor for objects of class Cabania
     */
    public Cabania(String p_nombre, double p_precioBase, int p_diasAlquiler, 
                        ArrayList<Servicio> p_servicios, int p_nroHabitaciones){
        super(p_nombre, p_precioBase, p_diasAlquiler, p_servicios);
        this.setHabitaciones(p_nroHabitaciones);
    }
    
    //SETTERS
    private void setHabitaciones(int p_nroHabitaciones){
        this.nroHabitaciones = p_nroHabitaciones;
    }
    
    //GETTERS
    public int getHabitaciones(){
        return this.nroHabitaciones;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override 
    public double costo(){
        double agregado = (this.getHabitaciones() * 30.0) * this.getDiasAlquiler();
        return super.costo() + agregado;
    }
    
    @Override
    public void liquidar(){
        double costoTotal = this.costo() + this.costoServicios();
        super.liquidar();
        System.out.println("Cabaña con " + this.getHabitaciones() + " habitaciones.");
        System.out.println("Total: ------> $" + costoTotal);
    }
    
    @Override
    public int contar(String p_alojamiento){
        if(p_alojamiento.equals("Cabaña")){
            return 1;
        }else{
            return 0;
        }
    }
}