package br.com.carlosjunior.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprimir números pares de 0 a 1000.
        int max = 10000;
        for (int i = 1; i <= max; i++) {
            if ( i % 2 == 0) {
                System.out.println(i + " é par!");
            }
        }

    }

}
