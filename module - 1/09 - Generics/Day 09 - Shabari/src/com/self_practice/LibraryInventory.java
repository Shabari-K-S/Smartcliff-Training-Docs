package com.self_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class LibraryInventory {
    private ArrayList<String> books = new ArrayList<String>();

    public void addBook(String title) {
        books.add(title);
    }

    public boolean removeBook(String title) {
        return books.remove(title);
    }

    public void removeBooksByCondition(String condition) {
        books.removeIf(book -> book.contains(condition));
    }

    public boolean searchBook(String title) {
        return books.contains(title);
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }

    public void listBooks() {
        books.forEach(System.out::println);
    }

    public void sortBooksByTitle() {
        books.sort(String::compareTo);
    }

    public void sortBooksByAuthor() {
        books.sort((book1, book2) -> book1.split(":")[1].compareTo(book2.split(":")[1]));
    }

    public int size() {
        return books.size();
    }

    public void increaseCapacity(int amount) {
        books.ensureCapacity(books.size() + amount);
    }

    public void iterateBooks() {
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public String[] convertToArray() {
        return books.toArray(new String[0]);
    }

    public Iterator<String> getIterator() {
        return books.iterator();
    }

    public static void main(String[] args) {
        LibraryInventory library = new LibraryInventory();
        library.addBook("Book1:Author1");
        library.addBook("Book2:Author2");
        library.addBook("Book3:Author3");

        library.listBooks();
        library.removeBook("Book2:Author2");
        library.listBooks();

        System.out.println(library.searchBook("Book1:Author1"));
        System.out.println(library.searchBook("Book2:Author2"));

        library.sortBooksByTitle();
        library.listBooks();

        library.sortBooksByAuthor();
        library.listBooks();

        System.out.println(library.size());
        library.increaseCapacity(5);

        library.iterateBooks();

        String[] bookTitles = library.convertToArray();
        for (String title : bookTitles) {
            System.out.println(title);
        }

        Iterator<String> iterator = library.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        library.removeBooksByCondition("Book");
        library.listBooks();

        System.out.println(library.isEmpty());

        library.addBook("Book4:Author4");
        library.addBook("Book5:Author5");
        library.addBook("Book6:Author6");

        library.listBooks();

        System.out.println(library.size());

        library.removeBooksByCondition("Author");

        library.listBooks();

        System.out.println(library.isEmpty());
    }
}