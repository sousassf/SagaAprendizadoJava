package Pcolecoes.C_MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest04 {
    public static void main(String[] args) {
        Map<Integer, String> alunos = new TreeMap<>();

        alunos.put(30, "Lucas");
        alunos.put(10, "Maria");
        alunos.put(20, "João");
        alunos.put(40, "Pedro");

        System.out.println(alunos);

        System.out.println("----------------------");

        Map<String, Double> medias = new TreeMap<>();

        medias.put("Roberto", 5.1);
        medias.put("Lucas", 9.5);
        medias.put("Maria", 8.5);
        medias.put("Ana", 10.0);

        System.out.println(medias);
    }
}
