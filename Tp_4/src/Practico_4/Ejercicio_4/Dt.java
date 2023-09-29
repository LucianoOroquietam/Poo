package Practico_4.Ejercicio_4;

import java.time.LocalDate;

public class Dt extends CuerpoTecnico {

    private String federacion;
    private int id;
    private static int ultimoId;
    public Dt(String nombre, String apellido, String numeroPasaporte, LocalDate fecha_nacimiento, String estado, String cargo, String federacion) {
        super(nombre, apellido, numeroPasaporte, fecha_nacimiento, estado, cargo);
        if (cargo.equalsIgnoreCase("dt")){
            this.id = ++ultimoId;
            this.federacion = federacion;
        }



    }

    public String getFederacion(){
        return federacion;
    }

    @Override
    public String toString() {
        return
                "Dt{" +
                        " id=" + id +
                        " federacion=" + federacion +
                        " cargo=" + getCargo() +
                        " nombre=" + getNombre() +
                        " apellido=" + getApellido() +
                        '}';
    }
}