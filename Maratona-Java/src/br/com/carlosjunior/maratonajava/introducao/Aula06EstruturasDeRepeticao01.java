package br.com.carlosjunior.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        System.out.println("While");
        int count = 0;

        while (count < 10) {
            System.out.println(++count);
        }

        System.out.println("DoWhile");
        count = 0;
        do {
            System.out.println("Dentro do DoWile:  " + count);
            count++;
        } while (count < 10);

        System.out.println("For");
        for (int i = 0; i < 10; i++) {
            System.out.println("Dentro do FOR:  " + i);

        }


    }
}
