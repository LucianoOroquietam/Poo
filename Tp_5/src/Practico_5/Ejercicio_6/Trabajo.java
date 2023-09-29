package Practico_5.Ejercicio_6;

import java.util.ArrayList;

public class Trabajo {
    private String nombreTrabajo;
    private ArrayList<String>palabrasClaves;

    public Trabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
        this.palabrasClaves = new ArrayList<>();
    }

    public void addPalabrasClaves(String palabraClave){
        if ((palabraClave!=null) && (!palabrasClaves.contains(palabraClave))){
            palabrasClaves.add(palabraClave);
        }
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    protected ArrayList<String> getPalabrasClaves() {
        return new ArrayList<>(palabrasClaves);
    }
}
