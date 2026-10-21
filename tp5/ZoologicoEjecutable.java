import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * ZoologicoEjecutable. Clase ejecutable para el zoológico "El Caribú": registra visitantes y emite listados.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 18/10/2026
 */
public class ZoologicoEjecutable {
    public static void main (String args []){
        // nueva instancia Zoologico
        Zoologico zoo = new Zoologico("El Caribú");
 
        // tres individuos: uno independiente y dos que integran la delegación PAMI
        Calendar dia = new GregorianCalendar(2024, Calendar.SEPTEMBER, 22);
        Individuo independiente = new Individuo("Maria", dia, new Persona(14528796, "María", "Perez", 1970));
        Individuo integrante1   = new Individuo("Maria", dia, new Persona(23568963, "María", "Lusteau", 1970));
        Individuo integrante2   = new Individuo("Carlos", dia, new Persona(24875785, "Carlos", "Lopez", 1979));
 
        // c) delegación PAMI con sus dos individuos (el segundo intento de inscribir a uno ya inscripto se ignora)
        Delegacion pami = new Delegacion( "PAMI", dia, integrante1);
        pami.inscribirIndividuo(integrante2);
        pami.inscribirIndividuo(integrante1);
        System.out.println("Integrantes de PAMI: " + pami.cantidadIntegrantes());
 
        // se registran solo los visitantes de primer nivel: los integrantes ya están dentro de la delegación
        zoo.nuevoVisitante(independiente);
        zoo.nuevoVisitante(pami);
 
        // d) todos los visitantes del 22/09/2024
        System.out.println("\n=== Visitantes del 22/09/2024 ===");
        zoo.listarVisitantePorFecha(dia);
 
        // e) recaudación del último mes (tomando como referencia el día de la visita)
        Calendar hasta = (Calendar) dia.clone();
        Calendar desde = (Calendar) dia.clone();
        desde.add(Calendar.MONTH, -1);
        System.out.println("\n=== Recaudación del último mes: $" + zoo.recaudacion(desde, hasta) + " ===");
 
        // f) delegaciones del 22/09/2024
        System.out.println("\n=== Delegaciones del 22/09/2024 ===");
        zoo.listarTipoVisitantePorFecha(dia, pami.tipoVisitante());
 
        // personas que visitaron el zoológico, sin repetir
        System.out.println("\n=== Personas que visitaron el zoológico: " + zoo.listarPersonasQueVisitaronElZoo().size() + " ===");

    }
}
