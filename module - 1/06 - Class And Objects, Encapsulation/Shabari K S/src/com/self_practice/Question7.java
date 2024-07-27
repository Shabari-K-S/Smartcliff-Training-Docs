package com.self_practice;

class Library{
    static int totalBooks;
    final static int MAX_CAPACITY = 1000;

    public void addBook(){
        totalBooks++;
    }

    public int getTotalBooks(){
        return totalBooks;
    }
}

public class Question7{
    public static void main(String[] args){
        Library library = new Library();
        library.addBook();
        library.addBook();
        library.addBook();
        System.out.println("Total Books: "+library.getTotalBooks());
    }
}