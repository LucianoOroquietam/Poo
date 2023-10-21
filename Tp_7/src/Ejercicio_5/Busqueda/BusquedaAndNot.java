package Ejercicio_5.Busqueda;

import Ejercicio_5.Pelicula;

public class BusquedaAndNot extends BusquedaPorPelicula{

    private BusquedaPorPelicula c1,c2;

    public BusquedaAndNot(BusquedaPorPelicula c1, BusquedaPorPelicula c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Pelicula p) {
        return this.c1.cumple(p) && !this.c2.cumple(p);
    }

    //Buscar todas las películas en las que haya actuado Will Smith y cuyo director
    //NO haya sido Martin Scorsese.
}
