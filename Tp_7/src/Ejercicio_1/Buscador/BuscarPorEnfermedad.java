package Ejercicio_1.Buscador;

import Ejercicio_1.Enfermedad;
import Ejercicio_1.ProductoQuimico;

public class BuscarPorEnfermedad extends Buscar {

    private Enfermedad enfermedad;

    public BuscarPorEnfermedad(Enfermedad enfermedad){
        this.enfermedad=enfermedad;
    }

    //Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.

    @Override
    public boolean cumple(ProductoQuimico p) {
        //p(agroquimico x) tiene x patologia) la enfermedad x contiene todas las patologias?
       return p.getEstadosPatologicos().containsAll(enfermedad.getPatologiasEnfermedad());
    }
}
