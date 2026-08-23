
/**
 * Clase ejecutable para instanciar y probar múltiples objetos Alumno
 * recibiendo sus datos por argumentos del main.
 *
 * @author Lourdes Gabriela Caceres 
 * @version 1.0 13/08/2026
 */
public class AlumnoEjecutable{
  public static void main (String arg []){
      
      // Instanciación del Primer Alumno (índices 0, 1 y 2)
      int p_lu = Integer.parseInt(arg[0]);
      Alumno alum1 = new Alumno(p_lu, arg[1], arg[2]);
      alum1.setNota1(5.5);
      alum1.setNota2(8.0);
      
      // Instanciación del Segundo Alumno (índices 3, 4 y 5)
      Alumno alum2 = new Alumno(Integer.parseInt(arg[3]), arg[4], arg[5]);
      alum2.setNota1(7.3);
      alum2.setNota2(6.9);
      
      System.out.print("\n====== Programación Orientada a Objetos ======");
      alum1.mostrar();
      System.out.print("\n*** AyN: "+alum1.apeYNom());
      
      alum2.mostrar();
      System.out.print("\n*** AyN: "+alum2.apeYNom());
  }
}