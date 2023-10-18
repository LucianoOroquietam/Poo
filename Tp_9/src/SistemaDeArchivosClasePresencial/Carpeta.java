package SistemaDeArchivosClasePresencial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta extends ElementoSistemaArchivo {
    private ArrayList<ElementoSistemaArchivo>elementos;

    public Carpeta(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.elementos = new ArrayList<>();
    }


    /*Implementacion metodos abstractos*/
    @Override
    public double getTamanio() {
        double total = 0.0;
        for (ElementoSistemaArchivo e:elementos) {
            total += e.getTamanio();
        }
        return total;
    }

    //cuando defino el for en funcion de un elemento abstracto
    //delego a ese elemento como calcula cada uno de esos elementos
    //cantArchivo o getTamanio
    // y el propio elemento es el encargado de ver como responde a ese metodo
    @Override
    public int cantArchivos() {
        int total =0;
        for (ElementoSistemaArchivo e:elementos) {
            //recorro los elementos sin importa que tipos son, los quiero manejar de manera uniforme
                //en caso que sea archivo que devuelva 1
            total+=e.cantArchivos();
        }
        return total;
    }




}



       /*

       // return elementos.size(); retorna la cantidad de hijos , no de archivos.
    //solo mira hijos directos osea (carpeta 1 tien 2 cosas y listo los subcarpetas o lo que este mas
    //                               interno no lo mira)
@Override
public int cantElementos() {
        int total =0;
        for (ElementoSistemaArchivo e:elementos) {
        total+=e.cantElementos();
        }
        return total +1; //me cuento ami mismo (this)
        }
        */