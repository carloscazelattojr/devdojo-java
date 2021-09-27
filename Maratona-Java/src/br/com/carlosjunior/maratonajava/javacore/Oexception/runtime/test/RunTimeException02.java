package br.com.carlosjunior.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeException02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    public static int divisao(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Argumento ilegall! Não pode ser 0");
        }
        return (a / b);
    }
}
