package Minterfaces.dominio;

public class Cachorro implements Animal{
    @Override
    public void fazerSom() {
        System.out.println("Au au");
    }

    @Override
    public void alimentacao() {
        System.out.println("Carne de boi");
    }

    @Override
    public void caminhado() {
        System.out.println("enlouquecido");
    }
}
