package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistbasic {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // add item to array list
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);

        System.out.println(numbers);

        // get the size of an arraylist size()
        System.out.println(numbers.size());

        // insert an item at a specific position
        numbers.add(1, 20);
        System.out.println(numbers);

        // access item inside the list using get(index)
        System.out.println(numbers.get(2));

        ArrayList<String> friends = new ArrayList<String>(Arrays.asList("Jim", "john", "Mike", "Barry"));
        ArrayList<String> friendsJ = new ArrayList<String>();

        // create another list with only friends its first letter of the name starts with j
        for(String f: friends){
            if(f.toLowerCase().startsWith("j")){
                friendsJ.add(f);
            }
        }

        System.out.println(friendsJ);

        // change the value of an item in the arraylist
        friends.set(2, "Michael");

        System.out.println(friends);
    }
}
