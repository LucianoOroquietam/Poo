package Ejercicio_1;

import Ejercicio_1.Buscador.Buscar;

import java.util.ArrayList;

public class EmpresaAgricola {

    //El sistema está pensado para ayudar a las agrícolas a decidir qué agroquímico se puede
    //utilizar para tratar ciertas enfermedades de los cultivos.
    private String nombreEmpresa;
    private ArrayList<Cultivo> cultivos;
    private ArrayList<ProductoQuimico> agroquimicos;

    public EmpresaAgricola(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.cultivos = new ArrayList<>();
        this.agroquimicos = new ArrayList<>();
    }
    public ArrayList<Cultivo> getCultivos() {
        return new ArrayList<>(cultivos);
    }

    public ArrayList<ProductoQuimico> getAgroquimicos() {
        return new ArrayList<>(agroquimicos);
    }

    //Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.
    public ArrayList<ProductoQuimico> tratarEnfermedad(Buscar b){
        ArrayList<ProductoQuimico> listaEnfermedadesTratadas = new ArrayList<>();

        for (ProductoQuimico p: agroquimicos) {
            if (b.cumple(p)){
                listaEnfermedadesTratadas.add(p);
            }
        }

        return listaEnfermedadesTratadas;
    }


    public void addCultivo(Cultivo c){
        if(c!=null && !cultivos.contains(c)){
            cultivos.add(c);
        }
    }

    public void addProducto(ProductoQuimico p){
        if(p!=null && !agroquimicos.contains(p)){
            agroquimicos.add(p);
        }
    }

}
