package Pcolecoes.A_ListTest;

import java.util.ArrayList;
import java.util.List;

public class ListTest05 {
    public static void main(String[] args) {
        ArrayList<String> listaComoArrayList = new ArrayList<>();
        listaComoArrayList.add("Flamengo");
        listaComoArrayList.add("Santos");

        List<String> listaComoList = new ArrayList<>();
        listaComoList.add("Neymar");
        listaComoList.add("Vini Jr");

        System.out.println("ArrayList direto:");
        for (String time : listaComoArrayList) {
            System.out.println(time);
        }

        System.out.println("List recebendo ArrayList:");
        for (String jogador : listaComoList) {
            System.out.println(jogador);
        }
    }
}
