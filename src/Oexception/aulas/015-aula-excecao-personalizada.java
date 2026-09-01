package Oexception.aulas;

class Aula015ExcecaoPersonalizada {
    public static void main(String[] args) {
        try {
            escalarJogadorSuspenso(true);
            System.out.println("Jogador escalado.");
        } catch (JogadorSuspensoException e) {
            System.out.println("Escalacao recusada: " + e.getMessage());
        }

        System.out.println("Fim da analise.");
    }

    public static void escalarJogadorSuspenso(boolean suspenso) {
        if (suspenso) {
            throw new JogadorSuspensoException("jogador esta suspenso");
        }
    }
}

class JogadorSuspensoException extends RuntimeException {
    public JogadorSuspensoException(String mensagem) {
        super(mensagem);
    }
}
