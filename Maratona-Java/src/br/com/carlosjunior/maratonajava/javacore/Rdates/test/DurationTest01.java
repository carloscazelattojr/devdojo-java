package br.com.carlosjunior.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeNow7Hours = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1);

    }
}
