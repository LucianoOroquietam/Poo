package Recuperatorio2022;

import java.util.ArrayList;

public class SeccionRestringida extends NoticiaCompuesta {

    private ArrayList<String> categoriaAdmisible;

    public SeccionRestringida(String categoria) {
        super(categoria);
        this.categoriaAdmisible = new ArrayList<>();
    }

    public void addCategoriaAdmisible(String categoria) {
        if (!categoriaAdmisible.contains(categoria)) {
            categoriaAdmisible.add(categoria);
        }
    }

    public void addElementos(Portal p) {
        if (categoriaAdmisible.contains(p.getCategoria())) {
            super.addElementos(p);
        }
    }

    public ArrayList<String> getCategoriaAdmisible() {
        return new ArrayList<>(categoriaAdmisible);
    }

    public NoticiaCompuesta obtenerCopia() {
        SeccionRestringida copia = new SeccionRestringida(this.getCategoria());

        for (String str : categoriaAdmisible) {
            copia.addCategoriaAdmisible(str);
        }
        return copia;
    }
}