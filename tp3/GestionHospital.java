import java.util.Scanner;
/**
 * Clase ejecutable para las clases Hospital, Paciente y Localidad.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0 - 31/08/2026
 */
public class GestionHospital
{
    /**
     * Instancia por teclado un objeto de la clase Hospital,
     * luego instancia un objeto Paciente con sus debidas localidades
     * de nacimiento y residencia. Finalmente muestra los datos por pantalla.
     */
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---HOSPITAL---");
        System.out.println("Ingrese el nombre del hospital.");
        String nombreHosp = teclado.nextLine();
        System.out.println("Ingrese el nombre del director.");
        String nombreDirec = teclado.nextLine();
        
        Hospital hospi1 = new Hospital(nombreHosp, nombreDirec);
        System.out.println("Hospital ingresado. Presione Enter para continuar.");
        teclado.nextLine();
        
        System.out.print('\u000C');
        System.out.println("---PACIENTE---");
        System.out.println("Ingrese la historia clínica del paciente.");
        int histClinica = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre del paciente.");
        String nombrePacien = teclado.nextLine();
        System.out.println("Ingrese el domicilio del paciente.");
        String domicilio = teclado.nextLine();
        
        System.out.println("Ingrese el nombre de la localidad donde nació el paciente.");
        String nomLocalNac = teclado.nextLine();
        System.out.println("Ingrese la provincia de la localidad donde nació el paciente.");
        String provLocalNac = teclado.nextLine();
        
        System.out.println("\n***LOCALIDAD DE NACIMIENTO***");
        Localidad localNacimiento1 = new Localidad(nomLocalNac, provLocalNac);
        System.out.println(localNacimiento1.mostrar());
        
        System.out.println("\n");
        System.out.println("Ingrese el nombre de la localidad donde vive el paciente.");
        String nomLocalVive = teclado.nextLine();
        System.out.println("Ingrese la provincia de la localidad donde vive el paciente.");
        String provLocalVive = teclado.nextLine();
        
        System.out.println("\n***LOCALIDAD DE VIVIENDA***");
        Localidad localVive1 = new Localidad(nomLocalVive, provLocalVive);
        System.out.println(localVive1.mostrar());
        
        System.out.println("\n");
        Paciente paciente1 = new Paciente(histClinica, nombrePacien, domicilio, localNacimiento1, localVive1);
        System.out.println(paciente1.cadenaDeDatos());
        teclado.nextLine();
        
        System.out.print('\u000C');
        hospi1.consultaDatosFiliatorios(paciente1);
        
    }
}