package br.com.carlosjunior.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'P';
        boolean booleanP = false;

        //Wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'P';
        Boolean booleanW = false;

        int i = intW;
        Integer iW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('a'));

    }
}
