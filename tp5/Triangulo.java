
/**
 * Write a description of class Triangulo here.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 16/10/2026
 */
public class Triangulo extends FiguraGeometrica
{
    // ATRIBUTOS
    private double base;
    private double altura;

    /**
     * Constructor for objects of class Triangulo
     */
    public Triangulo(double p_base, double p_altura, Punto p_origen){
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    //SETTERS
    private void setBase(double p_base){
        this.base = p_base;
    }
    
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    
    //GETTERS
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    //MÉTODOS DE CLASE
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String nombreFigura(){
        return "****** Triángulo ******";
    }
    
    public double superficie(){
        //area = (base*altura)/2
        return (this.getBase() * this.getAltura()) / 2;
    }
}