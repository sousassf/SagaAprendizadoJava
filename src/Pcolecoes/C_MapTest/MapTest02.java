package Pcolecoes.C_MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Map<String, Double> notas = new HashMap<>();

        notas.put("Lucas", 9.5);
        notas.put("Maria", 8.0);
        notas.put("João", 7.5);

        boolean r1 = notas.remove("Maria") != null;
        boolean r2 = notas.remove("Carlos") != null;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(notas);

        System.out.println("-------------------");

        Double resultado = notas.remove("Lucas");

        System.out.println(resultado);
        System.out.println(notas);
    }
}
