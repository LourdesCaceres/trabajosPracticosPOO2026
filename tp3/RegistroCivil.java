import java.util.Scanner;
/**
 * Clase ejecutable para instanciar objetos Hombre y Mujer; probar los métodos y
 * verificar la consistencia referencial entre ambos (0..1).
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 06/09/2026
 */
public class RegistroCivil {
    public static void main(String args []) {
        Scanner texto = new Scanner(System.in);

        System.out.println("\n=== REGISTRO CIVIL: INGRESO DE DATOS ===\n");

        // Ingreso de datos para el hombre
        System.out.println("\n--- DATOS DEL HOMBRE ---");
        System.out.print("\nNombre: ");
        String nombreH = texto.nextLine();
        System.out.print("Apellido: ");
        String apellidoH = texto.nextLine();
        System.out.print("Edad: ");
        int edadH = texto.nextInt();
        texto.nextLine();

        Hombre hombre1 = new Hombre(nombreH, apellidoH, edadH);

        // Ingreso de datos para la Mujer
        System.out.println("\n--- DATOS DE LA MUJER ---");
        System.out.print("\nNombre: ");
        String nombreM = texto.nextLine();
        System.out.print("Apellido: ");
        String apellidoM = texto.nextLine();
        System.out.print("Edad: ");
        int edadM = texto.nextInt();
        texto.nextLine(); 

        Mujer mujer1 = new Mujer(nombreM, apellidoM, edadM);

        System.out.println("\n======= VERIFICACIÓN DE ESTADO INICIAL");
        hombre1.mostrarEstadoCivil();
        mujer1.mostrarEstadoCivil();
        hombre1.casadoCon();
        mujer1.casadaCon();
        
        System.out.println("\n======= ¿Desea efectuar el matrimonio entre "
                            +mujer1.getNombre()+"y "+hombre1.getNombre()+" ?");
        System.out.println("Marque S (sí) o N (no): ");
        char respuesta = texto.next().charAt(0);
        if(respuesta == 'S' || respuesta == 's'){
            mujer1.casarseCon(hombre1);
            System.out.println("====================== ¡Felicidades oficialmente casados! ======================");
            mujer1.casadaCon();
            hombre1.casadoCon();
        }else{
            System.out.print("\n=========== TRÁMITE CANCELADO ===========");
        }

        System.out.println("\n======= ¿Desea pedir el divorcio entre "
                            +mujer1.getNombre()+"y "+hombre1.getNombre()+" ?");
        System.out.println("Marque S (sí) o N (no): ");
        char respuesta2 = texto.next().charAt(0);
        if(respuesta2 == 'S' || respuesta2 == 's'){
            mujer1.divorcio();
            System.out.println("====================== ¡TRAMITE REALIZADO! ======================");
            mujer1.getEstadoCivil();
            hombre1.getEstadoCivil();
        }else{
            System.out.print("\n =========== TRÁMITE CANCELADO ===========");        
        }
        
        // --- PRUEBA DEL SEGUNDO CONSTRUCTOR ---
        System.out.println("\nIngresando datos de una nueva pareja...");

        System.out.print("\nNombre del Hombre: ");
        String nombreH2 = texto.nextLine();

        System.out.print("Apellido del Hombre: ");
        String apellidoH2 = texto.nextLine();

        System.out.print("Edad del Hombre: ");
        int edadH2 = texto.nextInt();
        texto.nextLine(); // Limpieza del búfer tras lectura de entero

        Hombre hombre2 = new Hombre(nombreH2, apellidoH2, edadH2);

        System.out.print("\nNombre de la Mujer: ");
        String nombreM2 = texto.nextLine();

        System.out.print("Apellido de la Mujer: ");
        String apellidoM2 = texto.nextLine();

        System.out.print("Edad de la Mujer: ");
        int edadM2 = texto.nextInt();
        texto.nextLine(); // Limpieza del búfer tras lectura de entero

        // Instanciación vinculada mediante el 2do constructor
        Mujer mujer2 = new Mujer(nombreM2, apellidoM2, edadM2, hombre2);

        // Muestra de estados actualizados
        hombre2.mostrarEstadoCivil();
        mujer2.mostrarEstadoCivil();
        hombre2.casadoCon();
        mujer2.casadaCon();

        System.out.println("\n====== ¿Desea pedir el divorcio entre " + mujer2.getNombre() + " y " + hombre2.getNombre() + " ?");
        System.out.println("Marque S (sí) o N (no):");
        String opcion = texto.nextLine();

        if (opcion.equalsIgnoreCase("S")) {
            mujer2.divorcio();
            System.out.println("\n============ ¡Divorcio realizado con éxito! ============");
            mujer2.mostrarEstadoCivil();
            hombre2.mostrarEstadoCivil();
        }
        texto.close();
    }
}
