package br.com.carlosjunior.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[3];
        arrayInt[1] = new int[2];
        arrayInt[2] = new int[6];

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int valor : arrayBase) {
                System.out.print(valor);
            }
        }
        System.out.println("Outra forma");
        int[][] arrayInt2 = {{0,0},{1,1,1},{2,2,2,2,2,2} };
        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int valor : arrayBase) {
                System.out.print(valor);
            }
        }



    }
}
