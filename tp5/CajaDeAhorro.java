/**
 * Subclase de CuentaBancaria, que simula el funcionamiento de una caja de ahorro en un banco.
 * 
 * @author Chavez, Tobías Acdel y Lourdes G. Caceres 
 * @version 1.0 - 27/08/2026
 * @version 2.0 - 08/10/2026
 */
public class CajaDeAhorro extends CuentaBancaria {

    //nuevos atributos de instancia
    private int extraccionesPosibles;

    /**
     * Primer constructor de la Clase CajaDeAhorro. 
     * El saldo de la cuenta es 0.0 y la cant. maxima de extracciones es 10.
     * 
     * @param p_nroCuenta
     * @param p_titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
    }
    /**
     * Segundo constructor de la Clase CajaDeAhorro. 
     * Con un saldo inicial y la cant. maxima de extracciones es 10.
     * 
     * @param p_nroCuenta
     * @param p_titular
     * @param p_saldo
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    //Mutadores (SETTERS)
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    //Observadores (GETTERS)
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }

    /**    
     * Implementacion del método abstracto puedeExtraer() 
     * 
     * 
     * @return true o false
     */
    @Override 
    protected boolean puedeExtraer(double p_importe){
        if(this.getSaldo() >= p_importe && this.getExtraccionesPosibles() > 0){
            return true;
        }
        return false;
    }
    /**
     * Implementacion del método abstracto xQueNoPuedeExtraer
     * 
     * @return 
     */
    @Override 
    public String xQNoPuedeExtraer(double p_importe){
        if(this.puedeExtraer(p_importe) == false && this.getExtraccionesPosibles() <= 0){
            return "No tiene habilitadas más extracciones!";
        }else if(this.puedeExtraer(p_importe) == false && this.getSaldo() < p_importe){
            return "No puede extraer más que el saldo!";
        }
        return "Error Sistema";
    }
    /**
     * Redefinición del método extraer()
     * 
     * @param p_importe
     * @return true y false
     */
    @Override 
    public boolean extraer(double p_importe){
        if(super.extraer(p_importe)){
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
            return true;
        }
        return false;
    }
    /**
     * Redefinición del método mostrar para la clase CajaDeAhorro
     */
    @Override 
    public void mostrar(){
        System.out.println("-Caja de Ahorro-");
        super.mostrar();
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }

}
