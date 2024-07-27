package com.hands_on.Question5;

class Book extends Product {
    void AddToCart() {
        System.out.println("Book added to cart: " + Name);
    }

    double GetDiscountedPrice() {
        return Price * 0.9; // 10% discount on books
    }
}
