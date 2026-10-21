
/**
 * Abstracción de un renglón en el detalle de un pedido.
 * 
 * @author Chavez, Tobías Acdel. 
 * @version 1.0 - 20/10/2026
 */
public class Renglon
{
    // ATRIBUTOS
    private int cantidad;
    private double precio;
    private Etiqueta item;

    /**
     * CONSTRUCTOR DE LA CLASE Renglon
     */
    public Renglon(int p_cantidad, Etiqueta p_item){
        this.setCantidad(p_cantidad);
        this.setItem(p_item);
        this.setPrecio(this.getItem().precio(this.getCantidad()));
    }
    
    //SETTERS
    private void setCantidad(int p_cantidad){
        this.cantidad = p_cantidad;
    }
    
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    
    private void setItem(Etiqueta p_item){
        this.item = p_item;
    }
    
    //GETTERS
    public int getCantidad(){
        return this.cantidad;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public Etiqueta getItem(){
        return this.item;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Muestra el renglón informativo del pedido. Utiliza un método interno
     * de la clase Etiqueta.
     */
    public void mostrar(){
        System.out.println(this.getCantidad() + " Etiquetas de " + this.getItem().toString());
        System.out.println("Precio: $" + this.getPrecio());
    }
}