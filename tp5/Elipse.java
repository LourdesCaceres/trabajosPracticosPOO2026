
/**
 * SuperClase Elipse
 * @author Lourdes G. Caceres
 * @version 1.0 - 28/09/2026
 */
public class Elipse {
    // atributos
    private double sEjeMayor;
    private double sEjeMenor;
    private Punto centro;

    /**
     * 
     */
    public Elipse(double p_ejeMayor, double p_ejeMenor, Punto p_centro){
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);
        this.setCentro(p_centro);
    }
    
    /**
     * 
     */
    public Elipse(double p_ejeMayor, double p_ejeMenor){
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);
        this.setCentro(new Punto(0,0));
    }

    //SETTERS
    private void setEjeMayor(double p_ejeMayor){
        this.sEjeMayor = p_ejeMayor;
    }
    private void setEjeMenor(double p_ejeMenor){
        this.sEjeMenor = p_ejeMenor;
    }
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    //GETTERS
    public double getEjeMayor(){
        return this.sEjeMayor;
    }
    public double getEjeMenor(){
        return this.sEjeMenor;
    }
    public Punto getCentro(){
        return this.centro;
    }
    
    /**
     * 
     */
    public String nombreFigura(){
        return "****** Elipse ******";
    }
    /**
     *
     */
    public void caracteristicas(){
        System.out.println("");
    }
    /**
     * 
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
     *  
     */
    public double superficie(){
        //return 2 * Math.PI * this.getRadio();
        return 0.0;
    }
    
    /**
     *  
     */
    public double distanciaA(Elipse p_otraElipse){
        Punto otroCentro = p_otraElipse.getCentro();
        return this.getCentro().distanciaA(otroCentro);
    }
    
    /**
     * 
     */
    public Elipse elMayor(Elipse p_otraElipse){
        double superficie = this.superficie();
        double otraSuperficie = p_otraElipse.superficie();
        
        if(superficie > otraSuperficie){
            return this;
        }else if(otraSuperficie > superficie){
            return p_otraElipse;
        }
        
        return this;
    }
}