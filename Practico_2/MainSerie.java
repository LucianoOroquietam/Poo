package Practico_2;

public class MainSerie {

    public static void main(String[] args) {
        Serie serie1 = new Serie();
        System.out.println(serie1);
        System.out.println("-------------------------------------");

        Serie serie2 = new Serie("Breaking Bad", "walther white", "alguien", "drama");
        Temporada temp1 = new Temporada(6);
        Episodio cap1 = new Episodio("EL maldito walter white", "empezamos con las meta");
        Episodio cap2 = new Episodio("EL maldito walter white", "empezamos con las meta");
        Episodio cap3 = new Episodio("EL maldito walter white", "empezamos con las meta");
        Episodio cap4 = new Episodio("EL maldito walter white", "empezamos con las meta");


        temp1.agregarEpisodio(cap1);
        cap1.ingresarCalificacion(5);
        temp1.agregarEpisodio(cap2);
        cap2.ingresarCalificacion(2);
        temp1.agregarEpisodio(cap3);
        cap3.ingresarCalificacion(3);
        temp1.agregarEpisodio(cap4);
        cap4.ingresarCalificacion(3);

        serie2.agregarTemporada(temp1);
        System.out.println(serie2);
        System.out.println(serie2.seVieronTodosLosEpisodiosDeLaSerie(temp1));
        System.out.println("promedio de las califi" + serie2.getPromedioCalifi());
        System.out.println("Titulo del capitulo : " + cap1.getTitulo() + " Descripcion : " + cap1.getDescripcion());
        System.out.println("El numero de temporadas de la serie es de: " + temp1.getNumeroTemporadas());

    }
   
    
}
