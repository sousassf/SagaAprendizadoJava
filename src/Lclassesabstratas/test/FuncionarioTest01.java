package Lclassesabstratas.test;

import Lclassesabstratas.dominio.Desenvolvedor;
import Lclassesabstratas.dominio.Funcionario;
import Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Robson", 8000);
        Gerente g1 = new Gerente("Nami", 4500);


        System.out.println(g1);
        System.out.println(d1);
    }
}
