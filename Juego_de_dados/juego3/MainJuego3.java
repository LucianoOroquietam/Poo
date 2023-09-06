package Juego_de_dados.juego3;

public class MainJuego3 {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Luciano");
        Jugador j2 = new Jugador("Simon");
        Cubilete cubilete = new Cubilete(50,6);
        Juego3 jugarDados = new Juego3(j1,j2,7,7,cubilete);


        Jugador ganador = jugarDados.jugar3();
        if (ganador!=null){
            //ganador es un puntero a ese jugador
            System.out.println("Jugadores : " + j1.getNombre() + " vs " + j2.getNombre());
            System.out.println("Gano :" + ganador.getNombre() + " con " + ganador.getPuntos() + " Puntos");
        }else{
            System.out.println("Empataron");
        }
    }
}
