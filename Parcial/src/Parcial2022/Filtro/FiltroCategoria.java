package Parcial2022.Filtro;

import Parcial2022.Noticia;


public class FiltroCategoria extends Condicion{
    private String categoria;

    public FiltroCategoria(String c) {
        this.categoria = c;
    }

    @Override
    public boolean cumple(Noticia n) {
       return n.getCategoria().equals(this.categoria);
    }
}
