package Oexception.aulas;

class Aula004Throw {
    public static void main(String[] args) {
        int idadeJogador = 15;

        try {
            verificarIdadeParaProfissional(idadeJogador);
            System.out.println("Jogador pode ser registrado como profissional.");
        } catch (IllegalArgumentException e) {
            System.out.println("Registro recusado: " + e.getMessage());
        }

        System.out.println("Analise finalizada.");
    }

    public static void verificarIdadeParaProfissional(int idade) {
        if (idade < 16) {
            throw new IllegalArgumentException("idade minima e 16 anos");
        }
    }
}
