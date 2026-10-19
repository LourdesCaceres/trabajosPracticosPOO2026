import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase ejecutable para la clase Facultad y todas las clases que se toman
 * en consideración.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 18/10/2026
 */
public class AplicacionFacultad
{
    /**
     * El código combina partes con ingreso por teclad y otras con constantes para reducir
     * código y poder probar la mayor parte de funcionalidades. Se istancian 6 cargos y se listan
     * de formas distintas, probando cantidades erroneas (deben ser 3 cargos). Se pide información sobre la
     * facultad y los datos personales de los profesores, se instancia la facultad y se prueba a listar y hacer la nomina.
     */
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        Cargo cargo1 = new Cargo("Titular-Sistemas", 5000.0, 2015);
        Cargo cargo2 = new Exclusivo("JTP-Algebra", 8000.0, 2008, 12, 6, 8);
        Cargo cargo3 = new SemiExclusivo("Adjunto-Logica", 7000.0, 2010, 12, 8);
        Cargo cargo4 = new Cargo("JTP-Sistemas", 4500.0, 2016);
        Cargo cargo5 = new Exclusivo("JTP-POO", 9000.0, 2016, 12, 8, 8);
        Cargo cargo6 = new SemiExclusivo("Titular-Logica", 6000.0, 2010, 10, 6);
        
        ArrayList<Cargo> listaCargos1 = new ArrayList<Cargo>();
        listaCargos1.add(cargo1);
        listaCargos1.add(cargo2);
        listaCargos1.add(cargo3);
        listaCargos1.add(cargo4);
        
        ArrayList<Cargo> listaCargos2 = new ArrayList<Cargo>();
        listaCargos2.add(cargo5);
        listaCargos2.add(cargo6);
        
        ArrayList<Cargo> listaCargos3 = new ArrayList<Cargo>();
        listaCargos3.add(cargo2);
        listaCargos3.add(cargo4);
        listaCargos3.add(cargo6);
        
        Profesor prof1;
        Profesor prof2;
        Profesor prof3;
        
        
        System.out.println("Ingrese el nombre de la facultad.");
        teclado.nextLine();
        String nombreFacu = teclado.nextLine();
        
        System.out.println("---PROFESOR 1---");
        System.out.println("Ingrese el nombre");
        teclado.nextLine();
        String nombreProf1 = teclado.nextLine();
        System.out.println("Ingrese el apellido");
        String apeProf1 = teclado.nextLine();
        System.out.println("Ingrese el DNI");
        int dniProf1 = teclado.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int añoProf1 = teclado.nextInt();
        System.out.println("Ingrese el titulo del profesor");
        teclado.nextLine();
        String tituProf1 = teclado.nextLine();
        
        if(listaCargos1.size() == 3){
            prof1 = new Profesor(dniProf1, nombreProf1, apeProf1, añoProf1, tituProf1, listaCargos1);
        }else{
            System.out.println("Cada profesor debe tener 3 cargos. Eliminando cargo extra...");
            listaCargos1.remove(cargo4);
            prof1 = new Profesor(dniProf1, nombreProf1, apeProf1, añoProf1, tituProf1, listaCargos1);
        }
        
        System.out.println("---PROFESOR 2---");
        System.out.println("Ingrese el nombre");
        teclado.nextLine();
        String nombreProf2 = teclado.nextLine();
        System.out.println("Ingrese el apellido");
        String apeProf2 = teclado.nextLine();
        System.out.println("Ingrese el DNI");
        int dniProf2 = teclado.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int añoProf2 = teclado.nextInt();
        System.out.println("Ingrese el titulo del profesor");
        teclado.nextLine();
        String tituProf2 = teclado.nextLine();
        
        if(listaCargos2.size() == 3){
            prof2 = new Profesor(dniProf2, nombreProf2, apeProf2, añoProf2, tituProf2, listaCargos2);
        }else{
            System.out.println("Cada profesor debe tener 3 cargos. Agregando cargo extra...");
            listaCargos2.add(cargo2);
            prof2 = new Profesor(dniProf2, nombreProf2, apeProf2, añoProf2, tituProf2, listaCargos2);
        }
        
        System.out.println("---PROFESOR 3---");
        System.out.println("Ingrese el nombre");
        teclado.nextLine();
        String nombreProf3 = teclado.nextLine();
        System.out.println("Ingrese el apellido");
        String apeProf3 = teclado.nextLine();
        System.out.println("Ingrese el DNI");
        int dniProf3 = teclado.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int añoProf3 = teclado.nextInt();
        System.out.println("Ingrese el titulo del profesor");
        teclado.nextLine();
        String tituProf3 = teclado.nextLine();
        
        prof3 = new Profesor(dniProf3, nombreProf3, apeProf3, añoProf3, tituProf3, listaCargos3);
        
        Facultad facuPrueba1 = new Facultad(nombreFacu, prof1);
        facuPrueba1.agregarProfesor(prof2);
        facuPrueba1.agregarProfesor(prof3);
        
        ArrayList<Profesor> listaProfs = new ArrayList<Profesor>();
        listaProfs.add(prof1);
        listaProfs.add(prof2);
        listaProfs.add(prof3);
        
        Facultad facuPrueba2 = new Facultad(nombreFacu, listaProfs);
        
        System.out.println("Facultad creada exitosamente!\n");
        
        facuPrueba2.listarProfesorCargos();
        facuPrueba2.nominaProfesores();
    }
}