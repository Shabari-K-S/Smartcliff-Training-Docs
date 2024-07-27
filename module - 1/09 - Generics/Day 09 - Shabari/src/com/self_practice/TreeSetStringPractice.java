package com.self_practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStringPractice {
    private TreeSet<String> stringSet = new TreeSet<String>((str1, str2) -> str2.compareTo(str1));

    public void addStrings() {
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cherry");
        stringSet.add("date");
        stringSet.add("kiwi");
        stringSet.add("orange");
    }

    public void addString(String string) {
        stringSet.add(string);
    }

    public void removeString(String string) {
        stringSet.remove(string);
    }

    public boolean containsString(String string) {
        return stringSet.contains(string);
    }

    public boolean isEmpty() {
        return stringSet.isEmpty();
    }

    public int size() {
        return stringSet.size();
    }

    public void iterateStrings() {
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void retrieveFirstAndLast() {
        System.out.println(stringSet.first());
        System.out.println(stringSet.last());
    }

    public void pollFirstAndLast() {
        System.out.println(stringSet.pollFirst());
        System.out.println(stringSet.pollLast());
    }

    public static void main(String[] args) {
        TreeSetStringPractice set = new TreeSetStringPractice();
        set.addStrings();

        set.addString("grape");

        set.removeString("date");

        System.out.println(set.containsString("banana"));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.iterateStrings();

        set.retrieveFirstAndLast();

        set.pollFirstAndLast();
    }
}