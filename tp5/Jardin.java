import java.util.ArrayList;
/**
 * Write a description of class Jardin here.
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
     * Constructor for objects of class Jardin
     */
    public Jardin(String p_nombre){
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<>());
    }
    
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double cuantosMetros(){
        double metrosTotales = 0.0;
        for(FiguraGeometrica unaFigura : this.getFiguras()){
            metrosTotales += unaFigura.superficie();
        }
        
        return metrosTotales;
    }
    
    private double cuantosLitros(){
        //Como 4L cubren 20mts2, hacemos 20/5 y obtenemos que 1L cubre 5mts2
        return this.cuantosMetros() / 5.0;
    }
    
    public int cuantasLatas(){
        return (int)Math.ceil(this.cuantosLitros() / 4);
    }
    
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