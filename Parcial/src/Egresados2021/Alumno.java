package Egresados2021;

import Egresados2021.Filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends ElementoEmpresa{
    private double precio,deuda;
    public Alumno(String destino, String nombre, LocalDate fecha_partida, LocalDate fecha_regreso, double precio,double deuda) {
        super(destino, nombre, fecha_partida, fecha_regreso);
        this.precio=precio;
        this.deuda = deuda;
    }

    @Override
    public int cantAlumnos() {
        return 1;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public double getDeuda() {
        return this.deuda;
    }

    @Override
    public Alumno getDeudaMayor() {
        return this;
    }

    @Override
    public ElementoEmpresa getCopia() {
       return new Alumno(getDestino(),getNombre(),getFecha_partida(),getFecha_regreso(),getPrecio(),getDeuda());
    }

    @Override
    public ArrayList<ElementoEmpresa> elementosQueCumplen(Filtro f) {
        ArrayList<ElementoEmpresa> elementoCumple = new ArrayList<>();
       if (f.cumple(this)){
           elementoCumple.add(this);
       }
        return elementoCumple;
    }


    @Override
    public boolean equals(Object o){
        try {
            Alumno a = (Alumno) o;
            return this.getNombre().equals(a.getNombre()) &&
                    this.getDestino().equals(a.getDestino());

        }catch (Exception exc){
            return false;
        }

    }


}
