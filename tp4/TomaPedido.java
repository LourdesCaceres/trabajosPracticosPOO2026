import java.util.Scanner;
import java.util.*;
/**
 * Clase ejecutable para la clase Pedido, mediante valores ingresados por Scanner
 * se instancian objetos necesarios y se dispone de un ingreso ilimitado de productos.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 14/09/2026
 */
public class TomaPedido
{
    /**
     * Se instancian objetos de clase Calendar, Cliente, Laboratorio y Pedido para poder formar
     * la colección, todo mediante ingreso por teclado excepto por la fecha que toma la fecha en la
     * que se ejecuta el programa.
     * Instancia un objeto de clase Producto que es con el que se iniciará la lista usando el segundo
     * constructor de la clase Pedido. Una vez creada la lista, se le preguntará al usuario si desea seguir 
     * ingresando productos a la lista, esto lo hará indefinidamente mediante una estructura while y el
     * método agregarProducto().
     * Finalizado el ingreso de productos, imprime la lista en pantalla, luego elimina el primer
     * producto ingresado y vuelve a mostrar en pantalla la lista actualizada. 
     */
    public static void main(String args[]){
        int seleccion = 0;
        Scanner teclado = new Scanner(System.in);
        
        Calendar fechaHoy = Calendar.getInstance();
        
        System.out.print("****DATOS DEL CLIENTE****");
        System.out.print("\nIngrese el DNI.");
        int dni = teclado.nextInt();
        teclado.nextLine();
        System.out.print("\nIngrese el nombre.");
        String nombre = teclado.nextLine();
        System.out.print("\nIngrese el apellido.");
        String apellido = teclado.nextLine();
        System.out.print("\nIngrese el saldo.");
        double saldo = teclado.nextDouble();
        
        Cliente cliente1 = new Cliente(dni, nombre, apellido, saldo);
        System.out.print("\nCliente ingresado! Presione ENTER para continuar.");
        teclado.nextLine();
        teclado.nextLine();
        System.out.print('\u000C');
        
        System.out.println("****INGRESO DE PRODUCTOS****");
        System.out.println("Ingrese el codigo de producto.");
        int codProd1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("\nIngrese el rubro del producto.");
        String rubro1 = teclado.nextLine();
        System.out.print("\nIngrese la descripción del producto.");
        String descripcion1 = teclado.nextLine();
        System.out.print("\nIngrese el costo del producto.");
        double costo1 = teclado.nextDouble();
        System.out.println("\n***DATOS DEL LABORATORIO***");
        teclado.nextLine();
        System.out.print("\nIngrese el nombre del laboratorio.");
        String nomLab1 = teclado.nextLine();
        System.out.print("\nIngrese el domicilio del laboratorio.");
        String domLab1 = teclado.nextLine();
        System.out.print("\nIngrese el número de teléfono del laboratorio.");
        String telLab1 = teclado.nextLine();
        
        Laboratorio lab1 = new Laboratorio(nomLab1, domLab1, telLab1);
        Producto prod1 = new Producto(codProd1, rubro1, descripcion1, costo1, lab1);
        
        Pedido unPedido = new Pedido(fechaHoy, cliente1, prod1);
        System.out.println("Creada la lista e ingresado el primer producto. Presione ENTER para continuar.");
        
        teclado.nextLine();
        System.out.print('\u000C');
        
        System.out.println("¿Desea ingresar otro producto?");
        System.out.println("1-SI \t 2-NO");
        seleccion = teclado.nextInt();
        
        while(seleccion == 1){
            System.out.println("****INGRESO DE PRODUCTOS****");
        System.out.println("Ingrese el codigo de producto.");
        int codProdX = teclado.nextInt();
        teclado.nextLine();
        System.out.print("\nIngrese el rubro del producto.");
        String rubroX = teclado.nextLine();
        System.out.print("\nIngrese la descripción del producto.");
        String descripcionX = teclado.nextLine();
        System.out.print("\nIngrese el costo del producto.");
        double costoX = teclado.nextDouble();
        System.out.println("\n***DATOS DEL LABORATORIO***");
        teclado.nextLine();
        System.out.print("\nIngrese el nombre del laboratorio.");
        String nomLabX = teclado.nextLine();
        System.out.print("\nIngrese el domicilio del laboratorio.");
        String domLabX = teclado.nextLine();
        System.out.print("\nIngrese el número de teléfono del laboratorio.");
        String telLabX = teclado.nextLine();
        
        Laboratorio labX = new Laboratorio(nomLabX, domLabX, telLabX);
        Producto prodX = new Producto(codProdX, rubroX, descripcionX, costoX, labX);
        
        unPedido.agregarProducto(prodX);
        
        System.out.println("Producto ingresado correctamente. Presione ENTER para continuar.");
        teclado.nextLine();
        System.out.print('\u000C');
        
        System.out.println("¿Desea ingresar otro producto?");
        System.out.println("1-SI \t 2-NO");
        seleccion = teclado.nextInt();
        }
        
        System.out.print('\u000C');
        unPedido.mostrarPedido();
        System.out.print("\nPresione ENTER para continuar.");
        teclado.nextLine();
        teclado.nextLine();
        
        unPedido.quitarProducto(prod1);
        System.out.print("\nSe eliminó el primer producto ingresado. Presione ENTER para continuar.");
        teclado.nextLine();
        System.out.print('\u000C');
        unPedido.mostrarPedido();
    }
}