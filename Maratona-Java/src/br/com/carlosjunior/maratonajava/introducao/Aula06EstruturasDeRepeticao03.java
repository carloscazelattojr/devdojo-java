package br.com.carlosjunior.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprimir um numero de 0 - 50 e imprimir os 25 primeiros numeros.

        for (int i = 0; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("Numero: " + i);
        }
    }
}


