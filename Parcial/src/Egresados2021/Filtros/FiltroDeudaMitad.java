package Egresados2021.Filtros;

import Egresados2021.ElementoEmpresa;

public class FiltroDeudaMitad extends Filtro{

    private double porcentaje;

    public FiltroDeudaMitad(double precio) {
        this.porcentaje = precio;
    }

    //Todos los que deben más de la mitad del precio acordado.
    @Override
    public boolean cumple(ElementoEmpresa e) {
        return e.getDeuda() > e.getPrecio() * porcentaje;
    }
}


