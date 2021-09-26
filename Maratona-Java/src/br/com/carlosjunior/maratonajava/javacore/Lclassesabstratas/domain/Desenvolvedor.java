package br.com.carlosjunior.maratonajava.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calculaBonus() {

    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
