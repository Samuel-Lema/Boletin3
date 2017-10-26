
package boletin_3.pkg4;

import java.util.Scanner;

public class Boletin_34 {

    public static void main(String[] args) {
            
        Scanner reader = new Scanner(System.in);
        int polbo, patacas;
        
        System.out.print("Introduce los kilos de pulpo de hoy: ");  
        polbo = reader.nextInt();
        System.out.print("Introduce los kilos de patatas de hoy: ");  
        patacas = reader.nextInt();
        
        Almacen almacen1 = new Almacen(polbo, patacas);
        
        System.out.print(almacen1.knowClient());
        
        System.out.print("\r\nHa llegado un envio con más pulpo, introduce los kg: ");  
        almacen1.engadirPolbo(reader.nextInt());
        System.out.println("Ahora hay " + almacen1.amosarPolbo() + " kg de pulpo");
        
        System.out.print("Ha llegado un envio con más patatas, introduce los kg: ");  
        almacen1.engadirPatacas(reader.nextInt());
        System.out.println("Ahora hay " + almacen1.amosarPatacas() + " kg de patatas");
        
        System.out.print(almacen1.knowClient());
        
    }
    
}
