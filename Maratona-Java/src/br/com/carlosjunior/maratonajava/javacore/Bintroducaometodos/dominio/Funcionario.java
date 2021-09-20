package br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = null;


    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print("Salário R$ " + salario + " ");
            }
        }
        mediaSalarial();

    }

    public void mediaSalarial() {
        double mediaSalarial = 0;
        if (salarios != null) {
            for (double salario : salarios) {
                mediaSalarial += salario;
            }
            mediaSalarial /= salarios.length;
        }
        System.out.println("\nMedia Salarial: R$ " + mediaSalarial);
    }
}