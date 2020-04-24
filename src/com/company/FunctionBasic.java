package com.company;

public class FunctionBasic {

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static void greetFriend(String name){
        System.out.println("Hello " + name);
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static boolean numberGreaterThanFive(int x){
        if(x>5){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        sayHello();
        greetFriend("John");

        int result = add(5,8);
        System.out.println(result);
    }
}
