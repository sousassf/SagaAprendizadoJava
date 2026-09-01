package Dconstrutores.dominio;

public class Anime {
    public String nome;
    public String tipo;
    public int episodios;


     public Anime(String nome, String tipo, int episodios){
         System.out.println("Dentro do construtor");
         this.nome = nome;
         this.episodios = episodios;
         this.tipo = tipo;
     }

     public Anime(String nome, String tipo){

     }

     public void imprime(){
         System.out.println(this.nome);
         System.out.println(this.tipo);
         System.out.println(this.episodios);
     }

}
