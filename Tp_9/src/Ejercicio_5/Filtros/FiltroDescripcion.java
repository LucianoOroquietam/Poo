package Ejercicio_5.Filtros;

import Ejercicio_5.SeguroSimple;

public class FiltroDescripcion extends Filtro{

    private String descripcion;

    public FiltroDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean cumple(SeguroSimple s) {
        //cuando el seguro que viene como parametro es igual a this.descripcion
        return s.getDescripcion().contains(this.descripcion);
    }
}
