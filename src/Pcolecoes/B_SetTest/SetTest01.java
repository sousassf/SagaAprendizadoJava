package Pcolecoes.B_SetTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("Lucas");
        nomes.add("Leticia");
        nomes.add("Mel");
        nomes.add("Jackson");
        nomes.add("Lucas");

        System.out.println(nomes);

        System.out.println(nomes.contains("Lucas"));
        System.out.println(nomes.contains("João"));
        System.out.println("-----------");
        boolean result1 = nomes.add("Carlos");
        boolean result2 = nomes.add("Carlos");

        System.out.println(result1);
        System.out.println(result2);
    }
}
