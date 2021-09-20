package br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.test;

import br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] numeros = {10,11,12};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,34,5,369);
    }
}
