package Juego_de_dados.juego1;

public class Juego1 {
    private int puntosJugador1;
    private int puntosJugador2;
    private int cantidadCaras; //caras de dado
    private int cantidadRondas; //cantidad de rondas a jugar
    private int minimoPuntos; //minimo de puntos para ganar 1 ronda

    /*
    puntosJugador1 = 0;
    puntosJugador2 = 0;
    Esto se hace para asegurarse de que cuando se crea una nueva instancia de la clase,
    los puntos de ambos jugadores comiencen en 0, independientemente
    de las configuraciones específicas que puedan pasarse a través de los constructores.
    * */
    public Juego1(){
        puntosJugador1 = 0;
        puntosJugador2 = 0;
        minimoPuntos = 7;
    }

    public Juego1(int minimoPuntos){
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
        this.minimoPuntos = minimoPuntos;
    }

    public Juego1(int minimoPuntos, int cantidadCaras){
       this(minimoPuntos, cantidadCaras, 10);
    }


    public Juego1(int minimoPuntos, int cantidadCaras, int cantidadRondas){
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
        this.cantidadCaras = cantidadCaras;
        this.minimoPuntos = minimoPuntos;
        this.cantidadRondas = cantidadRondas;
    }

    public int getPuntosJugador1(){
        return this.puntosJugador1;
    }
    public int getPuntosJugador2(){
        return this.puntosJugador2;
    }
    private int tirarDado(){
        return (int)(Math.random()*cantidadCaras)+1;
    }

    public String jugar(){
        int jugador1;
        int jugador2;

        for (int i =0; i<cantidadRondas; i++){
            jugador1 = this.tirarDado() + this.tirarDado();
            jugador2 = tirarDado() + tirarDado();
            if ((jugador1>minimoPuntos)&&(jugador1>jugador2)){
                puntosJugador1++;
            }else{
               if ((jugador2>minimoPuntos)&&(jugador2>jugador1)){
                    puntosJugador2++;
                }
            }
        }
        return this.ganador();
    }

    public String ganador() {
        if (puntosJugador1 > puntosJugador2){
            return "Jugador 1 gano la partida";
        } else if (puntosJugador2>puntosJugador1) {
            return "Jugador 2 gano la partida";
        }else{
            return "Empate";
        }
    }
}
