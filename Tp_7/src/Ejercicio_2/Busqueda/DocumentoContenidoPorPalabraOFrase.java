package Ejercicio_2.Busqueda;

import Ejercicio_2.Documento;

public class DocumentoContenidoPorPalabraOFrase extends BuscarPorDocumento{

    //Todos los documentos cuyo contenido tenga una palabra o frase dada.

    private String  palabra;

    public DocumentoContenidoPorPalabraOFrase(String p){
        this.palabra = p;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getContenidoTextual().contains(this.palabra);
    }
}
