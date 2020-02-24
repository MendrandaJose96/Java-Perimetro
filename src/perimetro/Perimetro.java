
package perimetro;

import java.util.Scanner;
public class Perimetro {

  
    
     
    public static void main(String[] args) {
        
        double a,b,c,r;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Programa de calculo de perimetro de Triangulo Rectangulo");
        System.out.println("Ingrese el valor de el lado a -->");
        a = teclado.nextDouble();
        System.out.println("Ingrese el valor de el lado b -->");
        b = teclado.nextDouble();
        System.out.println("Ingrese el valor de el lado c -->");
        c = teclado.nextDouble();
        
        r = (a+b+c);
        System.out.println("El perimetro del triangulo es : "+r);
    }
    
}
