package Juego_de_dados.juego1;

import Juego_de_dados.juego1.Juego1;

//juego 1 procedural y casi nada orientado a objetos
public class MainJuego1 {
    public static void main(String[] args) {
        Juego1 juego1 = new Juego1();
        System.out.println(juego1.getPuntosJugador1());
        System.out.println(juego1.getPuntosJugador2());
        System.out.println("--------------------------------------");

        System.out.println(juego1.jugar());
        System.out.println(juego1.getPuntosJugador1());
        System.out.println(juego1.getPuntosJugador2());

        System.out.println("--------------------------------------");
        Juego1 juego2 = new Juego1(3);
        System.out.println(juego2.jugar());
        System.out.println(juego2.getPuntosJugador1());
        System.out.println(juego2.getPuntosJugador2());

        Juego1 juego3 = new Juego1(3,8);
        System.out.println(juego3.jugar());
        System.out.println(juego3.getPuntosJugador1());
        System.out.println(juego3.getPuntosJugador2());

    }




}
