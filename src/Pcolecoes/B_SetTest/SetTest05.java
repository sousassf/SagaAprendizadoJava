package Pcolecoes.B_SetTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest05 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("Lucas");
        hashSet.add("Maria");
        hashSet.add("João");
        hashSet.add("Pedro");

        System.out.println("HashSet");
        System.out.println(hashSet);

        System.out.println("--------------------------");

        linkedHashSet.add("Lucas");
        linkedHashSet.add("Maria");
        linkedHashSet.add("João");
        linkedHashSet.add("Pedro");

        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);
    }
}
