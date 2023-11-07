package Recuperatorio2021;

import Recuperatorio2021.Filtro.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Bazar{

    public abstract double getPrecioComponente();

    //el peso de cada combo queda determinado por la suma de los pesos de todos sus componentes.
    public abstract double getPesoComponente();

    //Las categorías de un combo se determinan como la unión, sin repetidos,
    // de todas las categorías de los elementos que contienen.
    public abstract ArrayList<String> getCategoria();

    public abstract int contarProductos();

    public abstract Bazar getCopia(Condicion c);

    public abstract ArrayList<Bazar> buscarOrdenar(Condicion filtro, Comparator<Bazar> orden);


}
