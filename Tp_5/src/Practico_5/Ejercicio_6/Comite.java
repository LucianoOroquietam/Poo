package Practico_5.Ejercicio_6;

import java.util.ArrayList;

public class Comite {
    ArrayList<Trabajo> trabajos;
    ArrayList<Evaluador> evaluadores;
    ArrayList<String> conocimientosExperto;

    public Comite(){
        this.trabajos = new ArrayList<>();
        this.evaluadores = new ArrayList<>();
        this.conocimientosExperto = new ArrayList<>();
    }


    protected ArrayList<Trabajo> getTrabajos() {
        return new ArrayList<>(trabajos);
    }

    public void addConocimiento(String conocimiento){
        if ((conocimiento!=null) && (!conocimientosExperto.contains(conocimiento))){
            conocimientosExperto.add(conocimiento);
        }
    }
    public void addTrabajo(Trabajo t){
        if ((t!=null) && (!trabajos.contains(t))){
            trabajos.add(t);
        }
    }
    public void addEvaluador(Evaluador e){
        if ((e!=null) && (!evaluadores.contains(e))){
            evaluadores.add(e);
        }
    }

    //si es evaluador general o experto
    public boolean esEvaluadorExperto(Evaluador e){
        return e.getConocimientos().containsAll(conocimientosExperto);
    }


    //cuantos trabajos tiene un evaluador?
    public int cantidadTrabajo(Evaluador e){
        int cont = 0;
        for (int i = 0; i<trabajos.size(); i++){
            if (e.esApto(trabajos.get(i))){
                cont++;
            }
        }

        return cont;
    }


    //qué trabajos pueden asignarse un evaluador particular
    public void trabajoEvaluadorParticular(Evaluador e){
        ArrayList<Trabajo>trabajosAptos = new ArrayList<>();

        for (int i = 0; i < trabajos.size(); i++) {
            Trabajo t = trabajos.get(i);
            if (e.esApto(t)) {
               trabajosAptos.add(t);
            }
        }
    }


}
