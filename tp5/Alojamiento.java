import java.util.ArrayList;
/**
 * Abstracción de un alojamiento, como clase abstracta representa un objeto más general
 * que sus clases hijas complementarán.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 16/10/2026
 */
public abstract class Alojamiento
{
    // ATRIBUTOS
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Alojamiento: para la cardinalidad ninguno.
     * 
     * @param p_nombre: String - nombre del alojamiento.
     * @param p_precioBase: double - precio base sin contar servicios ni otros aumentos.
     * @param p_diasAlquiler: int - número de días durante los que se alquila.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler){
        this.setNombre(p_nombre);
        this.setPrecio(p_precioBase);
        this.setDias(p_diasAlquiler);
        this.setServicios(new ArrayList<>());
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE Alojamiento: para la cardinalidad muchos.
     * 
     * @param p_nombre: String - nombre del alojamiento.
     * @param p_precioBase: double - precio base sin contar servicios ni otros aumentos.
     * @param p_diasAlquiler: int - número de días durante los que se alquila.
     * @param p_servicios: ArrayList<Servicio> - colección de servicios aplicados al alojamiento.
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPrecio(p_precioBase);
        this.setDias(p_diasAlquiler);
        this.setServicios(p_servicios);
    }
    
    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setPrecio(double p_precioBase){
        this.precioBase = p_precioBase;
    }
    
    private void setDias(int p_diasAlquiler){
        this.diasAlquiler = p_diasAlquiler;
    }
    
    private void setServicios(ArrayList<Servicio> p_servicios){
        this.servicios = p_servicios;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecio(){
        return this.precioBase;
    }
    
    public int getDiasAlquiler(){
        return this.diasAlquiler;
    }
    
    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }

    //MÉTODOS DE CLASE
    /**
     * Método propio de las colecciones tipo ArrayList, agrega un
     * objeto a la colección.
     * 
     * @param p_servicio: Servicio - servicio a agregar.
     * @return true/false según si pudo ser agregado.
     */
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    
    /**
     * Método propio de las colecciones tipo ArrayList, quita un
     * objeto a la colección.
     * 
     * @param p_servicio: Servicio - servicio a quitar.
     * @return true/false según si pudo ser quitado.
     */
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    
    /**
     * Método abstracto que las clases hijas Cabania y Hotel van a 
     * definir el comportamiento.
     * 
     * @param p_alojamiento: String - cadena indicando un tipo de alojamiento.
     */
    public abstract int contar(String p_alojamiento);
    
    /**
     * Recorre la colección de servicios para listarlos en un solo mensaje
     * cada renglón con el formato: "Alquiler auto: $500".
     */
    public void listarServicios(){
        for(Servicio unServicio : this.getServicios()){
            System.out.println(unServicio.getDescripcion() + ": $" + unServicio.getPrecio()); 
        }
    }
    
    /**
     * Calcula el costo sumado entre todos los servicios. Recorre la colección 
     * y guarda cada valor en un acumulador.
     * 
     * @return acumulador que representa la suma total entre los costos de cada servicio
     */
    public double costoServicios(){
        double costoTotal = 0.0;
        for(Servicio unServicio : this.getServicios()){
             costoTotal += unServicio.getPrecio();
        }
        
        return costoTotal;
    }
    
    /**
     * Calcula el costo total del alojamiento sin servicios, el cual
     * es calculado con el producto entre el precio por día y la cantidad de días.
     * 
     * @return costo del alojamiento.
     */
    public double costo(){
        return this.getPrecio() * this.getDiasAlquiler();
    }
    
    /**
     * Imprime un mensaje con los datos del alojamiento como su nombre, la cantidad
     * de días, el costo y la lista de servicios.
     */
    public void liquidar(){
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: " + this.costo());
        this.listarServicios();
    }
}