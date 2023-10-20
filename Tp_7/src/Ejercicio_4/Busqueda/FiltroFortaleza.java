package Ejercicio_4.Busqueda;

import Ejercicio_4.Ficha;

public class FiltroFortaleza extends Filtro{

    private int fortaleza;

    public FiltroFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    //Todas las fichas que tengan una fortaleza mayor a 5
    @Override
    public boolean cumple(Ficha f) {
        return f.getFortaleza() > this.fortaleza;
    }
}
