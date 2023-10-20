package Ejercicio_4.Busqueda;

import Ejercicio_4.Ficha;

public class FiltroOr extends Filtro {
    private Filtro condicion1,condicion2;

    public FiltroOr(Filtro condicion1, Filtro condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }
    @Override
    public boolean cumple(Ficha f) {
        return this.condicion1.cumple(f) || this.condicion2.cumple(f);
    }
}
