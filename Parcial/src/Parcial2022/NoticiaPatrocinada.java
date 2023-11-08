package Parcial2022;

import Parcial2022.Filtro.Condicion;

import java.util.ArrayList;

public class NoticiaPatrocinada extends Noticia{
    public NoticiaPatrocinada(String categoria, String c, String titulo, String a, Condicion cond) {
        super(categoria, c, titulo, a, cond);
    }

    public ArrayList<Noticia> noticiasQueCumplen(Condicion c) {
        ArrayList<Noticia> patrocinadas = new ArrayList<>();
            patrocinadas.add(this);
        return patrocinadas;
    }
}
