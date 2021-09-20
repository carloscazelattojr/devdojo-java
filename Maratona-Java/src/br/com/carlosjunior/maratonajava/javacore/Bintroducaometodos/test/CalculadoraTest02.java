package br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.test;

import br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int n1 = 1;
        int n2 = 2;
        calc.alteraDoisNumeros(n1, n2);
        System.out.println("Fora do alteraDoisNumeros");
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
    }
}
