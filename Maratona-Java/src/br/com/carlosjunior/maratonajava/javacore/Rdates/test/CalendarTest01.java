package br.com.carlosjunior.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
        System.out.println(c);

        System.out.println(c.getFirstDayOfWeek());
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana no calendario Gregoriano!");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
