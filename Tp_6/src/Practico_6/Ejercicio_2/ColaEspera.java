package Practico_6.Ejercicio_2;

import java.util.ArrayList;

public class ColaEspera {

    private ArrayList<ElementoColaOrdenado> elementos;

    public ColaEspera(){
        this.elementos = new ArrayList<>();
    }

    public ElementoColaOrdenado getSiguiente(){

        if (this.tieneElementos()){
            //lo elimina y lo retorna
            return elementos.remove(0);
        }else
            return null;

    }

    public boolean tieneElementos(){
       return !elementos.isEmpty();
    }

    public void addElemento (ElementoColaOrdenado elemento){
        boolean inserto = false;
        int i =0;

        while (!inserto && i<elementos.size()){

            //computadoras y procesadores necesitan un metodo en comun

            if (elemento.esMayor(elementos.get(i))){
                if (!elementos.contains(elemento)){
                    elementos.add(i, elemento);
                    inserto = true;
                }
            }
            i++;
        }
        if (!inserto){
            elementos.add(elemento);
        }

    }
}
