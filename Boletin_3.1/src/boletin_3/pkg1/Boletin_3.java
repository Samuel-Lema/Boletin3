
package boletin_3.pkg1;

import java.util.Scanner;

public class Boletin_3 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Coche ferrari = new Coche();
        
        System.out.print("Introduce a cantidad a acelerar: ");
        ferrari.acelerar(reader.nextInt());
        System.out.println("Velocidad actual: " + ferrari.getVelocidade());
        
        System.out.print("Introduce a velocidade a frenar: ");
        ferrari.frenar(reader.nextInt());
        System.out.println("Velocidad actual: " + ferrari.getVelocidade());
    }
    
}
