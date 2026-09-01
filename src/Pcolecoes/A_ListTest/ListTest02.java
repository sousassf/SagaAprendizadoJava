package Pcolecoes.A_ListTest;

import java.util.ArrayList;

public class ListTest02 {
    public static void main(String[] args) {
        ArrayList<String> times = new ArrayList<>();
        times.add("Flamengo");
        times.add("Santos");
        times.add("Sao Paulo");

        System.out.println(times.get(0));
        System.out.println(times.size());

        for(String time : times){
            System.out.println(time);
        }

        // Complete:
        // 1. Adicione 3 times na lista.
        // 2. Imprima o primeiro time usando get(0).
        // 3. Imprima a quantidade de times usando size().
        // 4. Use for-each para imprimir todos os times.
    }
}
