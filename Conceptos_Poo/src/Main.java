//import porq main esta fuera del paquete
import paquetePrueba.ConceptoA;
import paquetePrueba.ConceptoB;
import paquetePrueba2.ConceptoC;

public class Main {
    public static void main(String[] args) {
        ConceptoA cA = new ConceptoA();
        ConceptoB cB = new ConceptoB();
        ConceptoC cC = new ConceptoC();
        //solo tengo acceso al publico
        cA.atributoPublico = 5;

        //c1
        System.out.println(cA.a1());
        System.out.println(cA.a2());
        System.out.println(cA.a3());
        System.out.println(cA.atributoPublico);

        System.out.println("---------cB-------------");
        //cb
        cB.atributoPublico = 6;
        System.out.println(cB.a1()); //1
        System.out.println(cB.b1()); //5
        System.out.println(cB.b2()); //8
        System.out.println(cB.atributoPublico); //3
        cB.atributoPublico = 6; //PISANDO EL 3
        System.out.println(cB.atributoPublico); //6


        System.out.println("-----------cA=cB-----------------");

        //cB es tipo cB y el cB como hereda de cA, el cB es un cA
        //Se puede asignar porq es un hijo
        cA = cB;
        System.out.println(cA.a1()); //1
        System.out.println(cA.a2()); // 2
        System.out.println(cA.a3()); // 3
        System.out.println(cA.atributoPublico); //6
        //Solo mesajes que esten en la clase cA porque era el tipo de la variable

        //Evitar acceso estructura interna

        System.out.println("-----------cC-----------------");
        System.out.println(cC.c1()); //2
        System.out.println(cC.a2()); // 8
        System.out.println(cC.a3()); // 6
        System.out.println(cC.atributoPublico); //7

    }
}