package Parcial2022;

import Parcial2022.Filtro.Condicion;

import java.util.ArrayList;

public abstract class ElementoPortal {

    public abstract ArrayList<String> calcularpClaves();

    public abstract String getCategoria();

    public abstract ArrayList<Noticia> noticiasQueCumplen(Condicion c);


}
