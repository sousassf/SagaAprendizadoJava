package Oexception.aulas;

class Aula001ExcecoesBasico {
    public static void main(String[] args) {
        int torcedores = 50000;
        int portoesAbertos = 0;

        System.out.println("Inicio da simulacao do estadio");

        try {
            int torcedoresPorPortao = torcedores / portoesAbertos;
            System.out.println("Torcedores por portao: " + torcedoresPorPortao);
        } catch (ArithmeticException exception) {
            System.out.println("Nao da para dividir torcedores por zero portoes.");
        }

        System.out.println("Fim da simulacao do estadio");
    }
}
