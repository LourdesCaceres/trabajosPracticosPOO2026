import java.util.ArrayList;
import java.util.HashSet;

/**
 * Clase que representa la entidad bancaria, gestionando sus sucursales,
 * nomina de empleados y cuentas bancarias asociadas.
 * 
 * @author Lourdes G. Caceres
 * @version 2.0 16/09/2026
 */
public class Banco2 {
    // Variables de instancia
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentasBancarias; // Atributo agregado (Ejercicio 4)
    
    final String LINEA = " ------------------------------------------------------- ";

    /**
     * 1er constructor: Inicializa el banco con un único empleado inicial y lista de cuentas vacía.
     */
    public Banco2(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<Empleado>());
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>());
        this.agregarEmpleado(p_empleado);
    }

    /**
     * 2do constructor: Inicializa el banco con una lista de empleados y lista de cuentas vacía.
     */
    public Banco2(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>());
    }

    /**
     * 3er constructor: Inicializa el banco con listas preexistentes de empleados y cuentas bancarias.
     */
    public Banco2(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados, ArrayList<CuentaBancaria> p_cuentas) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
    }

    // Mutadores (SETTERS)
    private void setNombre(String p_nombre){ 
        this.nombre = p_nombre; 
    }
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal; 
    }
    private void setLocalidad(Localidad p_localidad){ 
        this.localidad = p_localidad; 
    }
    private void setEmpleados(ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados; 
    }
    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentas){ 
        this.cuentasBancarias = p_cuentas;
    }

    // Observadores (GETTERS)
    public String getNombre(){
        return this.nombre; 
    }
    public int getNroSucursal(){ 
        return this.nroSucursal; 
    }
    public Localidad getLocalidad(){ 
        return this.localidad; 
    }
    public ArrayList<Empleado> getEmpleados(){ 
        return this.empleados; 
    }
    public ArrayList<CuentaBancaria> getCuentasBancarias() { 
        return this.cuentasBancarias; 
    }

    // Métodos de gestión de Empleados
    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().add(p_empleado);
    }

    public boolean quitarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().remove(p_empleado);
    }

    public void listarSueldos() {
        for (Empleado empleado : this.getEmpleados()) {
            System.out.println(empleado.getCuil() + " " + empleado.apeYNom() + LINEA + "$" + empleado.sueldoNeto());
        }
    }

    public double sueldosAPagar() {
        double total = 0.0;
        for (Empleado empleado : this.getEmpleados()) {
            total += empleado.sueldoNeto();
        }
        return total;
    }

    // --- NUEVOS MÉTODOS Y FUNCIONALIDADES (Ejercicio 4) ---

    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuentasBancarias().add(p_cuenta);
    }

    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuentasBancarias().remove(p_cuenta);
    }

    /**
     * Muestra en consola aquellas cuentas bancarias registradas cuyo saldo actual es cero.
     */
    public void listarCuentasConSaldoCero() {
        for (CuentaBancaria cuenta : this.getCuentasBancarias()) {
            if (cuenta.getSaldo() == 0.0) {
                System.out.println(cuenta.getNroCuenta() + "\t\t" + cuenta.getTitular().apeYNom());
            }
        }
    }

    /**
     * Genera un conjunto con todos los titulares de cuentas, eliminando repetidos.
     * @return HashSet de objetos Persona.
     */
    public HashSet<Persona> listaDeTitulares() {
        HashSet<Persona> titulares = new HashSet<Persona>();
        for (CuentaBancaria cuenta : this.getCuentasBancarias()) {
            titulares.add(cuenta.getTitular());
        }
        return titulares;
    }

    /**
     * Calcula la cantidad de cuentas que poseen un saldo mayor a 0 (activas).
     * @return Cantidad de cuentas activas.
     */
    private int cuentasSaldoActivo() {
        int activas = 0;
        for (CuentaBancaria cuenta : this.getCuentasBancarias()) {
            if (cuenta.getSaldo() > 0.0) {
                activas++;
            }
        }
        return activas;
    }

    /**
     * Emite el resumen consolidado de cuentas bancarias según el formato requerido.
     */
    public void mostrarResumen() {
        int totalCuentas = this.getCuentasBancarias().size();
        int activas = this.cuentasSaldoActivo();
        int saldoCero = totalCuentas - activas;

        System.out.println("Banco: " + this.getNombre() + " - Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "     Provincia: " + this.getLocalidad().getProvincia());
        System.out.println("***************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("***************************************************");
        System.out.println("Número total de Cuentas Bancarias: " + totalCuentas);
        System.out.println("Cuentas Activas: " + activas);
        System.out.println("Cuentas Saldo Cero: " + saldoCero + ".");
        System.out.println("---------------------------------------------------");
        System.out.println("Cuentas sin saldo:");
        System.out.println("--- Cuenta ----------------- Apellido y Nombre ------------");
        this.listarCuentasConSaldoCero();
        System.out.println("---------------------------------------------------");

        // Formateo del listado de titulares únicos separados por punto y coma
        StringBuilder clientesStr = new StringBuilder("Listado de Clientes: ");
        HashSet<Persona> clientes = this.listaDeTitulares();
        int i = 0;
        for (Persona p : clientes) {
            clientesStr.append(p.apeYNom());
            if (i < clientes.size() - 1) {
                clientesStr.append("; ");
            }
            i++;
        }
        System.out.println(clientesStr.toString());
        System.out.println("---------------------------------------------------");
    }

    public void mostrar() {
        System.out.println("Banco: " + this.getNombre() + "\tSucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "\tProvincia: " + this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("\nTotal a Pagar " + LINEA + "$" + sueldosAPagar());
    }
}