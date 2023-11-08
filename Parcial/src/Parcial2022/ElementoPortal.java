package Parcial2022;

import Parcial2022.Filtro.Condicion;

import java.util.ArrayList;

public abstract class ElementoPortal {
    private String categoria;
    public ElementoPortal(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public abstract ArrayList<String> calcularpClaves();

    public abstract ArrayList<Noticia> noticiasQueCumplen(Condicion c);
}
