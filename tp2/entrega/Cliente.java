
/**
 * La clase Cliente representa la abstracción de los datos de una persona cliente de un negocio, se registran
 * datos personales y el saldo. Se desarrollan métodos para actualizar y reemplazar el saldo, así como uno
 * para imprimir un mensaje con los datos del cliente.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0
 */
public class Cliente
{
    //atributos
    private int nroDNI;
    private String nombre;
    private String apellido;
    private double saldo;
    
    /**
     * CONSTRUCTOR DE LA CLASE CLIENTE
     * Única forma de instanciar un objeto con esta clase. Se interactua con los atributos mediante setters.
     * 
     * @param p_dni - DNI del cliente.
     * @param p_nombre - Nombre del cliente.
     * @param p_apellido - Apellido del cliente.
     * @param p_saldo - Saldo actual del cliente.
     */
    public Cliente(int p_dni, String p_nombre, String p_apellido, double p_saldo){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setSaldo(p_saldo);
    }
    
    //Setters de cada atributo
    private void setDNI(int p_dni){
        nroDNI = p_dni;
    }
    
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    
    private void setSaldo(double p_saldo){
        saldo = p_saldo;
    }
    
    //Getters de cada atributo
    public int getDNI(){
        return nroDNI;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    /**
     * Método nomYape()
     * Concatena el nombre y apellido del cliente separado por un espacio. Devuelve como un String.
     */
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    
    /**
     * Método apeYNom()
     * Concatena el apellido y nombre del cliente separado por un espacio. Devuelve como un String.
     */
    public String ApeYNom(){
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Método nuevoSaldo()
     * Recibe por parámetro un importe que reemplazará el importe actual del objeto de clase Cliente. Devuelve el saldo.
     */
    public double nuevoSaldo(double p_importe){
        saldo = p_importe;
        return saldo;
    }
    
    /**
     * Método agregarSaldo()
     * Recibe por parámetro un importe que se sumará al importe que tenga el objeto de clase Cliente. Devuelve el saldo.
     */
    public double agregarSaldo(double p_importe){
        saldo += p_importe;
        return saldo;
    }
    
    /**
     * Método mostrar()
     * Imprime en pantalla un mensaje con los datos del cliente con un formato específico.
     */
    public void mostrar(){
        System.out.println("\t-CLIENTE-");
        System.out.println("Nombre y Apellido: " + nomYApe() + " - DNI: " + getDNI());
        System.out.println("Saldo: " + getSaldo());
    }
}