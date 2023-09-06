package Practico_2.AgendaPerso;
import java.util.ArrayList;

public class AgendaPersonal {

    private ArrayList<Reunion> reuniones;

    public AgendaPersonal(){
      reuniones = new ArrayList<Reunion>();
    }

    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }

    public int cantidadReuniones(){
      return  reuniones.size();
    }

    public void agregarReunionAgenda(Reunion reunion){
        if (reunion!=null){
            reuniones.add(reunion);
        }
    }


}
