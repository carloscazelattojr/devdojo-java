package br.com.carlosjunior.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

     public void imprimir() {
        super.imprimir();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
