package Ejercicio_8.Comparadores;

import Ejercicio_8.Usuario;
import Ejercicio_8.Video;

import java.util.Comparator;

public class ComparadorEmail implements Comparator<Usuario> {
    @Override
    public int compare(Usuario o1, Usuario o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
