package Parcial2023;

import Parcial2023.Filtro.Condicion;

import java.util.ArrayList;

public abstract class Printer3D {
    private String nombre,descripcion;
    private  static int precioGramo=12;
    private  static int costoSegundo=45;



    public Printer3D(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public static int getPrecioGramo() {
        return precioGramo;
    }

    public static int getCostoSegundo() {
        return costoSegundo;
    }

    public  abstract int cantidadPla();
    public   abstract double tiempoEstimado();
    public abstract ArrayList<String> listaColores();
    public abstract int  getCantidadSimples();
    public abstract double costoPieza();

    public abstract ArrayList<PiezaSimple> losQueCumple(Condicion c);

}
