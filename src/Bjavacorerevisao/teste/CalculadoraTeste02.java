package Bjavacorerevisao.teste;

import Bjavacorerevisao.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        cal.alteraDoisNumeros(num1, num2);

        System.out.println("\nDentro do teste02");
        System.out.println(num1);
        System.out.println(num2);


    }
}
