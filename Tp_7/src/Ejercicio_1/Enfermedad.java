package Ejercicio_1;

import java.util.ArrayList;
import java.util.Objects;


public class Enfermedad {
    private String nombreEnfermedad; //cochinilla
    private ArrayList<String> patologias;
    public Enfermedad(String nombre) {
        this.nombreEnfermedad = nombre;
    }

    public String getNombre() {
        return nombreEnfermedad;
    }

    public void setNombre(String nombre) {
        this.nombreEnfermedad = nombre;
    }

    public ArrayList<String> getPatologiasEnfermedad() {
            return new ArrayList<>(patologias);
    }


    public void addEnfermedad(String e){
        if (e!=null && !patologias.contains(e)){
            patologias.add(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        try {
            Enfermedad e = (Enfermedad) o;
            return Objects.equals(nombreEnfermedad, e.nombreEnfermedad);
        }catch (Exception exc){
            return false;
        }

    }


}
