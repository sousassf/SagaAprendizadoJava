package Oexception.aulas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Exercicio007CheckedUnchecked {
    public static void main(String[] args) {
        try {
            int pontos = 10;
            int partidas = 0;
            int media = pontos / partidas;
            System.out.println("Media: " + media);
        } catch (ArithmeticException e) {
            System.out.println("Caso A tratado");
        }

        try {
            Scanner scanner = new Scanner(new File("jogadores.txt"));
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Caso B tratado");
        }
    }
}
