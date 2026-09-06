/**
 * Clase que representa a una Mujer dentro del sistema del Registro Civil.
 * Mantiene una relación bidireccional casada o divorciada [0...1]con la clase Hombre.
 * 
 * @author Lourdes G. Caceres 
 * @version 1.0 02/09/2026
 */
public class Mujer {
    
    //variable de instancia
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    /**
     * 1er Constructor de la clase Mujer, estado civil "SOLTERA"
     * 
     * @param p_nombre
     * @param p_apellido
     * @param p_edad
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    /**
     * 2do Constructor de la clase Mujer, estado civil "CASADA"
     * 
     * @param p_nombre
     * @param p_apellido
     * @param p_edad
     * @param p_esposo
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.casarseCon(p_esposo);
    }

    //Mutadores (SETTERS)
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estado){
        this.estadoCivil = p_estado;
    }
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }

    //Observadores (GETTERS)
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    public Hombre getEsposo(){
        return this.esposo;
    }

    /**
     * Establece la conexión (matrimonio) entre la dos intancias Hombre y Mujer
     * 
     * @param p_hombre instancia de la clase Hombre
     */
    public void casarseCon(Hombre p_hombre){
        if(p_hombre != null && this.getEsposo() != p_hombre){
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada");    
            p_hombre.casarseCon(this);     // Sincroniza al cónyuge evadiendo recursión infinita
        }else{
            System.out.print("\n ================ NO SE PUEDE REALIZAR ESTE TRAMITE ================");
        }
    }
    /**
     * Deshace la conexion (divorcio) entre las dos instancias Hombre y Mujer
     */
    public void divorcio(){
        if(this.getEsposo() == null){
            throw new IllegalArgumentException("No se puede realizar este trámite: no posee esposo");
        }
        Hombre exEsposo = this.getEsposo();
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
        exEsposo.divorcio();
    }
    /**
     * Retorna la representación concatenada de los datos filiatorios.
     * 
     * @return Cadena con nombre, apellido y edad.
     */
    public String datos(){
        return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" anios";
    }
    /**
     * Imprime por pantalla los datos y el estado civil actual
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.datos()+" - "+this.getEstadoCivil());
    }
    /**
     * Imprime por pantalla, si es el caso, con quien esta casada la mujer
     */
    public void casadaCon(){
        if(this.getEsposo() != null){
        System.out.println(this.datos()+" esta casada con "+this.getEsposo().datos());    
        }else{
            System.out.println(this.datos() + " no está casada.");
        }
    }
    
}