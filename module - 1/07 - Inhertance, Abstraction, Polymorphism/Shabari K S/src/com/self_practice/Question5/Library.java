package com.self_practice.Question5;

class Library {
    Book[] books;

    Library(Book[] books){
        this.books = books;
    }

    Book searchBook(String title){
        for(Book book : books){
            if(book.title.equals(title)){
                return book;
            }
        }
        return null;
    }

    Book searchBook(String author, int a){
        for(Book book : books){
            if(book.author.equals(author)){
                return book;
            }
        }
        return null;
    }

    Book searchBookByISBN(String ISBN){
        for(Book book : books){
            if(book.ISBN.equals(ISBN)){
                return book;
            }
        }
        return null;
    }
}
