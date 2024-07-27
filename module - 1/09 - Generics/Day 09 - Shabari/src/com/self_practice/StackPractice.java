package com.self_practice;

import java.util.Iterator;
import java.util.Stack;

public class StackPractice {
    private Stack<String> books = new Stack<String>();

    public void pushBook(String title) {
        books.push(title);
    }

    public String popBook() {
        return books.pop();
    }

    public String peekBook() {
        return books.peek();
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

    public static void main(String[] args) {
        StackPractice stack = new StackPractice();
        stack.pushBook("The Great Gatsby");
        stack.pushBook("To Kill a Mockingbird");
        stack.pushBook("1984");

        stack.listBooks();
        stack.popBook();
        stack.listBooks();

        System.out.println(stack.searchBook("To Kill a Mockingbird"));
        System.out.println(stack.searchBook("1984"));

        System.out.println(stack.size());

        stack.iterateBooks();

        stack.pushBook("Animal Farm");
        stack.pushBook("Brave New World");
        stack.pushBook("The Catcher in the Rye");

        stack.listBooks();

        System.out.println(stack.size());

        stack.pushBook("The Grapes of Wrath");

        stack.listBooks();

        stack.increaseCapacity(5);

        stack.listBooks();

        stack.popBook();
        stack.popBook();
        stack.popBook();

        stack.listBooks();

        System.out.println(stack.isEmpty());

        stack.pushBook("The adventures of Tom Sawyer");

        stack.listBooks();

        stack.popBook();
        stack.popBook();

        stack.listBooks();

        System.out.println(stack.isEmpty());
    }
}