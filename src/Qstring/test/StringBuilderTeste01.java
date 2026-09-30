package Qstring.test;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Walter White";
        nome.concat(" / w.w.");
        System.out.println(nome);
        System.out.println(nome.concat(" / w.w.\n"));

        StringBuilder sb = new StringBuilder("Procedimento: ");
        StringBuilder sb2 = new StringBuilder("Procedimento: ");
        StringBuilder sbTeste = new StringBuilder("Procedimento: ");

        sb.append("teste");
        sb2.append("testando");

        System.out.println(sb);
        System.out.println(sb2);

        sbTeste = sb;
        sb = sb2;
        sb2 = sbTeste;

        System.out.println("-------------");
        System.out.println(sb);
        System.out.println(sb2);
        System.out.println("-------------");
        sb.reverse();
        sb2.reverse();
        sb2.reverse();
        System.out.println(sb);
        System.out.println(sb2);


    }
}
