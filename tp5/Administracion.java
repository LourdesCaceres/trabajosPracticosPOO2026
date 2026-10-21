import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase ejecutable para la clase Jardín y todo lo que con ella abarca.
 * Simula ingreso de figuras geométricas y a partir de allí calcula resultados.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 20/10/2026
 */
public class Administracion
{
    /**
     * Método auxiliar que limpia la pantalla de la terminal.
     */
    public static void limpiarPantalla() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }

    /**
     * El método main empieza pidiendo al usuario ingresar un nombre para el jardín de infantes,
     * luego presentando un menú de administración donde se pueden agregar figuras, eliminar,
     * mostrarlas en una lista y mostrar el detalle final.
     * Al terminar de ejecutar el primer jardin se instancia otro de prueba con constantes para probar
     * el segundo constructor de Jardin.
     */
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("Ingrese el nombre del jardín");
        String nomJar = teclado.nextLine();
        
        Jardin jardin1 = new Jardin(nomJar);
        
        do{
        limpiarPantalla();
        System.out.println("----ADMINISTRACION JARDIN " + jardin1.getNombre() + "----\n");
        System.out.println("-1- Agregar nueva figura");
        System.out.println("-2- Quitar una figura");
        System.out.println("-3- Ver lista de figuras");
        System.out.println("-4- Mostrar resultados");
        System.out.println("-0- Cerrar.");
        
        eleccion = teclado.nextInt();
        
        switch(eleccion){
            case 1:
                limpiarPantalla();
                int eleccionFigura = 0;
                System.out.println("¿Qué figura desea agregar?");
                System.out.println("-1- Triángulo");
                System.out.println("-2- Círculo");
                System.out.println("-3- Elipse");
                System.out.println("-4- Cuadrado");
                System.out.println("-5- Rectangulo");
                
                eleccionFigura = teclado.nextInt();
                
                switch(eleccionFigura){
                    case 1:
                        System.out.println("--Nuevo triángulo--");
                        System.out.println("Ingrese el valor x del punto de origen");
                        double xT = teclado.nextDouble();
                        System.out.println("Ingrese el valor y del punto de origen");
                        double yT = teclado.nextDouble();
                        Punto origen = new Punto(xT, yT);
                        
                        System.out.println("Ingrese la base del triángulo");
                        double base = teclado.nextDouble();
                        System.out.println("Ingrese la altura del triángulo");
                        double altura = teclado.nextDouble();
                        
                        FiguraGeometrica trian = new Triangulo(base, altura, origen);
                        jardin1.agregarFigura(trian);
                        System.out.println("Triángulo ingresado exitosamente! Presione ENTER para continuar.");
                        teclado.nextLine();
                        teclado.nextLine();
                        break;
                        
                    case 2:
                        System.out.println("--Nuevo circulo--");
                        System.out.println("Ingrese el valor x del punto central");
                        double xC = teclado.nextDouble();
                        System.out.println("Ingrese el valor y del punto central");
                        double yC = teclado.nextDouble();
                        Punto centroC = new Punto(xC, yC);
                        
                        System.out.println("Ingrese el radio del circulo");
                        double radio = teclado.nextDouble();
                        
                        FiguraGeometrica circ = new Circulo(radio, centroC);
                        jardin1.agregarFigura(circ);
                        System.out.println("Circulo ingresado exitosamente! Presione ENTER para continuar.");
                        teclado.nextLine();
                        teclado.nextLine();
                        break;
                        
                    case 3:
                        System.out.println("--Nueva elipse--");
                        System.out.println("Ingrese el valor x del punto central");
                        double xE = teclado.nextDouble();
                        System.out.println("Ingrese el valor y del punto central");
                        double yE = teclado.nextDouble();
                        Punto centroE = new Punto(xE, yE);
                        
                        System.out.println("Ingrese el valor del semieje mayor");
                        double semiEjeMayor = teclado.nextDouble();
                        System.out.println("Ingrese el valor del semieje menor");
                        double semiEjeMenor = teclado.nextDouble();
                        
                        FiguraGeometrica elip = new Elipse(semiEjeMayor, semiEjeMenor, centroE);
                        jardin1.agregarFigura(elip);
                        System.out.println("Elipse ingresada exitosamente! Presione ENTER para continuar.");
                        teclado.nextLine();
                        teclado.nextLine();
                        break;
                        
                    case 4:
                        System.out.println("--Nuevo cuadrado--");
                        System.out.println("Ingrese el valor x del punto de origen");
                        double xCu = teclado.nextDouble();
                        System.out.println("Ingrese el valor y del punto de origen");
                        double yCu = teclado.nextDouble();
                        Punto origenCu = new Punto(xCu, yCu);
                        
                        System.out.println("Ingrese el valor de los lados del cuadrado");
                        double lado = teclado.nextDouble();
                        
                        FiguraGeometrica cuad = new Cuadrado(origenCu, lado, lado, lado);
                        jardin1.agregarFigura(cuad);
                        System.out.println("Cuadrado ingresado exitosamente! Presione ENTER para continuar.");
                        teclado.nextLine();
                        teclado.nextLine();
                        break;
                        
                    case 5:
                        System.out.println("--Nuevo rectángulo--");
                        System.out.println("Ingrese el valor x del punto de origen");
                        double xR = teclado.nextDouble();
                        System.out.println("Ingrese el valor y del punto de origen");
                        double yR = teclado.nextDouble();
                        Punto origenR = new Punto(xR, yR);
                        
                        System.out.println("Ingrese el valor de ancho");
                        double ancho = teclado.nextDouble();
                        System.out.println("Ingrese el valor de alto");
                        double alto = teclado.nextDouble();
                        
                        FiguraGeometrica rectan = new Rectangulo(origenR, ancho, alto);
                        jardin1.agregarFigura(rectan);
                        System.out.println("Rectángulo ingresado exitosamente! Presione ENTER para continuar.");
                        teclado.nextLine();
                        teclado.nextLine();
                        break;
                }
                break;
                
            case 2:
                limpiarPantalla();
                if(jardin1.getFiguras() != null){
                  System.out.println("--ELIMINAR FIGURA--");
                  System.out.println("Ingrese el valor x del origen de la figura que desea eliminar");
                  double x = teclado.nextDouble();

                  System.out.println("Ingrese el valor y del origen de la figura que desea eliminar");
                  double y = teclado.nextDouble();

                  Punto origenElim = new Punto(x, y);

                  FiguraGeometrica elim = null;

                  for (FiguraGeometrica unaFigura : jardin1.getFiguras()) {
                       if (unaFigura.getOrigen().equals(origenElim)) {
                           elim = unaFigura;
                           break;
                        }
                    }

                  if(elim != null) {
                    jardin1.getFiguras().remove(elim);
                    System.out.println("Figura eliminada correctamente.");
                  }else {
                    System.out.println("No se encontró ninguna figura con ese origen.");
                  }

                  System.out.println("Presione ENTER para continuar.");
                  teclado.nextLine();
                  teclado.nextLine();
                  break;
                }else{
                 System.out.println("La lista de figuras está vacía!");
                 teclado.nextLine();
                 teclado.nextLine();
                 break;
                }
             
            case 3:
                limpiarPantalla();
                if(jardin1.getFiguras() != null){
                    System.out.println("---LISTA DE FIGURAS---");
                    for(FiguraGeometrica unaFigura : jardin1.getFiguras()){
                        unaFigura.mostrarSuperficie();
                    }
                    
                    System.out.println("\nPresione ENTER para continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                }else{
                    System.out.println("La lista de figuras está vacía!");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                }
                
            case 4:
                limpiarPantalla();
                if(jardin1.getFiguras() != null){
                    jardin1.detalleFiguras();
                    
                    System.out.println("\nPresione ENTER para continuar");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                }else{
                    System.out.println("La lista de figuras está vacía!");
                    teclado.nextLine();
                    teclado.nextLine();
                    break;
                }
            
            case 0:
                limpiarPantalla();
                System.out.println("Cerrando programa...");
                teclado.nextLine();
                teclado.nextLine();
                break;
        }
        }while(eleccion != 0);
        
        //PRUEBA DE SEGUNDO CONSTRUCTOR
        limpiarPantalla();
        ArrayList<FiguraGeometrica> figuras = null;
        Punto punto1 = new Punto (0.2, 5.4);
        Punto punto2 = new Punto (2.0, 1.4);
        Punto punto3 = new Punto (6.3, 7.5);
        
        Cuadrado cuadPrueba = new Cuadrado(punto1, 4.0, 4.0, 4.0);
        Triangulo trianPrueba = new Triangulo(5.0, 6.2, punto2);
        Circulo circPrueba = new Circulo(2.1, punto3);
        
        figuras.add(cuadPrueba);
        figuras.add(trianPrueba);
        figuras.add(circPrueba);
        
        Jardin jardin2 = new Jardin("Estrellitas", figuras);
        
        jardin2.detalleFiguras();
    }
}