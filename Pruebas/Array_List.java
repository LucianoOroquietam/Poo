package Pruebas;

import java.util.List;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        //lista de personas
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1,"Luciano", 26));
        lista.add(new Persona(1,"Tomas", 22));
        lista.add(new Persona(1,"LucianoA", 26));
        lista.add(new Persona(1,"Francisco", 24));

        System.out.println("----------FOR---------");
        //lista hablamos de tamaño porque es variable
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Nombre: " + lista.get(i).getNombre());
        }
        System.out.println("--------FOREACH-------");
        //por cada Persona que este dentro de la lista
        for (Persona p:lista) {
            System.out.println("id: " + p.getNum() + " "+
                    "Nombre: " + p.getNombre() + " "+
                    "Edad " + p.getEdad());
        }

    }
}
