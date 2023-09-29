package Practico_1;

public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico() {
        x = 0;
        y = 0;
    }
    public PuntoGeometrico(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistanciaEuclidea(PuntoGeometrico otroPunto) {
        double distanciaX = this.x - otroPunto.getX();
        double distanciaY = this.y - otroPunto.getY();
        return Math.sqrt(Math.pow(distanciaX,2) + Math.pow(distanciaY,2));
    }

    public void desplazar(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }






}
