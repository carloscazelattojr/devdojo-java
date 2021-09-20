package br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.test;

import br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somarDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicar(10, 20);
        double resultado = calc.dividirDoisNumeros(10,2);
        System.out.println(resultado);

    }



}
