package Ejercicio_1;
import java.util.ArrayList;
public class ProductoQuimico {

    //el producto sabe que estados patologicos se observan en los cultivos y que es capaz de tratar.
    //el producto tambien desaconseja su uso en x cultivo
    private String nombre; //randaz
    private ArrayList<Cultivo>cultivosNoRecomendados; //no utilizar en Cultivo(girasol,lino,maiz)
    private ArrayList<String>estadosPatologicos; //deshidratación, hojas amarillas


    public ProductoQuimico(String nombre, ArrayList<String> cultivos, ArrayList<String> estadosPatologicos) {
        this.nombre = nombre;
        this.cultivosNoRecomendados = new ArrayList<>();
        this.estadosPatologicos = new ArrayList<>();
    }
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Cultivo> getCultivosNoRecomendados(){
        return new ArrayList<>(cultivosNoRecomendados);
    }
    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<>(estadosPatologicos);
    }

    public void addCultivoNoRecomendado(Cultivo c){
        if(c!=null && !cultivosNoRecomendados.contains(c)){
            cultivosNoRecomendados.add(c);
        }
    }
        public void addEstadoPatologico(String s){
        if(s!=null && !estadosPatologicos.contains(s)){
            estadosPatologicos.add(s);
        }
    }


}


