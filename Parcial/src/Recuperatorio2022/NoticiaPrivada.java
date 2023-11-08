package Recuperatorio2022;

import Recuperatorio2022.Filtro.Filtro;

public class NoticiaPrivada extends Noticia{
    public NoticiaPrivada(String cat, String contenido, String titulo, String autor) {
        super(cat, contenido, titulo, autor);
    }

    public Portal getCopia(Filtro condicion) {
        return null;
    }
}
