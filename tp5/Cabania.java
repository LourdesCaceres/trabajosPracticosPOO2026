import java.util.ArrayList;
/**
 * Subclase de la clase Alojamiento, representa una cabaña a alquiler, pudiendo
 * tener múltiples habitaciones.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 18/10/2026
 */
public class Cabania extends Alojamiento
{
    // ATRIBUTOS
    private int nroHabitaciones;

    /**
     * CONSTRUCTOR DE LA CLASE Cabania: reutiliza el segundo constructor de Alojamiento.
     * 
     * @param p_nombre: String - nombre del alojamiento.
     * @param p_precioBase: double - precio base sin contar servicios ni otros aumentos.
     * @param p_diasAlquiler: int - número de días durante los que se alquila.
     * @param p_servicios: ArrayList<Servicio> - colección de servicios aplicados al alojamiento.
     * @param p_nroHabitaciones: int - cantidad de habitaciones que tiene la cabaña.
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
     * Sobreescribe el método de la clase abstracta, calcula el costo para 
     * el caso particular de cabaña, agregando $30 por habitación y multiplicando
     * por la cantidad de días, este agregado se suma al costo base.
     * 
     * @return costo calculado por la cabaña.
     */
    @Override 
    public double costo(){
        double agregado = (this.getHabitaciones() * 30.0) * this.getDiasAlquiler();
        return super.costo() + agregado;
    }
    
    /**
     * Sobreescribe el método de la clase abstracta, agregando información a la liquidación
     * del alojamiento. Calcula el costo total del alojamiento mediante el costo particular
     * de la cabaña más el costo de los servicios. Muestra la liquidación general mediante
     * el método propio de la clase padre y luego pone los datos de la cabaña junto al costo total.
     */
    @Override
    public void liquidar(){
        double costoTotal = this.costo() + this.costoServicios();
        super.liquidar();
        System.out.println("Cabaña con " + this.getHabitaciones() + " habitaciones.");
        System.out.println("Total: ------> $" + costoTotal);
    }
    
    /**
     * Sobreescribe el método de la clase abstracta. Cuenta +1 por cada
     * alojamiento de tipo Cabaña. Lo hace mediante un if y el equalsIgnoreCase() 
     * que verifica que la cadena que entra por parámetro sea "Cabaña", 
     * ignorando cambios entre mayúsculas y minúsculas.
     * 
     * @param p_alojamiento: String - cadena que entra por parámetro para ser comparada.
     * @return 1 si es una Cabaña, 0 si es un Hotel.
     */
    @Override
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Cabaña")){
            return 1;
        }else{
            return 0;
        }
    }
}