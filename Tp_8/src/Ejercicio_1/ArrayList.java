package Ejercicio_1;

import java.util.Arrays;

public class ArrayList implements SimpleList {
    private Object[] arrayObjects;
    private int size;
    private static final int CAPACIDAD_INICIAL = 10;

    public ArrayList() {
        arrayObjects = new Object[CAPACIDAD_INICIAL];
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object elemento) {
        return false;
    }

    private void asegurarCapacidad(int minCapacity) {
        if (minCapacity > arrayObjects.length) {
            //aumenta capacidad del array
            //Math.max(a, b) toma dos valores a y b y devuelve el valor máximo entre ellos.
            int newCapacity = Math.max(arrayObjects.length * 2, minCapacity);
            //redimensiona el array
            arrayObjects = Arrays.copyOf(arrayObjects, newCapacity);
            //Arrays.copyOf() se utiliza para copiar un arreglo en otro arreglo de un tamaño especificado.
        }
    }

    @Override
    public void add(Object element) {
        asegurarCapacidad(size + 1);
        arrayObjects[size++] = element;
    }

    @Override
    public Object add(int index, Object element) {
        if (index < 0 || index > size) {
            return null; // Índice fuera de rango
        }

        asegurarCapacidad(size + 1);
        for (int i = size; i > index; i--) {
            arrayObjects[i] = arrayObjects[i - 1];
        }
        arrayObjects[index] = element;
        size++;
        return element;


    }

    @Override
    public Object set(int pos, Object elemento) {
        return null;
    }

    @Override
    public boolean remove(Object elemento) {
        return false;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            return null; // Índice fuera de rango
        }

        Object removedElement = arrayObjects[index];
        for (int i = index; i < size - 1; i++) {
            arrayObjects[i] = arrayObjects[i + 1];
        }
        size--;
        return removedElement;
    }

    @Override
    public void addAll(SimpleList otraLista) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int pos) {
        return null;
    }

    @Override
    public int indexOf(Object elemento) {
        return 0;
    }


}
