
/**
 * Write a description of class Circulo here.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 24/08/2026
 */
public class Circulo
{
    // atributos
    private double radio;
    private Punto centro;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE CIRCULO
     */
    public Circulo(double p_radio, Punto p_centro)
    {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE CIRCULO
     */
    public Circulo()
    {
        this.setRadio(0);
        this.setCentro(new Punto(0,0));
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    //SETTERS
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    //GETTERS
    public double getRadio(){
        return this.radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    //Métodos de clase
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    public double perimetro(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
    
    public double superficie(){
        return 2 * Math.PI * this.getRadio();
    }
    
    public void caracteristicas(){
        System.out.println("******Circulo******");
        System.out.println("Centro: " + this.getCentro().coordenadas() + " - " + "Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " - " + "Perímetro: " + this.perimetro());
    }
    
    public double distanciaA(Circulo p_otroCirculo){
        Punto otroCentro = p_otroCirculo.getCentro();
        return this.getCentro().distanciaA(otroCentro);
    }
    
    public Circulo elMayor(Circulo p_otroCirculo){
        double superficie = this.superficie();
        double otraSuperficie = p_otroCirculo.superficie();
        
        if(superficie > otraSuperficie){
            return this;
        }else if(otraSuperficie > superficie){
            return p_otroCirculo;
        }
        
        return this;
    }
}