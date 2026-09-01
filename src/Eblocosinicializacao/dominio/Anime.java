package Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime() {
        episodios = new int[100];
        for(int episodios : this.episodios){
            System.out.print(episodios + " ");
        }
    }
}
