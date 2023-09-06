package Juego_de_dados.juego3;

public class Juego3 {
    private Jugador jugador1;
    private Jugador jugador2;
    private int cantidadRondas; //cantidad de rondas a jugar
    private int minimoPuntos; //minimo de puntos para ganar 1 ronda
    private Cubilete cub;

    public Juego3(int cantidadRondas, int minimoPuntos,Jugador j1,Jugador j2, Cubilete cub){
        //jugador1 = new Jugador(n1);
        //jugador2 = new Jugador(n2);
        this.jugador1 = j1;
        this.jugador2 = j2;
        this.cantidadRondas = cantidadRondas;
        this.minimoPuntos = minimoPuntos;
        cub = new Cubilete(2,cantidadRondas);

    }

    public Juego3(Jugador j1, Jugador j2, int cantidadRondas, int minimoPuntos, Cubilete cub){
        this.jugador1 = j1;
        this.jugador2 = j2;
        this.cantidadRondas = cantidadRondas;
        this.minimoPuntos = minimoPuntos;
        this.cub = cub;
    }

    public int getPuntosJugador1() {
        return jugador1.getPuntos();
    }
    public int getPuntosJugador2() {
        return jugador2.getPuntos();
    }

    public Jugador getJugador1(){
        return jugador1;
    }
    public Jugador getJugador2() {
        return jugador2;
    }

    public Jugador jugar3(){
        int puntos1;
        int puntos2;

        for (int i =0; i<cantidadRondas; i++){
            puntos1 = jugador1.tirarDados(cub);
            puntos2 = jugador2.tirarDados(cub);
            if ((puntos1>minimoPuntos)&&(puntos1>puntos2)){
                jugador1.sumarPuntos(puntos1);
            }else{
                if ((puntos2>minimoPuntos)&&(puntos2>puntos1)){
                    jugador2.sumarPuntos(puntos2);
                }
            }
        }
        return this.ganador();
    }
    public Jugador ganador() {
        if (jugador1.getPuntos() > jugador2.getPuntos()){
            return jugador1;
        } else if (jugador1.getPuntos() < jugador2.getPuntos()) {
            return jugador2;
        }else{
            return null;
        }
    }
}
