package Parcial2022;

import Parcial2022.Filtro.Condicion;

import java.util.ArrayList;

public class SeccionCompuesta extends ElementoPortal{

    // La categoría de cada sección / subsección se determina por la categoría del elemento en la posición 4, mientras
    //que para los grupos y subgrupos es la posición 5 (estas posiciones no son fijas
    //sino que pueden cambiar, y si no hay elementos suficientes siempre retornan “Sin
    //definir”).
    private ArrayList<ElementoPortal>elementos;
    private int pos;
    private static final String SIN_DEFINIR ="Sin definir";

    public SeccionCompuesta(String categoria, int pos) {
        super(categoria);
        this.pos = pos;
        this.elementos = new ArrayList<>();
    }


    @Override
    public String getCategoria() {
        if (pos<elementos.size()){
            //retorno la pos y la categoria que esta en esa pos
            return elementos.get(pos).getCategoria();
        }
        else{
            return getSinDefinir();
        }
    }

    public void addElementos(ElementoPortal e){
            elementos.add(e);
    }

    public static String getSinDefinir(){
        return SeccionCompuesta.SIN_DEFINIR;
    }


    //las palabras claves de una sección/subsección/grupo/subgrupo, se calculan como la
    //unión de todas las palabras claves de los elementos que contiene, sin incluir palabras repetidas.
    @Override
    public ArrayList<String> calcularpClaves() {
      ArrayList<String>pClaves = new ArrayList<>();
        for (ElementoPortal e:elementos) {
            //arreglo aux para guardar pClaves recursivamente
            ArrayList<String>aux = e.calcularpClaves();
            for (String str:aux){
                //si no tiene palabras repetidas
                if (!pClaves.contains(str)){
                    pClaves.add(str);
                }
            }
        }
        return pClaves;
    }

    @Override
    public ArrayList<Noticia> noticiasQueCumplen(Condicion c) {
        ArrayList<Noticia>lasQueCumplen = new ArrayList<>();
        for (ElementoPortal e: elementos) {
            lasQueCumplen.addAll(e.noticiasQueCumplen(c));
        }
        return lasQueCumplen;
    }
}
