import java.util.ArrayList;

/**
 * Clase ejecutable para validar las funcionalidades de la clase Banco
 * probando sus tres constructores sobrecargados (Ejercicio 4).
 * 
 * @author Lourdes G. Caceres
 * @version 3.0 20/09/2026
 */
public class AplicacionBanco2 {

    public static void main(String[] args) {
        // 1. Instanciación de datos de prueba compartidos
        Localidad locSaladas = new Localidad("Saladas", "Corrientes");
        Localidad locCapital = new Localidad("Corrientes", "Corrientes");
        Localidad locSanMiguel = new Localidad("San Miguel", "Corrientes");

        // Empleados de prueba
        Empleado emp1 = new Empleado(20351112229L, "Lopez", "Pedro", 300000.0, 2018);
        Empleado emp2 = new Empleado(20389998887L, "Gomez", "Carlos", 350000.0, 2020);
        Empleado emp3 = new Empleado(27341112224L, "Fernandez", "Ana", 400000.0, 2015);

        // Personas / Titulares de prueba
        Persona p1 = new Persona(28456987, "Marisa Esther", "Gomez", 1980);
        Persona p2 = new Persona(31456988, "Martín", "Villalba", 1985);
        Persona p3 = new Persona(25123456, "Ernesto", "Zalazar", 1975);

        // Cuentas Bancarias de prueba
        CuentaBancaria c1 = new CuentaBancaria(14526387, p1); // Saldo 0
        CuentaBancaria c2 = new CuentaBancaria(23145698, p2); // Saldo 0
        CuentaBancaria c3 = new CuentaBancaria(30998877, p3); // Con saldo
        CuentaBancaria c4 = new CuentaBancaria(40112233, p1); // Segunda cuenta de p1

        c3.depositar(150000.0);
        c4.depositar(85000.0);

        // =========================================================================
        // PRUEBA DEL CONSTRUCTOR 1:
        // Banco(String, Localidad, int, Empleado)
        // (Banco con un único empleado inicial y sin cuentas)
        // =========================================================================
        System.out.println("=================================================");
        System.out.println("   PRUEBA CONSTRUCTOR 1 (1 Empleado inicial)     ");
        System.out.println("=================================================");
        Banco2 banco1 = new Banco2("Rio", locSaladas, 3, emp1);
        
        // Carga posterior de cuentas bancarias
        banco1.agregarCuentaBancaria(c1);
        banco1.agregarCuentaBancaria(c2);
        banco1.agregarCuentaBancaria(c3);
        banco1.agregarCuentaBancaria(c4);

        banco1.mostrarResumen();


        // =========================================================================
        // PRUEBA DEL CONSTRUCTOR 2:
        // Banco(String, Localidad, int, ArrayList<Empleado>)
        // (Banco con una colección preexistente de empleados)
        // =========================================================================
        System.out.println("\n=================================================");
        System.out.println("   PRUEBA CONSTRUCTOR 2 (Lista de Empleados)     ");
        System.out.println("=================================================");
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);

        Banco2 banco2 = new Banco2("Nacion", locCapital, 1, listaEmpleados);
        
        // Carga posterior de cuentas bancarias
        banco2.agregarCuentaBancaria(c1);
        banco2.agregarCuentaBancaria(c3);

        banco2.mostrarResumen();


        // =========================================================================
        // PRUEBA DEL CONSTRUCTOR 3:
        // Banco(String, Localidad, int, ArrayList<Empleado>, ArrayList<CuentaBancaria>)
        // (Banco con listas preexistentes de empleados y de cuentas)
        // =========================================================================
        System.out.println("\n=================================================");
        System.out.println("   PRUEBA CONSTRUCTOR 3 (Empleados y Cuentas)    ");
        System.out.println("=================================================");
        ArrayList<Empleado> listaEmpleados3 = new ArrayList<Empleado>();
        listaEmpleados3.add(emp1);
        listaEmpleados3.add(emp2);
        listaEmpleados3.add(emp3);

        ArrayList<CuentaBancaria> listaCuentas3 = new ArrayList<CuentaBancaria>();
        listaCuentas3.add(c1);
        listaCuentas3.add(c2);
        listaCuentas3.add(c3);
        listaCuentas3.add(c4);

        Banco2 banco3 = new Banco2("Galicia", locSanMiguel, 5, listaEmpleados3, listaCuentas3);

        banco3.mostrarResumen();

    }    
}