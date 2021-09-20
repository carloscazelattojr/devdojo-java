package br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.test;

import br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setIdade(30);
        p1.setNome("carlos");

        System.out.println("---------------");
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

        p1.setIdade(04);
        p1.setNome("Mateus");

        System.out.println("---------------");
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

    }
}
