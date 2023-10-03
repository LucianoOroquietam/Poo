package Practico_6.Ejercicio_3;

import java.util.ArrayList;

public class ColaEspera {

   private ArrayList<OrdenColaEspera> elementos;

   public void addElemento(OrdenColaEspera elemento){
       boolean inserto = false;
       int i =0;

       while (!inserto && i< elementos.size()){
           //METODO EN COMUN DE CAMIONES Y BARCOS
           if (elemento.esMayor(elementos.get(i))){
               if (!elementos.contains(elemento)){
                   elementos.add(elemento);
                   inserto = true;
               }
           }
           i++;
       }
       if (!inserto){
           elementos.add(elemento);
       }
   }

   public OrdenColaEspera getSiguiente(){
       if (tieneElementos()){
           return elementos.remove(0);
       }else
           return null;
   }

    public boolean tieneElementos(){
        return !elementos.isEmpty();
    }


}
