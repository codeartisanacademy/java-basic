package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayChecker {
    public static void main(String[] args) {
        // ask user to enter its birthday in the format dd/mm/yyyy
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birthday dd/mm/yyyy: ");

        String birthday = input.nextLine();

        // create the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bday = LocalDate.parse(birthday, formatter);
        //System.out.println(bday);

        // you are x years old
        LocalDate today = LocalDate.now();

        System.out.println("You are " + bday.compareTo(today) + " years old");

        // your were born on Monday / Tuesday ...
        System.out.println("You were born on a " + bday.getDayOfWeek());
    }
}
