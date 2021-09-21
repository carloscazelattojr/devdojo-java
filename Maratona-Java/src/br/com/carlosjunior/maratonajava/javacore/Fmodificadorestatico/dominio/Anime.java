package br.com.carlosjunior.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private static int[] episodios;
    private String genero;

   static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio: Anime.episodios) {
            System.out.print(episodio+ " ");
        }
        System.out.println();
    }

    public Anime() {

    }

    public Anime(String nome) {
        this.nome = nome;
        System.out.println(this.nome);
    }
}
