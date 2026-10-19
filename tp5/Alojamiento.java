import java.util.ArrayList;
/**
 * Write a description of class Alojamiento here.
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
     * Constructor for objects of class Alojamiento
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler){
        this.setNombre(p_nombre);
        this.setPrecio(p_precioBase);
        this.setDias(p_diasAlquiler);
        this.setServicios(new ArrayList<>());
    }
    
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicios().add(p_servicio);
    }
    
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicios().remove(p_servicio);
    }
    
    public abstract int contar(String p_alojamiento);
    
    public void listarServicios(){
        for(Servicio unServicio : this.getServicios()){
            System.out.println(unServicio.getDescripcion() + ": $" + unServicio.getPrecio()); 
        }
    }
    
    public double costoServicios(){
        double costoTotal = 0.0;
        for(Servicio unServicio : this.getServicios()){
             costoTotal += unServicio.getPrecio();
        }
        
        return costoTotal;
    }
    
    public double costo(){
        return this.getPrecio() * this.getDiasAlquiler();
    }
    
    public void liquidar(){
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiasAlquiler() + " dias: " + this.costo());
        this.listarServicios();
    }
}