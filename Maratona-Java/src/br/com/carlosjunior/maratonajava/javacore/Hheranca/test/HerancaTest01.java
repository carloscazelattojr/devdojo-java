package br.com.carlosjunior.maratonajava.javacore.Hheranca.test;

import br.com.carlosjunior.maratonajava.javacore.Hheranca.dominio.Endereco;
import br.com.carlosjunior.maratonajava.javacore.Hheranca.dominio.Funcionario;
import br.com.carlosjunior.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua quauqa");
        endereco.setCep("87045230");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carlos");
        pessoa.setCpf("87546456465");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();

        Funcionario func = new Funcionario();
        func.setNome("Mateus");
        func.setSalario(189.9);
        func.setEndereco(endereco);
        func.imprimir();

    }
}
