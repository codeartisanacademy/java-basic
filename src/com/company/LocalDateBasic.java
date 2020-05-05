package com.company;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateBasic {
    public static void main(String[] args) {
        // today
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // create of
        LocalDate startDate = LocalDate.of(2020, 05, 01);
        System.out.println(startDate);

        LocalDate endDate = LocalDate.of(2020, Month.APRIL, 10);
        System.out.println(endDate);
        System.out.println(startDate.getYear());
        //System.out.println(Duration.between(endDate, startDate));

        // now
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());

        // today and now
        LocalDateTime todayAndTime = LocalDateTime.now();
        System.out.println(todayAndTime);

        // format ofPattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate newDate = LocalDate.parse("2020/05/12", formatter);
        System.out.println(newDate);

        // add couple days, weeks
        LocalDate expiredDate = today.plusDays(2);
        System.out.println("Expired date: " + expiredDate);

        // subtract couple of days
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);

        // compare dates
        int different = startDate.compareTo(yesterday);
        System.out.println(different);

        System.out.println(today.equals(startDate));

        // leap year 366 we have feb 29
        System.out.println(today.isLeapYear());

        // length of year
        System.out.println(today.lengthOfYear());
        System.out.println(today.lengthOfMonth());

        System.out.println(today.getDayOfWeek());

    }
}
