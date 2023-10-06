package Farmacia;

import Farmacia.condiciones.*;

public class Main {
    public static void main(String[] args) {
        Farmacia f = new Farmacia();

        Medicamento ibuprofeno = new Medicamento("Ibuprofeno", "bayer", 500.5);
        Medicamento paracetamol = new Medicamento("Parecetamol", "reuter", 1000.5);
        Medicamento tafirol = new Medicamento("Tafirol", "reuter", 3000.5);
        Medicamento aspirina = new Medicamento("aspirina", "bayer", 3000.5);

        //al estar definido el equals estos medicamentos no me los agrega porq ya estan repetidos
        Medicamento aspirina2 = new Medicamento("aspirina", "bayer", 3000.5);
        Medicamento aspirina3 = new Medicamento("aspirina", "bayer", 3000.5);
        Medicamento aspirina4= new Medicamento("aspirina", "bayer", 3000.5);
        Medicamento aspirina5 = new Medicamento("aspirina", "bayer", 3000.5);

        f.addMedicamento(ibuprofeno);
        f.addMedicamento(paracetamol);
        f.addMedicamento(tafirol);
        f.addMedicamento(aspirina);

        //medicamentos repetidos (probando funcionamiento equals)
        f.addMedicamento(aspirina2);
        f.addMedicamento(aspirina3);
        f.addMedicamento(aspirina4);
        f.addMedicamento(aspirina5);
        System.out.println("---arregloM---");
        System.out.println(f);

        Condicion cond1 = new CondicionNombre("aspirina");

        Condicion cond2 = new CondicionPrecio(3000.5);

        System.out.println("condicion nombre aspirina ");
        System.out.println(f.listarMedicamentos(cond1));

        System.out.println("lab bayer");
        System.out.println(f.listarMedicamentos(cond2));

        Condicion and1 = new CondicionAnd(cond1,cond2);

        System.out.println("condicion and");

        System.out.println(
                f.listarMedicamentos(new CondicionAnd(and1,new CondicionLaboratorio("bayer")))
        );

       // System.out.println("Para buscar todos los medicamentos que contengan “ina” " + cond1);
       // System.out.println("Para buscar todos los medicamentos del lab “Bayer” " + cond2);
       // System.out.println("Para buscar todos los medicamentos que contengan “ina” y sean del lab “Bayer” " + cond3);



    }
}
