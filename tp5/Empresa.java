
/**
 * Clase ejecutable Empresa
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 28/09/2029
 */
public class Empresa {
    public static void main (String arg []){
        
        //instancia de Persona
        Persona per1 = new Persona(45940137, "Caceres", "Lourdes", 2004);
        
        //intancia de Empleado
        Empleado empleado1 = new Empleado(per1.getDNI(), 23459401373L, per1.getApellido(), per1.getNombre(),
                            per1.getAnioNacimiento(), 350000, 2022);
                            
        //prueba de metodos
        per1.mostrar();
        empleado1.mostrar();
    }
}