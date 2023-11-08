package Recuperatorio2022;

import Recuperatorio2022.Filtro.Filtro;

import java.util.ArrayList;

public abstract class Portal implements Comparable<Portal>{
    private String categoria;

    public Portal(String cat){
        this.categoria = cat;
    }

    public String getCategoria() {
        return categoria;
    }

    public abstract ArrayList<String> calcularPalabrasClave();

    //copia con restriccion de tipo noticias
    public abstract Portal getCopia(Filtro condicion);


    @Override
    public int compareTo(Portal o) {
        return this.categoria.compareTo(o.categoria);
    }
}
