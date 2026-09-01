package Bjavacorerevisao.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimir(){
        System.out.println("----------------------------------------------------->");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if(salario == null){
            return;
        }
        for(int i = 0; i < salario.length; i++){
            System.out.printf("Salario %d: R$%.2f\n", i, salario[i]);
        }
        mediaSalarial();
        System.out.println("\n----------------------------------------------------->");

    }

    public void mediaSalarial(){
        if (salario == null) {
            return;
        }
        double media = 0;
        for(double salario: this.salario){
            media += salario;
        }
        System.out.printf("A média salarial desse funcionário é de R$%.2f", media);
    }





}
