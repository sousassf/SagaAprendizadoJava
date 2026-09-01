package Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarArquivo();
    }

    private static void criarArquivo() {
        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: "+ isCriado);
        } catch (IOException e) {
            e.printStackTrace();

            //catch so para tratar exceções, e não regras de negócio!!!
            //se não permitir na pasta arquivo para criar new files vai pro catch!!!
        }
    }


}
