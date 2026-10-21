import java.util.ArrayList;
/**
 * Subclase de la clase Alojamiento, representa una habitación de hotel, pudiendo
 * ser Single o Doble.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0 - 18/10/2026
 */
public class Hotel extends Alojamiento
{
    // ATRIBUTOS
    private String tipoHabitacion;

    /**
     * CONSTRUCTOR DE LA CLASE Hotel: reutiliza el segundo constructor de Alojamiento.
     * 
     * @param p_nombre: String - nombre del alojamiento.
     * @param p_precioBase: double - precio base sin contar servicios ni otros aumentos.
     * @param p_diasAlquiler: int - número de días durante los que se alquila.
     * @param p_servicios: ArrayList<Servicio> - colección de servicios aplicados al alojamiento.
     * @param p_tipoHabitacion: String - tipo de la habitacion de hotel, puede ser Single o Doble.
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
     * Sobreescribe el método de la clase abstracta, calcula el costo para 
     * el caso particular de habitación de hotel, teniendo en cuenta si es
     * Single o Doble. para el primer caso se debe agregar $20 por día, mientras
     * que para el otro es $35 por día. Se utiliza equals() para comprobar que el tipo
     * de habitación sea uno de los indicados.
     */
    @Override 
    public double costo(){
        double agregado = 0.0;
        if(this.getTipoHabitacion().equalsIgnoreCase("Single")){
            agregado = this.getDiasAlquiler() * 20.0;
        }else if(this.getTipoHabitacion().equalsIgnoreCase("Doble")){
            agregado = this.getDiasAlquiler() * 35.0;
        }else{
            System.out.println("Tipo de habitación incorrecto.");
        }
        
        return super.costo() + agregado;
    }
    
    /**
     * Sobreescribe el método de la clase abstracta, agregando información a la liquidación
     * del alojamiento. Calcula el costo total del alojamiento mediante el costo particular
     * de la habitación más el costo de los servicios. Muestra la liquidación general mediante
     * el método propio de la clase padre y luego pone los datos del hotel junto al costo total.
     */
    @Override
    public void liquidar(){
        double costoTotal = this.costo() + this.costoServicios();
        super.liquidar();
        System.out.println("Habitacion " + this.getTipoHabitacion());
        System.out.println("Total: ------> $" + costoTotal);
    }
    
    /**
     * Sobreescribe el método de la clase abstracta. Cuenta +1 por cada
     * alojamiento de tipo Hotel. Lo hace mediante un if y el equalsIgnoreCase() 
     * que verifica que la cadena que entra por parámetro sea igual a "Hotel", 
     * ignorando cambios entre mayúsculas y minúsculas.
     * 
     * @param p_alojamiento: String - cadena que entra por parámetro para ser comparada.
     * @return 1 si es un Hotel, 0 si es una cabaña.
     */
    @Override
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Hotel")){
            return 1;
        }else{
            return 0;
        }
    }
}