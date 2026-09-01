package Pcolecoes.A_ListTest;

import java.util.ArrayList;
import java.util.List;

public class ListTest06 {
    public static void main(String[] args) {
        // Complete:
        // 1. Crie uma variavel chamada campeonatos do tipo List<String>.
        // 2. Instancie usando new ArrayList<>().
        // 3. Adicione 3 campeonatos.
        // 4. Percorra com for-each e imprima todos.

        List<String> campeonatos = new ArrayList<>();
        campeonatos.add("Libertadores");
        campeonatos.add("Brasileirao");
        campeonatos.add("Champions League");

        for(String camp : campeonatos){
            System.out.println(camp);
        }
    }
}
