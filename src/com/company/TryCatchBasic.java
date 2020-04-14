package com.company;

public class TryCatchBasic {
    public static void main(String[] args) {
        int[] numbers =  {1,2,3};

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
    }
}
