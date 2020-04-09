package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
	// write your code here
        String name = "John";
        System.out.println(name);

        int[] numbers = {1,2,3,4};
        System.out.println(Arrays.toString(numbers));

        for(byte x=0; x<numbers.length; x++){
            System.out.println(numbers[x]);
        }
    }
}
