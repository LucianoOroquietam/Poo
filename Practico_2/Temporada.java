package Practico_2;

import java.util.ArrayList;

public class Temporada {
    private int numeroTemporadas;
    private ArrayList<Episodio> episodios = new ArrayList<>();
    public Temporada(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void agregarEpisodio(Episodio episodio){
        episodios.add(episodio);
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public double getPromedioCalificaciones() {
        int sumaCalificaciones = 0;
        int cantCalificaciones = 0;

        if (episodios !=null) {
            for (Episodio episodio : episodios) {
                if (episodio.fueVisto()) {
                    sumaCalificaciones += episodio.getCalificacion();
                    cantCalificaciones++;
                }
            }
        }
        //condición ? expr1 : expr2
        return cantCalificaciones > 0 ? (double) sumaCalificaciones / cantCalificaciones : 0;
    }

    public int getTotalEpisodiosVistos() {
        int totalEpisodiosVistos = 0;
        for (Episodio episodio : episodios) {
            if (episodio.fueVisto()) {
                totalEpisodiosVistos++;
            }
        }
        return totalEpisodiosVistos;
    }
    public int getSumaCalificaciones() {
        int sumaCalificaciones = 0;
        for (Episodio episodio : episodios) {
            if (episodio.fueVisto()) {
                sumaCalificaciones += episodio.getCalificacion();
            }
        }
        return sumaCalificaciones;
    }

    public int getCantCalificaciones() {
        int cantCalificaciones = 0;

        for (Episodio episodio : episodios) {
            if (episodio.fueVisto()) {
                cantCalificaciones++;
            }
        }

        return cantCalificaciones;
    }

    public boolean seVieronTodosLosEpisodios() {
        for (Episodio episodio : episodios) {
            if (!episodio.fueVisto()) {
                return false;
            }
        }
        return true;
    }



    @Override
    public String toString() {
        return "Temporada{" +
                "numeroTemporadas=" + numeroTemporadas +
                '}';
    }
}










