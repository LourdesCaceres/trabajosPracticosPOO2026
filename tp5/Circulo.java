
/**
 * Write a description of class Circulo here.
 * 
 * @author Lourdes G. Caceres 
 * @version 1.0 28/09/2026
 */
public class Circulo extends Elipse{
    
    public Circulo(double p_ejeMayor, double p_ejeMenor, Punto p_centro){
        super(p_ejeMayor, p_ejeMenor, p_centro);
    }
    
    public Circulo(double p_ejeMayor, double p_ejeMenor){
        super(p_ejeMayor, p_ejeMenor);
    }
    
    @Override
    public String nombreFigura(){
        return "";
    }
}