package br.com.carlosjunior.maratonajava.javacore.Jmodificadorfinal.domain;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
