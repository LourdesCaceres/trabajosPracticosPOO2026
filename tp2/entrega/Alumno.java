
/**
 * La clase "Alumno" representa los datos personales y académicos de
 * un alumno de la asignatura POO, y evaluar su condicion académica (promedio 
 * y condicion de aprobado).
 * 
 * @author Lourdes Gabriela Caceres 
 * @version 1.0 13/08/2026
 */
public class Alumno {
    // variables de instancia
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1; 
    private double nota2;
    
    /**
     * Constructor de la clase Alumno
     * 
     * @param p_lu Número de libreta universitaria
     * @param p_nombre Nombre del alumno
     * @param p_apellido Apellido del alumno
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido){
        setLU(p_lu);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setNota1(0.0);
        setNota2(0.0);
    }
    
    //Observadores (GETTERS)
    public int getLU(){
        return lu;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }

    //Mutadores (SETTERS)
    private void setLU(int p_lu){
        lu = p_lu;
    }
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    public void setNota1(double p_nota1){
        nota1 = p_nota1;
    }
    public void setNota2(double p_nota2){
        nota2 = p_nota2;
    }
    
    /**
     * Método, calcula el promedio de las dos notas del alumno
     * 
     * @return el 'promedio' (double) de las notas.
     */
    public double promedio(){
        return (getNota1() + getNota2())/2;
    }
    /**
     * Metodo que determina si el alumno cumple (true) o no (false) las condiciones 
     * para aprobar la asignatura, a partir de su promedio.
     * 
     * @return true o false dependiendo del promedio
     */
    private boolean aprueba(){
        
        if(promedio() > 7.0 && (getNota1() >= 6.0 && getNota2() >= 6.0)){
            return true;
        }
        return false;
    }
    
    /**
     * Metodo que muestra en pantalla el aprobado o desaprobado, dependiedo de la
     * condicion en la que este el alumno.
     * 
     * @return Cadena "APROBADO" o "DESAPROBADO" 
     */
    private String leyendaAprueba(){
        
        if(aprueba()){
            return "APROBADO";
        }
        return "DESAPROBADO";
    }
    
    /**
     * Método que concatena el nombre y apellido del alumno
     * 
     * @return Cadena con el formato "Nombre Apellido"
     */
    public String nomYApe(){
        return getNombre()+" "+getApellido(); 
    }
    
    /**
     * Concatena el apellido y nombre del alumno
     * 
     * @return Cadena con el formato "Apellido Nombre"
     */
    public String apeYNom(){
        return getApellido()+" "+getNombre(); 
    }
    
    /**
     * Método que muestra por pantalla la informacion y situación académica del alunmno:
     * Nombre y Apellido, LU; notas, promedio y condicion final.
     */
    public void mostrar(){
        System.out.print("\n\nNombre y Apellido: "+nomYApe());
        System.out.print("\nLU: "+getLU() + "  Notas: " + getNota1() + " - " + getNota2() ); 
        System.out.print("\nPromedio: "+promedio()+" - "+leyendaAprueba());
    }
    
    
}
