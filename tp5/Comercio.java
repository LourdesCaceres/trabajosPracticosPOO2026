import java.util.ArrayList;
import java.util.Scanner;

/**a
 * Clase ejecutable Comercio. Instancia objetos de la clase ArtefactosHogar (y las subclases) que ofrece el comercio.
 * La colección es de tipo ArtefactoHogar: contiene cocinas, heladeras y lavarropas.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 - 14/10/2026
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
            artefacto.imprimir();
            System.out.println("\n[" + numero + "]");
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
        System.out.print("\nCuotas: " + p_cuotas + " - Interés: " + p_interes + "%");
        System.out.printf("\nValor Cuota: %.2f", p_artefacto.cuotaCredito(p_cuotas, p_interes));
        System.out.printf("\nValor Cuota Con Adicionales: %.2f", p_artefacto.creditoConAdicional(p_cuotas, p_interes));
    }

    /**
     * METODO EJECUTABLE. Instancia los artefactos del comercio, simula consultas de clientes y
     * muestra un menú para listar, consultar un crédito o quitar artefactos.
     */
    public static void main(String arg[]){
        Scanner texto = new Scanner(System.in);
        ArrayList<ArtefactoHogar> artefactos = new ArrayList<>();

        ArtefactoHogar cocina = new Cocina("Volcan", 600.0f, 15, 4, 2000, "80*60*60cm");
        ArtefactoHogar heladera = new Heladera("Bambi", 1200.0f, 8, 11, 2, true);
        ArtefactoHogar lavarropas = new Lavarropas("Drean", 900.0f, 5, 6, 7.0f, false);

        agregarArtefacto(artefactos, cocina);
        agregarArtefacto(artefactos, heladera);
        agregarArtefacto(artefactos, lavarropas);

        int opcion = -1;
        do{
            System.out.print("\n\n----COMERCIO----");
            System.out.print("\n1) Listar artefactos.");
            System.out.print("\n2) Consultar crédito.");
            System.out.print("\n3) Quitar un artefacto.");
            System.out.print("\n0) Salir.");
            System.out.print("\nSeleccione una opción: ");
            opcion = texto.nextInt();

            switch(opcion){
                case 1:
                    listarArtefactos(artefactos);
                    break;
                case 2:
                    System.out.println("===== CONSULTAS =====\n");
                    consultarCredito(cocina, 3, 2.53f);
                    consultarCredito(heladera, 3, 2.53f);
                    consultarCredito(lavarropas, 6, 3.1f);
                    break;
                case 3:
                    listarArtefactos(artefactos);
                    System.out.print("\nIndique el numero del electrodomestico a quitar: ");
                    int numero = texto.nextInt();
                    quitarArtefacto(artefactos, artefactos.get(numero - 1));
                    System.out.println("Artefacto quitado.\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.print("\nOpción inválida.\n");
            }
        }while(opcion > 0 && opcion < 4);
        
        System.out.println("***PROGRAMA FINALIZADO***");
        texto.close();
    }
}

