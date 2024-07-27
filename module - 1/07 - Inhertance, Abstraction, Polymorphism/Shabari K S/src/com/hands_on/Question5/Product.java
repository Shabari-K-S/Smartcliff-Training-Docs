package com.hands_on.Question5;

abstract class Product {
    String Name;
    double Price;

    abstract void AddToCart();

    double GetDiscountedPrice() {
        return Price;
    }
}
