package Oexception.aulas;

class Exercicio012OrdemCatch {
    public static void main(String[] args) {
        try {
            validarSaldoCartao(-10);
            System.out.println("Compra aprovada.");
        } catch (IllegalArgumentException e) {
            System.out.println("Catch A");
        } catch (RuntimeException e) {
            System.out.println("Catch B");
        }

        System.out.println("Fim");
    }

    public static void validarSaldoCartao(int saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("saldo negativo");
        }
    }
}
