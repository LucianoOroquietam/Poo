package Ejercicio_5;

import Ejercicio_5.Filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class SeguroTemporal extends ElementoAseguradora{

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ElementoAseguradora seguro;

    public SeguroTemporal(int dni,LocalDate fechaInicio, LocalDate fechaFin, ElementoAseguradora seguro) {
        super(dni);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.seguro = seguro;
    }


    public boolean estaVigente(){
        LocalDate hoy = LocalDate.now();
        //si es despues de la fecha incio y antes de la fecha fin sigue vigente
        return hoy.isAfter(fechaInicio) && hoy.isBefore(fechaFin);
        // return hoy.compareTo(fechaInicio) > 0 && hoy.compareTo(fechaFin) < 0;
    }

    //el seguro temporal el
    //costo es el costo del seguro contenido, siempre y cuando la fecha actual esté dentro de la
    //vigencia del seguro (caso contrario es 0).
    @Override
    public double getCostoPoliza() {
        if (estaVigente()){
            return seguro.getMontoAsegurado();
        }else{
            return 0;
        }
    }

    //. El monto asegurado es el monto del seguro contenido siempre y
    //cuando la fecha actual esté dentro del periodo de validez.
    @Override
    public double getMontoAsegurado() {
        if (estaVigente()){
          return seguro.getMontoAsegurado();
        }else{
            return 0;
        }
    }
    //El número de póliza es el mismo que
    //la póliza contenida
    @Override
    public int getNumeroPoliza() {
     return seguro.getNumeroPoliza();
    }


    //En el caso del seguro temporal, solo se incluye como resultado de la búsqueda los elementos
    //contenidos por el y que cumplen con la búsqueda siempre y cuando esté vigente

    @Override
    public ArrayList<SeguroSimple> segurosQueCumplen(Filtro filtro, Comparator<SeguroSimple>orden) {
        if (estaVigente()){
           return seguro.segurosQueCumplen(filtro, orden);
        }
        //para evitar null retorno un arreglo vacio
        return new ArrayList<>();
    }
}
