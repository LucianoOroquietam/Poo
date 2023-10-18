package Ejercicio_3.Busqueda;

import Ejercicio_3.Documento;

public class DocumentoPorPalabraOFrase extends BuscarPorDocumento {
    //Todos los documentos cuyo título contenga una palabra o frase dada.

    private String tituloPalabraFraseDada;

    public DocumentoPorPalabraOFrase (String t){
        this.tituloPalabraFraseDada = t;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().contains(this.tituloPalabraFraseDada);
    }
}
