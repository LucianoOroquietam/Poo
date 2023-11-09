package Ejercicio_8.Comparadores;

import Ejercicio_8.Usuario;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Usuario> {
    @Override
    public int compare(Usuario o1, Usuario o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
