package Poo.Practico_1.Practico_1;
public class MainElectrodomestico {
    public static void main(String[] args) {
        
        Electrodomestico electrodomestico1 = new Electrodomestico();
        System.out.println("electrodomestico1 = " + electrodomestico1);
        System.out.println(electrodomestico1.esConsumoBajo(electrodomestico1.getConsumoEnergetico()));

        Electrodomestico electrodomestico2 = new Electrodomestico(50);
        System.out.println("--------------------------------------------");
        electrodomestico2.setNombre("Cafetera");
        electrodomestico2.setPeso(5);
        electrodomestico2.setColor("negra");
        electrodomestico2.setPrecioBase(9999.99);

        System.out.println(electrodomestico2);
        System.out.println(electrodomestico2.esConsumoBajo(electrodomestico2.getConsumoEnergetico()));
        //al ser estatico le tengo que pasar el nombre de la clase.metodo()
        System.out.println("El balance es de : " + Electrodomestico.balance(electrodomestico2.getPrecioBase(), electrodomestico2.getPeso()));

        if (electrodomestico2.esDeAltaGama(electrodomestico2.getPrecioBase(), electrodomestico2.getPeso())) {
            System.out.println("El producto es de alta gama.");
        } else {
            System.out.println("El producto no es de alta gama.");
        }
    }
}
