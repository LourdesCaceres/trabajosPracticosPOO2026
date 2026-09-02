import java.util.Formatter;
/**
 * 
 * Rectangulo
 * 
 * @author Lourdes Gabriela Caceres
 * @version 1.0 27/08/2026
 */
public class Rectangulo {
    
    //variables de intancia
    private Punto origen;
    private double ancho;
    private double alto;

    /**
     * 1er CONSTRUCTOR de la clase Rectangulo: para el caso en que el
     * origen se encuentra en el punto (0,0), y solo recibe las dimensiones (ancho-alto)
     * 
     * @param p_ancho
     * @param p_alto
     */
    public Rectangulo(double p_ancho, double p_alto){
        
        setOrigen(new Punto(0,0));
        setAncho(p_ancho);
        setAlto(p_alto);
    }

    /**
     * 2do CONSTRUCTOR de la clase Rectangulo: para el caso ...
     * 
     * @param p_origen
     * @param p_ancho
     * @param p_alto
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        setOrigen(p_origen);
        setAncho(p_ancho);
        setAlto(p_alto);
    }

    //Observadores (GETTERS)
    public Punto getOrigen(){
        return this.origen;
    }
    public double getAncho(){
        return this.ancho;
    }
    public double getAlto(){
        return this.alto;
    }

    //Mutadores (SETTERS)
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    } 
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }

    /**
     * 
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
        System.out.print("\n\t=== punto desplazado correctamente");
    }

    /**
     * Imprime en pantalla las caracteristicas del rectangulo:
     * origen, alto y ancho. Asi como su superficie y el perímetro
     */
    public void caracteristicas(){
        System.out.print("\n********** Rectangulo **********");
        System.out.printf("\nOrigen: %s - Alto: %.2f - Ancho: %.2f", this.getOrigen().coordenadas(), this.getAlto(), this.getAncho());
        System.out.printf("\nSuperficie: %.2f - Perimetro: %.2f\n", this.superficie(), this.perimetro());
    }

    public double perimetro(){
        //perimetro = 2*(l1*l2)
        return 2*(this.getAncho() + this.getAlto());
    }
    public double superficie(){
        //area = base * altura
        return this.getAncho() * this.getAlto();
    }

    public double distanciaA(Rectangulo otroRectangulo){
        double distancia = this.getOrigen().distanciaA(otroRectangulo.getOrigen());
        return distancia;
    }

    public Rectangulo elMayor(Rectangulo otroRectangulo){

        if(this.superficie() == otroRectangulo.superficie()){
            System.out.print("tienen la misma superficie");
            return this;
        }else if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }
        return otroRectangulo;
    }

}
