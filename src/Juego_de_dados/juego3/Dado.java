package Juego_de_dados.juego3;

public class Dado {
    private int cantidadDeCaras;

    public Dado (int cantidad){
        /*es como hacer
         public Dado (int cantidadDeCaras)
        this.cantidadDeCaras = cantidadDeCaras
        * */
        cantidadDeCaras = cantidad;
    }

    public int getCantidadDeCaras() {
        return cantidadDeCaras;
    }

    public void setCantidadDeCaras(int cantidadDeCaras) {
        this.cantidadDeCaras = cantidadDeCaras;
    }

    public int tirar(){
        return (int)(Math.random()*cantidadDeCaras)+1;
    }

    public static void main(String[] args) {
        Dado d1 = new Dado(7);
        for (int i =0; i<10; i++){
            System.out.println(d1.tirar());
        }
    }
}
