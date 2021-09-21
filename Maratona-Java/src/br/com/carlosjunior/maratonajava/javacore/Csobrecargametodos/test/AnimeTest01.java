package br.com.carlosjunior.maratonajava.javacore.Csobrecargametodos.test;

import br.com.carlosjunior.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akuma Drive", "TI", 19,"Genero");
        anime.imprime();

    }

}
