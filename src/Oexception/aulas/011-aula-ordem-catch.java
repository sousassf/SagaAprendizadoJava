package Oexception.aulas;

class Aula011OrdemCatch {
    public static void main(String[] args) {
        try {
            validarQuantidadeGols(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro especifico: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro generico de runtime.");
        }

        System.out.println("Programa encerrado.");
    }

    public static void validarQuantidadeGols(int gols) {
        if (gols < 0) {
            throw new IllegalArgumentException("gols nao podem ser negativos");
        }
    }
}
