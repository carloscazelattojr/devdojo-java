package br.com.carlosjunior.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.03;
    public Tomate(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate!!!");
        return this.valor * IMPOSTO;
    }
}
