package Oexception.aulas;

class Exercicio002ExcecoesBasico {
    public static void main(String[] args) {
        int gols = 3;
        int partidas = 0;

        System.out.println("Calculando media de gols por partida...");
        try{
            int media = gols/partidas;
            System.out.println("Media: " + media);
        }catch(ArithmeticException e){
            System.out.println("Nao e possivel calcular media com zero partidas.");
            
        }

        // Complete o codigo:
        // 1. Coloque a divisao dentro de um try.
        // 2. Capture ArithmeticException com catch.
        // 3. No catch, mostre uma mensagem amigavel explicando o problema.
        //
        // A divisao que pode dar erro:
        // int media = gols / partidas;
        // System.out.println("Media: " + media);

        System.out.println("Programa finalizado.");
    }
}
