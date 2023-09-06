package Practico_2;

public class Episodio {
    private String titulo;
    private String descripcion;
    private int calificacion;
    private boolean fueVisto;

    public Episodio(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fueVisto = false;
        this.calificacion = -1;
    }

    public boolean fueVisto(){
        return this.fueVisto = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void ingresarCalificacion(int nuevaCalificacion) {
        if (nuevaCalificacion >= 1 && nuevaCalificacion <= 5) {
            calificacion = nuevaCalificacion;
        }
    }

}
