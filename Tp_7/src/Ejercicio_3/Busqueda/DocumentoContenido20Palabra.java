package Ejercicio_3.Busqueda;

import Ejercicio_3.Documento;

public class DocumentoContenido20Palabra extends BuscarPorDocumento{

    //Todos los documentos cuyo contenido tenga al menos 20 palabras.

    private String palabraMax20;

    public DocumentoContenido20Palabra(String palabraMax20) {
        this.palabraMax20 = palabraMax20;
    }

    @Override
    public boolean cumple(Documento d) {
        String contenido = d.getContenidoTextual();
        String[] palabras = contenido.split(" "); // Dividir por espacio en blanco

        // Contar las palabras en la cadena
        int cantidadPalabras = 0;
        for (String palabra : palabras) {
            //palabras no vacias
            if (!palabra.isEmpty()) {
                cantidadPalabras++;
            }
        }

        return cantidadPalabras >= 20;
    }
}
