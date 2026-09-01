package Oexception.error.test;

public class StackOverFlowTeste01 {

    //erro não consegue arrumar em tempo de execução
    //Quando a memoria atinge o limite
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
