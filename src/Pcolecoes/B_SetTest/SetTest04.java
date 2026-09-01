package Pcolecoes.B_SetTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest04 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("Lucas");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Lucas");

        System.out.println(nomes);

        System.out.println(nomes.contains("Maria"));

        boolean r1 = nomes.remove("João");
        boolean r2 = nomes.remove("Carlos");

        System.out.println(r1);
        System.out.println(r2);

        System.out.println(nomes.size());

        System.out.println("------ForEach------");
        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("-------------------");

    }
}
