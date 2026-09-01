package Pcolecoes.B_SetTest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest06 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(10);

        System.out.println(numeros);
        System.out.println(numeros.contains(30));
        boolean r1 = numeros.remove(20);
        System.out.println(r1);
        System.out.println(numeros);

        numeros = new HashSet<>(numeros);

        System.out.println(numeros);
    }
}
