package Juego_de_dados.juego3;

public class Jugador {
    private String Nombre;
    private int puntos;

    public Jugador(String Nombre){
        this.Nombre= Nombre;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos(int puntos) {
        this.puntos++;
    }

    public int tirarDados(Cubilete cub){
        //delegando responsabilidades
        return cub.tirar();
    }
}
