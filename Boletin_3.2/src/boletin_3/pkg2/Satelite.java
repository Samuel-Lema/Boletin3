
package boletin_3.pkg2;

public class Satelite {
 
    private double meridiano, paralelo, distanciaTerra;

    public Satelite() {

        meridiano = paralelo = distanciaTerra = 0 ;
    }

    public Satelite(double m, double p, double d) {

        meridiano = m ;
        paralelo = p;
        distanciaTerra = d ;
    }
    public void verPosicion(){

        System.out.println("Satelite atopase  no paralelo " + paralelo + ", meridiano" + meridiano + ", a unha distancia da terra " + distanciaTerra);
    }
}
