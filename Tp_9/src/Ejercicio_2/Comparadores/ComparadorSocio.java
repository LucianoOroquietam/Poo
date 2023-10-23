package Ejercicio_2.Comparadores;

import Ejercicio_2.Socio;

import java.util.Comparator;

public abstract class ComparadorSocio implements Comparator<Socio> {

    private ComparadorSocio siguiente;

    public ComparadorSocio() {
    }

    public ComparadorSocio(ComparadorSocio siguiente) {
        this.siguiente = siguiente;
    }

    abstract int comparar(Socio o1,Socio o2);
    @Override
    public int compare(Socio o1, Socio o2) {
        int aux = comparar(o1,o2);
        if (aux ==0){
           return this.siguiente.compare(o1,o2);
        }
        return aux;
    }
}
