package Practico_4.Ejercicio_4;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroPasaporte;
    private LocalDate fecha_nacimiento;
    private String estado;


    public Persona(String nombre, String apellido, String numeroPasaporte, LocalDate fecha_nacimiento, String estado){
        if (estado.equalsIgnoreCase("viajando")|| estado.equalsIgnoreCase("En concentracion")|| estado.equalsIgnoreCase("En pais de origen")){
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroPasaporte = numeroPasaporte;
            this.fecha_nacimiento = fecha_nacimiento;
            this.estado = estado;
        }else {
            //evito null pointer exception
            this.estado = "Estado invalido";
        }

    }
  public String getEstado(){
        return estado;
  }

  public boolean estaDisponible(){
      return estado.equalsIgnoreCase("En pais de origen");
  }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
