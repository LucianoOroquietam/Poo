package paquetePrueba;

public class ConceptoB extends ConceptoA {

    public int a1(){
        return super.a1();
    }
    public int b1() {
        return 5;
    }

    public int b2(){
        //protected por herencia puedo acceder a el
        this.atributoProtected = 4;
        this.atributoPublico = 3;
        return 8;
    }
}
