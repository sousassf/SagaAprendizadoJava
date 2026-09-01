package Pcolecoes.B_SetTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest03 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        boolean result1 = numeros.remove(20);
        boolean result2 = numeros.remove(50);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println(numeros);

        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());

        for(Integer num : numeros){
            System.out.println(num);
        }
    }
}
