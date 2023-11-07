package Parcial2023;

import Parcial2023.Filtro.Condicion;

import java.util.ArrayList;

public class PiezaSimple extends Printer3D {

    private double tiempoImpresion;
    private String color;

    private int pla;

    public PiezaSimple(String nombre, String descripcion, double tiempoImpresion, String color) {
        super(nombre, descripcion);
        this.tiempoImpresion = tiempoImpresion;
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    @Override
   public int cantidadPla() {
        return this.pla;
    }

    @Override
   public double tiempoEstimado() {

        return this.tiempoImpresion;
    }

    @Override
    public ArrayList<String> listaColores() {
        ArrayList<String>colores = new ArrayList<>();
            colores.add(this.color);
            return colores;
    }

    @Override
   public int getCantidadSimples() {
        return 1;
    }

    @Override
    public double costoPieza() {
        //return cantidadPla() * this.pla + tiempoEstimado() * this.tiempoImpresion;
        return cantidadPla() * getPrecioGramo() + tiempoEstimado() * getCostoSegundo();
    }

    @Override
    public ArrayList<PiezaSimple> losQueCumple(Condicion c) {
        ArrayList<PiezaSimple>resultado = new ArrayList<>();
        if (c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }


}
