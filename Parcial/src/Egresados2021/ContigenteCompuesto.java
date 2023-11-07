package Egresados2021;

import Egresados2021.Filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContigenteCompuesto extends ElementoEmpresa {

    private ArrayList<ElementoEmpresa> elementos;

    //A la hora de agrupar contingentes, la empresa debe controlar que todos se dirijan al mismo destino,
    // y con la misma fecha de partida
    private Filtro condicion;
    public ContigenteCompuesto(String destino, String nombre, LocalDate partida, LocalDate regreso){
        super(destino,nombre,partida,regreso);
        this.elementos = new ArrayList<>();
    }


    public void addElementos (ElementoEmpresa e){
        if ((e!=null) && (!elementos.contains(e)) && condicion.cumple(e)){
            elementos.add(e);
        }
    }

    @Override
    public int cantAlumnos() {
        int cantAlumno =0;
        for (ElementoEmpresa e:elementos) {
            cantAlumno+=e.cantAlumnos();
        }
        return cantAlumno;
    }


    // En el caso del contingente el precio queda determinado por la suma de los precios de todos sus integrantes.
    @Override
    public double getPrecio() {
        double precioTotal =0.0;
        for (ElementoEmpresa e:elementos) {
            precioTotal+=e.getPrecio();
        }
        return precioTotal;
    }

    @Override
    public double getDeuda() {
        double deudaTotal =0.0;
        for (ElementoEmpresa e:elementos) {
            deudaTotal+=e.getDeuda();
        }
        return deudaTotal;
    }

    @Override
    public Alumno getDeudaMayor() {
        double deudaMayor = 0;
        Alumno alumno = null;
        for (ElementoEmpresa e:elementos) {
            if (e.getDeuda()>deudaMayor){
                //deuda mayor
                deudaMayor = e.getDeuda();
                //alumno que mas debe
                alumno = e.getDeudaMayor();
            }
        }
        return alumno;
    }

    @Override
    public ElementoEmpresa getCopia() {
        ContigenteCompuesto copia = new ContigenteCompuesto(getDestino(),getNombre(),getFecha_partida(),getFecha_regreso());
        for (ElementoEmpresa e:elementos) {
            copia.addElementos(e.getCopia());
        }
        return copia;
    }

    @Override
    public ArrayList<ElementoEmpresa> elementosQueCumplen(Filtro f) {
        ArrayList<ElementoEmpresa> aux = new ArrayList<>();
        for (ElementoEmpresa e:elementos) {
            if (f.cumple(this)){
                aux.add(this);
            }else{
                aux.addAll(e.elementosQueCumplen(f));
            }

        }
        return aux;
    }


}
