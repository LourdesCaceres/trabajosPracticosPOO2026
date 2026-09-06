
/**
 * Clase que simula el funcionamiento de la cuenta corriente de un banco.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 30/08/2026
 */
public class CuentaCorriente
{
    // ATRIBUTOS
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;

    /**
     * PRIMER CONSTRUCTOR DE LA CALSE CuentaCorriente.
     * Por defecto el saldo es 0 y el limite de descubierto es de 500.0,
     * simula la creación de una cuenta nueva.
     * 
     * @param p_nroCuenta: int - numero de cuenta de la persona.
     * @param p_titular: Persona - la persona titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(0.0);
        setLimDescubierto(500.0);
    }
    
    /**
     * PRIMER CONSTRUCTOR DE LA CALSE CuentaCorriente.
     * Ya posee un saldo pero el limite es 500.0 por defecto.
     * 
     * @param p_nroCuenta: int - numero de cuenta de la persona.
     * @param p_saldo: double - saldo de la cuenta.
     * @param p_titular: Persona - la persona titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(p_saldo);
        setLimDescubierto(500.0);
    }
    
    //SETTERS
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setLimDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    
    //GETTERS
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double getLimDescubierto(){
        return this.limiteDescubierto;
    }
    
    //MÉTODOS DE LA CLASE
    /**
     * Recibe un importe que se sumará al saldo de la cuenta.
     * 
     * @param  p_importe: double - importe a depositar.
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Verifica si un importe cumple las condiciones de extracción, las cuáles son
     * que el importe no sea mayor al saldo sumado al limite de descubierto.
     * 
     * @param p_importe: double - importe que se desea extraer.
     * @return verdadero o falso según si se puede extraer o no.
     */
    private boolean puedeExtraer(double p_importe){
        if(p_importe > (this.getSaldo() + this.getLimDescubierto())){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Extrae el importe, actualiza el saldo.
     * 
     * @param p_importe: double - importe que será extraído.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    /**
     * Sigue el procedimiento para extraer un importe del saldo.
     * Primero verifica a través de un if si cumple las condiciones, si no cumple una
     * indica un mensaje con el problema; si cumple ambas, llama al método que 
     * extrae el dinero y muestra un mensaje.
     * 
     * @param p_importe: double - importe a extraer.
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == true){
            extraccion(p_importe);
            System.out.println("Se extrajo $" + p_importe + " de la cuenta corriente.");
        }else{
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        }
    }
    
    /**
     * Imprime en pantalla los datos de la cuenta corriente.
     * Imprime el numero de cuenta, el saldo, el titular y de cuánto es el
     * limite descubierto.
     */
    public void mostrar(){
        System.out.println("- Cuenta Corriente -");
        System.out.println("Nro.Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto " + this.getLimDescubierto());
    }
    
}