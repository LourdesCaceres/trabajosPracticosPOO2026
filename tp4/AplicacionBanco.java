import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase ejecutable para probar las funcionalidades de la clase Banco
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 07/09/2026
 * 
 */
public class AplicacionBanco {
    /**
     * Solicita por consola los datos para instanciar un objeto Empleado.
     * @param p_texto Instancia de Scanner para la lectura de datos.
     * @return Nuevo objeto Empleado inicializado.
     */    
    public static Empleado datosEmpleado(Scanner p_texto){
        
        System.out.print("----------------- DATOS DEL EMPLEADO: ");

        System.out.print("\nNombre: ");
        String nombre = p_texto.nextLine();
        
        System.out.print("Apellido: ");
        String apellido = p_texto.nextLine();
        
        System.out.print("\nCUIL: ");
        long cuil = p_texto.nextLong();
        
        System.out.print("\nSueldo base: $");
        double sueldoBase = p_texto.nextDouble();
        p_texto.nextLine();

        System.out.print("Ingrese el año ingreso:");
        int anioIng = p_texto.nextInt();

        p_texto.nextLine();

        return new Empleado(cuil, apellido, nombre, sueldoBase, anioIng);
    }
    public static void main (String arg []){
        
        Scanner texto = new Scanner(System.in);

        //nueva instancia Localidad
        Localidad localidad1 = new Localidad("San Miguel","Corrientes");
        
        //ingreso de datos
        System.out.print("\nSUCURSAL de la LOCALIDAD: "+localidad1.getNombre()+" - "
                            +localidad1.getProvincia());
        System.out.print("\nEscriba el nombre de la sucursal: ");
        String nombreSuc = texto.nextLine();
        System.out.print("\nNro de sucursal: ");
        int nroSucursal = texto.nextInt();
        texto.nextLine();

        //instancia Banco
        Banco banco1 = new Banco(nombreSuc, localidad1, nroSucursal, datosEmpleado(texto));
        
        /*utiizar un while para ingresar varios */
        char respuesta;
        System.out.print("\n\n==================== Registro de nuevos empleados ====================\n");
        do{
            System.out.println("Agregar otro empleado?(s-si / n-no): ");
            respuesta = texto.nextLine().charAt(0);

            if(respuesta == 'S' || respuesta == 's'){
                Empleado nuevoEmpleado = datosEmpleado(texto);
                banco1.agregarEmpleado(nuevoEmpleado);
            }
        }while(respuesta == 'S' || respuesta == 's');

        //SEGUNDO CONTRUCTOR - que recibe una lista de empleados
        Localidad localidad2 = new Localidad("CaaCati","Corrientes");

        //ingreso de datos para la segunda sucursal
        System.out.print("\nSUCURSAL de la LOCALIDAD: "+localidad2.getNombre()+" - "
                            +localidad2.getProvincia());
        System.out.print("\nEscriba el nombre de la sucursal: ");
        String nombreSuc2 = texto.nextLine();
        System.out.print("\nNro de sucursal: ");
        int nroSuc2 = texto.nextInt();
        texto.nextLine();

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        int rta;
        System.out.println("Lista de empeados de la segunda sucursal...");
        do {
            listaEmpleados.add(datosEmpleado(texto));
            System.out.println("Agregar otro empleado?(1-si / 0 -no): ");
            rta = texto.nextInt();
            texto.nextLine();
        } while (rta == 1);

        Banco banco2 = new Banco(nombreSuc2, localidad2, nroSuc2, listaEmpleados);

        System.out.println("==================== NOMINA DE EMPLEADOS  ====================");
        banco1.mostrar();

        System.out.println("==================== NOMINA DE EMPLEADOS ====================");
        banco2.mostrar();
        int totalEmpleados = banco2.getEmpleados().size();
        
        //eliminar un empleado de la lista
        Empleado desempleado = banco2.getEmpleados().get(totalEmpleados -1);
        banco2.quitarEmpleado(desempleado);
        System.out.println("\nEmpleado despedido...");
        
        banco2.mostrar();
        texto.close();
    }    
}
