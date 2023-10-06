package Ejercicio_1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad>enfermedadesFrecuentes;


    public Cultivo(String nombre, ArrayList<Enfermedad> enfermedadesFrecuentes) {
        this.nombre = nombre;
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

   protected ArrayList<Enfermedad> getEnfermedadesFrecuentes() {
        return new ArrayList<>(enfermedadesFrecuentes);
    }


    public void addEnfremedadesFrecuentes(Enfermedad e){
        if(e!=null && !enfermedadesFrecuentes.contains(e)){
            enfermedadesFrecuentes.add(e);
        }
    }




}
