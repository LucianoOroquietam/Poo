package Procesadores;

public class ProcesadorLlegada extends Procesador{

    @Override
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public boolean esMayor(Tarea t1, Tarea t2) {
        return false;
    }
}
