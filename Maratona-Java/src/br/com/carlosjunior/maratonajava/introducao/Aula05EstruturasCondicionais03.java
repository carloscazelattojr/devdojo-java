package br.com.carlosjunior.maratonajava.introducao;

// Operador TERNARIO.

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 5000.01;

        String mensagemDoar = "Eu vou doar R$ 40,00 para Escola!!!";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter no futuro!";


        String resultado = salario > 6000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }

}
