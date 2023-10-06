package Farmacia;

import java.util.ArrayList;

public class Medicamento {

    private String nombre;
    private String laboratorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String laboratorio, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.precio = precio;
        this.sintomas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean trataSintoma(String sintoma){
        return sintomas.contains(sintoma);
    }

    @Override
    public boolean equals(Object o){
        try {
            Medicamento m = (Medicamento) o;
            return this.getNombre().equalsIgnoreCase(m.getNombre()) &&
                    this.getLaboratorio().equalsIgnoreCase(m.getLaboratorio());

        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", precio=" + precio +
                '}';
    }
}
