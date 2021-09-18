package br.com.carlosjunior.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[5];
        nomes[0] = "Carlos";
        nomes[1] = "Junior";
        nomes[2] = "Mateus";
        nomes[3] = "Hiroki";
        nomes[4] = "Eliana";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }

    }
}
