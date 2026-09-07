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
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n=== REGISTRO CIVIL: INGRESO DE DATOS ===\n");

        System.out.println("\n--- DATOS DEL HOMBRE ---");
        System.out.print("\nNombre: ");
        String nombreH = teclado.nextLine();
        System.out.print("\nApellido: ");
        String apellidoH = teclado.nextLine();
        System.out.print("Edad: ");
        int edadH = teclado.nextInt();
        teclado.nextLine();

        Hombre hombre1 = new Hombre(nombreH, apellidoH, edadH);

        // --- Lectura de datos para la primera Mujer ---
        System.out.println("\n--- DATOS DE LA MUJER ---");
        System.out.print("Nombre: ");
        String nombreM = teclado.nextLine();
        System.out.print("Apellido: ");
        String apellidoM = teclado.nextLine();
        System.out.print("Edad: ");
        int edadM = teclado.nextInt();
        teclado.nextLine(); 

        Mujer mujer1 = new Mujer(nombreM, apellidoM, edadM);

        // --- 1. ESTADO INICIAL (CONSTRUCTOR DE 3 PARÁMETROS) ---
        System.out.println("\n========================================");
        System.out.println("1. VERIFICACIÓN DE ESTADO INICIAL");
        System.out.println("========================================");
        hombre1.mostrarEstadoCivil();
        mujer1.mostrarEstadoCivil();
        hombre1.casadoCon();
        mujer1.casadaCon();

        // --- 2. EJECUCIÓN DEL MATRIMONIO ---
        System.out.println("\n================================ EJECUCIÓN DE MATRIMONIO ================================\n");
        mujer1.casarseCon(hombre1);

        // Verificación de sincronización bidireccional
        hombre1.mostrarEstadoCivil();
        mujer1.mostrarEstadoCivil();
        hombre1.casadoCon();
        mujer1.casadaCon();

        // --- 3. EJECUCIÓN DEL DIVORCIO ---
        System.out.println("\n================================ EJECUCIÓN DE DIVORCIO ================================\n");
        hombre1.divorcio();

        // Verificación de ruptura bidireccional
        hombre1.mostrarEstadoCivil();
        mujer1.mostrarEstadoCivil();
        hombre1.casadoCon();
        mujer1.casadaCon();

        // --- 4. PRUEBA DEL SEGUNDO CONSTRUCTOR ---
        System.out.println("\nIngresando datos de una nueva pareja...");

        System.out.print("\nNombre del Hombre: ");
        String nombreH2 = teclado.nextLine();
        System.out.print("Apellido del Hombre: ");
        String apellidoH2 = teclado.nextLine();
        System.out.print("Edad del Hombre: ");
        int edadH2 = teclado.nextInt();
        teclado.nextLine();

        Hombre hombre2 = new Hombre(nombreH2, apellidoH2, edadH2);

        System.out.print("\nNombre de la Mujer: ");
        String nombreM2 = teclado.nextLine();
        System.out.print("Apellido de la Mujer: ");
        String apellidoM2 = teclado.nextLine();
        System.out.print("Edad de la Mujer: ");
        int edadM2 = teclado.nextInt();
        teclado.nextLine();

        // Instanciación usando el 2do constructor (vincula a hombre2 directamente)
        Mujer mujer2 = new Mujer(nombreM2, apellidoM2, edadM2, hombre2);

        // Verificación de casamiento automático al instanciar
        hombre2.mostrarEstadoCivil();
        mujer2.mostrarEstadoCivil();
        hombre2.casadoCon();
        mujer2.casadaCon();

        teclado.close();
    }
}
