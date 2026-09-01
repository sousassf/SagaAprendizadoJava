package Oexception.aulas;

class Exercicio003FluxoTryCatch {
    public static void main(String[] args) {
        int jogadores = 11;
        int times = 0;

        System.out.println("Antes do calculo");

        try {
            System.out.println("Entrou no try");
            int jogadoresPorTime = jogadores / times;
            System.out.println("Jogadores por time: " + jogadoresPorTime);
        } catch (ArithmeticException e) {
            System.out.println("Entrou no catch");
        }

        System.out.println("Depois do try/catch");
    }
}
