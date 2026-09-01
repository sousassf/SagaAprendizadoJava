package Bjavacorerevisao.dominio;

public class ModificadoresDeAcesso {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade < 0 || idade > 125){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
}
