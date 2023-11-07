package Recuperatorio2022;

import Recuperatorio2022.Filtro.Filtro;

import java.util.ArrayList;
import java.util.Collections;

public class NoticiaCompuesta extends Portal{
    private ArrayList<Portal>elementos;

    public NoticiaCompuesta(String categoria){
        super(categoria);
        this.elementos = new ArrayList<>();
    }

    public void addElementos(Portal p){
        if (p!=null && !elementos.contains(p)){
            int i = 0;
            while (i<elementos.size() && elementos.get(i).compareTo(p) < 0)
                i++;
            if (i<elementos.size())
                elementos.add(i, p);
            else
                elementos.add(p);
        }

    }


    //Por otro lado, las palabras claves de una sección/subsección/
    //grupo/subgrupo, se calculan como la unión de todas las palabras claves de los elementos
    //que contiene, sin incluir palabras repetidas.
    @Override
    public ArrayList<String> calcularPalabrasClave() {
        ArrayList<String>pClaves = new ArrayList<>();
        for (Portal p: elementos){
            ArrayList<String> aux = p.calcularPalabrasClave();
            for (String str:aux) {
                if (!pClaves.contains(str)) {
                    pClaves.add(str);
                }
            }
        }
        return pClaves;
    }

    @Override
    public Portal getCopia(Filtro condicion) {
        Portal copia = null;

        if (condicion.cumple(this)){
            ArrayList<Portal> hijosQueCumplen = new ArrayList<>();
            copia = new NoticiaCompuesta(getCategoria());
            for (Portal p:elementos) {
                copia = p.getCopia(condicion);
                if (p!=null)
                    hijosQueCumplen.add(p);

            }
            if (!hijosQueCumplen.isEmpty()){
                return copia;
            }
        }



        return copia;
    }


    @Override
    public int compareTo(Portal otro) {
        return this.getCategoria().compareTo(otro.getCategoria());
    }
}
