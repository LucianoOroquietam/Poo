package Parcial2022.Filtro;

import Parcial2022.Noticia;

public class FiltroTItulo extends Condicion{
    private String titulo;

    public FiltroTItulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getTitulo().equals(this.titulo);
    }
}
