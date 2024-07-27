package com.self_practice;

class Author{
    String name;
    String email;

    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Author: "+name+" ("+email+")";
    }
}

class Book{
    String isbn;
    String name;
    Author author;
    double price;
    int qty;

    public Book(String isbn, String name, Author author, double price){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String isbn, String name, Author author, double price, int qty){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn(){
        return isbn;
    }

    public Author getAuthor(){
        return author;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return name+" by "+author;
    }
}

public class Question2{
    public static void main(String[] args){
        Author author = new Author("Shabari", "2k21cse137@kiot.ac.in");
        Book book = new Book("123456", "The Logic God", author, 100.0, 10);
        System.out.println(book);
        System.out.println("ISBN: "+book.getIsbn());
        System.out.println("Name: "+book.getName());
        System.out.println("Price: "+book.getPrice());
        System.out.println("Qty: "+book.getQty());
    }
}
