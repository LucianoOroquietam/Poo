package Practico_6.Ejercicio_2;


public class Main {
    public static void main(String[] args) {
        CentroComputo unicen = new CentroComputo();

        Computadora c1 = new Computadora(2560.0,"lab1");
        Computadora c2 = new Computadora(2360.0,"lab2");
        Computadora c3 = new Computadora(3260.0,"lab3");
        Computadora c4 = new Computadora(5560.0,"lab4");

        unicen.addComputadora(c1);
        unicen.addComputadora(c2);
        unicen.addComputadora(c3);
        unicen.addComputadora(c4);

        System.out.println(unicen);


    }
}
