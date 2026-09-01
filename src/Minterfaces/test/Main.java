package Minterfaces.test;

import Minterfaces.dominio.Cachorro;
import Minterfaces.dominio.Gato;
import Minterfaces.dominio.Papagaio;

public class Main {
    public static void main(String[] args) {
        Gato g = new Gato();
        Cachorro c = new Cachorro();
        Papagaio p = new Papagaio();

        c.fazerSom();
        c.alimentacao();
        c.caminhado();
        System.out.println("------");
        g.fazerSom();
        g.alimentacao();
        g.caminhado();
        System.out.println("------");
        p.fazerSom();
        p.alimentacao();
        p.caminhado();
        System.out.println("------");
        c.cagarCoco();
        g.cagarCoco();
        p.cagarCoco();

        System.out.println(15 + 11 + 8 + 9 +8 + 2);
    }

}
