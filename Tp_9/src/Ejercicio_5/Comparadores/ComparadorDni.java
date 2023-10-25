package Ejercicio_5.Comparadores;

import Ejercicio_5.SeguroSimple;

import java.util.Comparator;

public class ComparadorDni implements Comparator<SeguroSimple> {
    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        return o1.getDni() - o2.getDni();
    }
}
