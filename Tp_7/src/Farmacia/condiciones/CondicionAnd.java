package Farmacia.condiciones;

import Farmacia.Medicamento;

public class CondicionAnd extends Condicion{
    private Condicion c1,c2;

    public CondicionAnd(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Medicamento m) {
        return this.c1.cumple(m) &&
                this.c2.cumple(m);
    }

}
