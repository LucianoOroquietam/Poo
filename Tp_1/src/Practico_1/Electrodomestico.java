package Practico_1;

public class Electrodomestico {
    /*
    * Atributos son nombre, precio base, color, consumo energético y peso.
    * */

    private String nombre;
    private double precioBase;
    private String color;
    private int consumoEnergetico;
    private double peso;


    public Electrodomestico(){
        this.nombre = "Pava electrica";
        this.color = "gris plata";
        this.consumoEnergetico = 10;
        this.precioBase = 100;
        this.peso = 2;
    }
    public Electrodomestico(int consumoEnergetico){
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    /*
    * Calcular el balance, el mismo es el resultado de dividir el costo por el peso
    *
    *  Indicar si un producto es de alta gama, el balance es mayor que 3
    * */
    public static double balance(double precioBase, double peso){
        double balance;
        balance = precioBase/peso;
        return balance;
    }

    public static boolean esDeAltaGama(double precioBase, double peso) {
        double balance = balance(precioBase, peso);
        return balance > 3.0;
    }
    public boolean esConsumoBajo(int consumoEnergetico) {
        if (consumoEnergetico<45){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Electrodomestico: " + nombre +
                "\nPrecio Base: " + precioBase +
                "\nColor: " + color +
                "\nConsumo energetico: " + consumoEnergetico +
                "\nPeso: " + peso;

    }
}
