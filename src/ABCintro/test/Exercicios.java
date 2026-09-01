package ABCintro.test;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media = 0;
        int maior = 0;
        int menor = 0;
        int cont = 0;


        while (cont < 4) {
            System.out.print("Digite um numero: ");
            int num = leitor.nextInt();

            if(num >= 0){
                cont ++;
                media += num;
                if(cont == 1){
                    maior = num;
                    menor = num;
                }else{
                    if(num > maior){
                        maior = num;
                    }
                    if(num < menor){
                        menor = num;
                    }
                }
            }else{
                System.out.println("ERRO, digite um numero positivo!!!");
            }
        }
        media = media / 4;

        System.out.println("A media dos valores digitados é: " + media);
        System.out.println("O maior valor digitado é: "+ maior);
        System.out.println("O menor valor digitado é: "+ menor);

        leitor.close();
    }
}
