package com.company;

public class ArrayBasic {
    public static void main(String[] args) {
        // declare an array
        int[] numbers = {1,2,3,4,5};

        for(int x = 0; x < numbers.length; x++){
            System.out.println(numbers[x]);
        }

        for(int x: numbers){
            System.out.println(x);
        }

        int[][] grids = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println(grids[0][1]);
    }
}
