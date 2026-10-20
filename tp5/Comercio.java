import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Clase ejecutable Comercio. Mantiene la colección de artefactos que ofrece el comercio,
 * simula consultas de crédito de los clientes y ofrece un menú de opciones.
 * La colección es de tipo ArtefactoHogar: contiene cocinas, heladeras y lavarropas, y
 * los mensajes imprimir() y creditoConAdicional() se resuelven según la clase real de cada objeto.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 - 20/10/2026
 */
public class Comercio {

    /**
     * Agrega un artefacto a la colección.
     * 
     * @param p_lista: ArrayList<ArtefactoHogar> - colección de artefactos.
     * @param p_artefacto: ArtefactoHogar - artefacto a agregar.
     * @return verdadero si se agregó.
     */
    public static boolean agregarArtefacto(ArrayList<ArtefactoHogar> p_lista, ArtefactoHogar p_artefacto){
        return p_lista.add(p_artefacto);
    }

    /**
     * Quita un artefacto de la colección.
     * 
     * @param p_lista: ArrayList<ArtefactoHogar> - colección de artefactos.
     * @param p_artefacto: ArtefactoHogar - artefacto a quitar.
     * @return verdadero si el artefacto estaba en la colección y fue quitado.
     */
    public static boolean quitarArtefacto(ArrayList<ArtefactoHogar> p_lista, ArtefactoHogar p_artefacto){
        return p_lista.remove(p_artefacto);
    }

    /**
     * Lista los artefactos numerados, sin conocer de qué clase es cada uno (polimorfismo).
     * 
     * @param p_lista: ArrayList<ArtefactoHogar> - colección de artefactos.
     */
    public static void listarArtefactos(ArrayList<ArtefactoHogar> p_lista){
        int numero = 1;
        for(ArtefactoHogar artefacto : p_lista){
            System.out.println("[" + numero + "]");
            artefacto.imprimir();
            System.out.println();
            numero++;
        }
    }

    /**
     * Simula la consulta de un cliente: muestra el artefacto, las condiciones del crédito,
     * el valor de la cuota y el valor de la cuota con adicionales.
     * 
     * @param p_artefacto: ArtefactoHogar - artefacto consultado.
     * @param p_cuotas: int - cantidad de cuotas (mayor que 0).
     * @param p_interes: float - interés en porcentaje.
     */
    public static void consultarCredito(ArtefactoHogar p_artefacto, int p_cuotas, float p_interes){
        p_artefacto.imprimir();
        System.out.println("Cuotas: " + p_cuotas + " - Interés: " + p_interes + "%");
        // Locale.US: asegura el punto decimal independientemente de la configuración regional
        System.out.println(String.format(Locale.US, "Valor Cuota: %.2f",
                            p_artefacto.cuotaCredito(p_cuotas, p_interes)));
        System.out.println(String.format(Locale.US, "Valor Cuota Con Adicionales: %.2f",
                            p_artefacto.creditoConAdicional(p_cuotas, p_interes)));
        System.out.println();
    }

    /**
     * Lee por teclado un número entero, reintentando hasta que el valor ingresado sea válido.
     */
    private static int leerEntero(Scanner p_teclado, String p_mensaje){
        while(true){
            System.out.print(p_mensaje);
            try{
                return Integer.parseInt(p_teclado.nextLine().trim());
            }catch(NumberFormatException e){
                System.out.println("Valor inválido. Ingrese un número entero.");
            }
        }
    }

    /**
     * Lee por teclado un número real (acepta coma o punto decimal), reintentando hasta que sea válido.
     */
    private static float leerFloat(Scanner p_teclado, String p_mensaje){
        while(true){
            System.out.print(p_mensaje);
            try{
                return Float.parseFloat(p_teclado.nextLine().trim().replace(',', '.'));
            }catch(NumberFormatException e){
                System.out.println("Valor inválido. Ingrese un número.");
            }
        }
    }

    /**
     * Instancia los artefactos del comercio, simula consultas de clientes y
     * muestra un menú para listar, consultar un crédito o quitar artefactos.
     */
    public static void main(String arg[]){
        Scanner texto = new Scanner(System.in);
        ArrayList<ArtefactoHogar> artefactos = new ArrayList<>();

        ArtefactoHogar cocina = new Cocina("Volcan", 600.0f, 15, 4, 2000, "80*60*60cm");
        ArtefactoHogar heladera = new Heladera("Gafa", 1200.0f, 8, 11, 2, true);
        ArtefactoHogar lavarropas = new Lavarropas("Drean", 900.0f, 5, 6, 7.0f, false);

        agregarArtefacto(artefactos, cocina);
        agregarArtefacto(artefactos, heladera);
        agregarArtefacto(artefactos, lavarropas);

        System.out.println("===== SIMULACIÓN DE CONSULTAS =====\n");
        consultarCredito(cocina, 6, 2.53f);
        consultarCredito(heladera, 6, 2.53f);
        consultarCredito(lavarropas, 12, 3.1f);

        int opcion;
        do{
            System.out.println("----COMERCIO----");
            System.out.println("1) Listar artefactos.");
            System.out.println("2) Consultar crédito.");
            System.out.println("3) Quitar un artefacto.");
            System.out.println("0) Salir.");
            opcion = leerEntero(texto, "Opción: ");
            System.out.println();

            switch(opcion){
                case 1:
                    listarArtefactos(artefactos);
                    break;
                case 2:
                    if(artefactos.isEmpty()){
                        System.out.println("No hay artefactos cargados.\n");
                        break;
                    }
                    listarArtefactos(artefactos);
                    int posicion = leerEntero(texto, "Número de artefacto: ");
                    if(posicion < 1 || posicion > artefactos.size()){
                        System.out.println("El artefacto indicado no existe.\n");
                        break;
                    }
                    int cuotas = leerEntero(texto, "Cantidad de cuotas: ");
                    float interes = leerFloat(texto, "Interés (%): ");
                    if(cuotas <= 0 || interes < 0){
                        System.out.println("Las cuotas deben ser mayores que 0 y el interés no negativo.\n");
                        break;
                    }
                    System.out.println();
                    consultarCredito(artefactos.get(posicion - 1), cuotas, interes);
                    break;
                case 3:
                    listarArtefactos(artefactos);
                    int numero = leerEntero(teclado, "Número de artefacto a quitar: ");
                    if(numero >= 1 && numero <= artefactos.size()){
                        quitarArtefacto(artefactos, artefactos.get(numero - 1));
                        System.out.println("Artefacto quitado.\n");
                    }else{
                        System.out.println("El artefacto indicado no existe.\n");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida.\n");
            }
        }while(opcion != 0);
        System.out.println("***PROGRAMA FINALIZADO***");
    }
}
