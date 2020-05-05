package com.company;

class Product{
    String name;
    float price;

    public void checkStock(){
        System.out.println("Checking stock...");
    }
    public void getPrice(){
        System.out.println("The price of the product...");
    }
}

class PromoProduct extends Product{
    public void getPrice(){
        super.getPrice();
        System.out.println("The price after discount...");
    }
}

public class ProductInheritance {
    public static void main(String[] args) {
        Product p = new Product();
        p.name = "iPhone 11";
        p.price = 13000000;
        p.checkStock();
        p.getPrice();

        PromoProduct pp = new PromoProduct();
        pp.name = "iPhone 11 Promo";
        pp.price = 10000000;
        pp.getPrice();
    }
}










