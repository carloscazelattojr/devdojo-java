package br.com.carlosjunior.maratonajava.javacore.Gassociacao.test;

import br.com.carlosjunior.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Carlos");
        Jogador j2 = new Jogador("Romario");
        Jogador j3 = new Jogador("Ronaldo");

        Jogador[] jogadores = new Jogador[]{j1, j2, j3};

        for(Jogador jogador : jogadores){
            jogador.imprimir();
        }

    }
}
