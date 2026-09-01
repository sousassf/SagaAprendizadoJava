package Minterfaces.dominio;

public class Gato implements Animal{
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }

    @Override
    public void alimentacao() {
        System.out.println("Carninha");
    }

    @Override
    public void caminhado() {
        System.out.println("Lentamente");
    }
}
