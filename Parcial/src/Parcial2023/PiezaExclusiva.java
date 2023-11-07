package Parcial2023;

import Parcial2023.Filtro.Condicion;

import java.util.ArrayList;

public class PiezaExclusiva extends PiezaSimple{
    //Piezas exclusivas, las cuales poseen un nombre, una cantidad de PLA necesario (medido en
    //gramos), el color y un tiempo estimado de (medido en segundos). Sin embargo, esta pieza no se
    //incluye en ninguna busqueda y su costo es el costo de la pieza (como se estipula en la inicial) mas un
    //costo de exclusividad.

    private int exclusividad;
    public PiezaExclusiva(String nombre, String descripcion, double tiempoImpresion, String color, int exclusividad) {
        super(nombre, descripcion, tiempoImpresion, color);
        this.exclusividad = exclusividad;
    }

    @Override
    public ArrayList<PiezaSimple> losQueCumple(Condicion c) {
        //esta pieza no se incluye en ninguna busqueda
        return new ArrayList<PiezaSimple>();
    }

    @Override
    public int cantidadPla() {
        //su costo es el costo de la pieza (como se estipula en la inicial) mas un costo de exclusividad
        return super.cantidadPla()+this.exclusividad;
    }
}
