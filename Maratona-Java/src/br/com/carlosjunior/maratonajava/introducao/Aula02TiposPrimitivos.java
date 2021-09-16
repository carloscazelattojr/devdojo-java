package br.com.carlosjunior.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        int idadeCast = (int) 100000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.2;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        char caractereKeyASCII = 87;
        char caractereKeyUnicode = '\u0041';
        String palavra = "Carlos Junior";


        System.out.println("int: "+idade);
        System.out.println("int Cast: "+idadeCast);
        System.out.println("long: "+numeroGrande);
        System.out.println("double: "+salarioDouble);
        System.out.println("float: "+salarioFloat);
        System.out.println("byte: "+idadeByte);
        System.out.println("short: "+idadeShort);
        System.out.println("boolean True: "+verdadeiro);
        System.out.println("boolean False: "+falso);
        System.out.println("char: "+caractere);
        System.out.println("char: "+caractereKeyASCII);
        System.out.println("char: "+caractereKeyUnicode);
        System.out.println("String: "+palavra);

    }
}
