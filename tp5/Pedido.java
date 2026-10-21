import java.util.ArrayList;
/**
 * Abstracción de un pedido genérico donde se especifican la cantidad de cada producto y su etiqueta.
 * Para lo que es la clase importa más el detalle de un pedido, donde cada renglón especifica
 * los datos mencionados. Es otra clase distinta de la clase Pedido realizada en tps anteriores.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0 - 20/10/2026
 */
public class Pedido
{
    // ATRIBUTOS
    private ArrayList<Renglon> renglones;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Pedido: para la cardinalidad uno.
     * 
     * @param p_renglon: Renglon - un único renglón del detalle.
     */
    public Pedido(Renglon p_renglon){
        this.setRenglones(new ArrayList<Renglon>());
        this.getRenglones().add(p_renglon);
    }

    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE Pedido: para la cardinalidad muchos.
     * 
     * @param p_renglones: ArrayList<Renglon> - coleccion de renglones del detalle.
     */
    public Pedido(ArrayList<Renglon> p_renglones){
        this.setRenglones(p_renglones);
    }
    
    //SETTER
    private void setRenglones(ArrayList<Renglon> p_renglones){
        this.renglones = p_renglones;
    }
    
    //GETTERS
    public ArrayList<Renglon> getRenglones(){
        return this.renglones;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Método propio de las colecciones. Agrega un elemento.
     * 
     * @param p_renglon: Renglon - renglón a agregar a la colección
     * @return true/false según si se pudo agregar el elemento.
     */
    public boolean agregarRenglon(Renglon p_renglon){
        return this.getRenglones().add(p_renglon);
    }
    
    /**
     * Método propio de las colecciones. Quita un elemento.
     * Como la cardinalidad mínima es 1, verifica que la colección no quede vacía.
     * 
     * @param p_renglon: Renglon - renglón a quitar a la colección
     * @return true/false según si se pudo quitar el elemento.
     */
    public boolean quitarRenglon(Renglon p_renglon){
        if(this.getRenglones().size() == 1){
            System.out.print("La colección no puede quedar vacía!");
            return false;
        }else{
            return this.getRenglones().remove(p_renglon);
        }
    }
    
    /**
     * Imprime un mensaje con el detalle completo del pedido. Indica la cantidad de items
     * y cada item muestra un renglón informativo. Al final muestra la cantidad total de etiquetas
     * junto al precio total.
     */
    public void mostrar()
    {
        int cantEtiquetas = 0;
        double precioTotal = 0.0;
        
        System.out.println("Pedido: ");
        System.out.println("Cantidad de items: " + this.getRenglones().size());
        
        int i = 1;
        for(Renglon unRenglon : this.getRenglones()){
            System.out.print("Item " + i + ": ");
            unRenglon.mostrar();
            
            cantEtiquetas += unRenglon.getCantidad();
            precioTotal += unRenglon.getPrecio();
            i++;
        }
        
        System.out.println("--- Total pedido: " + cantEtiquetas + "etiquetas por un importe total de: $" + precioTotal);
    }
}