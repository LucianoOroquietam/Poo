package Recuperatorio2021;

import Recuperatorio2021.Filtro.Condicion;

public class Promocional extends ProductoCompuesto{
    public Promocional(double descuento, double descuentoTope, Condicion filtro) {
        super(descuento, descuentoTope, filtro);
    }
    // y otro que se identifica como “Promocionales”, en el cual
    //el precio del mismo se calcula siempre como el promedio de los precios que él contiene
    // (no va a cambiar nunca la forma).

    //metodo que recorre todos los hijos .. sumaTotalElemtos / cantidadElementos = promedio

    public double precioPromocional(){
        return super.getPrecioComponente()/super.contarProductos();
    }

}
