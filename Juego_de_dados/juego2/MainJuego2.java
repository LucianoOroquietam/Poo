package Juego_de_dados.juego2;


//juego 2 mas orientado a objetos
public class MainJuego2 {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Luciano");
        Jugador j2 = new Jugador("Simon");
        Dado d1 = new Dado(6);
        Dado d2 = new Dado(6);
        //los objetos se pueden crear en el pasaje de parametros
        Juego2 juegoDados = new Juego2(j1,j2,50,7,d1,d2);

        Jugador ganador = juegoDados.jugar();
        if (ganador!=null){
            //ganador es un puntero a ese jugador
            System.out.println("Jugadores : " + j1.getNombre() + " vs " + j2.getNombre());
            System.out.println("Gano :" + ganador.getNombre() + " con " + ganador.getPuntos() + " Puntos");
        }else{
            System.out.println("Empataron");
        }
    }
}
