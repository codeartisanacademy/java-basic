package com.company;

import java.sql.SQLOutput;

public class TryCatchBasic {
    public static void main(String[] args) {
        int[] numbers =  {1,2,3};

        try {
            System.out.println(5 / 0);
        }catch(Exception ex){
            System.out.println("There is an error, try again");
            System.out.println(ex.getMessage());
        }
        System.out.println("The end of the program");

        try {
            System.out.println(numbers[4]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("The item is not in the array");
        }catch(Exception ex){
            System.out.println("There is a general error");
        }finally {
            System.out.println("The end of the line");
        }
    }
}

/**
 try {
 System.out.println(5/0);
 System.out.println(numbers[2]);
 System.out.println("No error");
 }
 catch (ArrayIndexOutOfBoundsException ex){
 System.out.println("The error from array");
 System.out.println(ex.getMessage());
 }
 catch (Exception ex){
 System.out.println("General error");
 System.out.println(ex.getMessage());
 }
 finally {
 System.out.println("Finally");
 }

 System.out.println("Hit the end");
 */