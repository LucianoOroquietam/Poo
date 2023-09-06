package Practico_4.Ejercicio_3;

public class EmpresaInformatica {
    private String nombreEmpresa;
    private String direccionEmpresa;

    public EmpresaInformatica(String nombreEmpresa, String direccionEmpresa){
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getNombreEmpresa(){
        return nombreEmpresa;
    }
    public String getDireccionEmpresa(){
        return direccionEmpresa;
    }


}
