package Practico_2.SitemaControlGastosPublicos;


public class MainSistemaControl {

    public static void main(String[] args) {
        Pais argentina = new Pais("Argentina");
        Provincia BuenosAires = new Provincia("Buenos Aires");
        Provincia LaPampa = new Provincia("La Pampa");

        Impuesto impuestosTandil = new Impuesto(200000,200000,200000,200000,200000);
        Ciudad tandil = new Ciudad(171352306,"Tandil",150162,impuestosTandil);

        Impuesto impuestosMardel = new Impuesto(200000,200000,200000,200000,200000);
        Ciudad marDelPlata = new Ciudad(171352306,"Mar del plata",650000,impuestosMardel);

        Impuesto impuestosBahiBlanca = new Impuesto(200000,200000,200000,200000,200000);
        Ciudad bahiaBlanca = new Ciudad(171352306,"Bahia Blanca",311704,impuestosBahiBlanca);

        Impuesto impuestosJuarez = new Impuesto(2000,200,200,200,2000);
        Ciudad benitoJuarez = new Ciudad(17126,"Benito Juarez",22558,impuestosJuarez);

        Impuesto impuestosAzul = new Impuesto(200,200,200,200,2000);
        Ciudad azul = new Ciudad(1713,"Azul",75324,impuestosAzul);

        argentina.addProvincia(BuenosAires);
        BuenosAires.addCiudad(tandil);
        BuenosAires.addCiudad(marDelPlata);
        BuenosAires.addCiudad(benitoJuarez);
        BuenosAires.addCiudad(azul);
        BuenosAires.addCiudad(bahiaBlanca);

        System.out.println("--------NOMBRE PAIS---------------");
        System.out.println(argentina.getNombrePais());
        System.out.println("--------PROVINCIA/CIUDADES-----------------");
        System.out.println(argentina.getProvincias());
        System.out.println("--------CIUDADES-----------------");
        System.out.println(BuenosAires.getCiudades());

        System.out.println("provincias con mitad de ciudades en deficit " + argentina.getProvinciasConMitadCiudadesDeficit());
        System.out.println("La ciudad de " + tandil.getNombreCiudad() + " ¿Gasta mas de lo que recauda? " + tandil.gastaMasDeLoQueRecauda());
        System.out.println("La ciudad de " + benitoJuarez.getNombreCiudad() + " ¿Gasta mas de lo que recauda? " + benitoJuarez.gastaMasDeLoQueRecauda());
        System.out.println("La ciudad de " + azul.getNombreCiudad() + " ¿Gasta mas de lo que recauda? " + azul.gastaMasDeLoQueRecauda());
        System.out.println("La ciudad de " + bahiaBlanca.getNombreCiudad() + " ¿Gasta mas de lo que recauda? " + bahiaBlanca.gastaMasDeLoQueRecauda());
        System.out.println("La ciudad de " + marDelPlata.getNombreCiudad() + " ¿Gasta mas de lo que recauda? " + marDelPlata.gastaMasDeLoQueRecauda());

    }




}
