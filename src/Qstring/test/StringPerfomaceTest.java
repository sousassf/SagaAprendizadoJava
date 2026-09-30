package Qstring.test;

public class StringPerfomaceTest {
    public static void main(String[] args) {
        long inicio  = System.currentTimeMillis();
        concatString(50_000);
        long fim  = System.currentTimeMillis();
        System.out.println("Tempo para execução para String foi de " + (fim - inicio) + " ms");

        inicio  = System.currentTimeMillis();
        concatStringBuilder(500_000);
        fim  = System.currentTimeMillis();
        System.out.println("Tempo para execução para String Builder foi de " + (fim - inicio) + " ms");

        inicio  = System.currentTimeMillis();
        concatStringBuffer(500_000);
        fim  = System.currentTimeMillis();
        System.out.println("Tempo para execução para String Buffer foi de " + (fim - inicio) + " ms");

    }

    //StringBuilder e StringBuffer = mudam direto no mesmo objeto ao ser concatenada
    //String normal cria um novo objeto ao concatenar algo a mais nela


    public static void concatString(long tamanho){
        String texto = "";
        for(int i = 0; i < tamanho; i++){
            texto += i;
        }
    }


    public static void concatStringBuilder(long tamanho){
        StringBuilder bs = new StringBuilder();
        for(int i = 0; i < tamanho; i++){
            bs.append(i);
        }
    }


    public static void concatStringBuffer(long tamanho){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
