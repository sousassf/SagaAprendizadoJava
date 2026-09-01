package Oexception.aulas;

class Exercicio016ExcecaoPersonalizada {
    public static void main(String[] args) {
        int cartoesVermelhos = 1;

        try {
            validarCartoesVermelhos(cartoesVermelhos);
            System.out.println("Jogador pode continuar.");
        } catch (JogadorExpulsoException e) {
            System.out.println("Jogador removido: " + e.getMessage());
        }

        System.out.println("Partida continua.");
    }

    // Complete este metodo:
    // Se cartoesVermelhos for maior que 0,
    // lance JogadorExpulsoException com a mensagem:
    // "recebeu cartao vermelho"
    public static void validarCartoesVermelhos(int cartoesVermelhos) {
        if(cartoesVermelhos > 0){
            throw new JogadorExpulsoException("recebeu cartao vermelho");
        }
    }
}

class JogadorExpulsoException extends RuntimeException {
    public JogadorExpulsoException(String mensagem) {
        super(mensagem);
    }
}
