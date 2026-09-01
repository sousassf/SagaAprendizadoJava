package Gassociacao.test;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador cr7 = new Jogador("Cr7");
        Jogador marcelo = new Jogador("Marcelo");
        Jogador kross = new Jogador("Kross");

        Jogador messi = new Jogador("Messi");
        Jogador neymar = new Jogador("Neymar");
        Jogador suarez = new Jogador("Suárez");

        Jogador[] jr = {cr7, marcelo, kross};
        Jogador[] jb = {messi, neymar, suarez};

        Time real = new Time("Real Madri", jr);
        Time barca = new Time("Barça", jb);

        //System.out.println("--- "+ real.getNome()+" ---");
        barca.imprime();
        //System.out.println("--- "+ barca.getNome()+" ---");
        real.imprime();

        cr7.imprime();
        messi.imprime();
        neymar.imprime();
        marcelo.imprime();
    }
}
