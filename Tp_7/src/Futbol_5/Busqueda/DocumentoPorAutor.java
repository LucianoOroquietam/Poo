package Ejercicio_2.Busqueda;

import Ejercicio_2.Documento;

public class DocumentoPorAutor extends BuscarPorDocumento {
    //Todos los documentos de un autor determinado.
    private String autor;
    
    public DocumentoPorAutor(String a){
        this.autor = a;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getAutores().contains(autor);
    }
}
