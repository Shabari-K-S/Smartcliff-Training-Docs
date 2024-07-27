package com.self_practice.Question5;

public class Main {

    public static void main(String[] args){
        Book[] books = {
                new Book("Java Programming", "John Doe", "123456"),
                new Book("Python Programming", "Jane Smith", "234567"),
                new Book("Data Structures", "Alice Johnson", "345678")
        };
        Library library = new Library(books);
        Book book1 = library.searchBook("Java Programming");
        if(book1 != null){
            System.out.println("Book found - Title: " + book1.title + ", Author: " + book1.author + ", ISBN: " + book1.ISBN);
        }else{
            System.out.println("Book not found.");
        }
        Book book2 = library.searchBook("Jane Smith", 1);
        if(book2 != null){
            System.out.println("Book found - Title: " + book2.title + ", Author: " + book2.author + ", ISBN: " + book2.ISBN);
        }else{
            System.out.println("Book not found.");
        }
        Book book3 = library.searchBookByISBN("345678");
        if(book3 != null){
            System.out.println("Book found - Title: " + book3.title + ", Author: " + book3.author + ", ISBN: " + book3.ISBN);
        }else{
            System.out.println("Book not found.");
        }
    }
}
