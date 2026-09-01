package Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    //construtor, inicializando o time
    public Time(String nome) {
        this.nome = nome;
    }
    //construtor sobrecarregado
    public Time(String nome, Jogador... jogadores){
        this.nome = nome;
        this.jogadores = jogadores;

        for(Jogador jogador : jogadores){
            jogador.setTime(this);
        }

    }

    public void imprime(){
        System.out.println("--- "+this.nome+" ---");
        if(jogadores == null) return;
        for(Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        }
    }

    //getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
