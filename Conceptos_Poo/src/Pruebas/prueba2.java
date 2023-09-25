package Pruebas;

public class prueba2 {
    public static int sumar(int a, int b){
        return a + b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        prueba2 mathUtils = new prueba2();
        int result1 = mathUtils.sumar(5,10);
        System.out.println("La suma da: "+result1);
        int result2 = mathUtils.multiplicar(2,3);
        System.out.println("La multiplicacion da: "+result2);
    }
}
