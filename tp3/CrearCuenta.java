import java.util.Random;
import java.util.Scanner;
/**
 * Clase ejecutable para instanciar y probar objetos de la Clase CuentaBancaria y Persona
 * recibiendo sus datos desde la consola
 * el usuario puede probar los distintos métodos atraves de un menú intactivo.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 31/08/2026
 */
public class CrearCuenta {
    public static void main (String args []){
        
        Scanner texto = new Scanner(System.in);
        
        Random aleatorio = new Random();

        //nueva instancia Persona
        
        System.out.print("\n******** Nueva cuenta bancaria ---  Banco X ********");
        System.out.print("\n\tDatos del titular: ");
        System.out.print("\n- Nombre /s: ");
        String p_nombre = texto.nextLine();
        System.out.print("\n- Apellido /s: ");
        String p_apellido = texto.nextLine();
        System.out.print("\n- DNI: ");
        int p_DNI = texto.nextInt();
        System.out.print("\n- Año de nacimiento: ");
        int p_anio = texto.nextInt();

        Persona persona1 = new Persona(p_DNI, p_nombre, p_apellido, p_anio);
        
        //nueva instancia CuentaBancaria 
        CuentaBancaria cuenta1;

        //genera un aleatorio de 8 dígitos: entre 10_000_000 a 99_999_999
        int min = 10000000;
        int max = 100000000;
        int nroCuenta = aleatorio.nextInt(max - min) - min;

        System.out.print("\n- Desea agregar un saldo inicial a la cuenta (s - si ; n - no): ");
        char eleccion = texto.next().charAt(0);

        if(eleccion == 's' || eleccion == 'S'){
            System.out.print("\n- Ingrese el monto del saldo: $");
            double saldo = texto.nextDouble();
            // Asignación utilizando el constructor de 3 parámetros
            cuenta1 = new CuentaBancaria(nroCuenta, persona1, saldo);
        }else{
            // Asignación utilizando el constructor de 2 parámetros
            cuenta1 = new CuentaBancaria(nroCuenta, persona1);
        }

        //verificacion de métodos - mediante menú
        int opcion = 0;
        do {
            System.out.print("\n\n******** MENU  ---  Banco X ********");
            System.out.print("\n----- ELIJA UNA OPCION: "+"\n1) Realizar DEPOSITO: "+"\n2) Realizar EXTRACCION: "
                                +"\n3) Mostrar Resumen: "+"\n4) Salir...");
            opcion = texto.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el monto a depositar $");
                    double deposito = texto.nextDouble(); 
                    cuenta1.depositar(deposito);
                    System.out.print(""+cuenta1.toString());
                    break;
                case 2:
                    System.out.print("\nIngrese el monto a extraer $");
                    double extraccion = texto.nextDouble();
                    cuenta1.extraer(extraccion);
                    System.out.print(""+cuenta1.toString());
                    break;
                case 3:
                    cuenta1.mostrar();
                    break;
                default: 
                    System.out.println("\t...Saliendo ");
                    break;
            }
        } while (opcion < 4);
        
        texto.close();
    }
}