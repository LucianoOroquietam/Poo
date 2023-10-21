package Ejercicio_2.Comparadores;

import Ejercicio_2.Socio;

import java.util.Comparator;

public class CompararPorEdad implements Comparator<Socio> {
    public int compare(Socio o1, Socio o2) {
       return Integer.compare(o1.getEdad(), o2.getEdad());
       //return o1.getEdad() - o2.getEdad();
    }
}
