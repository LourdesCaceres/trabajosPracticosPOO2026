import java.util.ArrayList;
/**
 * Clase que representa la abstracción de un jardín de infantes desde una actividad
 * donde se desea pintar figuras geometricas.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 16/10/2026
 */
public class Jardin
{
    // ATRIBUTOS
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Jardin: para la cardinalidad 0.
     * 
     * @param p_nombre: String - nombre del jardín.
     */
    public Jardin(String p_nombre){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<>());
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE Jardin: para la cardinalidad muchos.
     * 
     * @param p_nombre: String - nombre del jardín.
     * @param p_figuras: ArrayList<FiguraGeometrica> p_figuras.
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Método propio de colecciones. Agrega un elemento.
     * 
     * @param p_figura: FiguraGeometrica - elemento a agregar.
     * @return true/false según si se pudo agregar.
     */
    public boolean agregarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().add(p_figura);
    }
    
    /**
     * Método propio de colecciones. Quita un elemento.
     * 
     * @param p_figura: FiguraGeometrica - elemento a quitar.
     * @return true/false según si se pudo quitar.
     */
    public boolean quitarFigura(FiguraGeometrica p_figura){
        return this.getFiguras().remove(p_figura);
    }
    
    /**
     * Recorre todas las figuras sumando sus superficies para obtener la cantidad de metros
     * a pintar.
     * 
     * @return cantidad de metros a pintar.
     */
    public double cuantosMetros(){
        double metrosTotales = 0.0;
        for(FiguraGeometrica unaFigura : this.getFiguras()){
            metrosTotales += unaFigura.superficie();
        }
        
        return metrosTotales;
    }
    
    /**
     * Calcula la cantidad de litros necesarios para pintar la superficie requerida.
     * Aprovechamos el conocimiento de que 4L cubren 20mts dividiendo tenemos que 1L 
     * cubren 5mts.
     * 
     * @return cantidad de litros necesarios.
     */
    private double cuantosLitros(){
        //Como 4L cubren 20mts2, hacemos 20/5 y obtenemos que 1L cubre 5mts2
        return this.cuantosMetros() / 5.0;
    }
    
    /**
     * Calculan cuántas latas serán necesarias para abarcar los litros calculados
     * en cuantosLitros(), dividiendo los litros por 4 (cada lata es de 4L) y redondeando el 
     * resultado para arriba.
     * 
     * @return número de latas necesarias
     */
    public int cuantasLatas(){
        return (int)Math.ceil(this.cuantosLitros() / 4);
    }
    
    /**
     * Imprime un mensaje general con el nombre del jardín, las figuras que el
     * jardín quiere pintar junto a su superficie y finalmente un detalle
     * de cuántos metros se desea pintar y cuántas latas deben ser compradas.
     */
    public void detalleFiguras(){
        System.out.println("Presupuesto: " + this.getNombre());
        for(FiguraGeometrica unaFigura : this.getFiguras()){
            unaFigura.mostrarSuperficie();
        }
        System.out.println("------------------------------");
        System.out.println("Total a cubrir: " + this.cuantosMetros());
        System.out.println("Comprar " + this.cuantasLatas() + " latas.");
    }
}