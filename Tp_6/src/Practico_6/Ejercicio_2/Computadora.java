package Practico_6.Ejercicio_2;

public class Computadora extends ElementoColaOrdenado {

    private double velocidadCPU;
    private String nombre;
    private Proceso proc;

    public Computadora(double velocidadCPU, String nombre) {
        this.velocidadCPU = velocidadCPU;
        this.nombre = nombre;
        this.proc = null;
    }

    public double getVelocidadCPU() {
        return velocidadCPU;
    }

    public String getNombre() {
        return nombre;
    }

    public void EjecutarProceso(Proceso p){
        //la computadora esta ocupada con este proc
       this.proc = p;
    }



    @Override
    public boolean esMayor(ElementoColaOrdenado elemento) {
        return this.getVelocidadCPU()>((Computadora) elemento).getVelocidadCPU();
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "velocidadCPU=" + velocidadCPU +
                ", nombre='" + nombre + '\'' +
                '}'+"\n";
    }
}
