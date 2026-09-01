package Pcolecoes.A_ListTest;

import java.util.ArrayList;

public class ListTest01 {
    public static void main(String[] args) {
        ArrayList<String> jogadores = new ArrayList<>();

        jogadores.add("Neymar");
        jogadores.add("Vini Jr");
        jogadores.add("Rodrygo");

        System.out.println("Primeiro jogador: " + jogadores.get(0));
        System.out.println("Quantidade de jogadores: " + jogadores.size());

        System.out.println("Lista de jogadores:");
        for (String jogador : jogadores) {
            System.out.println(jogador);
        }
    }
}
