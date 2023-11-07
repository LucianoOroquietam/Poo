package Parcial2023;

import Parcial2023.Filtro.Condicion;

import java.util.ArrayList;

public class PiezaCompuesta extends Printer3D {

    ArrayList<Printer3D>elementos;
    private int extraPLA;
    private double tiempoEstimado;

    public PiezaCompuesta(String n, String d){
        super(n,d);
    }


    public void addElementos(Printer3D e){
        if (e!= null){
            elementos.add(e);
        }
    }

    public int getCantidadSimples(){
        int suma =0;
        for (Printer3D e:elementos) {
            suma += e.getCantidadSimples();
        }

        return suma;
    }

    @Override
    public double costoPieza() {
        return cantidadPla() * getPrecioGramo() + tiempoEstimado() * getCostoSegundo();
    }

    @Override
    public ArrayList<PiezaSimple> losQueCumple(Condicion c) {
        ArrayList<PiezaSimple>resultado = new ArrayList<>();

        for (Printer3D e: elementos){
            resultado.addAll(e.losQueCumple(c));
        }

        return resultado;
    }


    @Override
  public   int cantidadPla() {
        int cantidadPla = 0;
        //cantidad de PLA necesario que
        //se calcula como la suma del PLA necesario 1 gramo por cada pieza simple que la compone

        //tengo que sumar el pla de los hijos mas 1 gramo por cada pieza que compone a una pieza compuesta
        for (Printer3D elemento:elementos) {
            cantidadPla += elemento.cantidadPla();
        }
        //la cantPla total + extra (representa ese 1) * la cantidad de simples de una compuesta.
        return cantidadPla + extraPLA * getCantidadSimples();

    }


    @Override
    public double tiempoEstimado() {
       double tiempoTotal = 0;

       for (int i=0; i< elementos.size(); i++){
           tiempoTotal += elementos.get(i).tiempoEstimado();
       }
       //45s = this.tiempoEstimado
       return tiempoTotal + this.tiempoEstimado;
    }

    @Override
    public ArrayList<String> listaColores() {
        //debe ser posible obtener
        // la lista de los colores de las piezas que lo componen (simples o compuestas), sin repetidos.
        ArrayList<String> colores = new ArrayList<>();

        for (Printer3D e:elementos) {
            ArrayList<String> aux = e.listaColores();
            for (String str: aux){
                if (!colores.contains(str)){
                    colores.add(str);
                }
            }
        }
        return colores;

    }
}
