package Bjavacorerevisao.teste;

import Bjavacorerevisao.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        cal.somaDoisNumeros();
        cal.multiplicaDoisNumeros(10, 5);

        System.out.println("-----------------");

        double result = cal.divideDoisNumeros(20, 1);
        System.out.println(result);

        System.out.println("-----------------");

        cal.imprime(20,0);

        System.out.println("-----------------");



    }
}
