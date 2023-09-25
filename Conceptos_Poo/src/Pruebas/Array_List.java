package Pruebas;

import java.util.List;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        //lista de personas
        List<Persona> lista = new ArrayList<>();
        lista.add(
                new Persona(1,"Luciano", 26)
        );
        lista.add(new Persona(1,"Tomas", 22));
        lista.add(new Persona(1,"LucianoA", 26));
        lista.add(new Persona(1,"Francisco", 24));

        //cambiar valores con set

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Charlie");

        String primerNombre = nombres.get(0); // Alice
        System.out.println("primer nombre de lista de nombre : " + primerNombre);

        System.out.println("------------arraylist--------------------------");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre: " + nombres.get(i));
        }

        System.out.println("------------set robert pos = 1--------------------------");

        nombres.set(1, "Robert"); //Modifica el valor de la posición 1

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre: " + nombres.get(i));
        }

        nombres.add(1,"Juan"); //agrega un elemento en la posicion 1 y realiza un corrimiento de los restantes

        System.out.println("------------add juan pos = 1--------------------------");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre: " + nombres.get(i));
        }

        nombres.remove(2); // Elimina "Robert" (corrimiento)

        System.out.println("------------remove pos = 2--------------------------");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre: " + nombres.get(i));
        }

        System.out.println("------------arraylist final--------------------------");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre: " + nombres.get(i));
        }

        int tamaño = nombres.size(); // 3
        System.out.println("el tamaño es " + tamaño);
        int indice = nombres.indexOf("Alice"); // 0

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
