package Minterfaces.dominio;

public interface Animal {
    void fazerSom();

    void alimentacao();

    void caminhado();

    default void cagarCoco(){
        System.out.println("Cocozinho mole");
    }
}
