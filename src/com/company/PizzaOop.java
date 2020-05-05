package com.company;

import java.util.ArrayList;
import java.util.Arrays;

class Pizza{
    String name;
    ArrayList<String> toppings;
    // constructor a function that has no return and same name as the class
    public Pizza(){
        this.name = "Plain Pizza";
        this.toppings = new ArrayList<String>(Arrays.asList("Olive", "Cheese"));
    }
    // method constructor overload: same name different signature
    public Pizza(String _name, ArrayList<String> _toppings){
        this.name = _name;
        this.toppings = _toppings;
    }

}

public class PizzaOop {
    public static void main(String[] args) {

        Pizza plain = new Pizza();
        System.out.println(plain.name);

        ArrayList<String> tunaPestoToppings = new ArrayList<String>(Arrays.asList("Cheese", "Tuna", "Pesto"));
        Pizza tunaPesto = new Pizza("PIzza Tuno Pesto", tunaPestoToppings );

        System.out.println(tunaPesto.name);
        System.out.println("Has the following toppings");
        for (String topping:tunaPesto.toppings) {
            System.out.println(topping);
        }
    }
}















/**
 class Pizza{
 ArrayList<String> toppings;
 String name;

 Pizza(){
 this.toppings = new ArrayList<String>(Arrays.asList("Cheese", "olive"));
 this.name = "Basic Pizza";
 }

 Pizza(ArrayList<String> toppings, String name){
 this.toppings = toppings;
 this.name = name;
 }

 }

 public class PizzaOop {
 public static void main(String[] args) {
 Pizza pizza = new Pizza();
 System.out.println(pizza.name);
 System.out.println(pizza.toppings.toString());

 ArrayList<String> toppingsTuna = new ArrayList<String>();
 toppingsTuna.add("Tuna");
 toppingsTuna.add("Jalapeno");

 Pizza tuna = new Pizza(toppingsTuna, "Tuna Pizza");
 System.out.println(tuna.toppings);
 }


 }

 */