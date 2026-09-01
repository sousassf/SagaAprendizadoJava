package Dconstrutores.test;

import Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Comédia", 12);
        Anime anime1 = new Anime("Gocu", "Ação");
        System.out.println("------------------------------------");
        anime.imprime();
    }
}
