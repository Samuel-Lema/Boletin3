
package boletin_3.pkg3;

public class Circulo {
        
    private double radio;
    final double PI = 3.14;

    public Circulo() {
        radio = 0;
    }
    public Circulo(double r) {
        radio = r;
    }
    
    public void setRadio(double r){
        radio = r;
    }
    public double getRadio(){
        return radio;
    }

    public String calcularArea(){
        
        return "Area --> " + Math.pow(radio, 2);
    }
    public String calcularLonxitude(){
        
        return "Lonxitude --> " + (2 * PI * radio);
    }
}
