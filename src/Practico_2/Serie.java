package Practico_2;

import java.util.ArrayList;
public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada>temporadas = new ArrayList<>();
    public Serie(){
        titulo = "N";
        creador = "N";
        descripcion = "N";
        genero = "N";
    }
    public Serie(String titulo, String descripcion, String creador, String genero){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
    }
    public void agregarTemporada(Temporada temporada){
        temporadas.add(temporada);
    }
    public double getPromedioCalifi() {
        int sumaCalificaciones = 0;
        int cantCalificaciones = 0;
        for (Temporada temporada : temporadas) {
            sumaCalificaciones = temporada.getSumaCalificaciones();
            cantCalificaciones += temporada.getTotalEpisodiosVistos();
        }
        return cantCalificaciones > 0 ? (double) sumaCalificaciones / cantCalificaciones : 0;
    }

    public boolean seVieronTodosLosEpisodiosDeLaSerie(Temporada temporada) {
        return temporada.seVieronTodosLosEpisodios();
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", creador='" + creador + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
