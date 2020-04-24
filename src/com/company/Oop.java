package com.company;

class Student {
    String firstName;
    String lastName;
    String major;
    boolean isEnrolled;

    void enroll(){
        isEnrolled = true;
    }
}

public class Oop {
    public static void main(String[] args) {
        Student john = new Student();
        john.firstName = "John";
        john.lastName = "Doe";
        john.major = "Science";
        john.isEnrolled = false;

        System.out.println(john.isEnrolled);
        john.enroll();
        System.out.println(john.isEnrolled);


        Student mike = new Student();


        System.out.println(john.firstName);

        System.out.println(mike);
    }
}
