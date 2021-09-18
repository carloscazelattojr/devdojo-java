package br.com.carlosjunior.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        // Arrays[x,x]
        // 1,2,3,4 = meses
        // 31,28,31,30 = dias;

        int[][] dias = new int[3][3];
        System.out.println(dias[0][0]);
        //dias[i][j]
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 4;
        dias[1][1] = 5;
        dias[1][2] = 6;

        dias[2][0] = 7;
        dias[2][1] = 8;
        dias[2][2] = 9;

        // for normal
        System.out.println("For normal");
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("----");
        System.out.println("For Each");
        for( int[] arrayDias: dias){
            for (int num : arrayDias) {
                System.out.println(num);

            }
        }

    }
}
