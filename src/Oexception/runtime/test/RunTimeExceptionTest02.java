package Oexception.runtime.test;


//sempre usar as exceções mais especificas possíveis
public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
    }

    public static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegao, não pode ser zero");
        }
        return a/b;
    }

}
