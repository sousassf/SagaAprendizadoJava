package Oexception.aulas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Aula006CheckedUnchecked {
    public static void main(String[] args) {
        // Unchecked exception:
        // O compilador deixa rodar, mesmo podendo dar erro em tempo de execucao.
        int gols = 3;
        int partidas = 0;

        try {
            int media = gols / partidas;
            System.out.println("Media de gols: " + media);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked: erro de calculo tratado.");
        }

        // Checked exception:
        // O compilador exige tratamento com try/catch ou throws.
        try {
            Scanner scanner = new Scanner(new File("times.txt"));
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Checked: arquivo nao encontrado tratado.");
        }

        System.out.println("Fim da aula.");
    }
}
