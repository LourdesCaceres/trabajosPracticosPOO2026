import java.util.HashMap;
/**
 * La clase Curso abstrae la idea de un curso de alumnos, se utiliza HashMap
 * para simular una lista de alumnos inscriptos, permitiendo agregar alumnos, quitarlos,
 * buscarlos y mostrar sus datos.
 * 
 * @author Chavez, Tobías Acdel. 
 * @version 1.0 - 14/09/2026.
 */
public class Curso
{
    //ATRIBUTOS
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Curso: de tipo 0.*
     * 
     * @param p_nombre: String - nombre del curso.
     */
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<>());
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE Curso:
     * 
     * @param p_nombre: String - nombre del curso.
     * @param p_alumnos: HashMap<Integer, Alumno> - HashMap de alumnos con la clave lu siento int.
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }

    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlumnos(HashMap<Integer, Alumno> p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Devuelve la cantidad de alumnos, lo hace mediante el método size()
     * que devuelve el tamaño de un HashMap.
     * 
     * @return  cantidad de alumnos. 
     */
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    
    /**
     * Verifica si un alumno está inscripto buscandolo por su libreta universitaria.
     * Utiliza el método containsKey que verifica si el objeto contiene la clave de la colección
     * que es en este caso la libreta universitaria.
     * 
     * @param p_lu: int - libreta universitaria del alumno que se quiere verificar.
     * @return true si la libreta pertenece a la colección y false si no lo hace.
     */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    
    /**
     * Verifica si un alumno está inscripto buscandolo por su libreta universitaria.
     * Utiliza el método containsKey que verifica si el objeto contiene la clave de la colección
     * que es en este caso la libreta universitaria, pero en este caso se recibe el propio alumno
     * por parámetro, sacando su clave para ver si está en la colección.
     * 
     * @param p_alumno: Alumno - alumno que se quiere verificar.
     * @return true si la libreta pertenece a la colección y false si no lo hace.
     */
    public boolean estaInscripto(Alumno p_alumno){
        return alumnos.containsKey(p_alumno.getLu());
    }
    
    /**
     * Busca un alumno específico entre los de la colección a través de su clave que
     * es la libreta universitaria. Hace uso del método get() que obtiene un objeto 
     * a través de una clave.
     * 
     * @param p_lu: int - numero de libreta universitaria.
     * 
     * @return obtine el alumno que se buscaba.
     */
    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }
    
    /**
     * Agrega un alumno que se recibe por parámetro a la colección (lo inscribe).
     * Hace uso del método put() que es el equivalente al add() de ArrayList,
     * recibiendo como clave la libreta universitaria del alumno.
     * 
     * @param p_alumno: Alumno - alumno a inscribir.
     */
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    
    /**
     * Quita un alumno de la colección. El alumno se específica a través de su
     * libreta universitaria ingresada por parámetro.
     * 
     * @param p_lu: int - libreta universitaria del alumno a quitar.
     * 
     * @return el alumno que fue eliminado.
     */
    public Alumno quitarAlumno(int p_lu){
        return this.getAlumnos().remove(p_lu);
    }
    
    /**
     * Busca un alumno mediante su libreta universitaria y cuando lo encuentra
     * imprime su promedio mediante un método heredado de la clase Alumno.
     * 
     * @param p_lu: int - libreta universitaria del alumno que imprimirá su promedio 
     */
    public void imprimirPromediosDelAlumno(int p_lu){
        Alumno unAlumno = this.buscarAlumno(p_lu);
        
        System.out.println("Promedio del alumno " + unAlumno.nomYApe() + " es: " + unAlumno.promedio()); 
    }
    
    /**
     * Recorre la colección mediante un for, verifica con un if si el alumno
     * está inscripto y, si lo está, imprime su libreta universitaria, nombre y apellido
     * con este formato:  128914 - Juan Pérez.
     */
    public void mostrarInscriptos(){
        for(Alumno unAlumno : this.getAlumnos().values()){
            if(estaInscripto(unAlumno) == true){
                System.out.println(unAlumno.getLu() + " - " + unAlumno.nomYApe());
            }
        }
    }
}