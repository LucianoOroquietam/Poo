package Ejercicio_1.Buscador;

import Ejercicio_1.Cultivo;
import Ejercicio_1.Enfermedad;
import Ejercicio_1.ProductoQuimico;

public class BuscarPorCultivoyEnfermedad extends Buscar {

    private Cultivo cultivo;
    private Enfermedad enfermedad;

    public BuscarPorCultivoyEnfermedad(Cultivo c,Enfermedad e){
        this.cultivo=c;
        this.enfermedad=e;
    }


    //Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los
    //pueden tratar la enfermedad. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
    //determinados cultivos.

    @Override
    public boolean cumple(ProductoQuimico p) {
        //si el producto quimico no es recomedado para el cultivo y si los estados patologicos de p contienen todas las enfermedades
        return !p.getCultivosNoRecomendados().contains(cultivo) && p.getEstadosPatologicos().containsAll(enfermedad.getPatologiasEnfermedad());

    }
}
