package br.com.carlosjunior.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 19;

        // + - * /
        System.out.println("soma: " + (num1+num2));
        System.out.println("subtração: " + (num2-num1));
        System.out.println("multiplicação: " + (num1*num2));
        System.out.println("Divisão: " + (num2/num1));
        System.out.println(num2+num1 + " Teste " + num2+num1 );

        // %
        int resto = num2 % num1;
        System.out.println("Resto: "+ resto);
        System.out.println(21 % 8 );

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);

        boolean isDezIgualADez = 10 == 10 ;
        System.out.println("isDezIgualADez: "+isDezIgualADez);

        boolean isDezDiferenteAOnze = 10 != 11 ;
        System.out.println("isDezDiferenteAOnze: "+isDezDiferenteAOnze);

        // AND = &&
        // OR = ||
        // ! = Not
        boolean isDezIgualDezEMaiorQueOnze = 10 == 10 && 10 < 11;
        System.out.println("isDezIgualDezEMaiorQueOnze: "+isDezIgualDezEMaiorQueOnze);

        int idade = 35;
        float salario = 3500F;
        boolean isMaiorQueTrinta = idade >30 && salario > 4612;
        System.out.println("isMaiorQueTrinta: "+isMaiorQueTrinta );

        boolean isMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println("isMenorQueTrinta: "+isMenorQueTrinta );

        // += -= *= /=
        double bonus = 2000;
        bonus += 500;
        System.out.println("bonus +: "+bonus);

        bonus -= 300;
        System.out.println("bonus -: "+bonus);

        bonus *= 2;
        System.out.println("bonus 2: "+bonus);

        bonus /= 2;
        System.out.println("bonus /: "+bonus);

        bonus %= 2;
        System.out.println("bonus %: "+bonus);



    }




}
