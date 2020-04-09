package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeaderTitle {
    static String toTitle(String title){
        String headerTitle = "";

        String[] words = title.split(" ");
        // [hello, world

        for(String word: words){
            // hello -> h
            // convert the char to string -> toupper case -> H
            String firstLetter = Character.toString(word.charAt(0)).toUpperCase();
                            // H + ello + " "
            headerTitle += firstLetter + word.substring(1).toLowerCase() + " ";
        }
        return headerTitle;
    }
    public static void main(String[] args) {
        System.out.println(toTitle("hello world!"));
    }
}
