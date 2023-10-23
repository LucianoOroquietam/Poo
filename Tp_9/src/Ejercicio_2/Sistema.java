package Ejercicio_2;

import Ejercicio_2.Filtros.FiltroSocio;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Socio>socios;

    public Sistema(){
        this.socios = new ArrayList<>();
    }

    public void addSocio(Socio s){
        if (s!=null && !socios.contains(s)){
            socios.add(s);
        }
    }

    public ArrayList<Socio> Filtro(FiltroSocio filtroSocio){
        ArrayList<Socio> sociosQueCumplen = new ArrayList<>();

        for (Socio s:socios) {
            if (filtroSocio.cumple(s)){
                socios.add(s);
            }
        }
        return sociosQueCumplen;
    }


}
