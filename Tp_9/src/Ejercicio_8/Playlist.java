package Ejercicio_8;

import Ejercicio_8.Filtro.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class Playlist extends ElementoVideo{

    private ArrayList<ElementoVideo>elementos;
    private double demoraCarga;
    public Playlist(String titulo) {
        super(titulo);
        this.elementos = new ArrayList<>();
    }

    public void addElementos(ElementoVideo e){
        if (e!=null){
            elementos.add(e);
        }
    }

    @Override
    public ArrayList<Video> busquedas(Filtro condicion, Comparator<Video> orden) {
        ArrayList<Video>elementosQueCumplen = new ArrayList<>();
        for (ElementoVideo e: elementos) {
            elementosQueCumplen.addAll(e.busquedas(condicion,orden));
        }
        //Collections.sort(elementosQueCumplen,orden);
        elementosQueCumplen.sort(orden);
        return elementosQueCumplen;
    }


    // En el caso de las playlists y grupos, la lista de palabras
    //clave queda definida por la unión de todas las palabras clave de los elementos que
    //contiene, sin repetidos.
    @Override
    public ArrayList<String> getpClaves() {
        ArrayList<String>pClaves = new ArrayList<>();
        for (ElementoVideo e:elementos) {
            ArrayList<String>aux = e.getpClaves();
            for (String str: aux){
                if (!pClaves.contains(str)){
                    pClaves.add(str);
                }
            }
        }

        return pClaves;
    }

    @Override
    public int cantidadVideos() {
        int videosTotales =0;
        for (ElementoVideo e: elementos){
            videosTotales+=e.cantidadVideos();
        }
        return videosTotales;
    }

    //la duración es la suma de la duración de todo su
    //contenido, más 5 segundos por la demora de carga del grupo. Si se mejora la carga,
    //este valor puede cambiar.
    @Override
    public double getDuracion() {
      double duracionTotal=0;
      for (ElementoVideo e: elementos){
          duracionTotal+=e.getDuracion();
      }
      return duracionTotal + this.demoraCarga;
    }
}
