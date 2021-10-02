package br.com.carlosjunior.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Carlos Junior";
        nome.concat(" - Software Engineer Back-End");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Carlos Junior");
        sb.append(" - Software Engineer Back-End");
        System.out.println(sb);
    }
}
