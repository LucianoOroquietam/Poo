package Practico_5.Ejercicio_6;

import java.util.ArrayList;

public class EvaluadorPoster extends Evaluador{

    public EvaluadorPoster(String nombre, int dni) {
        super(nombre, dni);
    }

    @Override
    public boolean esApto(Trabajo t){
        //el evaluador contiene todos los conocimeintos para el trabajo?
        ArrayList<String> conocimientosRequeridos = t.getPalabrasClaves();

        for (int i = 0; i<conocimientosRequeridos.size(); i++){
            if (!getConocimientos().contains(conocimientosRequeridos)) {
                // El evaluador no tiene uno de los conocimientos requeridos
                return false;
            }
        }
        return true;
    }
}
