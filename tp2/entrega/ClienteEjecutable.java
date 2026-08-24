
/**
 * Clase ejecutable para la clase Cliente. los objetos se instancian mediante argumentos del main y se prueban los métodos
 * públicos.
 * 
 * @author Chavez, Tobías Acdel. 
 * @version 1.0
 */
public class ClienteEjecutable
{
    /**
     * Método main()
     * Diseñado para ingresar argumentos, los cuales serán los atributos del cliente (dni, nombre, apellido y saldo),
     * serán recibidos como Strings por lo que dni y saldo son parseados a sus respectivos tipos de datos.
     * Se instancia un objeto de clase Cliente con estos datos y se prueban los métodos agregarSaldo() y mostrar() para
     * ver el resultado, se prueba nuevoSaldo() y se vuelve a usar mostrar() para ver el correcto funcionamiento.
     */
    public static void main(String args[]){
        int dni = Integer.parseInt(args[0]);
        double saldo = Double.parseDouble(args[3]);
        Cliente cliente1 = new Cliente(dni, args[1], args[2], saldo);
        
        cliente1.agregarSaldo(5000.0);
        cliente1.mostrar();
        cliente1.nuevoSaldo(2000.0);
        cliente1.mostrar();
        
    }
}