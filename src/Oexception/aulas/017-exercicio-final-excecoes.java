package Oexception.aulas;

class Exercicio017FinalExcecoes {
    public static void main(String[] args) {
        int idadeJogador = 17;
        int cartoesVermelhos = 1;

        try {
            validarInscricaoJogador(idadeJogador, cartoesVermelhos);
            System.out.println("Jogador inscrito no campeonato.");
        } catch (JogadorMenorDeIdadeException e) {
            System.out.println("Inscricao recusada por idade: " + e.getMessage());
        } catch (JogadorSuspensoExceptionFinal e) {
            System.out.println("Inscricao recusada por suspensao: " + e.getMessage());
        } finally {
            System.out.println("Validacao de inscricao finalizada.");
        }

        System.out.println("Sistema encerrado.");
    }

    // Complete este metodo:
    // 1. Se idadeJogador for menor que 16,
    // lance JogadorMenorDeIdadeException com a mensagem:
    // "idade minima e 16 anos"
    //
    // 2. Se cartoesVermelhos for maior que 0,
    // lance JogadorSuspensoExceptionFinal com a mensagem:
    // "jogador recebeu cartao vermelho"
    public static void validarInscricaoJogador(int idadeJogador, int cartoesVermelhos) {
        if(idadeJogador < 16){
            throw new JogadorMenorDeIdadeException("idade minima e 16 anos");
        }

        if(cartoesVermelhos > 0){
            throw new JogadorSuspensoExceptionFinal("jogador recebeu cartao vermelho");
        }
    }
}

class JogadorMenorDeIdadeException extends RuntimeException {
    public JogadorMenorDeIdadeException(String mensagem) {
        super(mensagem);
    }
}

class JogadorSuspensoExceptionFinal extends RuntimeException {
    public JogadorSuspensoExceptionFinal(String mensagem) {
        super(mensagem);
    }
}
