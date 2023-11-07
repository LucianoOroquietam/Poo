package Egresados2021;

import Egresados2021.Filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoEmpresa {
    private String destino,nombre;
    private LocalDate fecha_partida,fecha_regreso;

    public ElementoEmpresa(String destino, String nombre, LocalDate fecha_partida, LocalDate fecha_regreso) {
        this.destino = destino;
        this.nombre = nombre;
        this.fecha_partida = fecha_partida;
        this.fecha_regreso = fecha_regreso;
    }

    public void setFecha_regreso(LocalDate fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }

    public void setFecha_partida(LocalDate fecha_partida){
        this.fecha_partida = fecha_partida;
    }

    public String getDestino() {
        return destino;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha_partida() {
        return fecha_partida;
    }

    public LocalDate getFecha_regreso() {
        return fecha_regreso;
    }

    //metodos abstractos

    public abstract int cantAlumnos(); //contar la cantidad total de alumnos que posee un contingente.
    public abstract double getPrecio(); //precio del viaje
    public abstract double getDeuda(); //deuda
    public abstract Alumno getDeudaMayor();//Retornar el alumno con mayor deuda de un contingente.
    // Nota:debe ser un alumno y no un contingente
    public abstract ElementoEmpresa getCopia();
    // Obtener una copia de un contingente/alumno: Se debe obtener una copia de
    // todo el contenido respetando la estructura original.

    public abstract ArrayList<ElementoEmpresa> elementosQueCumplen(Filtro f);

}
