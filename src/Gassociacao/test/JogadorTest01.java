package Gassociacao.test;

import Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar");
        Jogador j2 = new Jogador("Endrick");
        Jogador j3 = new Jogador("Romário");
        Jogador [] jogadores = {j1, j2, j3};

        for(int i = 0; i < jogadores.length; i++){
            System.out.println(jogadores[i].getNome());
        }
    }
}
