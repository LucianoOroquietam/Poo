package Procesadores;

public class Tarea {

    private int prioridad;
    private double usoMemoria;
    private double usoCpu;
    private String idTarea;

    public Tarea(int prioridad, double usoMemoria, double usoCpu, String idTarea) {
        this.prioridad = prioridad;
        this.usoMemoria = usoMemoria;
        this.usoCpu = usoCpu;
        this.idTarea = idTarea;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public double getUsoMemoria() {
        return usoMemoria;
    }

    public void setUsoMemoria(double usoMemoria) {
        this.usoMemoria = usoMemoria;
    }

    public double getUsoCpu() {
        return usoCpu;
    }

    public void setUsoCpu(double usoCpu) {
        this.usoCpu = usoCpu;
    }


    public void ejecutarTarea(){
        System.out.println("SE EJECUTO LA TAREA " + this);
    }

    @Override
    public String toString() {
        return
                " prioridad=" + prioridad +
                " usoMemoria=" + usoMemoria + " usoCpu=" + usoCpu +
                " idTarea=" + idTarea + "\n"  ;
    }
}
