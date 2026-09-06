/**
 * Clase que representa a un Hombre dentro del sistema del Registro Civil.
 * Mantiene una relación bidireccional cadado o divorsiado [0...1] con la clase Mujer.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 02/09/2026
 */
public class Hombre {
    
    //variables de instancia
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    /**
     * 1er Constructor de la clase Hombre, estado civil "SOLTERO"
     * 
     * @param p_nombre
     * @param p_apellido
     * @param p_edad
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }
    /**
     * 2do Constructor de la clase Hombre, estado civil "CASADO"
     * 
     * @param p_nombre
     * @param p_apellido
     * @param p_edad
     * @param p_esposa
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.casarseCon(p_esposa);
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
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
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
    public Mujer getEsposa(){
        return this.esposa;
    }

    /**
     * Establece la conexión (matrimonio) entre la dos intancias Hombre y Mujer
     * 
     * @param p_hombre instancia de la clase Hombre
     */
    public void casarseCon(Mujer p_mujer){
        if(p_mujer != null && this.getEsposa() != p_mujer){
            this.setEsposa(p_mujer);
            this.setEstadoCivil("Casado");    
            p_mujer.casarseCon(this);     // Sincroniza al cónyuge evadiendo recursión infinita
        }else{
            System.out.print("\n ================ NO SE PUEDE REALIZAR ESTE TRAMITE ================");
        }
    }
    /**
     * Deshace la conexion (divorcio) entre las dos instancias Hombre y Mujer
     */
    public void divorcio(){
        if(this.getEsposa() == null){
            throw new IllegalArgumentException("No se puede realizar este trámite: no posee esposo");
        }
        Mujer exEsposa = this.getEsposa();
        this.setEsposa(null);
        this.setEstadoCivil("Divorciado");
        exEsposa.divorcio();
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
     * 
     */
    public void mostrarEstadoCivil(){
        System.out.print("\n"+this.datos()+" - "+this.getEstadoCivil());
    }
    /**
     * Imprime por pantalla, si es el caso, con quien esta casada el hombre
     */
    public void casadoCon(){
        if(this.getEsposa() != null){
        System.out.println(this.datos()+" esta casado con "+this.getEsposa().datos());    
        }else{
            System.out.println(this.datos() + " no está casado.");
        }
    }
}
