package Bjavacorerevisao.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
        System.out.println("Método void, ou seja não retorna nada pro programa");
    }

    public void subtraiDoisNumeros(){
        System.out.println(35 -2);
    }

    public void multiplicaDoisNumeros(int a, int b){
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }else{
            return num1/num2;
        }
    }

    public void imprime(double num1, double num2){
        if(num2 == 0){
            System.out.println("não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }


}
