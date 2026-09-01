package ABCintro.test;
import java.util.Scanner;

public class alunosPratica{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String[] nomes = new String[5];
        double[][] notas = new double[5][3];
        int cont = 0;

        while(cont < 5){
            System.out.println("----------------------------------------");
            System.out.printf("--------------- Aluno %d ----------------\n", (cont+1));
            System.out.println("----------------------------------------");

            System.out.print("Digite seu nome: ");
            String nome = leitor.next();
            nomes[cont] = nome;

            while(true){
                System.out.print("Digite sua primeira nota: ");
                int nota1 = leitor.nextInt();
                if(nota1 < 0 || nota1 > 10){
                    System.out.println("Essa nota não existe, tente novamente...");
                    System.out.println("----------------------------------------");
                    continue;
                }else{
                    notas[cont][0] = nota1;
                    break;
                }
            }

            while(true){
                System.out.print("Digite sua segunda nota: ");
                int nota2 = leitor.nextInt();
                if(nota2 < 0 || nota2 > 10){
                    System.out.println("Essa nota não existe, tente novamente...");
                    System.out.println("----------------------------------------");
                    continue;
                }else{
                    notas[cont][1] = nota2;
                    break;
                }
            }

            while(true){
                System.out.print("Digite sua terceira nota: ");
                int nota3 = leitor.nextInt();
                if(nota3 < 0 || nota3 > 10){
                    System.out.println("Essa nota não existe, tente novamente...");
                    System.out.println("----------------------------------------");
                    continue;
                }else{
                    notas[cont][2] = nota3;
                    break;
                }
            }
            cont++;
        }


        System.out.println("----------------------------------------");
        System.out.println("---------------- DADOS -----------------");
        System.out.println("----------------------------------------");
        for(int i = 0; i < 5; i++){
            double media = ((notas[i][0] + notas[i][1] + notas[i][2])/3.0);
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Média: " + media);

            if(media == 10){
                System.out.println("Aluno nota máxima encontrado, foda demais...");
            }else{
                if(media >= 7){
                    System.out.println("Aluno aprovado");
                }else if( media >= 5){
                    System.out.println("Aluno em recuperação");
                }else{
                    System.out.println("Aluno reprovado");
                }
            }

            System.out.println("<------------------------------>");
        }
    }
}
