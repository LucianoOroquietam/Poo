package Ejercicio_5;

import Ejercicio_5.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoAseguradora {

    private int dni;

    public ElementoAseguradora(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    //valor mensual del seguro
    public abstract double getCostoPoliza();


    //monto asegurado valor del bien sobre el que aplico el seguro
    public abstract double getMontoAsegurado();
    //numero de poliza
    public abstract int getNumeroPoliza();

    //si se lo puedo pedir a cualquier es un metodo abstracto
    //LOS FILTROS ACTUAN SOBRE LOS SIMPLES
    public abstract ArrayList<SeguroSimple> segurosQueCumplen(Filtro filtro, Comparator<SeguroSimple> orden);
}
