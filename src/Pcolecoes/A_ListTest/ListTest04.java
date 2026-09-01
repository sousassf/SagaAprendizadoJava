package Pcolecoes.A_ListTest;

import java.util.ArrayList;

public class ListTest04 {
    public static void main(String[] args) {
        ArrayList<String> jogadores = new ArrayList<>();

        jogadores.add("Neymar");
        jogadores.add("Vini Jr");
        jogadores.add("Rodrygo");

        System.out.println("A lista contem Vini Jr? "+ jogadores.contains("Vini Jr"));
        jogadores.remove("Vini Jr");
        System.out.println("A lista contem Vini Jr apos o remove? "+ jogadores.contains("Vini Jr"));
        System.out.println("A lista esta vazia? "+ jogadores.isEmpty());

        for(String jogador : jogadores){
            System.out.println(jogador);
        }

        // Complete:
        // 1. Mostre se a lista contem "Vini Jr".
        // 2. Remova "Vini Jr".
        // 3. Mostre novamente se a lista contem "Vini Jr".
        // 4. Mostre se a lista esta vazia.
        // 5. Percorra a lista com for-each e imprima os jogadores restantes.
    }
}
