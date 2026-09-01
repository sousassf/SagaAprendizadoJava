package Pcolecoes.C_MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, Double> notas = new HashMap<>();
        //primeiro String é o tipo da chave, segundo é o tipo do valor
        //map: interface
        //HashMap: implementação

        notas.put("Maria", 8.5);
        notas.put("Lucas", 9.5);
        notas.put("Roberto", 5.1);

        System.out.println(notas);

        System.out.println("-------------------");

        notas.put("Lucas", 10.0);
        System.out.println(notas.get("Lucas"));
        System.out.println(notas.get("João"));

        System.out.println("-------------------");

        System.out.println(notas.containsKey("Lucas"));
        System.out.println(notas.containsKey("Lukas"));

        System.out.println("-------------------");

        notas.remove("Lucas");

        System.out.println(notas);
    }
}
