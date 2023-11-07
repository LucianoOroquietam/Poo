package Recuperatorio2021;

import Recuperatorio2021.Filtro.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductoSimple extends Bazar{
    private double peso;
    private double precio;
    private ArrayList<String> categorias;

    public ProductoSimple(double peso, double precio) {
        this.peso = peso;
        this.precio = precio;
        this.categorias = new ArrayList<>();
    }

    public void addCategorias(String p){
        categorias.add(p);
    }

    @Override
    public double getPrecioComponente() {
        return this.precio;
    }

    @Override
    public double getPesoComponente() {
        return this.peso;
    }

    @Override
    public ArrayList<String> getCategoria() {
        return new ArrayList<>(categorias);
    }

    @Override
    public int contarProductos() {
        return 1;
    }

    @Override
    public Bazar getCopia(Condicion c ) {
        ProductoSimple copia = null;
        if (c.cumple(this)) {
            copia = new ProductoSimple(this.peso, this.precio);
            for (String str : categorias) {
                copia.addCategorias(str);
            }
        }

        return copia;
    }

    @Override
    public ArrayList<Bazar> buscarOrdenar(Condicion filtro, Comparator<Bazar> orden) {
        ArrayList<Bazar> resultado =  new ArrayList<>();
        if (filtro.cumple(this))
            resultado.add(this);
        return resultado;
    }


}
