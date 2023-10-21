package Ejercicio_2;

public class EliminarPalabraPlugin implements Plugin {
    //EliminarPalabraPlugin: Elimina del texto todas las palabras que coincidan con una
    //dada por el usuario.

    private String palabraDada;


    public EliminarPalabraPlugin(String palabraDada) {
        this.palabraDada = palabraDada;
    }

    @Override
    public void ejecutar(String texto) {
        // Reemplaza la palabra a eliminar por un espacio en blanco
        texto = texto.replace(palabraDada, " ");
    }


}
