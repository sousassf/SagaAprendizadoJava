package Pcolecoes.B_SetTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest02 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(10);
        numeros.add(20);

        System.out.println(numeros);

        System.out.println(numeros.contains(30));

        boolean result1 = numeros.add(40);
        boolean result2 = numeros.add(40);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println("Apos adicionar o 40: "+numeros);

    }
}
