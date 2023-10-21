package Ejercicio_2;
public class ContadorPalabrasPlugin implements Plugin {
    private int cantidadPalabras;

    @Override
    public void ejecutar(String texto) {
        // Contar las palabras en el texto
        this.cantidadPalabras = texto.split(" ").length;
    }

    // Método para consultar la cantidad de palabras
    public int getCantidadPalabras() {
        return this.cantidadPalabras;
    }
}

