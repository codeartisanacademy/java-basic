package com.company;

public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        try{
            System.out.println(numbers[6]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("It is the end");
        }

        int[] myNumbers = {1,2,3,4,5};
        sumNumbers(myNumbers);
    }

    public static int sumNumbers(int[] numbers) throws ArrayIndexOutOfBoundsException{
        int total = 0;
        for(int x = 0; x < 6; ++x){
            total += numbers[x];
        }

        return total;

    }
}
