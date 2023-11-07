package Recuperatorio2021;

import Recuperatorio2021.Filtro.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductoCompuesto extends Bazar{

    private ArrayList<Bazar>elementos;
    private double descuento,descuentoTope;

    private Condicion filtro;
    public ProductoCompuesto(double descuento,double descuentoTope, Condicion f) {
        this.elementos = new ArrayList<>();
        this.descuento = descuento;
        this.descuentoTope = descuentoTope;
        this.filtro = f;
    }

    public void addElementos(Bazar e){
        if ((e!=null) && (filtro.cumple(e)) && (!elementos.contains(e))){
            elementos.add(e);
        }
    }

    @Override
    public double getPrecioComponente() {
        ///En el caso del combo, el precio queda
        // determinado por la suma de los precios de todos sus componentes, menos un 1,4% por cada producto contenido.
       // Se debe tener en cuenta que el descuento nunca debe superar el 50% del precio original del combo (si supera, el
        // descuento queda en 50%), a futuro ambos valores pueden variar, incluso ser distintos dependiendo del combo.
        double precioTotal =0;
        double descuentoTotal = this.descuento * contarProductos();

        if (descuentoTotal > this.descuentoTope){
          return precioTotal * descuentoTope;
        }

        return precioTotal - (descuentoTotal * precioTotal);
    }

    @Override
    public double getPesoComponente() {
        double pesoTotal=0;
        for (Bazar e : elementos){
            pesoTotal = pesoTotal + e.getPesoComponente();
        }
        return pesoTotal;
    }

    @Override
    public ArrayList<String> getCategoria() {
        //creo un array categorias
        ArrayList<String>categorias = new ArrayList<>();
        //todas las categorías de los elementos
        for(Bazar e: elementos){
            //arreglo para llamada recursiva
            ArrayList<String>aux = e.getCategoria();
            for (String cat: aux){
                if (!categorias.contains(cat)){
                    categorias.add(cat);
                }
            }
        }
        return categorias;
    }

    @Override
    public int contarProductos() {
        int totalProductos = 0;
        for (Bazar e:elementos) {
            totalProductos+= e.contarProductos();
        }

        return totalProductos;
    }

    @Override
    public Bazar getCopia(Condicion c) {
        Bazar copia = null;
        if (c.cumple(this)){
            ProductoCompuesto comboCopia = new ProductoCompuesto(this.descuento,this.descuentoTope,this.filtro);
            ArrayList<Bazar>hijosQueCumplen = new ArrayList<>();
            for (Bazar e: elementos){
                copia = e.getCopia(c);
                if (copia != null){
                    hijosQueCumplen.add(copia);
                }

            }
            if (!hijosQueCumplen.isEmpty()){
                for (Bazar elem:hijosQueCumplen)
                    comboCopia.addElementos(elem);
                return comboCopia;
            }

        }

        return copia;
    }

    @Override
    public ArrayList<Bazar> buscarOrdenar(Condicion filtro, Comparator<Bazar> orden) {
        ArrayList<Bazar> elementosQueCumplen = new ArrayList<>();
       for (int i =0; i< elementos.size(); i++){
           Bazar hijos = elementos.get(i);
           elementosQueCumplen.addAll(hijos.buscarOrdenar(filtro,orden));

       }

        if(orden==null)
            Collections.sort(elementosQueCumplen,orden);

            //Collections.sort(elementosQueCumplen);

        return elementosQueCumplen;

    }


}
