package Ejercicio_5;

import Ejercicio_5.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SeguroIntegradorCompuesto extends ElementoAseguradora{

    private ArrayList<ElementoAseguradora> elementos;

    public SeguroIntegradorCompuesto(int dni) {
        super(dni);
        this.elementos = new ArrayList<>();
    }

    public void addElementos(ElementoAseguradora e){
        if ((e!=null) && (!elementos.contains(e))){
            elementos.add(e);
        }
    }

    @Override
    public double getCostoPoliza() {
        double sumaTotal = 0.0;
        for (ElementoAseguradora e: elementos) {
            sumaTotal += e.getCostoPoliza();
        }
        return sumaTotal;

    }
    //El monto asegurado de un seguro integrador se calcula como la suma de todos los seguros que contiene.
    @Override
    public double getMontoAsegurado() {
        double sumaTotal = 0.0;
        for (ElementoAseguradora e: elementos) {
            sumaTotal += e.getMontoAsegurado();
        }
        return sumaTotal;
    }

    //El número de
    //póliza de un seguro integrador queda determinado por el mayor número de póliza de
    //los seguros que contiene
    @Override
    public int getNumeroPoliza() {
        int numeroPolizaMayor = 0;
        for(ElementoAseguradora elemento: elementos){
            if (elemento.getNumeroPoliza()>numeroPolizaMayor){
                numeroPolizaMayor = elemento.getNumeroPoliza();
            }
        }

       return numeroPolizaMayor;
    }

    @Override
    public ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion, Comparator<SeguroSimple>orden) {
        ArrayList<SeguroSimple> aux = new ArrayList<>();
        for (ElementoAseguradora e:elementos) {
            //al arreglo aux le agrego todos los seguros que cumplen de cada uno de los hijos con la (conidcion)
            //en composite llamo siempre por recursividad
                //Agrego de todos mis hijos los que cumplan pero no agrego seguroIntegrador (this)
            aux.addAll(e.segurosQueCumplen(condicion,orden));
        }
        Collections.sort(aux,orden);
        return aux;
    }
}
