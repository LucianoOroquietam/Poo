package Procesadores;

import java.util.ArrayList;

public abstract class Procesador {

    protected ArrayList<Tarea> tareas;

    public Procesador (){
        this.tareas = new ArrayList<>();
    }

    public abstract boolean esMayor(Tarea t1, Tarea t2);


    //METODO TEMPLATE
    public void agregarTarea(Tarea tarea){
        boolean encontro = false;
        int i =0;

        while (!encontro && i < tareas.size()){
            //si es mayor que el cpu de la otra tarea
            // if (tarea.getUsoCpu() > tareas.get(i).getUsoCpu()){
            if (this.esMayor(tarea, tareas.get(i))){
                //encontro lugar donde acomodarlo
                encontro = true;
                tareas.add(i,tarea);
            }
            i++;
        }
        if(!encontro){
            tareas.add(tarea);
        }
    }


    public void EjecutarPrimera(){
        if (tareas.size()>0){
            Tarea t1 = tareas.get(0);
            t1.ejecutarTarea();
            tareas.remove(0);
        }
    }


    @Override
    public String toString() {
        return "tareas = " +   "\n" +  tareas;
    }
}
