import java.util.HashMap;
import java.util.Scanner;
/**
 * Clase ejecutable para probar las funcionalidades de la clase Comercio 
 * 
 * @author Caceres, Lourdes G.
 * @version 1.0 14/09/2026
 */
public class GestionComercio{
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
    public static void main(String args []){
        
        Scanner texto = new Scanner(System.in);
        
        // 1. Instanciación del comercio 1 (vacio - Constructor 1)
        Comercio comercio1 = new Comercio("El corralito");
        
        // 2. Instanciación de colección inicial para el comercio 2 (Constructor 2)
        HashMap<Long, Empleado> nomina = new HashMap<Long, Empleado>();
        Empleado empleado1 = new Empleado(2034344556, "Perez", "Jose", 300000.00, 2010);
        Comercio comercio2 = new Comercio("Mayorista ElFortin", nomina);
        comercio2.altaEmpleado(empleado1);
        
        // MENU para elegir un comercio sobre el cual operar
        Comercio comercioElegido = null;
        int opcionComercio = 0;

        System.out.println("====================================================");
        System.out.println("    SISTEMA DE GESTION DE COMERCIOS Y EMPLEADOS     ");
        System.out.println("====================================================");

        // Seleccion inicial del comercio a operar
        do {
            System.out.println("\nSeleccione el Comercio a operar:");
            System.out.println("1. " + comercio1.getNombre());
            System.out.println("2. " + comercio2.getNombre());
            System.out.print("Opción: ");
            opcionComercio = texto.nextInt();
            texto.nextLine();

            if (opcionComercio == 1) {
                comercioElegido = comercio1;
            } else if (opcionComercio == 2) {
                comercioElegido = comercio2;
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (comercioElegido == null);

        //MENÚ
        int opcionMenu = 0;
        do {
            System.out.println("\n----------------------------------------------------");
            System.out.println(" COMERCIO ACTIVO: " + comercioElegido.getNombre().toUpperCase());
            System.out.println("----------------------------------------------------");
            System.out.println("1. Dar de alta un empleado");
            System.out.println("2. Dar de baja un empleado");
            System.out.println("3. Emitir nómina de sueldos (nomina)");
            System.out.println("4. Consultar sueldo neto por CUIL");
            System.out.println("5. Verificar si es empleado por CUIL (esEmpleado)");
            System.out.println("6. Ver cantidad total de empleados (cantidadDeEmpleados)");
            System.out.println("7. Cambiar de Comercio activo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            
            opcionMenu = texto.nextInt();
            texto.nextLine();

            switch (opcionMenu) {
                case 1:
                    int rta;
                    System.out.println("Lista de empleados...");
                    do {
                        comercioElegido.altaEmpleado(datosEmpleado(texto));
                        System.out.println("Agregar otro empleado?(1-si / 0 -no): ");
                        rta = texto.nextInt();
                        texto.nextLine();
                    } while (rta == 1);
                    break;

                case 2:
                    System.out.print("\nIngrese el CUIL del empleado a dar de baja: ");
                    long cuilBaja = texto.nextLong();
                    texto.nextLine();
                    Empleado deBaja = comercioElegido.bajaEmpleado(cuilBaja);
                    if (deBaja != null) {
                        System.out.println("-> Se ha eliminado a " + deBaja.getNombre() + " " + deBaja.getApellido() + " de la plantilla.");
                    } else {
                        System.out.println("-> Error: No se encontró ningún empleado registrado con el CUIL proporcionado.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- NOMINA COMPLETA DE " + comercioElegido.getNombre() + " ---");
                    if (comercioElegido.getEmpleados().isEmpty()) {
                        System.out.println("No hay empleados registrados en la nómina.");
                    } else {
                        comercioElegido.nomina();
                    }
                    break;

                case 4:
                    System.out.print("\nIngrese el CUIL a consultar: ");
                    long cuilConsulta = texto.nextLong();
                    texto.nextLine();
                    comercioElegido.sueldoNeto(cuilConsulta);
                    break;

                case 5:
                    System.out.print("\nIngrese el CUIL a verificar: ");
                    long cuilExiste = texto.nextLong();
                    texto.nextLine();
                    if (comercioElegido.esEmpleado(cuilExiste)) {
                        System.out.println("-> PERTENECE a la nómina de la empresa.");
                    } else {
                        System.out.println("-> NO pertenece a la empresa.");
                    }
                    break;

                case 6:
                    System.out.println("\n-> El comercio '" + comercioElegido.getNombre() + 
                                       "' cuenta actualmente con " + comercioElegido.cantidadDeEmpleados() + " empleado(s).");
                    break;

                case 7:
                    if (comercioElegido == comercio1) {
                        comercioElegido = comercio2;
                    } else {
                        comercioElegido = comercio1;
                    }
                    System.out.println("-> Comercio activo cambiado a: " + comercioElegido.getNombre());
                    break;

                case 0:
                    System.out.println("\nFinalizando ejecución del sistema de gestión.");
                    break;

                default:
                    System.out.println("Opcion invalida...");
                    break;
            }

        } while (opcionMenu != 0);
        
        texto.close();
    }
}