package br.com.carlosjunior.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //inicialização padrão:
        // byte, short, int, long, float e double = 0
        // char = '\u0000'  ou ' '
        // boolean = false
        // String = null

        char [] idades = new char[3];

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
