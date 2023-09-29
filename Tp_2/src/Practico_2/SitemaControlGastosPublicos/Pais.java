package Practico_2.SitemaControlGastosPublicos;

import java.util.ArrayList;

public class Pais {
    private String nombrePais;
    ArrayList<Provincia> provincias;

    public Pais(String nombrePais){
        this.nombrePais = nombrePais;
        this.provincias = new ArrayList<Provincia>();
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void addProvincia(Provincia provincia){
        provincias.add(provincia);
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }
    public int getProvinciasConMitadCiudadesDeficit() {
        int  provinciasConMitadCiudadesDeficit =0;
        for (Provincia provincia : provincias) {
            int totalCiudades = provincia.cantidadCiudades();
            int ciudadesConDeficit = provincia.getCiudadesConDeficit();
            if (ciudadesConDeficit > totalCiudades / 2) {
                provinciasConMitadCiudadesDeficit++;
            }
        }

        return provinciasConMitadCiudadesDeficit;

    }


    @Override
    public String toString() {
        return "Pais{" +
                "nombrePais='" + nombrePais + '\'' +
                ", provincias=" + provincias+
                '}';
    }
}
