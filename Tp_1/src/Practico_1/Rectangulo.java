package Practico_1;

public class Rectangulo {
    private PuntoGeometrico a,b,c,d;
    public Rectangulo(PuntoGeometrico a, PuntoGeometrico b, PuntoGeometrico c, PuntoGeometrico d) {
        if (a.getY() == b.getY() && b.getX() == c.getX() && c.getY() == d.getY() && d.getX() == a.getX()){
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            
        }

    }

    public PuntoGeometrico getA() {
        return a;
    }

    public void setA(PuntoGeometrico a) {
        this.a = a;
    }

    public PuntoGeometrico getB() {
        return b;
    }

    public void setB(PuntoGeometrico b) {
        this.b = b;
    }

    public PuntoGeometrico getC() {
        return c;
    }

    public void setC(PuntoGeometrico c) {
        this.c = c;
    }

    public PuntoGeometrico getD() {
        return d;
    }

    public void setD(PuntoGeometrico d) {
        this.d = d;
    }




        /*
    public boolean esRectangulo() {

        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        double x4 = d.getX();
        double y4 = d.getY();

        // Verificar que los ángulos sean aproximadamente 90 grados
        boolean angulosRectos = (x1 - x2) * (x3 - x4) + (y1 - y2) * (y3 - y4) < 0.01;

        // Verificar que los lados opuestos sean de igual longitud
        boolean ladosIguales = Math.abs((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) - (x3 - x4) * (x3 - x4) - (y3 - y4) * (y3 - y4)) < 0.01;

        return angulosRectos && ladosIguales;
    } */
}
