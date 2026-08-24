
/**
 * La clase Punto representa un punto en un sistema de ejes cartesianos para posterior uso en trabajos de figuras geométricas.
 * Se instancia de dos maneras según si el punto está en el origen o tiene valores de x e y. Se diseñan métodos para desplazar,
 * escribir en forma de coordenadas y mostrar los valores.
 * 
 * @author Chavez, Tobías Acdel.
 * @version 1.0
 */
public class Punto
{
    //atributos: x e y, ejes de un sistema de ejes.
    private double x;
    private double y;
    
    /**
     * PRIMER CONSTRUCTOR DE LA CLASE PUNTO: para el caso de que el punto esté en el origen (0,0).
     */
    public Punto(){
        setX(0);
        setY(0);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE PUNTO: para el caso de que el punto tenga valores distintos a 0.
     */
    public Punto(double p_x, double p_y){
        setX(p_x);
        setY(p_y);
    }
    
    //SETTERS
    private void setX(double p_x){
        x = p_x;
    }
    
    private void setY(double p_y){
        y = p_y;
    }
    
    //GETTERS
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    /**
     * Método desplazar()
     * Recibe por parámetro los valores de desplazo de los ejes x e y, estos valores se sumarán a los de los propios ejes,
     * dando por resultado nuevas coordenadas.
     */
    public void desplazar(double p_dx, double p_dy){
        double nuevoX = getX() + p_dx;
        double nuevoY = getY() + p_dy;
        
        setX(nuevoX);
        setY(nuevoY);
    }
    
    /**
     * Método coordenadas()
     * Escribe los valores de los ejes x e y como coordenadas, es decir, con la forma "(x, y)".
     */
    public String coordenadas(){
        return "(" + getX() + ", " + getY() + ")"; 
    }
    
    /**
     * Método mostrar()
     * Imprime un mensaje en pantalla donde se detallan los valores de los ejes x e y para el punto.
     */
    public void mostrar(){
        System.out.println("Punto. X:" + getX() + ", Y:" + getY());
    }
}