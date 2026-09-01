package Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;

    //constante: usa 'final'
    //boa prática: caps lock, e separa por "_", que nem o exemplo a cima

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
