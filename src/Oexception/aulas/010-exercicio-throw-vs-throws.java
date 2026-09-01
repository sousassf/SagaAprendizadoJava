package Oexception.aulas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Exercicio010ThrowVsThrows {
    public static void main(String[] args) {
        try {
            validarNumeroCamisa(0);
            mostrarPatrocinador();
        } catch (IllegalArgumentException e) {
            System.out.println("Numero invalido: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de patrocinador nao encontrado.");
        }
    }

    public static void validarNumeroCamisa(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("numero deve ser maior que zero");
        }
    }

    public static void mostrarPatrocinador() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("patrocinador.txt"));
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
