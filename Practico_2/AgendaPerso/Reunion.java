package Practico_2.AgendaPerso;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
public class Reunion {
    private String temaReunion;
    private String lugarDeLaReunion;
    private LocalDate fechaReunion;
    private LocalTime inicioReunion;
    private LocalTime finReunion;
    private Duration duracionReunion;

    private ArrayList<Asistente> asistentes;

    public Reunion(LocalDate fechaReunion){
        this.fechaReunion = fechaReunion;
    }

    public Reunion(String temaReunion, String lugarDeLaReunion,LocalDate fechaReunion, LocalTime inicioReunion, LocalTime finReunion, Duration duracionReunion) {
        this(fechaReunion);
        this.inicioReunion = inicioReunion;
        this.finReunion = finReunion;
        this.temaReunion = temaReunion;
        this.lugarDeLaReunion = lugarDeLaReunion;
        this.duracionReunion = duracionReunion;
        this.asistentes = new ArrayList<Asistente>();

    }

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void agregarAsistente(Asistente asistente){
        if (asistente!=null){
            asistentes.add(asistente);
        }

    }

    public int cantidadAsistente(){
       return asistentes.size();
    }

    @Override
    public String toString() {
        return "Reunion{" +
                "temaReunion='" + temaReunion + '\'' +
                ", lugarDeLaReunion='" + lugarDeLaReunion + '\'' +
                ", fechaReunion=" + fechaReunion +
                ", inicioReunion=" + inicioReunion +
                ", finReunion=" + finReunion +
                ", duracionReunion=" + duracionReunion +
                ", asistentes=" + asistentes +
                '}';
    }

    public String toString(LocalDate fechaReunion) {
        return
                "fechaReunion : " + fechaReunion ;
    }
}
