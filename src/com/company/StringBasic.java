package com.company;

public class StringBasic {
    public static void main(String[] args) {
        String email = "john.doe@gmail.id";

        // method overload = if a method has multiple signatures
        System.out.println(email.substring(5));
        System.out.println(email.substring(5,10));

        System.out.println(email.contains("@"));
        int dotPosition = email.indexOf("."); // 10
        System.out.println(email.substring(dotPosition));

        char letter = email.charAt(2);
        String letterString = Character.toString(letter);


    }
}
