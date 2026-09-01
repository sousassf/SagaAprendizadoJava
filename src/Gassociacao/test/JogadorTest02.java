package Gassociacao.test;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Romário");
        System.out.println("Antes de definir o time");
        j1.imprime();
        System.out.println("=====================");
        Time time  = new Time("Seleção Brasileira");
        j1.setTime(time);
        System.out.println("Depois de definir o time");
        j1.imprime();

    }
}
