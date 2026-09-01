package Oexception.aulas;

class Exercicio014Finally {
    public static void main(String[] args) {
        int gols = 4;
        int partidas = 2;

        try {
            System.out.println("Iniciando calculo.");
            int media = gols / partidas;
            System.out.println("Media: " + media);
        } catch (ArithmeticException e) {
            System.out.println("Erro no calculo.");
        } finally {
            System.out.println("Limpando dados temporarios.");
        }

        System.out.println("Fim.");
    }
}
