
public class TrianguloRectangulo{
    public static void main(String arg []){
        double h, c1, c2;
        
        h = Double.parseDouble(arg[0]);
        c1 = Double.parseDouble(arg[1]);
        c2 = Double.parseDouble(arg[2]);
        
        if(Math.pow(h,2) == Math.pow(c1,2) + Math.pow(c2, 2)){
            System.out.println("El triangulo es rectangulo");
        }else{
             System.out.println("El triangulo NO es rectangulo");
        }
    }
}