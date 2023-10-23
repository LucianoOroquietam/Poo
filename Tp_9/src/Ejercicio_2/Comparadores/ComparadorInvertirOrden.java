package Ejercicio_2.Comparadores;

import Ejercicio_2.Socio;

public class ComparadorInvertirOrden extends ComparadorSocio{

    private ComparadorSocio comparador;

    //Si tengo un comparador que ordena los objetos en un orden ascendente,
    // este comparador los ordena en un orden descendente, y viceversa.
    @Override
    public int comparar(Socio s1, Socio s2) {
        return -1 *(comparador.compare(s1,s2));
    }

}
