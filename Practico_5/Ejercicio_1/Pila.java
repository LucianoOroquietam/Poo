package Practico_5.Ejercicio_1;


import java.util.ArrayList;
import java.util.List;


public class Pila {
    private List<Object> elementos = new ArrayList<>();



    public void push(Object elemento){
        if (elemento!=null && !elementos.contains(elemento)){
            elementos.add(elemento);
        }else
            throw new IllegalStateException("La pila que quiere ingresar esta repetida o esta vacia");
    }

    public Object pop(){
       // pop(), que retorna el último elemento agregado y lo elimina de la misma.
        if (elementos.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int lastIndex = elementos.size()-1;
        Object elemento = elementos.get(lastIndex);
        elementos.remove(lastIndex);
        return elemento;
    }

    public boolean contains(Object elemento) {
        return elementos.contains(elemento);
    }


    public Object top(){
        return elementos.get(elementos.size()-1);
    }

    public int size(){
        return elementos.size();
    }

    public Pila copy(){
        Pila nuevaPila = new Pila();
        for (Object elemento: elementos){
            nuevaPila.push(elemento);
        }
        return nuevaPila;
    }

    public Pila reverse(){
        Pila nuevaPilaReverse = new Pila();
       while (!elementos.isEmpty()){
           nuevaPilaReverse.push(pop());
       }
       return nuevaPilaReverse;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "elementos=" + elementos +
                '}';
    }
}

/*
* Implementar en Java una pila de elementos. A una pila se le pueden agregar elementos
utilizando el método push(Object o). Para retirar elementos de la pila se utiliza el método
pop(), que retorna el último elemento agregado y lo elimina de la misma.
* Es posible consultar el tope de la pila sin eliminarlo utilizando el método top().
*  La mencionada anteriormente es la única forma de consultar y retirar elementos de la pila, es decir, no se
pueden obtener ni consultar elementos de otra posición que no sea el tope de la pila.
* Definir también los siguientes métodos:
● size(): retorna la cantidad de elementos almacenados
● copy(): retornar una nueva pila con una copia de los elementos de la pila original, en
el mismo orden. La pila original debe mantener el orden de los elementos.
● reverse(): retorna una copia de la pila pero con los elementos en el orden inverso.
* */