import java.util.*;
/**
 * La clase alumno abstrae datos básicos de una persona como su nombre y apellido,
 * junto a datos acádemicos como libreta universitaria y dos notas para promediar,
 * simulando un estudiante de una materia.
 * Esta es una actualización de un trabajo anterior,
 * agregamos documentación y la pseudovariable "this".
 * La tercera actualización lo hace una subclase de la clase Persona.
 * 
 * @author Chavez, Tobías Acdel
 * @version 2.0 - 14/09/2026
 * @version 3.0 - 28/09/2026
 */
public class Alumno extends Persona
{
    //ATRIBUTOS
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    /**
     * CONSTRUCTOR DE LA CLASE Alumno
     * 
     * @param p_lu : int - libreta universitaria del alumno.
     * @param p_nombre: String - nombre del alumno.
     * @param p_apellido: String - apellido del alumno.
     */
    public Alumno(int p_lu, int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        super(p_dni, p_nombre, p_apellido, p_fecha);
        this.setLu(p_lu);
    }
    
    //SETTERS
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    public void setNota1(double p_nota1){
        this.nota1 = p_nota1;
    }
    
    public void setNota2(double p_nota2){
        this.nota2 = p_nota2;
    }
    
    //GETTERS
    public int getLu(){
        return this.lu;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public double getNota1(){
        return this.nota1;
    }
    
    public double getNota2(){
        return this.nota2;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Concatena el nombre y el apellido del alumno y lo retorna.
     * Con la actualización de este código, utiliza el mismo método
     * de la superclase. Elegimos no eliminar este método para que quede constancia.
     * 
     * @return cadena con el nombre y el apellido del alumno.
     */
    public String nomYApe(){
        return super.nomYApe();
    }
    
    /**
     * Concatena el apellido y el nombre del alumno y lo retorna.
     * Con la actualización de este código, utiliza el mismo método
     * de la superclase. Elegimos no eliminar este método para que quede constancia.
     * 
     * @return cadena con el apellido y el nombre del alumno.
     */
    public String apeYNom(){
        return super.apeYNom();
    }
    
    /**
     * Obtiene y suma las notas del alumno, guardando el resultado en una
     * variable temporal y luego la divide por 2 (cantidad de notas).
     * 
     * @return promedio del alumno que fue calculado.
     */
    public double promedio(){
        double sumaNotas = this.getNota1() + this.getNota2();
        return sumaNotas / 2;
    }
    
    /**
     * Comprueba si un alumno aprueba mediante una estructura if. Verifica que
     * el promedio sea mayor o igual a 7 y las notas individuales mayores o
     * iguales a 6.
     * 
     * @return true o false según si el alumno aprueba o no.
     */
    private boolean aprueba(){
        if(this.promedio() >= 7.0 && this.getNota1() >= 6.0 && this.getNota2() >= 6.0){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Si el alumno aprueba devuelve una leyenda con el mensaje APROBADO, caso 
     * contrario, devuelve DESAPROBADO.
     * 
     * @return cadena APROBADO/DESAPROBADO según el valor de aprueba().
     */
    private String leyendaAprueba(){
        if(aprueba() == true){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    }
    
    /**
     * Redefine el método mostrar() de la superclase Persona.
     * Imprime los datos de la persona como ser su nombre, apellido y DNI a través del método de la superclase
     * y luego imprime los datos académicos como ser la LU, notas y su promedio indicando si aprueba o no.
     */
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("L.U: " + this.getLu() + "  Notas: " + this.getNota1() + "-" + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    }
}                                    