package Juego_de_dados.juego3;

public class Cubilete {
    private Dado[] dados;

    public Cubilete(int cantidadDados,int cantidadCaras){
        //creo un arreglo de "cantidadDados" es el tamaño tamaño = cantidad de daods
        dados = new Dado[cantidadDados]; //reservamos en memoria donde vamos a meter x cant de dados
        for (int i=0; i<dados.length; i++){
            //creo cada objeto en cada posicion del arreglo
         dados[i] = new Dado(cantidadCaras);
        }
    }
/*
    public Cubilete(Dado[] dadosAfuera){
    un arreglo de dados y lo asigno directamente
    una forma de que venga todo creado desde afuera
    lo que yo nose si ese arreglo tiene null o el dado
    bien creado.
        dados= dadosAfuera;
    } */

    public int tirar(){
        int sumaDado =0;
        for(int i =0; i<dados.length; i++){
            //suma = suma + dados[i].tirar();
            sumaDado += dados[i].tirar();
        }
        return sumaDado;
    }

    //Comportamiento del dado , esto no hace al juego
    public  Dado getDadoEnPos(int pos){
        if ((pos>=0)&&pos<dados.length){
            return dados[pos];
        }else{
            return null;
        }
    }

    public void setDadoEnPos(int pos, Dado nuevoDado){
        if (((pos>=0)&&pos<dados.length)&& nuevoDado!=null){
            dados[pos]=nuevoDado;
        }
    }
}
