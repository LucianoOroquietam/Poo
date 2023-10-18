package Ejercicio_3;

public class EliminarPalabraPlugin implements Plugin {
    //EliminarPalabraPlugin: Elimina del texto todas las palabras que coincidan con una
    //dada por el usuario.

    private String palabraDada;
    private String textoModificado;

    public EliminarPalabraPlugin(String palabraDada) {
        this.palabraDada = palabraDada;
    }

    @Override
    public void ejecutar(String texto) {
        // Reemplaza la palabra a eliminar por un espacio en blanco
        textoModificado = texto.replace(palabraDada, " ");
    }

    public String getTextoModificado() {
        return textoModificado;
    }
}
