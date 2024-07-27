package com.self_practice;

class Product{
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(){
        productId = 0;
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    public Product(int productId, String name, double price, int quantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display(){
        System.out.println("Product ID: "+productId);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
}

public class Question3{
    public static void main(String[] args){
        Product product1 = new Product();
        Product product2 = new Product(123456, "The Logic God", 100.0, 10);
        product1.display();
        product2.display();
    }
}