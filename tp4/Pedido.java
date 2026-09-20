import java.util.*;
/**
 * La clase Pedido simula un pedido de productos de un laboratorio para
 * una farmacia o droguería. Utiliza un arreglo dinámico de tipo ArrayList,
 * para este ejercicio decidimos hacerlo no genérico.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 11/09/2026
 */
public class Pedido
{
    // Atributos
    private Calendar fecha;
    private Cliente cliente;
    private ArrayList productos;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Pedido
     * 
     * @param p_fecha: Calendar - fecha en la que se realiza el pedido.
     * @param p_cliente: Cliente - persona que realiza el pedido.
     * @param p_productos: ArrayList<Producto> - lista de productos que se piden.
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    /**
     *SEGUNDO CONSTRUCTOR DE LA CLASE Pedido
     *
     * @param p_fecha: Calendar - fecha en la que se realiza el pedido.
     * @param p_cliente: Cliente - persona que realiza el pedido.
     * @param p_producto: Producto - unidad de producto que se pide.
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList());
        this.getProductos().add(p_producto);
    }
    
    //GETTERS
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public ArrayList getProductos(){
        return this.productos;
    }
    
    //SETTERS
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    private void setProductos(ArrayList p_productos){
        this.productos = p_productos;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Agrega un producto a la colección.
     * 
     * @param p_producto: Producto - el producto que será agregado
     * @return true o false si el producto pudo ser agregado o no. 
     */
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    /**
     * Quita un producto a la colección.
     * 
     * @param p_producto: Producto - el producto que será agregado
     * @return true o false si el producto pudo ser quitado o no. 
     */
    public boolean quitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);
    }
    
    /**
     * Crea una variable temporal que será un acumulador de los precios al contado
     * de cada producto de la colección. Para recorrer la colección y sumar los valores
     * se utiliza una estructura for.
     * 
     * @return el acumulador de todos los precios al contado.
     */
    public double totalAlContado(){
        double totalContado = 0.0;
        for(Object unObjeto: this.getProductos()){
            Producto unProducto = (Producto)unObjeto;
            totalContado += unProducto.precioContado();
        }
        
        return totalContado;
    }
    
    /**
     * Crea una variable temporal que será un acumulador de los precios de lista
     * de cada producto de la colección. Para recorrer la colección y sumar los valores
     * se utiliza una estructura for.
     * 
     * @return el acumulador de todos los precios financiados.
     */
    public double totalFinanciado(){
        double totalFinanciado = 0.0;
        for(Object unObjeto: this.getProductos()){
            Producto unProducto = (Producto)unObjeto;
            totalFinanciado += unProducto.precioLista();
        }
        
        return totalFinanciado;
    }
    
    /**
     * Muestra un detalle del pedido, mostrando la fecha en la que se realizó y una tabla
     * con el nombre del producto, su precio de lista y precio al contado. El formato es así:
     * "Jabón Liquido Ala"    $4999.99     $4500.0
     * Utiliza un for para recorrer la colección, instanciando un objeto colaborador de clase Producto. 
     */
    public void mostrarPedido(){
        System.out.println("*******Detalle del pedido******* Fecha: " + this.getFecha());
        System.out.println("     Producto    Precio Lista    Precio Contado");
        System.out.println("--------------------------------------------------------");
        
        for(Object unObjeto: this.getProductos()){
            Producto unProducto = (Producto)unObjeto;
            System.out.println(unProducto.getDescripcion() + "    " + unProducto.precioLista() + "    " + unProducto.precioContado()); 
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("*** Total --- " + this.totalFinanciado() + "    " + this.totalAlContado());
    }
}