package Practico_6.Ejercicio_2;

public class Proceso extends ElementoColaOrdenado {

    private String nombre;
    private double memRequerida;

    public Proceso(String nombre, double memRequerida) {
        this.nombre = nombre;
        this.memRequerida = memRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMemRequerida() {
        return memRequerida;
    }

    @Override
    public boolean esMayor(ElementoColaOrdenado elemento) {
        //a dif del equals retorno si es mayor o menor
       return this.getMemRequerida() > ((Proceso) elemento).getMemRequerida();

    }

    @Override
    public boolean equals(Object otro){
        try {
            Proceso otroProceso = ((Proceso) otro);
            return this.getNombre().equals(otroProceso.getNombre()) &&
                    this.getMemRequerida() == otroProceso.getMemRequerida();
        }catch (Exception e){
            return false;
        }
    }
}
