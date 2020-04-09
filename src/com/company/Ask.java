package com.company;

import java.util.Scanner;

public class Ask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = input.nextLine();

        System.out.println("Your name is " + name);


    }

}
