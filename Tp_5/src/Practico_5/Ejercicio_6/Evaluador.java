package Practico_5.Ejercicio_6;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private int dni;
    private ArrayList<String>conocimientos;


    public Evaluador(String nombre, int dni){
        this.conocimientos = new ArrayList<>();
        this.nombre = nombre;
        this.dni = dni;
    }


    //que evaluador esApto para un determinado trabajo

    public boolean esApto(Trabajo t){
        //el evaluador contiene todos los conocimeintos para el trabajo?
        ArrayList<String> conocimientosRequeridos = t.getPalabrasClaves();

        for (int i = 0; i<conocimientosRequeridos.size(); i++){
            if (!conocimientos.containsAll(conocimientosRequeridos)) {
                // El evaluador no tiene uno de los conocimientos requeridos
                return false;
            }
        }
        return true;
    }

    protected ArrayList<String> getConocimientos() {
        return new ArrayList<>(conocimientos);
    }
}
