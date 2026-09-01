package Oexception.aulas;

class Exercicio005Throw {
    public static void main(String[] args) {
        int quantidadeJogadores = 6;

        try {
            validarQuantidadeJogadores(quantidadeJogadores);
            System.out.println("Time aprovado para entrar em campo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Time recusado: " + e.getMessage());
        }

        System.out.println("Validacao encerrada.");
    }

    public static void validarQuantidadeJogadores(int quantidadeJogadores) {
        if(quantidadeJogadores < 7){
            throw new IllegalArgumentException("quantidade minima e 7 jogadores");
        }

        // Complete este metodo:
        // Se quantidadeJogadores for menor que 7,
        // lance IllegalArgumentException com a mensagem:
        // "quantidade minima e 7 jogadores"
    }
}
