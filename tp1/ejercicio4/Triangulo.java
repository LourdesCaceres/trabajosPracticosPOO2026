
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo{
        public static void main(String args []){
        double a, b, c;                        //lados del triangulo
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        
        double semip = (a+b+c)/2;
        double areaTrin = Math.sqrt(semip*(semip - a)*(semip - b)*(semip - c));
        
        System.out.println("El semiperimetro del triangulo es: " +semip);
        System.out.println("El Area del triangulo es: " +areaTrin);
    }
}