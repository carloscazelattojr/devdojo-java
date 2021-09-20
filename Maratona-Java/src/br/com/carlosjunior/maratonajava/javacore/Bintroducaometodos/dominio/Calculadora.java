package br.com.carlosjunior.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-1);
    }

    public void multiplicar(int a, int b){
        System.out.println(a * b);
    }

    public double dividirDoisNumeros(double n1, double n2){
        return n1 / n2;
    }

    public void alteraDoisNumeros(int n1, int n2) {
        n1 = 99;
        n2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Somatoria: " + soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Somatoria: " + soma);
    }
}
