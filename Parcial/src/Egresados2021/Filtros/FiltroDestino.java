package Egresados2021.Filtros;

import Egresados2021.ElementoEmpresa;

public class FiltroDestino extends Filtro{
    private String destino;

    public FiltroDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public boolean cumple(ElementoEmpresa e) {
        return e.getDestino().equals(this.destino);
    }
}
