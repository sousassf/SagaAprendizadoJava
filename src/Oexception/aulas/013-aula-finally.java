package Oexception.aulas;

class Aula013Finally {
    public static void main(String[] args) {
        int gols = 2;
        int partidas = 0;

        try {
            System.out.println("Abrindo relatorio do campeonato.");
            int media = gols / partidas;
            System.out.println("Media de gols: " + media);
        } catch (ArithmeticException e) {
            System.out.println("Nao foi possivel calcular a media.");
        } finally {
            System.out.println("Fechando relatorio do campeonato.");
        }

        System.out.println("Programa encerrado.");
    }
}
