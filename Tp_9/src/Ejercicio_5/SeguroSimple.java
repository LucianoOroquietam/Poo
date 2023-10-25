package Ejercicio_5;

import Ejercicio_5.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class SeguroSimple extends ElementoAseguradora implements Comparable<SeguroSimple>{

    private String descripcion;
    private int nroPoliza;
    private double monto;
    private CalcularCosto calcularCosto;
    public SeguroSimple(int dni, String descripcion, int nroPoliza, double monto) {
        super(dni);
        this.descripcion = descripcion;
        this.nroPoliza = nroPoliza;
        this.monto = monto;
    }



    //cambiar calculardor en t de ejecucion
    public void setCalcularCosto(CalcularCosto nuevoCosto) {
        this.calcularCosto = nuevoCosto ;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public double getCostoPoliza() {
        return calcularCosto.cuantoCuesta(this);
    }

    @Override
    public double getMontoAsegurado() {
        return this.monto;
    }

    @Override
    public int getNumeroPoliza() {
        return this.nroPoliza;
    }

    @Override
    public ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion, Comparator<SeguroSimple> orden) {
        ArrayList<SeguroSimple>aux = new ArrayList<>();
        if (condicion.cumple(this)){
            aux.add(this);
        }
        return aux;
    }



    @Override
    public int compareTo(SeguroSimple o) {
        return 0;
    }
}
