package Oexception.aulas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Exercicio009Throws {
    public static void main(String[] args) {
        try {
            mostrarNomeDoTecnico();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo do tecnico nao encontrado.");
        }

        System.out.println("Consulta finalizada.");
    }

    // Complete este metodo:
    // 1. Declare que ele pode lancar FileNotFoundException.
    // 2. Crie um Scanner lendo o arquivo "tecnico.txt".
    // 3. Imprima a primeira linha do arquivo.
    // 4. Feche o Scanner.
    public static void mostrarNomeDoTecnico() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("tecnico.txt"));
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
