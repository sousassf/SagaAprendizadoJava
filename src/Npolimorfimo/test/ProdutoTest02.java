package Npolimorfimo.test;

import Npolimorfimo.dominio.Computador;
import Npolimorfimo.dominio.Produto;
import Npolimorfimo.dominio.Tomate;
import Npolimorfimo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("acer5 i7", 4000);
        Produto produto2 = new Tomate("Tomate siciliano", 35);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        CalculadoraImposto.calcularImposto(produto);


    }



}
