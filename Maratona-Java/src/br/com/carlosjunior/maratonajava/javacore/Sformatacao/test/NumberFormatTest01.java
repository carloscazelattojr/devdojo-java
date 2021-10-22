package br.com.carlosjunior.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale locaPT = new Locale("pt", "BR");
        Locale locaJP = Locale.JAPAN;
        Locale locaItaly = Locale.ITALY;
        NumberFormat[] numberFormat = new NumberFormat[4];

        numberFormat[0] = NumberFormat.getInstance(locaPT);
        numberFormat[1] = NumberFormat.getInstance(locaItaly);
        numberFormat[2] = NumberFormat.getInstance(locaJP);
        numberFormat[3] = NumberFormat.getInstance();

        double valor = 1000.213;

        for( NumberFormat n : numberFormat){
            System.out.println(n.format(valor));
        }

    }
}
