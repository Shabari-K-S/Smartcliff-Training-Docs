package com.hands_on.Question3;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger();
        burger.Name = "Cheeseburger";
        burger.Price = 10.99;
        burger.Cook();

        Pizza pizza = new Pizza();
        pizza.Name = "Margherita Pizza";
        pizza.Price = 12.99;
        pizza.Cook();
    }
}
