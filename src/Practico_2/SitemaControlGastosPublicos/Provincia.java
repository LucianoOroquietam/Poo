package Practico_2.SitemaControlGastosPublicos;

import java.util.ArrayList;

public class Provincia {
    private String nombreProvincia;
    ArrayList<Ciudad>ciudades;

    public Provincia(String nombreProvincia){
        this.nombreProvincia = nombreProvincia;
        this.ciudades = new ArrayList<>();
    }

    public void addCiudad(Ciudad ciudad){
        if (ciudad !=null){
            ciudades.add(ciudad);
        }

    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
    public int cantidadCiudades(){
        return ciudades.size();
    }

    public int getCiudadesConDeficit() {
        int ciudadesConDeficit = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.gastaMasDeLoQueRecauda()) {
                    ciudadesConDeficit++;
            }
        }
        return ciudadesConDeficit;
    }

    @Override
    public String toString() {
        return "Clase Provincia : " +
                "nombreProvincia='" + nombreProvincia + '\'' +
                ", ciudades=" + ciudades;
    }
}
