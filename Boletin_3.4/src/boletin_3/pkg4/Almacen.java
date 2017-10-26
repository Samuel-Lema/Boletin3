
package boletin_3.pkg4;

public class Almacen {
    
    private int polbo;
    private int patacas;
    
    public Almacen(){
        
        polbo = 0;
        patacas = 0;
    }
    public Almacen(int x, int y){
        
        polbo = x;
        patacas = y;
    }
    
    public void engadirPolbo(int x){
        polbo += x;
    }
    public void engadirPatacas (int x){
        patacas += x;
    }
    public int amosarPolbo( ){
        return polbo;
    }
    public int amosarPatacas (){
        return patacas;
    }
    
    public String knowClient(){
        
        return "Se puede atender a :" + (polbo + patacas) + " clientes actualmente.";
    }
}
