package Oexception.error.test;

public class StackOverFlowTeste01 {

    //Quando
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
