package Npolimorfimo.servico;

import Npolimorfimo.dominio.Computador;
import Npolimorfimo.dominio.Produto;
import Npolimorfimo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: R$"+produto.getValor());
        System.out.println("Imposto a ser pago: R$"+imposto);
    }
}
