package Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Lucas";  //String constant pool
        nome1 = nome1.concat(" Sousa");
        String nome2 = "Lucas";
        String nomeTeste = "           Robertinho                   ";

        System.out.println(nome1 == nome2);


        System.out.println(nomeTeste);

        System.out.println(nomeTeste.trim());


    }
}
