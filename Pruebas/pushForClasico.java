/*

package Pruebas;

public class pushForClasico {
    private Object[] arregloPila;
    private int tamaño;
    private int capacidad;
    private String elemento;

    public pushForClasico( int capacidad,String elemento) {
        this.arregloPila = new Object[capacidad];
        this.elemento = elemento;
        this.capacidad = capacidad;
    }
    public void push(E elemento){

         * : El operador tamaño++ incrementa el valor de tamaño en 1 después de que se haya utilizado en la expresión.
         * En otras palabras, después de que se haya agregado el elemento al arreglo en la posición tamaño, tamaño se incrementará en 1,
         * lo que significa que la próxima vez que se llame a push, el elemento se agregará en la siguiente posición disponible.

        if (tamaño < capacidad){
            arregloPila[tamaño++] = elemento;
        }else {
            throw  new IllegalStateException("La pila esta llena");
        }
    }

    public void push(E elemento) {
        if (tamaño >= arreglo.length) {
            // Si el arreglo está lleno, crea un nuevo arreglo con el doble de capacidad
            Object[] nuevoArreglo = new Object[arreglo.length * 2];
            // Copia los elementos del arreglo original al nuevo arreglo
            for (int i = 0; i < tamaño; i++) {
                nuevoArreglo[i] = arreglo[i];
            }
            arreglo = nuevoArreglo;
        }
        arreglo[tamaño++] = elemento;
    }

}


*/