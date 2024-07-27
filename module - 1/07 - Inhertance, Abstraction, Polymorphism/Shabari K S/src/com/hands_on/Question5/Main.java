package com.hands_on.Question5;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.Name = "Java Programming";
        book.Price = 29.99;
        book.AddToCart();
        System.out.println("Discounted Price: $" + book.GetDiscountedPrice());

        Electronics electronics = new Electronics();
        electronics.Name = "Smartphone";
        electronics.Price = 499.99;
        electronics.AddToCart();
        System.out.println("Discounted Price: $" + electronics.GetDiscountedPrice());
    }
}
