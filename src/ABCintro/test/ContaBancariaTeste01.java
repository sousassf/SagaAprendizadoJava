package ABCintro.test;
import ABCintro.dominio.ContaBancaria;
import java.util.Scanner;

public class ContaBancariaTeste01 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            ContaBancaria cb = new ContaBancaria();

            System.out.println("-------------------------------------");
            System.out.println("---------- BANCO DOS GURIS ----------");
            System.out.println("-------------------------------------");
            System.out.println("");

            System.out.print("Digite o seu nome: ");
            String titular = leitor.nextLine();
            System.out.print("Digite o seu saldo atual: ");
            double saldo = leitor.nextDouble();
            double saldoAt = saldo;

            while(true){
                System.out.print("Digite [1] para depositar e [2] para sacar: ");
                int op = leitor.nextInt();
                if(op == 1){
                    System.out.print("Quanto você deseja depositar: ");
                    double depositar = leitor.nextDouble();
                    cb.depositar(depositar);
                    saldoAt += depositar;
                }else if(op == 2){
                    System.out.print("Quanto você quer sacar: ");
                    double sacar = leitor.nextDouble();
                    if(sacar <= cb.saldo){
                        cb.sacar(sacar);
                        saldoAt -= sacar;
                    }else{
                        System.out.println("Saldo indisponível!");
                        System.out.println("Tente novamente...");
                        continue;
                    }

                }else{
                    System.out.println("Opção inválida, tente novamente...");
                    continue;
                }

                System.out.print("Você quer continuar? [1] SIM / [2] NÃO: ");
                int continuar = leitor.nextInt();
                if(continuar == 2){
                    break;
                }else if(continuar == 1){
                    continue;
                }else{
                    System.out.println("Opção inválida, tente novamente...");
                    continue;
                }
            }

            cb.saldo = saldoAt;

            cb.titular = titular;

            cb.extrato();

        }
    }
}