package paquetePrueba2;

import paquetePrueba.ConceptoA;

public class ConceptoC extends ConceptoA {


    public int c1(){
        return 2;
    }

    public int a2(){
        atributoProtected = 8;
        atributoPublico =7;
        //sin modificador se conoce en el mismo paquete
        return 8;
    }
    public int a3(){
       return super.a1() + a2() - 3;
    }

}
