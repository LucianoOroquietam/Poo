package PracticaPoo.Herencia;

import PracticaPoo.Herencia.Figuras.Circulo;
import PracticaPoo.Herencia.Figuras.Figura;
import PracticaPoo.Herencia.Figuras.Rectangulo;

public class MainFigura {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        /*
        * En este ejemplo, creamos instancias de Circulo y Rectangulo y las asignamos a referencias de tipo Figura.
        * Aunque el método calcularArea() se declara en la clase base Figura, debido al binding dinámico,
        * cuando llamamos al método en las instancias, se ejecutan las implementaciones específicas de Circulo y Rectangulo.
        *  Esto permite que el cálculo del área sea apropiado para cada tipo de figura,
        * a pesar de que el método se defina en la clase base.
        * */
    }
}
