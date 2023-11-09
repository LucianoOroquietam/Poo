package Recuperatorio2022;

import Recuperatorio2022.Filtro.Filtro;
import java.util.ArrayList;
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

        ArrayList<Portal> hijosQueCumplen = new ArrayList<>();
            for (Portal p:elementos) {
              Portal copiaHijo = p.getCopia(condicion);
                //chequear que cada copia que haga y cumpla con condicion no sea null
                if (copiaHijo!=null)
                    hijosQueCumplen.add(p);
            }
            //Tener en cuenta que, si una sección, subsección, grupo o subgrupo,
        // no contiene ninguna noticia que cumpla con el criterio de restricción, la/el misma/o no se debe incluir en la copia.
            if (!hijosQueCumplen.isEmpty()){
                NoticiaCompuesta copiaCompuesto = obtenerCopia();
                //Considerar también que tanto las noticias como las
                //secciones, subsecciones, grupos y subgrupos retornados por este servicio deben ser una copia del original, de tal forma
                //que, si se modifican, el original se mantenga intacto.
                for (Portal p:elementos) {
                    copiaCompuesto.addElementos(p);
                }
                return copiaCompuesto;
            }
        return null;
    }

    public NoticiaCompuesta obtenerCopia(){
       return new NoticiaCompuesta(getCategoria());
    }


    @Override
    public int compareTo(Portal otro) {
        return this.getCategoria().compareTo(otro.getCategoria());
    }
}
