
/**
 * La clase Punto representa un punto en un sistema de ejes cartesianos para posterior uso en trabajos de figuras geométricas.
 * Se instancia de dos maneras según si el punto está en el origen o tiene valores de x e y. Se diseñan métodos para desplazar,
 * escribir en forma de coordenadas y mostrar los valores.
 * 
 * @author Chavez, Tobías Acdel y Caceres Lourdes G.
 * @version 2.0 24/08/2026
 */
public class Punto2 {
    //atributos de instancia x e y, ejes de un sistema de ejes.
    private double x;
    private double y;
    
    /**
     * PRIMER CONSTRUCTOR DE LA CLASE PUNTO: para el caso de que el punto esté en el origen (0,0).
     */
    public Punto2 (){
        this.setX(0);
        this.setY(0);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE PUNTO: para el caso en que 
     * el punto tenga valores distintos a 0.
     * 
     * @param p_x 
     * @param p_y
     */
    public Punto2 (double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
    //GETTERS
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    //SETTERS
    private void setX(double p_x){
        this.x = p_x;
    }
    
    private void setY(double p_y){
        this.y = p_y;
    }
    
    /**
     * Desplaza el punto original la distancia (incremento) que recibe por 
     * parámetro dando por resultado nuevas coordenadas.
     * 
     * @param p_dx incremento de x
     * @param p_dy incremento de y
     */
    public void desplazar(double p_dx, double p_dy){
        double nuevoX = this.getX() + p_dx;
        double nuevoY = this.getY() + p_dy;
        
        this.setX(nuevoX);
        this.setY(nuevoY);
    }
    
    /**
     * Escribe los valores de los ejes x e y como coordenadas
     * 
     * @return cadena con el formato "(x, y)"
     */
    public String coordenadas(){
        return "(" + this.getX() + ", " + this.getY() + ")"; 
    }

    /**
     * Método que imprime un mensaje en pantalla donde se detallan los 
     * valores de los ejes x e y para el punto.
     */
    public void mostrar(){
        System.out.println("Punto. X:" + this.getX() + ", Y:" + this.getY());
    }
 
    /**
     * Calcula la distancia entre el punto actual y otro punto que pasa 
     * como parámetro. Utilizando la formula de pitágoras.
     * 
     * @param p_ptoDistante de la clase Punto
     * @return pitagoras, resultado de calcular la distancia entre los dos puntos.
     */
    public double distanciaA(Punto2 p_ptoDistante){
        double x1 = this.getX();
        double y1 = this.getY();
        
        double x2 = p_ptoDistante.x;
        double y2 = p_ptoDistante.y;
        
        double pitagoras = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return pitagoras;
    }
    
}