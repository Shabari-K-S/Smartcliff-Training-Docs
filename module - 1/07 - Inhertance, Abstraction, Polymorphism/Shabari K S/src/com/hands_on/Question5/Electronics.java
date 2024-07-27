package com.hands_on.Question5;

class Electronics extends Product {
    void AddToCart() {
        System.out.println("Electronics added to cart: " + Name);
    }

    double GetDiscountedPrice() {
        return Price * 0.8; // 20% discount on electronics
    }
}
