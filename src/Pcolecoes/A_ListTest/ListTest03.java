package Pcolecoes.A_ListTest;

import java.util.ArrayList;

public class ListTest03 {
    public static void main(String[] args) {
        ArrayList<String> times = new ArrayList<>();

        times.add("Flamengo");
        times.add("Santos");
        times.add("Sao Paulo");

        System.out.println("Tem Santos? " + times.contains("Santos"));

        times.remove("Santos");

        System.out.println("Tem Santos depois do remove? " + times.contains("Santos"));
        System.out.println("Lista esta vazia? " + times.isEmpty());
        System.out.println("Quantidade: " + times.size());

        for (String time : times) {
            System.out.println(time);
        }
    }
}
