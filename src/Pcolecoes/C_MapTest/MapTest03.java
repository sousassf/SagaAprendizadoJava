package Pcolecoes.C_MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Map<String, Double> notas = new HashMap<>();

        notas.put("Lucas", 9.5);
        notas.put("Maria", 8.0);
        notas.put("João", 7.5);

        for(Map.Entry<String, Double> entry: notas.entrySet()){
            System.out.print(entry.getKey());
            System.out.println(" - "+entry.getValue());
        }

        System.out.println("----------------");

        for(String nome: notas.keySet()){
            System.out.println(nome);
        }

        System.out.println("----------------");

        for(Double valor : notas.values()){
            System.out.println(valor);
        }

    }
}
