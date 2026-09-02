
/**
 * Clase que representa la abstracción de una cuenta bancaria, permite registrar un nuevo titular 
 * (con sus datos personales) y administrar el saldo de la cuenta.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 31/08/2026
 */
public class CuentaBancaria {
    // variables de instancia - replace the example below with your own
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    /**
     * 1er Constructor de la clase CuentaBancaria, sin un saldo inicial
     * 
     * @param p_nroCuenta
     * @param p_titular
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    /**
     * 2do Constructor de la clase CuentaBancaria, sin un saldo inicial
     * 
     * @param p_nroCuenta
     * @param p_titular
     * @param p_saldo
     */    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }

    //Observadores (GETTERS)
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public Persona getTitular(){
        return this.titular;
    }
    
    //Mutadores (SETTERS)
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    /**
     * Incrementa el saldo actual de la cuenta tanto como se específica
     * 
     * @param  p_importe el monto que deposita el titular
     * @return  el saldo actualizado
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    /**
     * Decrementa el saldo actual de la cuenta tanto como se específica
     * 
     * @param  p_importe el monto que extrae el titular
     * @return  el saldo actualizado
     */    
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
    
    /**
     * Muestra por pantalla un informe con la informacion personal y bancaria del titular
     */
    public void mostrar(){
        System.out.print("\n-CUENTA BANCARIA - ");
        System.out.print("\nTitular: "+this.getTitular().nomYApe()+
                                    " ("+this.getTitular().edad()+" años)");
        System.out.print("\nSaldo: "+this.getSaldo());
    }
    
    /**
     * Concatena en una sola linea la informacion importante del titular
     * 
     * @return  cadena formada por el nro de cuente, el titular y el saldo actual
     */
    public String toString(){
        
        return "\n"+this.getNroCuenta()+"\t"+this.getTitular().nomYApe()+"\t"+this.getSaldo(); 
    }

}