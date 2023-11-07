package Parcial2023;

import Parcial2023.Filtro.Condicion;

public class PiezaDiseño extends PiezaCompuesta{
    private Condicion c;
    public PiezaDiseño(String n, String d, Condicion c) {
        super(n, d);
        this.c = c;
    }

    @Override
    public void addElementos(Printer3D e) {
        if (c.cumple(e)){
            super.addElementos(e);
        }
       
    }
}
