package Pwrappers.teste;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;


        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;


        //autoboxing -> transformar tipo primitivo em wrapper, envelopando
        //unboxing -> transformar wrapper em tipo primitivo, desenvelopando

        int i = intW; //unboxing



        try{
            Integer intW2 = Integer.parseInt("7");
            System.out.println(intW2);

            Integer intW3 = Integer.parseInt("A");
            System.out.println(intW3);
        }catch (NumberFormatException e){
            System.out.println("Erro ao passar letras ao invez de numeros");
            System.out.println(e);
        }

        System.out.println("----");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.getType('A'));
        System.out.println(Character.getType(2));




    }
}
