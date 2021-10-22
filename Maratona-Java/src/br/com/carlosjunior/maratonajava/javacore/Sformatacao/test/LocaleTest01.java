package br.com.carlosjunior.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        //https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes
        //https://pt.wikipedia.org/wiki/ISO_3166-2


        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localIndia = new Locale("hi", "IN");
        Locale localJapao = new Locale("ja", "JP");
        Locale localHolanda = new Locale("nl", "NL");


        Calendar calendar = Calendar.getInstance();
        DateFormat dIt =  DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dCH = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dIn = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        DateFormat dJp = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
        DateFormat dHo = DateFormat.getDateInstance(DateFormat.FULL, localHolanda);

        System.out.println("Data Locale");
        System.out.println("Italy: "+dIt.format(calendar.getTime()));
        System.out.println("Suiça: "+dCH.format(calendar.getTime()));
        System.out.println("India: "+dIn.format(calendar.getTime()));
        System.out.println("Japão: "+dJp.format(calendar.getTime()));
        System.out.println("Holanda: "+dHo.format(calendar.getTime()));

        System.out.println("Country");
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localIndia.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());

        System.out.println(localJapao.getLanguage());


    }
}
