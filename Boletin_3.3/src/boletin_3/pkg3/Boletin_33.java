
package boletin_3.pkg3;

import java.util.Scanner;

public class Boletin_33 {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Introduce el radio: ");
        Circulo circulo1 = new Circulo(reader.nextDouble());
        System.out.println(circulo1.getRadio());
        
        System.out.print("Ups, ha habido un error, cambia el radio ;) ");
        circulo1.setRadio(reader.nextDouble());
        System.out.println(circulo1.getRadio());
        
        System.out.println("El area es: " + circulo1.calcularArea());
        System.out.println("A lonxitude es: " + circulo1.calcularLonxitude());
    }
    
}
