package paquetePrueba;

public class ConceptoA {

   public int atributoPublico;
   protected int atributoProtected;
   private int atributoPrivate;
   int atributoSolito;

   public int a1(){
       return 1;
   }

   public int a2(){
       return 2;
   }
   public int a3(){
       return this.a1() + this.a2();
   }


}
