
/**
 * Clase que simula el funcionamiento de una caja de ahorro
 * en un banco.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 27/08/2026
 */
public class CajaDeAhorro
{
    //ATRIBUTOS
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;

    /**
     * PRIMER CONSTRUCTOR DE LA CALSE CajaDeAhorro
     * Por defecto el saldo es 0 y las extracciones posibles son 10,
     * simula la creación de una cuenta nueva.
     * 
     * @param p_nroCuenta: int - numero de cuenta de la persona.
     * @param p_titular: Persona - la persona titular de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(0);
        setExtraccionesPosibles(10);
    }
    
    /**
     * PRIMER CONSTRUCTOR DE LA CALSE CajaDeAhorro
     * Ya posee un saldo pero las extracciones son por defecto.
     * 
     * @param p_nroCuenta: int - numero de cuenta de la persona.
     * @param p_saldo: double - saldo de la cuenta.
     * @param p_titular: Persona - la persona titular de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, double p_saldo, Persona p_titular){
        setNroCuenta(p_nroCuenta);
        setTitular(p_titular);
        setSaldo(p_saldo);
        setExtraccionesPosibles(10);
    }

    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    
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
     * que el importe no sea mayor al saldo ni las extracciones posibles menores a 0.
     * 
     * @param p_importe: double - importe que se desea extraer.
     * @return verdadero o falso según si se puede extraer o no.
     */
    private boolean puedeExtraer(double p_importe){
        if(this.getSaldo() > p_importe && this.getExtraccionesPosibles() > 0){
            return true;
        }else{
        return false;
    }
    }
    
    /**
     * Sigue el procedimiento para extraer un importe del saldo.
     * Primero verifica a través de un if anidado si cumple las condiciones, si no cumple una
     * indica un mensaje con el problema; si cumple ambas, llama al método que 
     * extrae el dinero y muestra un mensaje.
     * 
     * @param p_importe: double - importe a extraer.
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == false && this.getExtraccionesPosibles() <= 0){
            System.out.println("No tiene habilitadas más extracciones!");
        }else if(this.puedeExtraer(p_importe) == false && this.getSaldo() < p_importe){
            System.out.println("No puede extraer más que el saldo!");
        }else{
            this.extraccion(p_importe);
            System.out.println("Se extrajo $" + p_importe + " de la caja de ahorro.");
        }
    }
    
    /**
     * Extrae el importe, actualiza el saldo y resta una de las extracciones posibles.
     * 
     * @param p_importe: double - importe que será extraído.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /**
     * Imprime en pantalla los datos de la caja de ahorro.
     * Imprime el numero de cuenta, el saldo, el titular y cuántas extracciones
     * le queda.
     */
    public void mostrar(){
        System.out.println("-Caja de Ahorro-");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}