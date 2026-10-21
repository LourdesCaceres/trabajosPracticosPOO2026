import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase ejecutable para Gerencia y todas las clases conjuntas a ella.
 * Simula la administración de una gerencia que alquila multiples cabañas y habitaciones
 * de hotel.
 * 
 * @author Chavez, Tobías Acdel. 
 * @version 1.0 - 20/10/2026
 */
public class AdministracionGerencia
{
    /**
     * Se instancia una primer gerencia para probar el constructor mínimo, utilizando los ejemplos
     * requeridos por la consigna, se muestran los resultados. Finalmente se instancia una segunda
     * gerencia esta vez con datos ingresados por teclado (excepto los servicios) para probar el segundo
     * constructor de Gerencia así como más métodos de Alojamiento y Gerencia.
     */
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de su gerencia");
        String nomGer1 = teclado.nextLine();
        
        Gerencia gerencia1 = new Gerencia(nomGer1);
        
        Servicio internet = new Servicio("internet", 5000.0);
        Servicio lavanderia = new Servicio("lavanderia", 2500.0);
        Servicio alquilerAuto = new Servicio("alquiler de auto", 7000.0);
        
        ArrayList<Servicio> servicios1 = new ArrayList<>();
        servicios1.add(internet);
        servicios1.add(lavanderia);
        
        Alojamiento hotel1 = new Hotel("Hotel Casino", 10000.0, 7, servicios1, "Doble");
        
        ArrayList<Servicio> servicios2 = new ArrayList<>();
        servicios2.add(alquilerAuto);
        servicios2.add(lavanderia);
        
        Alojamiento cabania1 = new Cabania("Cabaña Paraná", 12000.0, 5, servicios2, 2);
        
        //Alojamiento para probar eliminar elementos.
        Alojamiento alojamientoEliminar = new Cabania("Error", 3435.22, 4, servicios2, 5);
        
        gerencia1.agregarAlojamiento(hotel1);
        gerencia1.agregarAlojamiento(cabania1);
        gerencia1.agregarAlojamiento(alojamientoEliminar); 
        
        gerencia1.mostrarLiquidacion();
        gerencia1.quitarAlojamiento(alojamientoEliminar);
        gerencia1.mostrarLiquidacion();
        
        //PRUEBA DEL SEGUNDO CONSTRUCTOR DE Gerencia E INGRESOS POR TECLADO.
        System.out.println("Ingrese el nombre de su gerencia");
        teclado.nextLine();
        String nomGer2 = teclado.nextLine();
        
        System.out.println("NUEVA CABAÑA");
        System.out.println("Ingrese el nombre");
        String nombreCab = teclado.nextLine();
        System.out.println("Ingrese el valor de precio base");
        double precioCab = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de días a alquilar");
        int diasCab = teclado.nextInt();
        System.out.println("Ingrese la cantidad de habitaciones");
        int habitCab = teclado.nextInt();
        
        ArrayList<Servicio> servicios3 = new ArrayList<>();
        servicios3.add(alquilerAuto);
        
        Alojamiento cabania2 = new Cabania(nombreCab, precioCab, diasCab, servicios3, habitCab);
        cabania2.agregarServicio(internet);
        
        System.out.println("--NUEVA HABITACION DE HOTEL");
        teclado.nextLine();
        System.out.println("Ingrese el nombre");
        String nombreHotel = teclado.nextLine();
         System.out.println("Ingrese el valor de precio base");
        double precioHotel = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de días a alquilar");
        int diasHotel = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Qué tipo de habitación? Single/Doble");
        String tipoHab = teclado.nextLine();
        
        ArrayList<Servicio> servicios4 = new ArrayList<>();
        servicios4.add(internet);
        servicios4.add(alquilerAuto);
        servicios4.add(lavanderia);
        
        Alojamiento hotel2 = new Hotel(nombreHotel, precioHotel, diasHotel, servicios4, tipoHab);
        hotel2.quitarServicio(alquilerAuto);
        
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        alojamientos.add(cabania1);
        alojamientos.add(cabania2);
        alojamientos.add(hotel2);
        
        Gerencia gerencia2 = new Gerencia(nomGer2, alojamientos);
    }
}