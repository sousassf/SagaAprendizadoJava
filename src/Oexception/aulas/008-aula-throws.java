package Oexception.aulas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Aula008Throws {
    public static void main(String[] args) {
        try {
            mostrarPrimeiroJogador();
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel abrir o arquivo de jogadores.");
        }

        System.out.println("Programa encerrado.");
    }

    public static void mostrarPrimeiroJogador() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("jogadores.txt"));
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
