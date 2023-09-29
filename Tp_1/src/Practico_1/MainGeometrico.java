package Practico_1;

public class MainGeometrico {
    public static void main(String[] args) {

        PuntoGeometrico punto1 = new PuntoGeometrico(1, 5);
        PuntoGeometrico punto2 = new PuntoGeometrico(4, 5);
        PuntoGeometrico punto3 = new PuntoGeometrico(4, 2);
        PuntoGeometrico punto4 = new PuntoGeometrico(1, 2);

        //esto me desplaza
        punto1.desplazar(2,3);
        punto2.desplazar(2,3);
        punto3.desplazar(2,3);
        punto4.desplazar(2,3);

        double distanciaEuclidea = punto1.calcularDistanciaEuclidea(punto2);

        System.out.println("La distancia euclídea entre los puntos es: " + distanciaEuclidea);

        //Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
        //Y.

        Rectangulo rectanguloA = new Rectangulo(punto1,punto2,punto3,punto4);
        System.out.println(punto1.getX());
        punto1.desplazar(2, 3);
        System.out.println(punto1.getX());

    }
}
