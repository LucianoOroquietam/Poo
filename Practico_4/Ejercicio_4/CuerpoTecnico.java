package Practico_4.Ejercicio_4;

import java.time.LocalDate;

public class CuerpoTecnico extends Persona{
    private String cargo;
    private int id;
    private static int ultimoId;
    private String titulo;
    private int aniosExperiencia;

    public CuerpoTecnico(String nombre, String apellido, String numeroPasaporte, LocalDate fecha_nacimiento, String estado, String cargo) {
        super(nombre, apellido, numeroPasaporte, fecha_nacimiento, estado);

        if (cargo.equalsIgnoreCase("dt")){
            this.id = ++ultimoId;
            this.cargo = cargo;
        }

    }

    public CuerpoTecnico(String nombre, String apellido, String numeroPasaporte, LocalDate fecha_nacimiento, String estado, String cargo, String titulo, int aniosExperiencia) {
        super(nombre, apellido, numeroPasaporte, fecha_nacimiento, estado);
        if (cargo.equalsIgnoreCase("masajista")){
            this.cargo = cargo;
            this.titulo = titulo;
            this.aniosExperiencia = aniosExperiencia;
        }

    }

    public boolean esDt(){
        return cargo.equalsIgnoreCase("dt");
    }
    public  boolean esMasajista(){
        return cargo.equalsIgnoreCase("masajista");
    }

    @Override
    public String toString() {
        if (esDt()){
            return "CuerpoTecnico{" +
                    ", id=" + id +
                    ", cargo='" + cargo + '\'' +
                    ", nombre=" + getNombre() +
                    ", apellido=" + getApellido() +
                    '}';
        }else{
                return "CuerpoTecnico{" +
                        ", nombre=" + getNombre() +
                        ", apellido=" + getApellido() +
                        ", cargo='" + cargo + '\'' +
                        ", titulo=" + titulo +
                        ", años de experiencia = " + aniosExperiencia +
                        '}';
        }

    }
}
