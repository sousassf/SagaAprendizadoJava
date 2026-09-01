package Minterfaces.dominio;

public class Papagaio implements Animal{


    @Override
    public void fazerSom() {
        System.out.println("Repete o que você fala");
    }

    @Override
    public void alimentacao() {
        System.out.println("Sementes");
    }

    @Override
    public void caminhado() {
        System.out.println("Voando");
    }
}
