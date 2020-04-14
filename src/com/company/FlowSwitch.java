package com.company;

import java.util.Scanner;

public class FlowSwitch {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your oder: ");
        String order = scanner.nextLine();

        switch (order){
            case "burger":
                System.out.println("You ordered burger");
                break;
            case "hot dog":
                System.out.println("You ordered hot dog");
                break;
            case "pasta":
                System.out.println("You ordered pasta");
                break;
            default:
                System.out.println("Just fries");
                break;
        }
    }

}
