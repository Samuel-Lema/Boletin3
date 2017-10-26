
package boletin_3.pkg2;

import java.util.Scanner;

public class Boletin_32 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Exemplo de satelite por defecto: ");
        Satelite sateliteVacio = new Satelite();
        sateliteVacio.verPosicion();
        
        double m, p, d; 
        
        System.out.print("Introduce o meridiano: ");
        m = reader.nextDouble();
        System.out.print("Introduce a posición: ");
        p = reader.nextDouble();
        System.out.print("Introduce a distancia: ");
        d = reader.nextDouble();
        
        Satelite satelite2 = new Satelite(m, p, d);
        satelite2.verPosicion();
    }
    
}
