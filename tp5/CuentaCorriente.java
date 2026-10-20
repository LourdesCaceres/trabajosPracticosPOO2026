/**
 * Subclase de CuentaBancaria que simula el funcionamiento de la cuenta corriente de un banco.
 * 
 * @author Chavez, Tobías Acdel y Lourdes G. Caceres
 * @version 1.0 - 30/08/2026
 * @version 2.0 - 08/10/2026
 */
public class CuentaCorriente extends CuentaBancaria{
    //nuevos atributos de instancia
    private double limiteDescubierto;

    /**
     * Primer constructor de la clase CuentaCorriente
     * 
     * @param
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500.00);
    }
    /**
     * Segundo constructor de la clase CuentaCorriente
     * 
     * @param
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500.00);
    }
    //Mutadores (SETTERS)
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    //Observadores (GETTERS)
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    /**
     * Implementacion del método puedeExtraer()
     * 
     * @param p_importe
     */
    @Override 
    protected boolean puedeExtraer(double p_importe){
        if(p_importe > (this.getSaldo() + this.getLimiteDescubierto())){
            return false;
        }
        return true;
    }
    /**
     * Implementacion del método xQueNoPuedeExtraer()
     * 
     * @param p_importe
     */
    @Override 
    public String xQNoPuedeExtraer(double p_importe){
        return "El importe de extraccion sobrepasa el límite de descubierto!";
    }
    /**
     * Redefinicion del método mostrar()
     */
    @Override 
    public void mostrar(){
        System.out.println("- Cuenta Corriente -");
        super.mostrar();
        System.out.println("Descubierto " + this.getLimiteDescubierto());        
    }

}