package com.company;

// create a class for Book think about 4 properties that should be in this class
// getDiscountedPrice(int discount)
// user parameterized constructor

class Book{
    String title;
    String author;
    String genre;
    float price;

    public Book(String _title, String _author, String _genre, float _price) {
        this.title = _title;
        this.author = _author;
        this.genre = _genre;
        this.price = _price;
    }

    public float getDiscountedPrice(int discount){
        return this.price - ((this.price)*discount/100);
    }

    public float getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}

public class OopExercise {
    public static void main(String[] args) {
        Book pythonBook = new Book("Python Book", "John Doe", "Programming", 12.00f);
        System.out.println("Regular price: " + pythonBook.getPrice());
        System.out.println("Price after discount: " + pythonBook.getDiscountedPrice(50));
    }
}
