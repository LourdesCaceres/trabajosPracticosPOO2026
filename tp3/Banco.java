import java.util.Scanner;
import java.util.*;
/**
 * Clase Ejecutable para las clases CajaDeAhorro y CuentaCorriente.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 31/08/2026
 */
public class Banco
{
    /**
     * Instancia mediante valores ingresados por teclado los datos de una persona titular
     * y su cuenta corriente y caja de ahorro. Se implementa mediante varios switch case un menú interactivo
     * que permite probar todos los métodos de las clases libremente.
     */
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---Titular---");
        System.out.println("Ingrese su dni.");
        int dni = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese su nombre.");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su apellido.");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese su año de nacimiento.");
        int anioNacimiento = teclado.nextInt();
        System.out.println("Ingrese el número de su mes de nacimiento.");
        int mesNacimiento = teclado.nextInt();
        System.out.println("Ingrese el número de su día de nacimiento.");
        int diaNacimiento = teclado.nextInt();
        
        Calendar fechaNacimiento = new GregorianCalendar(anioNacimiento, mesNacimiento - 1, diaNacimiento);
        
        Persona titular = new Persona(dni, nombre, apellido, fechaNacimiento);
        
        System.out.println("\n---Cuenta Corriente---");
        System.out.println("Ingrese el numero de cuenta.");
        int nroCtaCorriente = teclado.nextInt();
        System.out.println("Ingrese el saldo.");
        double saldo1 = teclado.nextDouble();
        
        CuentaCorriente cuenta1 = new CuentaCorriente(nroCtaCorriente, titular, saldo1);
        
        System.out.println("\n---Caja de Ahorro---");
        System.out.println("Ingrese el numero de cuenta.");
        int nroCajaAhorro = teclado.nextInt();
        System.out.println("Ingrese el saldo.");
        double saldo2 = teclado.nextDouble();
        
        CajaDeAhorro caja1 = new CajaDeAhorro(nroCajaAhorro, saldo2, titular);
        
        teclado.nextLine();
        System.out.println();
        System.out.println("Titular ingresado, junto a sus cuentas. Presione Enter para continuar.");
        teclado.nextLine();
        
        int seleccion = 0;
        
        do{
        System.out.print('\u000C');
        if(titular.esCumpleaños() == true){
            System.out.println("¡Feliz Cumpleaños " + titular.getNombre() + "!\n");
        }
        System.out.println("----BANCO----");
        System.out.println("1) Cuenta Corriente.");
        System.out.println("2) Caja de ahorro.");
        System.out.println("0) Salir.");
        
        seleccion = teclado.nextInt();
        
        switch(seleccion){
            case 1:
                int seleccionCuenta = 0;
                
                do{
                System.out.print('\u000C');
                System.out.println("----CUENTA CORRIENTE----");
                System.out.println("1) Depositar importe.");
                System.out.println("2) Extraer importe.");
                System.out.println("3) Mostrar datos.");
                System.out.println("0) Volver.");
                
                seleccionCuenta = teclado.nextInt();
                
                switch(seleccionCuenta){
                    case 1:
                        System.out.print('\u000C');
                        System.out.println("---DEPÓSITO EN CUENTA CORRIENTE---");
                        System.out.println("¿Cuánto desea depositar?");
                        double deposito1 = teclado.nextDouble();
                        cuenta1.depositar(deposito1);
                        System.out.println("Deposito realizado.");
                        
                        teclado.nextLine();
                        System.out.println();
                        System.out.println("Presione Enter para continuar.");
                        teclado.nextLine();
                        break;
                    case 2:
                        System.out.print('\u000C');
                        System.out.println("---EXTRACCIÓN EN CUENTA CORRIENTE---");
                        System.out.println("¿Cuánto desea extraer?");
                        double extraccion1 = teclado.nextDouble();
                        cuenta1.extraer(extraccion1);
                        
                        teclado.nextLine();
                        System.out.println();
                        System.out.println("Presione Enter para continuar.");
                        teclado.nextLine();
                        break;
                    case 3:
                        cuenta1.mostrar();
                        
                        teclado.nextLine();
                        System.out.println();
                        System.out.println("Presione Enter para continuar.");
                        teclado.nextLine();
                        break;
                    case 0:
                        break;
                }
                }while(seleccionCuenta != 0);
                break;
                
            case 2:
                int seleccionCaja = 0;
                
                do{
                System.out.print('\u000C');
                System.out.println("----CAJA DE AHORRO----");
                System.out.println("1) Depositar importe.");
                System.out.println("2) Extraer importe.");
                System.out.println("3) Mostrar datos.");
                System.out.println("0) Volver.");
                
                seleccionCaja = teclado.nextInt();
                
                switch(seleccionCaja){
                    case 1:
                        System.out.print('\u000C');
                        System.out.println("---DEPÓSITO EN CAJA DE AHORRO---");
                        System.out.println("¿Cuánto desea depositar?");
                        double deposito2 = teclado.nextDouble();
                        caja1.depositar(deposito2);
                        System.out.println("Deposito realizado.");
                        
                        teclado.nextLine();
                        System.out.println();
                        System.out.println("Presione Enter para continuar.");
                        teclado.nextLine();
                        break;
                    case 2:
                        System.out.print('\u000C');
                        System.out.println("---EXTRACCIÓN EN CAJA DE AHORRO---");
                        System.out.println("¿Cuánto desea extraer?");
                        double extraccion2 = teclado.nextDouble();
                        caja1.extraer(extraccion2);
                        
                        teclado.nextLine();
                        System.out.println();
                        System.out.println("Presione Enter para continuar.");
                        teclado.nextLine();
                        break;
                    case 3:
                        caja1.mostrar();
                        
                        teclado.nextLine();
                        System.out.println();
                        System.out.println("Presione Enter para continuar.");
                        teclado.nextLine();
                        break;
                    case 0:
                        break;
                }
                }while (seleccionCaja != 0);
                break;
                
            case 0:
                break;
        }
        
        }while (seleccion != 0);
        System.out.println("***PROGRAMA FINALIZADO***");
    }
}