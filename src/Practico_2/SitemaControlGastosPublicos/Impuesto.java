package Practico_2.SitemaControlGastosPublicos;

public class Impuesto {
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;


    public Impuesto(double imp1, double imp2, double imp3, double imp4, double imp5){
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
    }

    public double sumaTotalImpuesto(){
        return imp1+imp2+imp3+imp4+imp5;
    }

    @Override
    public String toString() {
        return "Clase Impuesto :" +
                "imp1=" + imp1 +
                ", imp2=" + imp2 +
                ", imp3=" + imp3 +
                ", imp4=" + imp4 +
                ", imp5=" + imp5 ;
    }
}
