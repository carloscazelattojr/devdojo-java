package br.com.carlosjunior.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isMaiorIdade = idade >= 18;

        if (isMaiorIdade){
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }

        if (!isMaiorIdade){
            System.out.println("Menor de idade deverá ser acompanhado por um responsável!");
        }

        boolean c = false;
        if (c == false){
            System.out.println("C é falso");
        }


    }
}
