package Ejercicio_8.Comparadores;

import Ejercicio_8.Video;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Video> {
    private Comparator<Video>c1,c2;

    public ComparadorCompuesto(Comparator<Video> c1, Comparator<Video> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Video o1, Video o2) {
        int res = c1.compare(o1,o2);
        if (res == 0){
            return c2.compare(o1,o2);
        }
        return res;
    }
}
