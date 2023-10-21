package Ejercicio_2;

public class ContadorOcurrenciaPlugin implements Plugin {

    private int cantidadOcurrencias;
    private String palabraDada;

    public ContadorOcurrenciaPlugin(int contadorOcurrencias, String palabraDada) {
        this.cantidadOcurrencias = contadorOcurrencias;
        this.palabraDada = palabraDada;
    }

    //metodo para consultar la cantidad de ocurrencias
    public int getContadorOcurrencias() {
        return cantidadOcurrencias;
    }

    //Cuenta la cantidad de veces que una palabra dada por el
    //usuario aparece en el texto actual.
    @Override
    public void ejecutar(String texto) {
        this.cantidadOcurrencias = contarOcurrencias(texto, palabraDada);
    }

    public int contarOcurrencias(String texto, String palabraDada){
        int contador = 0;
        //arreglo de palabras
        String[] palabras = texto.split(" ");
        //recorro la palabra
        for(int i =0; i< palabras.length; i++){
            //si hay ocurrencia entre palabra[i] y la palabra dada
            if (palabras[i].equals(palabraDada)){
                contador++;
            }
        }
        return contador;
    }






}
