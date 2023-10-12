package Ejercicio_1;

public interface SimpleList {

    int size();
    boolean isEmpty();
    boolean contains(Object elemento);
    void add(Object elemento);
    Object add(int pos, Object elemento);
    Object set(int pos, Object elemento);
    boolean remove(Object elemento);
    Object remove(int pos);
    void addAll(SimpleList otraLista);
    void clear();
    Object get(int pos);
    int indexOf(Object elemento);
}
