package Npolimorfimo.test;

import Npolimorfimo.dominio.Computador;
import Npolimorfimo.dominio.Tomate;
import Npolimorfimo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador c = new Computador("Nuc1-i7", 10000);
        Tomate t = new Tomate("Tomate verde", 10);

        CalculadoraImposto.calcularImposto(c);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(t);
    }
}
