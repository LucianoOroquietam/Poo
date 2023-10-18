package Ejercicio_3.Busqueda;

import Ejercicio_3.Documento;

public class DocumentoPorTitulo extends BuscarPorDocumento{
    //Todos los documentos cuyo título sea exactamente igual a un título dado.
    private String titulo;
    public DocumentoPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Documento d) {
        return d.getTitulo().equalsIgnoreCase(titulo);
    }
}
