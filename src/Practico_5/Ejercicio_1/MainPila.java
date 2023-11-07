package Practico_5.Ejercicio_1;

public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila();



        // Agregamos elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        pila.push(7);
        pila.push(8);
        pila.push(9);



        boolean elementoExiste1 = pila.contains(1); // Verificar si 1 existe en la pila
        boolean elementoExiste2 = pila.contains(3); // Verificar si 3 existe en la pila
        boolean elementoExiste3 = pila.contains(30); // Verificar si 3 existe en la pila

        System.out.println("¿El elemento 1 existe en la pila? " + elementoExiste1);
        System.out.println("¿El elemento 3 existe en la pila? " + elementoExiste2);
        System.out.println("¿El elemento 30 existe en la pila? " + elementoExiste3);




        System.out.println(" Tamaño size() : " + pila.size());
        // Consultamos y retiramos elementos de la pila
        System.out.println("La cantidad de elementos en la cima(top()) de la pila es de: " + pila.top());
        System.out.println("Retiramos el ultimo elemento pop(): " + pila.pop());

        // Consultamos el tamaño de la pila
        System.out.println("Ahora la pila nos queda de Tamaño size(): " + pila.size());

        // Creamos una copia de la pila
        Pila copiaPila = pila.copy();
        System.out.println("Copia de la pila copy(): " + copiaPila);

        // Creamos una pila con elementos en orden inverso
        Pila pilaInversa = pila.reverse();
        System.out.println("Pila en orden inverso reverse(): " + pilaInversa);


    }
}
