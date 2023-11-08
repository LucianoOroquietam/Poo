package Recuperatorio2022.Filtro;

import Recuperatorio2022.Noticia;
import Recuperatorio2022.NoticiaCompuesta;
import Recuperatorio2022.Portal;

public class FiltroTitulo extends Filtro{
    private String titulo;
    public FiltroTitulo(String t){
        this.titulo = t;
    }
    @Override
    public boolean cumple(Portal c) {
        return c.getTitulo().equals(this.titulo);
    }

}
