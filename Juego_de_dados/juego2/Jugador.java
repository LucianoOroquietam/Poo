package Juego_de_dados.juego2;

import Juego_de_dados.juego3.Cubilete;

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

    public int tirarDados(Dado d1,Dado d2){
        //delegando responsabilidades
        return d1.tirar() + d2.tirar();
    }
}
